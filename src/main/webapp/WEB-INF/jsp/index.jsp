<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ include file="../layout/taglib.jsp"%>

<div ng-app="mainApp" ng-controller="indexController">
<div class="container">
	<a data-ng-click="getData()">Get Data</a>
	<div class="row clearfix">
		<div class="col-md-12 column">
			
						<div class="row clearfix" ng-hide="searchBar">
							<div class="col-md-5 column" style=" text-align: right;">
							<label>filter is enabled,</label><a data-ng-click="disableFilter()" style="">disable?</a>
							</div>
							<div class="col-md-2 column" style=" text-align: right;">
								<label>No of Items</label>
							</div>
							<div class="col-md-1 column">
								<form class="form-inline" role="form" data-placement='bottom'  data-toggle="tooltip"  title="Select iteams per Page">
						   		<div class="clientCount">
						        	<!-- <label class="text-muted" style="font-size: 85%">{{itemRows}} : </label> -->
							         <select class="form-control" data-ng-model="pageSize">
							            <option>6</option>
							         	<option>9</option>
							         	<option>10</option>
							         	<option>20</option>
							         	<option>30</option>
							         </select>
						    	</div>
						    	 </form>   
							</div>
							<div class="col-md-4 column">
								<div>
							        <input type="text" name="table_search" class="form-control input-sm clientSearch" placeholder= "Search" data-ng-model="searchText"/>
							     </div>
							</div>
						</div>
						<div class="row clearfix" ng-hide="filterEnableBar">
							<div class="col-md-5 column" style=" text-align: right;">
								<label>filter is disbaled,</label><a data-ng-click="enableFilter()">enable?</a>
							</div>
							<div class="col-md-5 column" >
								
							</div>
							<div class="col-md-2 column">
							</div>
						</div>
					
		
		
		
				
				<h1>Latest Questions</h1>
				
				<table class="table table-bordered table-hover table-striped" ng-hide="hideQuestion">
					<thead>
						<tr>
							<th>Questions</th>
						</tr>
					</thead>
					<tbody>
							<tr data-ng-repeat="question in response">
								<td > 
									<strong>
										<a href="<spring:url value="/question/{{question.id}}.html" />">
											{{question.title}}
										</a> 
									</strong>
									<br />
									{{question.description}}
									<br />
									
									<div class="container">
										<div class="row clearfix">
											<div class="col-md-1 column" style=" text-align: right;">
												 <span class="label label-warning" href="<spring:url value="/tag/{{question.tagId}}.html" />">{{question.tagName}}</span>
											</div>
											<div class="col-md-4 column"  style=" text-align: left;">
												 On {{question.publishedDate  | date:'medium'}} by <a href="<spring:url value="/users/{{question.userId}}.html" />" class="info">{{question.userName}}</a>
											</div>
										</div>
									</div>
								</td>
							</tr>
					</tbody>
				</table>
			<ul class="pagination">
				<li>
					<a href="#">Prev</a>
				</li>
				<li>
					<a href="#">1</a>
				</li>
				<li>
					<a href="#">2</a>
				</li>
				<li>
					<a href="#">3</a>
				</li>
				<li>
					<a href="#">4</a>
				</li>
				<li>
					<a href="#">5</a>
				</li>
				<li>
					<a href="#">Next</a>
				</li>
			</ul>
		</div>
	</div>
</div>

<h1>Angular Grid </h1>
<div style="height: 6%;">
        Page Size:
        <select ng-model="pageSize" ng-change="onPageSizeChanged()">
            <option value="10">10</option>
            <option value="100">100</option>
            <option value="500">500</option>
            <option value="1000">1000</option>
        </select>
</div>
<div ag-grid="gridOptions" class="ag-dark" style="height: 100%;"></div>


<%-- <table class="table table-bordered table-hover table-striped">
	<thead>
		<tr>
			<th>Questions</th>
		</tr>
	</thead>
	<tbody>
		<c:forEach items="${questions}" var="question">
			<tr>
				<td> 
					<strong>
						<a href="<spring:url value="/question/${question.id}.html" />">
							<c:out value="${question.title}" />
						</a> 
					</strong>
					<br />
					${question.description}
					<br />
					On  <fmt:formatDate type="both" value="${question.publishedDate}"  dateStyle="short" timeStyle="short" /> by
					
					<a href="<spring:url value="/users/${question.user.id}.html" />">
					<c:out value="${question.user.name}" />
					</a>
				</td>
			</tr>
		</c:forEach>
	</tbody>
</table> --%>
</div>


<script>
var mainApp = angular.module("mainApp", ["angularGrid"]);

mainApp.controller('indexController', function($scope, $http) {
	
	$scope.pageSize = '10';
	
	var columnDefs = [	// this row just shows the row index, doesn't use any data from the row
	                    {headerName: "#", width: 50, cellRenderer: function(params) {
	                        return params.node.id + 1;
	                    } },
	                    {headerName: "Athlete", field: "athlete", width: 150},
	                    {headerName: "Age", field: "age", width: 90},
	                    {headerName: "Country", field: "country", width: 120},
	                    {headerName: "Year", field: "year", width: 90},
	                    {headerName: "Date", field: "date", width: 110},
	                    {headerName: "Sport", field: "sport", width: 110},
	                    {headerName: "Gold", field: "gold", width: 100},
	                    {headerName: "Silver", field: "silver", width: 100},
	                    {headerName: "Bronze", field: "bronze", width: 100},
	                    {headerName: "Total", field: "total", width: 100}

	                ];

	                var rowData = [
						 {"athlete":"Michael Phelps","age":23,"country":"United States","year":2008,"date":"24/08/2008","sport":"Swimming","gold":8,"silver":0,"bronze":0,"total":8},
						 {"athlete":"Michael Phelps","age":19,"country":"United States","year":2004,"date":"29/08/2004","sport":"Swimming","gold":6,"silver":0,"bronze":2,"total":8},
						 {"athlete":"Michael Phelps","age":27,"country":"United States","year":2012,"date":"12/08/2012","sport":"Swimming","gold":4,"silver":2,"bronze":0,"total":6},
						 {"athlete":"Natalie Coughlin","age":25,"country":"United States","year":2008,"date":"24/08/2008","sport":"Swimming","gold":1,"silver":2,"bronze":3,"total":6},
						 {"athlete":"Aleksey Nemov","age":24,"country":"Russia","year":2000,"date":"01/10/2000","sport":"Gymnastics","gold":2,"silver":1,"bronze":3,"total":6},
						 {"athlete":"Alicia Coutts","age":24,"country":"Australia","year":2012,"date":"12/08/2012","sport":"Swimming","gold":1,"silver":3,"bronze":1,"total":5},
						 {"athlete":"Missy Franklin","age":17,"country":"United States","year":2012,"date":"12/08/2012","sport":"Swimming","gold":4,"silver":0,"bronze":1,"total":5},
						 {"athlete":"Ryan Lochte","age":27,"country":"United States","year":2012,"date":"12/08/2012","sport":"Swimming","gold":2,"silver":2,"bronze":1,"total":5},
						 {"athlete":"Allison Schmitt","age":22,"country":"United States","year":2012,"date":"12/08/2012","sport":"Swimming","gold":3,"silver":1,"bronze":1,"total":5},
						 {"athlete":"Natalie Coughlin","age":21,"country":"United States","year":2004,"date":"29/08/2004","sport":"Swimming","gold":2,"silver":2,"bronze":1,"total":5},
						 {"athlete":"Ian Thorpe","age":17,"country":"Australia","year":2000,"date":"01/10/2000","sport":"Swimming","gold":3,"silver":2,"bronze":0,"total":5},
						 {"athlete":"Dara Torres","age":33,"country":"United States","year":2000,"date":"01/10/2000","sport":"Swimming","gold":2,"silver":0,"bronze":3,"total":5}
	                ];

	                $scope.gridOptions = {
	                        columnDefs: columnDefs,
	                        enableSorting: true,
	                        enableFilter: true,
	                        enableColResize: true,
	                        rowData: rowData,
	                        dontUseScrolls: true // because so little data, no need to use scroll bars
	                    };

	
	$scope.getData = function(){ 
		$http({
		    url: '/getallquestion.json',
		    method: 'GET',
		    headers: {
		    	"Content-Type": "application/json"
		    }
		    }).success(function(response){
		        console.log(response);
		    }).error(function(error){
		        $scope.s = error;
		});
	};
   

   $scope.enableFilter = function(){
	   $scope.searchBar = false;
	   $scope.filterEnableBar = true;
	   
   };
   
   $scope.disableFilter = function(){
	   $scope.searchBar = true;
	   $scope.filterEnableBar = false;
	   
   };
   
   var getQuestions = function () {
	   $http({
		    url: '/getquestion.json',
		    method: 'GET',
		    headers: {
		    	"Content-Type": "application/json"
		    }
		    }).success(function(response){
		        $scope.response = response;
		        $scope.hideQuestion = false;
		    }).error(function(error){
		        $scope.response = error;
		});
   };
  
   var init = function () {
	   console.log("On page load");
	   $scope.hideQuestion = true;
	   $scope.searchBar = true;
	   $scope.filterEnableBar = false;

	   getQuestions();
	};
	// and fire it after definition
	init();
   
});
</script>