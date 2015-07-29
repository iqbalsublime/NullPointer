<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles"%>
<!DOCTYPE html>
<html>
<head>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/security/tags" prefix="security" %>


<title><tiles:getAsString name="title" /></title>


<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.3.15/angular.min.js"></script>

<script src="http://ajax.aspnetcdn.com/ajax/jquery.validate/1.13.1/jquery.validate.min.js"></script>


	<link rel="stylesheet" href="<spring:url value='/resources/css/bootstrap.min.css'/>" type="text/css"/>
    <link rel="stylesheet" href="<spring:url value='/resources/css/bootstrap-theme.min.css'/>" />
    <link rel="stylesheet" href="<spring:url value='/resources/css/datepicker.css'/>" />
    <script src="<spring:url value='/resources/js/jquery-2.1.1.min.js'/>"></script>
    <script src="<spring:url value='/resources/js/bootstrap.min.js'/>"></script>
    <script src="<spring:url value='/resources/js/bootstrap-datepicker.js'/>"></script>
    
    <!-- Angular Grid  -->
    <link rel="stylesheet" href="<spring:url value='/resources/ag-grid/angular-grid.css'/>" />
    <link rel="stylesheet" href="<spring:url value='/resources/ag-grid/theme-fresh.css'/>" />
    <script src="<spring:url value='/resources/ag-grid/angular-grid.js'/>"></script>

    
    
    <link rel="stylesheet" href="//netdna.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap.min.css">
	<link rel="stylesheet" href="//netdna.bootstrapcdn.com/bootstrap/3.2.0/css/bootstrap-theme.min.css">
	<link rel="stylesheet" href="http://eternicode.github.io/bootstrap-datepicker/bootstrap-datepicker/css/datepicker3.css">
	<link rel="stylesheet" href="//maxcdn.bootstrapcdn.com/font-awesome/4.3.0/css/font-awesome.min.css">
	<script src="//ajax.googleapis.com/ajax/libs/jquery/2.1.0/jquery.min.js"></script>
	<script type="text/javascript" src="http://ajax.aspnetcdn.com/ajax/jquery.validate/1.11.1/jquery.validate.min.js"></script>
	<script src="//netdna.bootstrapcdn.com/bootstrap/3.2.0/js/bootstrap.min.js"></script>
	<script type="text/javascript" src="https://cdnjs.cloudflare.com/ajax/libs/json2/20140204/json2.js"></script>
	<script type="text/javascript" src="http://eternicode.github.io/bootstrap-datepicker/bootstrap-datepicker/js/bootstrap-datepicker.js"></script>
	    
    <meta charset="utf-8">
  
    <meta content="IE=edge,chrome=1" http-equiv="X-UA-Compatible">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="">

    <link href='http://fonts.googleapis.com/css?family=Open+Sans:400,700' rel='stylesheet' type='text/css'>

    <link rel="stylesheet" href="<spring:url value='/resources/css/font-awesome.css'/>" type="text/css"/>
    
    <link rel="stylesheet" href="//maxcdn.bootstrapcdn.com/font-awesome/4.3.0/css/font-awesome.min.css">
  
	<script src="<spring:url value='/resources/js/jquery.knob.js'/>"></script>
    <script type="text/javascript">
        $(function() {
            $(".knob").knob();
        });
    </script>

    <link rel="stylesheet" href="<spring:url value='/resources/css/theme.css'/>" type="text/css"/>
    <link rel="stylesheet" href="<spring:url value='/resources/css/premium.css'/>" type="text/css"/>

</head>
<body class=" theme-blue">
<%@ taglib uri="http://tiles.apache.org/tags-tiles-extras" prefix="tilesx" %>
<tilesx:useAttribute name="current"/>
    <!-- Demo page code -->

    <script type="text/javascript">
        $(function() {
            var match = document.cookie.match(new RegExp('color=([^;]+)'));
            if(match) var color = match[1];
            if(color) {
                $('body').removeClass(function (index, css) {
                    return (css.match (/\btheme-\S+/g) || []).join(' ')
                })
                $('body').addClass('theme-' + color);
            }

            $('[data-popover="true"]').popover({html: true});
            
        });
    </script>
    <style type="text/css">
        #line-chart {
            height:300px;
            width:800px;
            margin: 0px auto;
            margin-top: 1em;
        }
        .navbar-default .navbar-brand, .navbar-default .navbar-brand:hover { 
            color: #fff;
        }
    </style>

    <script type="text/javascript">
        $(function() {
            var uls = $('.sidebar-nav > ul > *').clone();
            uls.addClass('visible-xs');
            $('#main-menu').append(uls.clone());
        });
    </script>

    

    <div class="navbar navbar-default" role="navigation">
        <div class="navbar-header">
          <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target=".navbar-collapse">
            <span class="sr-only">Toggle navigation</span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
          </button>
          <a class="" href="<spring:url value="/" />"><span class="navbar-brand"><span class="fa fa-paper-plane"></span> Null Pointer</span></a></div>
		
		
        <div class="navbar-collapse collapse" style="height: 1px;">
          <ul id="main-menu" class="nav navbar-nav navbar-right">
            <li class="dropdown hidden-xs">
                <a href="#" class="dropdown-toggle" data-toggle="dropdown">
                    <span class="glyphicon glyphicon-user padding-right-small" style="position:relative;top: 3px;"></span> Iqbal
                    <i class="fa fa-caret-down"></i>
                </a>
              <ul class="dropdown-menu">
                 <security:authorize access="isAuthenticated()">
                <li><a href="<spring:url value="/account.html" />">My Account</a></li>
                 </security:authorize>
                <li class="divider"></li>
                <li class="dropdown-header">Admin Panel</li>
                <li><a href="./">Users</a></li>
                <li><a href="./">Security</a></li>
                <li><a tabindex="-1" href="./">Payments</a></li>
                <li class="divider"></li>
                <security:authorize access="isAuthenticated()">
                <li><a tabindex="-1" href="<spring:url value="/logout" />">Logout</a></li>
                </security:authorize>
              </ul>
              
            </li>
          </ul>

        </div>
       
      </div>
    </div>
    

    <div class="sidebar-nav">
    <ul>
    <security:authorize access="hasRole('ROLE_ADMIN')">
    <li><a href="#" data-target=".dashboard-adminPanel" class="nav-header" data-toggle="collapse"><i class="fa fa-fw fa-dashboard"></i> Admin Panel<i class="fa fa-collapse"></i></a></li>
    <li><ul class="dashboard-adminPanel nav nav-list collapse">
            <li><a href="<spring:url value="/users.html" />"><span class="fa fa-caret-right"></span> Users</a></li>
    </ul></li>
      </security:authorize>
    
    <security:authorize access="hasRole('ROLE_USER')">
    <li><a href="#" data-target=".dashboard-menu" class="nav-header" data-toggle="collapse"><i class="fa fa-fw fa-dashboard"></i> My Menu<i class="fa fa-collapse"></i></a></li>
    <li><ul class="dashboard-menu nav nav-list collapse">
            <li><a href="<spring:url value="/newquestion.html" />"><span class="fa fa-caret-right"></span> Ask Question</a></li>
             <li><a href="<spring:url value="/" />"><span class="fa fa-caret-right"></span> Home</a></li>
    </ul></li>
	</security:authorize>


        <li><a href="#" data-target=".legal-menu" class="nav-header collapsed" data-toggle="collapse"><i class="fa fa-fw fa-legal"></i> Legal<i class="fa fa-collapse"></i></a></li>
        <li><ul class="legal-menu nav nav-list collapse">
            <li ><a href=""><span class="fa fa-caret-right"></span> Privacy Policy</a></li>
            <li ><a href=""><span class="fa fa-caret-right"></span> Terms and Conditions</a></li>
    </ul></li>
		<security:authorize access="!isAuthenticated()">
        <li><a href="<spring:url value="/register.html" />" class="nav-header"><i class="fa fa-fw fa-question-circle"></i> Register</a></li>
        <li><a href="<spring:url value="/login.html" />" class="nav-header"><i class="fa fa-fw fa-comment"></i> Login</a></li>
        </security:authorize>
    </ul>
    </div>

    <div class="content">
        <div class="header">
            <div class="stats">
    <p class="stat"><span class="label label-info">5</span> Tickets</p>
    <p class="stat"><span class="label label-success">27</span> Tasks</p>
    <p class="stat"><span class="label label-danger">15</span> Overdue</p>
</div>

            <h1 class="page-title"><tiles:getAsString name="title" /></h1>
                    <ul class="breadcrumb">
            <li><a href="index.html">Home</a> </li>
            <li class="active"><tiles:getAsString name="title" /></li>
        </ul>

        </div>
        <div class="main-content">
            <tiles:insertAttribute name="body" />
		
			<center>
				<tiles:insertAttribute name="footer" />
			</center>
    	</div>


    <script src="lib/bootstrap/js/bootstrap.js"></script>
    <script type="text/javascript">
        $("[rel=tooltip]").tooltip();
        $(function() {
            $('.demo-cancel-click').click(function(){return false;});
        });
    </script>
    
  
</body></html>
