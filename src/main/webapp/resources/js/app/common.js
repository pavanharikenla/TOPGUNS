/**
 * Author: H Pavan Kumar
 */

$.ajax({
  type: "POST",
  url: url,
  data: data,
  success: success,
  dataType: dataType
});

function generateDonut(resObject){
	var agelist = resObject.agegroup;
	//alert(JSON.stringify(agelist));
	Morris.Donut({
	        element: 'morris-donut-chart-tg',
	        data: agelist,
	        resize: true
	    });
}

function generateAreaChart(resObject){
	var categoryList = resObject.categoryData;
	//alert(JSON.stringify(categoryList));
	// Area Chart
    Morris.Area({
        element: 'morris-area-chart-tg',
        data: categoryList,
        xkey: 'period',
        ykeys: ['Smartphones', 'Tablets', 'Products'],
        labels: ['Smartphones', 'Tablets', 'Products'],
        pointSize: 2,
        hideHover: 'auto',
        parseTime: false,
        resize: true
    });
}