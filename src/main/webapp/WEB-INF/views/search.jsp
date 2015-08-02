<%@page import="com.vz.tg.model.HomeBean"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<!DOCTYPE html>
<html lang="en">

<head>

    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>Top Guns - Twitter Analysis</title>

    <!-- Bootstrap Core CSS -->
    <link href="<%= request.getContextPath() %>/resources/css/bootstrap.min.css" rel="stylesheet">

    <!-- Custom CSS -->
    <link href="<%= request.getContextPath() %>/resources/css/sb-admin.css" rel="stylesheet">

    <!-- Morris Charts CSS -->
    <link href="<%= request.getContextPath() %>/resources/css/plugins/morris.css" rel="stylesheet">

    <!-- Custom Fonts -->
    <link href="<%= request.getContextPath() %>/resources/font-awesome/css/font-awesome.min.css" rel="stylesheet" type="text/css">
    <script src="<%= request.getContextPath() %>/resources/js/angular/angular.min.js"></script>

    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
        <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
        <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
	<script type="text/javascript">
	var contextpath = "<%= request.getContextPath() %>";
	</script>
</head>

<body>

    <div id="wrapper" ng-app="topguns">

        <!-- Navigation -->
        <nav class="navbar navbar-inverse navbar-fixed-top" role="navigation">
            <!-- Brand and toggle get grouped for better mobile display -->
            <div class="navbar-header">
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-ex1-collapse">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a class="navbar-brand" href="#" onclick="requestHome();">Twitter Data Analysis</a>
            </div>
            <ul class="nav navbar-right top-nav">
            	<li class="message-preview">
            	<div class="media-body">
                       <h5 class="media-heading"><strong>TOP GUNS</strong>
                       </h5>
                 </div>
                </li>
            </ul>
            
            <!-- Sidebar Menu Items - These collapse to the responsive navigation menu on small screens -->
            <div class="collapse navbar-collapse navbar-ex1-collapse">
                <ul class="nav navbar-nav side-nav">
                    <li>
                        <a href="#" onclick="requestHome();"><i class="fa fa-fw fa-dashboard"></i> Dashboard</a>
                    </li>
                    <li>
                        <a href="#" onclick="requestCharts();"><i class="fa fa-fw fa-bar-chart-o"></i> Charts</a>
                    </li>
                    <li class="active">
                    	<a href="#" onclick="requestSearch();"><i class="fa fa-fw fa-search"></i> Search</a>
                    </li>
                    
                </ul>
            </div>
            <!-- /.navbar-collapse -->
        </nav>

        <div id="page-wrapper" ng-controller = "searchcontroller">

            <div class="container-fluid">

                <!-- Page Heading -->
                <div class="row">
                    <div class="col-lg-12">
                        <h1 class="page-header">
                            Dashboard <small>Search Content</small>
                        </h1>
                        <ol class="breadcrumb">
                            <li class="active">
                                <i class="fa fa-dashboard"></i> Tweet Search
                            </li>
                        </ol>
                    </div>
                </div>
                
                
                
                <div class="input-group col-lg-4">
				    <input type="text" class="form-control" id="searchKey" placeholder="search" ng-keypress="data.doClick(item,$event);"/>
				    <span class="input-group-addon">
				    	<a href="#" ng-click="data.doClick(item,$event);" id="searchId"> 
				        	<i class="fa fa-search"></i>
				        </a>
				    </span>
				    
				</div>
				<div style="margin-left:10px;"><span id="processSearch"></span></div>
                <!-- /.row -->
				 
                <div class="row" id="alertDiv" style="display:none;">
                    <div class="col-lg-12">
                        <div class="alert alert-info alert-dismissable" id="alertInfo">
                            <!-- <button type="button" class="close" data-dismiss="alert" aria-hidden="true">&times;</button>
                            <i class="fa fa-info-circle"></i>  <strong>Like SB Admin?</strong> Try out <a href="http://startbootstrap.com/template-overviews/sb-admin-2" class="alert-link">SB Admin 2</a> for additional features!
                        	-->
                        	
                        </div>
                    </div>
                </div>
                <!-- /.row -->

                

                

                
                    <div class="col-lg-12" id="tweetTableBase">
                        <div class="panel panel-default" id="tableHolder" style="display: none;">
                            <div class="panel-heading">
                                <h3 class="panel-title"><i class="fa fa-money fa-fw"></i> Tweet List</h3>
                            </div>
                            <div class="panel-body">
                                <div class="table-responsive">
                                    <table class="table table-bordered table-hover table-striped" id="tweetTable">
                                        <thead>
                                            <tr>
                                                <th>Tweets</th>
                                            </tr>
                                        </thead>
                                        <tbody>
                                           <%--  <c:forEach var="tweet" items="${model.tweetList}" varStatus="i">
                                            	<tr><td>${tweet.value}</td></tr>
                                            </c:forEach> --%>
                                        </tbody>
                                    </table>
                                    <%-- <input type="hidden" id="endRecord" value="${model.endRecord}"/> --%>
                                </div>
                                <div class="text-right" id="navigationDiv">
                                	<div><span id="processNextPrev"></span></div>
                                	<div>
                                	<a ng-click="data.doClick(item,$event);" id="prevNav" style="display: none;"><i class="fa fa-arrow-circle-left"></i> Prev</a>&nbsp;&nbsp;
                                    <a ng-click="data.doClick(item,$event);" id="nextNav">Next <i class="fa fa-arrow-circle-right"></i></a>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                <!-- /.row -->

            </div>
            <!-- /.container-fluid -->

        </div>
        <!-- /#page-wrapper -->

    </div>
    <!-- /#wrapper -->

    <!-- jQuery -->
    <script src="<%= request.getContextPath() %>/resources/js/jquery.js"></script>

    <!-- Bootstrap Core JavaScript -->
    <script src="<%= request.getContextPath() %>/resources/js/bootstrap.min.js"></script>

    <!-- Morris Charts JavaScript -->
    <script src="<%= request.getContextPath() %>/resources/js/plugins/morris/raphael.min.js"></script>
    <script src="<%= request.getContextPath() %>/resources/js/plugins/morris/morris.min.js"></script>
    <script src="<%= request.getContextPath() %>/resources/js/plugins/morris/morris-data.js"></script>
    <script src="<%= request.getContextPath() %>/resources/js/app/search.js"></script>
    <script src="<%= request.getContextPath() %>/resources/js/app/common.js"></script>

</body>

</html>
<style>
.navbar-right{margin-top:20px;color:white !important;}
#tweetTableBase{padding:0px!important;margin-top:10px;}
div.input-group{margin-bottom:20px;}
</style>
