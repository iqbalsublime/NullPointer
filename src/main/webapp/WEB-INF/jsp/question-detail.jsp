<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="../layout/taglib.jsp"%>
<div ng-app="mainApp" ng-controller="questionDetailsController">

<div class="container">
	<div class="row clearfix">
		<div class="col-md-11 column">
			<div class="panel panel-info">
				<div class="panel-heading">
					<h3 class="panel-title">
						<c:out value="${question.title}" />
						<input type="hidden" data-ng-model="ques" value="${question.id}">
					</h3>
				</div>
				<div class="panel-body">
					<c:out value="${question.description}" />
				</div>
				<div class="panel-footer">
			<div class="row">
			On  <fmt:formatDate type="both" value="${question.publishedDate}"  dateStyle="short" timeStyle="short" /> by
				 <span class="label label-info">
					 <a href="<spring:url value="/users/${question.user.id}.html" />">
						<c:out value="${question.user.name}" />
					 </a>
				 </span>
				 
			</div>
			<div class="row">
				 <label>Tag : </label>
				 <span class="label label-danger">
				 	<a href="<spring:url value="/tag/${question.tag.id}.html" />">
						<c:out value="${question.tag.name}" />
					</a>	
				 </span>  
			</div>
				</div>
			</div>
		</div>
	</div>
</div>
<div class="container">
	<div class="row clearfix">
		<div class="col-md-11 column">
			<div class="row clearfix">			 	
						<div class="col-md-2 column">
						
						</div>
						
							<div class="col-md-10 column">
								<ul>
									<c:forEach items="${question.comments}" var="comment">
										<li style="border: medium; border-color: black;">
											<c:out value="${comment.commentText}" />
										</li>
									</c:forEach>
								</ul>
							</div>
						
			</div>
		</div>
	</div>
</div>

<div class="container">
	<div class="row clearfix">
		<div class="col-md-11 column">
			<div class="row clearfix" ng-hide="commentStatus">
						<div class="col-md-2 column">
						</div>
						<div class="col-md-10 column">
							<div class="alert alert-success">{{commentmgs}}</div>
						</div>
						
			</div>
		</div>
	</div>
	<div class="row clearfix">
		<div class="col-md-11 column">
			<div class="row clearfix">
						<div class="col-md-2 column">
						</div>
						<div class="col-md-8 column">
										<div class="form-group">
											 	<input data-ng-model="comment.commentText" type="text" placeholder="Add Comment" Class="form-control">
										</div>
						</div>
						<div class="col-md-2 column">
							  <input type="button" value="Add" class="btn btn-success" data-ng-click="submit()">
						</div>
			</div>
		</div>
	</div>
</div>

<br/>

<c:if test="${empty question.answers}">
No Answer for this Question! 
</c:if> 	

<c:if test="${not empty question.answers}">		
	ANSWER
	<c:forEach items="${question.answers}" var="answer">
		<div class="container">
			<div class="row clearfix">
				<div class="col-md-11 column">
					<div class="panel panel-success">
						<div class="panel-heading">
							<h3 class="panel-title">
								<c:out value="${answer.description}" />
							</h3>
						</div>
						<div class="panel-body">
							<c:out value="${answer.description}" />
						</div>
						<div class="panel-footer">
							<div class="row">
					On  <fmt:formatDate type="both" value="${answer.publishedDate}"  dateStyle="short" timeStyle="short" /> by
						 <span class="label label-info">
							 <a href="<spring:url value="/users/${answer.user.id}.html" />">
								<c:out value="${answer.user.name}" />
							 </a>
						 </span> 
					</div>
						</div>
					</div>
				</div>
			</div>
		</div>
	</c:forEach>
</c:if> 

 <form:form commandName="answer" cssClass="form-horizontal answerForm">
  
		    <c:if test="${param.success eq true}">
				<div class="alert alert-success">Answer posted successfull!</div>
			</c:if> 
			
			<div class="form-group">
				<label for="description" class="col-sm-2 control-label">Your Answer:</label>
				<div class="col-sm-10">
					<form:textarea path="description" cssClass="form-control" />
					<form:errors path="description"/>
				</div>
			</div>
			 <div class="modal-footer">
		      <!--   <button type="button" class="btn btn-default" data-dismiss="modal">Close</button> -->
		        <input type="submit" value="Save" class="btn btn-success">
		      </div>
  </form:form>
  
 </div>
 
 <script>
var mainApp = angular.module("mainApp", []);

mainApp.controller('questionDetailsController', function($scope, $http) {
   
	 $scope.comment = {}; 
   		
	 $scope.submit = function(){
		 console.log($scope.comment);
		 console.log($scope.ques);
		  $http({
		      method: 'POST', url: '/postcomment.json',
		      data: $scope.comment
		    }).
		      success(function(data, status, headers, config) {
		    	  $scope.commentStatus = false;
		    	  $scope.commentmgs = 'Comment posted successfull!';
		    	  $scope.comment = {}; 
		    	  $window.location.replace('./question/{id}.html'); 
		      }).
		      error(function(data, status, headers, config) {
		        if(status == 400) {
		          $scope.messages = data;
		          $scope.commentStatus = false;
		          $scope.commentmgs = 'Unable to post Comment! ';
		        } else {
		        	 $scope.commentStatus = false;
		        	 $scope.commentmgs = 'Unexpected server error. ';
		        }
		      }); 
	   };
  
   var init = function () {
	   console.log("On page load");
	   $scope.commentStatus = true;
	};
	// and fire it after definition
	init();
   
});
</script>

<script type="text/javascript">
$(document).ready(function() {
	
	$(".answerForm").validate(
		{
			rules: {
				description: {
					required : true,
					minlength : 10
				}
			
			},
			highlight: function(element) {
				$(element).closest('.form-group').removeClass('has-success').addClass('has-error');
			},
			unhighlight: function(element) {
				$(element).closest('.form-group').removeClass('has-error').addClass('has-success');
			}
		}
	);
});
</script>
