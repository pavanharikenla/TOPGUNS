package com.vz.tg;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Locale;

import org.apache.solr.client.solrj.SolrQuery;
import org.apache.solr.client.solrj.response.Group;
import org.apache.solr.client.solrj.response.GroupCommand;
import org.apache.solr.client.solrj.response.QueryResponse;
import org.apache.solr.common.SolrDocument;
import org.apache.solr.common.SolrDocumentList;
import org.json.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.vz.tg.model.HomeBean;
import com.vz.tg.services.HomeService;

/**
 * Handles requests for the application home page.
 */
@Controller
public class ChartController {
	
	private static final Logger logger = LoggerFactory.getLogger(ChartController.class);
	@Autowired
	HomeService homeservice ;
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/charts", method = RequestMethod.GET)
	public ModelAndView home(Locale locale, Model model) {
		
		logger.info("Welcome Charts! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		//model = new object.. set values and set to MAV..
		
		SolrQuery query = new SolrQuery("id:*");
		query.set("group", true);
		query.set("group.field", "sentimentScore");
		query.addSort("sentimentScore",SolrQuery.ORDER.asc);
		HomeBean bean = new HomeBean();
		try{
			QueryResponse response = homeservice.getServiceResponse(query);
			if(response!=null){
				 /*SolrDocumentList responseList = response.getResults();
				 long totalCount = responseList.getNumFound();
				 if(totalCount>0){
					 bean.setResultCount(totalCount);
				 }*/
				 List<GroupCommand> list = response.getGroupResponse().getValues();
				 GroupCommand groupList = list.get(0);
				 long totalCount = groupList.getMatches();
				 bean.setResultCount(totalCount);
				 List<Group> groups = groupList.getValues();
				 
				 long positivaTotal =0;
				 if(groups!=null && groups.size()>0){
					 for(Group grp:groups){
						 String grpValue = grp.getGroupValue();
						 SolrDocumentList docList = grp.getResult();
						 long numFound = docList.getNumFound();
						 if(grpValue!=null){
							 int sentiment_val =  Integer.parseInt(grpValue);
							 switch(sentiment_val){
							 	case 0://Negative Needs immediate Attention....
							 		bean.setNegativeCount(numFound);
							 		break;
							 	case 2:
							 		bean.setNeutralCount(numFound);
							 		break;
							 	case 3:
							 		positivaTotal = positivaTotal+numFound;
							 		break;
							 	case 4:
							 		positivaTotal = positivaTotal+numFound;
							 		break;
							 }
						 }
					 }
				 }
				 bean.setPositiveCount(positivaTotal);
			}
		
		}catch(Exception e){
			e.printStackTrace();
		}
		ModelAndView mav = new ModelAndView("charts", "model", bean);
		logger.info("bye now");
		return mav;
	}
	@RequestMapping(value = "/tweetresponse1", method = RequestMethod.GET)
	@ResponseBody
	
	public String getTweets(@RequestParam("type") String type,@RequestParam("start") int start,@RequestParam("end") int end) {
		
		logger.info("Welcome to Tweets");
		JSONObject finalObject = new JSONObject();
		
		int startRow =0;
		int endRow=10;
		String tweetType="*";
		if(type!=null && !type.equalsIgnoreCase("general")){
			tweetType = type;
		}
		if(start>startRow){
			startRow =start;
		}
		if(end>endRow){
			endRow=end;
		}
		SolrQuery query = new SolrQuery("sentiment:"+tweetType);
		query.setStart(startRow);
		query.setRows(endRow);
		HomeBean bean = new HomeBean();
		Collection<JSONObject> objectList = new ArrayList<JSONObject>();
		try{
		QueryResponse response = homeservice.getServiceResponse(query);
		if(response!=null){
			 SolrDocumentList responseList = response.getResults();
			 long totalCount = responseList.getNumFound();
			 if(totalCount>0){
				 bean.setResultCount(totalCount);
			 }
			  
			 for(SolrDocument document:responseList){
				 JSONObject json = new JSONObject();
				 json.put("id", document.getFieldValue("id"));
				 json.put("tweet", document.getFieldValue("tweet_content"));
				 objectList.add(json);
			 }
		}
		}catch(Exception e){
			e.printStackTrace();
		}
		
		finalObject.put("tweetList", objectList);
		logger.info("bye Tweets");
		return finalObject.toString();
	}
}
