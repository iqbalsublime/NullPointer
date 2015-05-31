<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="../layout/taglib.jsp"%>

<div class="container" ng-app="helloApp">
	<div class="row clearfix" ng-controller="HttpController">
		<div class="col-md-12 column">
			<ul class="nav nav-pills">
				<li class="active">
					 Tag Name : <a href="#"> <span class="badge pull-right"><c:out value="${tag.id}" /></span> <c:out value="${tag.name}" /></a>
					 <a data-ng-click="getAllTodos()">Click</a>
				</li>
			</ul>
		</div>
	</div>
</div>
<c:if test="${empty tag.questions}">
No Question for this Tag! 
</c:if> 	

<c:if test="${not empty tag.questions}">		
	<br/>
	<label>Questions</label>
	<c:forEach items="${tag.questions}" var="question">
		<div class="container">
			<div class="row clearfix">
				<div class="col-md-12 column">
					<div class="page-header">
						<h3>
							<a href="<spring:url value="/question/${question.id}.html" />">
								<c:out value="${question.title}" />
							</a> 
							<div>
								<small>On <c:out value="${question.publishedDate}" /> By <c:out value="${question.user.name}" /> </small>
							</div>
						</h3>
					</div>
				</div>
			</div>
		</div>
		
	</c:forEach>
</c:if> 
<script type="text/javascript">
var helloApp = angular.module("helloApp", []);
helloApp.controller("HttpController", [ '$scope', '$http', function($scope, $http) {
	
	$scope.getAllTodos = function(){
		$http({
			method : 'GET',
			url : '/getAllProfiles.html'
		}).success(function(data, status, headers, config) {
			$scope.profiles = data;
		}).error(function(data, status, headers, config) {
			alert( "failure");
		});
    }
	
		
} ])
	
</script>


