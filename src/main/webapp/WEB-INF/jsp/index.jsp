<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ include file="../layout/taglib.jsp"%>

<h1>Latest Questions</h1>

<table class="table table-bordered table-hover table-striped">
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
						<a href="<spring:url value="/post/${question.id}.html" />">
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
</table>
