<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="../layout/taglib.jsp"%>

<div class="container">
	<div class="row clearfix">
		<div class="col-md-12 column">
			<h2>
				<c:out value="${question.title}" />
			</h2>
			<p>
				<c:out value="${question.description}" />
			</p>
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