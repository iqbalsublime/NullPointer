<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="../layout/taglib.jsp"%>

<div class="container">
	<div class="row clearfix">
		<div class="col-md-12 column">
			<ul class="nav nav-pills">
				<li class="active">
					 Tag Name : <a href="#"> <span class="badge pull-right"><c:out value="${tag.id}" /></span> <c:out value="${tag.name}" /></a>
				</li>
			</ul>
		</div>
	</div>
</div>
<c:if test="${empty tag.questions}">
No Question for this Tag! 
</c:if> 	

<c:if test="${not empty tag.questions}">		
	Question
	<c:forEach items="${tag.questions}" var="question">
		<div class="container">
			<div class="row clearfix">
				<div class="col-md-12 column">
					<div class="panel panel-success">
						<div class="panel-heading">
							<h3 class="panel-title">
								<c:out value="${question.title}" />
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
						</div>
					</div>
				</div>
			</div>
		</div>
	</c:forEach>
</c:if> 

