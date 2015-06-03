<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="../layout/taglib.jsp"%>

<script>
var mainApp = angular.module("mainApp", []);

mainApp.controller('studentController', function($scope, $http) {
   
   $scope.questions = [{"title":"What is Java?","id":"1"}, {"title":"What is Java Script?","id":"2"}];
   $scope.title= 'Hello';
   $scope.hideTable  = true ;
   $scope.hideButton  = true ;
   $scope.hidePanel = function(){
	   $scope.hideTable  = true ;
	   $scope.hideButton  = true ;
   }; 
   $scope.getData = function(){
	   console.log("Controller hit!");
	   $http({
		    url: '/getAll.json',
		    method: 'GET',
		    headers: {
		    	"Content-Type": "application/json"
		    }
		    }).success(function(response){
		        $scope.data = response;
		        console.log($scope.data);
		       /*  $scope.hideTable = false;
		        $scope.hideButton  = false ; */
		    }).error(function(error){
		        $scope.data = error;
		        console.log("Failed");
		});
   };
   
   $scope.add = function(id){
	   console.log("Controller hit!");
	   console.log(id);
	   $http({
		    url: '/mkyoung.json',
		    method: 'GET',
		    headers: {
		    	"Content-Type": "application/json"
		    }
		    }).success(function(response){
		        $scope.response = response;
		        console.log($scope.response);
		       /*  $scope.hideTable = false;
		        $scope.hideButton  = false ; */
		    }).error(function(error){
		        $scope.response = error;
		        console.log("Failed");
		});
   };
   
   var init = function () {
	   console.log("On page load");
	};
	// and fire it after definition
	init();
   
});
</script>

<div ng-app="mainApp" ng-controller="studentController">

			<a data-ng-click="getData()">Get List</a>
					<div class="container" ng-hide="hideButton">
						<div class="row clearfix">
							<div class="col-md-12 column">
								 <button type="button" class="btn btn-sm active btn-success" data-ng-click="hidePanel()">Hide Table</button>
							</div>
						</div>
					</div>
					<div class="container" ng-hide="hideTable">
						<div class="row clearfix">
							<div class=" column">
								<table class="table table-striped table-hover">
									<thead>
										<tr class="info">
											<th>
												Name
											</th>
											<th>
												Address
											</th>
											<th>
												City
											</th>
											<th>
												Phone
											</th>
										</tr>
									</thead>
									<tbody>
										<tr data-ng-repeat="person in responses" class="success">
											<td>
												{{person.firstname}}
											</td>
											<td>
												{{person.address}}
											</td>
											<td>
												{{person.city}}
											</td>
											<td>
												{{person.phone}}
											</td>
										</tr>
										
									</tbody>
								</table>
							</div>
						</div>
					</div>

					<div class="panel-body">
								<div class="container" data-ng-repeat="question in questions">
									<div class="row clearfix">
										<div class=" column">
											<div class="">
												<h3>
													<a data-ng-click="add(question.id)">
														{{title}}
														{{question.title}}
													</a> 
													<div>
														<small>On  </small>
													</div>
												</h3>
											</div>
										</div>
									</div>
								</div>
								
						</div>
</div>


<div class="container">
	<div class="row clearfix">
		<div class="col-md-11 column">
			<div class="panel panel-default">
				<div class="panel-heading">
					<h3 class="panel-title">
						My Account 
					</h3>
				</div>
				<div class="panel-body">
					<div class="container">
						<div class="row clearfix">
							<div class="col-md-12 column">
								<div class="row clearfix">
									<div class="col-md-2 column">
										<label>Name:</label>
									</div>
									<div class="col-md-6 column">
										<h5>${user.name}</h5>
									</div>
									
								</div>
								<div class="row clearfix">
									<div class="col-md-2 column">
										<label>ID:</label>
									</div>
									<div class="col-md-6 column">
										<h5>${user.id}</h5>
									</div>
									
								</div>
							</div>
						</div>
					</div>
				</div>
				
			</div>
		</div>
	</div>
</div>



<br/> <br/>



<script type="text/javascript">
$(document).ready(function() {
	$('.nav-tabs a:first').tab('show'); // Select first tab
	$(".triggerRemove").click(function(e) {
		e.preventDefault();
		$("#modalRemove .removeBtn").attr("href", $(this).attr("href"));
		$("#modalRemove").modal();
	});
	
	
});
</script>



<div class="container">
	<div class="row clearfix">
		<div class="col-md-11 column">
			<div class="row clearfix">
				<div class="col-md-6 column">
					<div class="panel panel-default">
						<div class="panel-heading">
							<h3 class="panel-title">
								<c:if test="${empty user.questions}">
									There is no question of this user
								</c:if>
								<c:if test="${not empty user.questions}">
									Questions
								</c:if>
							</h3>
						</div>
						<div class="panel-body">
							<c:forEach items="${user.questions}" var="question">
								<div class="container">
									<div class="row clearfix">
										<div class=" column">
											<div class="">
												<h3>
													<a href="<spring:url value="/question/${question.id}.html" />">
														<c:set var="quesTitle" value="${fn:substring(question.title, 0, 30)}" />
														<c:out value="${quesTitle}" />..
													</a> 
													<div>
														<small>On <c:out value="${question.publishedDate}" />  </small>
													</div>
												</h3>
											</div>
										</div>
									</div>
								</div>
								
							</c:forEach>
						</div>
						
					</div>
				</div>
				<div class="col-md-6 column">
					<div class="panel panel-default">
						<div class="panel-heading">
							<h3 class="panel-title">
								<c:if test="${empty user.answers}">
									There is no answer of this user
								</c:if>
								<c:if test="${not empty user.answers}">
									Answers
								</c:if>
							</h3>
						</div>
						<div class="panel-body">
							<c:forEach items="${user.answers}" var="answer">
								<div class="container">
									<div class="row clearfix">
										<div class=" column">
											<div class="">
												<h3>
													<a href="<spring:url value="/question/${answer.question.id}.html" />">
														<c:set var="ansTitle" value="${fn:substring(answer.question.title, 0, 30)}" />
														<c:out value="${ansTitle}" />..
													</a> 
													<div>
														<c:set var="des" value="${fn:substring(answer.description, 0, 30)}" />
														<small><c:out value="${des}" /> ... </small>
														
													</div>
													<div>
														<small>On <c:out value="${answer.publishedDate}" />  </small>
													</div>
												</h3>
											</div>
										</div>
									</div>
								</div>
								
							</c:forEach>
						</div>
						
					</div>
				</div>
			</div>
		</div>
	</div>
</div>



<div class="container" ng-app="mainApp" ng-controller="studentController">
	<div class="row clearfix">
		<div class="col-md-11 column">
			<div class="row clearfix">
				<div class="col-md-6 column">
					<div class="panel panel-default">
						<div class="panel-heading">
							<h3 class="panel-title">
								
							</h3>
						</div>
						<div class="panel-body">
						
								<div class="container" data-ng-repeat="question in questions">
									<div class="row clearfix">
										<div class=" column">
											<div class="">
												<h3>
													<a >
														{{title}}
														{{question.title}}
													</a> 
													<div>
														<small>On  </small>
													</div>
												</h3>
											</div>
										</div>
									</div>
								</div>
								
						</div>
						
					</div>
				</div>
				<div class="col-md-6 column">
					<div class="panel panel-default">
						<div class="panel-heading">
							<h3 class="panel-title">
								<c:if test="${empty user.answers}">
									There is no answer of this user
								</c:if>
								<c:if test="${not empty user.answers}">
									Answers
								</c:if>
							</h3>
						</div>
						<div class="panel-body">
							<c:forEach items="${user.answers}" var="answer">
								<div class="container">
									<div class="row clearfix">
										<div class=" column">
											<div class="">
												<h3>
													<a href="<spring:url value="/question/${answer.question.id}.html" />">
														<c:set var="ansTitle" value="${fn:substring(answer.question.title, 0, 30)}" />
														<c:out value="${ansTitle}" />..
													</a> 
													<div>
														<c:set var="des" value="${fn:substring(answer.description, 0, 30)}" />
														<small><c:out value="${des}" /> ... </small>
														
													</div>
													<div>
														<small>On <c:out value="${answer.publishedDate}" />  </small>
													</div>
												</h3>
											</div>
										</div>
									</div>
								</div>
								
							</c:forEach>
						</div>
						
					</div>
				</div>
			</div>
		</div>
	</div>
</div>


<!-- Modal -->
<div class="modal fade" id="modalRemove" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
  <div class="modal-dialog">
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
        <h4 class="modal-title" id="myModalLabel">Remove Blog</h4>
      </div>
      <div class="modal-body">
        Really want to remove blog ?
      </div>
      <div class="modal-footer">
        <button type="button" class="btn btn-info" data-dismiss="modal">Cancel</button>
        <a href="" class="btn btn-danger btn-sm removeBtn">Remove</a>
      </div>
    </div>
  </div>
</div>



	