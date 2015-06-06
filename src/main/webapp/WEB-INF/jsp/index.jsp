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
var mainApp = angular.module("mainApp", []);

mainApp.controller('indexController', function($scope, $http) {
	
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