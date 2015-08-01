package com.vz.tg.connectors;

import org.apache.solr.client.solrj.SolrClient;
import org.apache.solr.client.solrj.impl.HttpSolrClient;


public class SolrConnector {
	public static SolrClient getConnection(){
		String url = "http://113.128.164.246:8983/solr/tg_core";
		SolrClient solr = new HttpSolrClient(url);
		return solr;
	}
}
