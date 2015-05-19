<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="../layout/taglib.jsp"%>

<h1>Details of <c:out value="${user.name}" /></h1>

<label>Name:</label> <h5>${user.name}</h5>
<label>ID:</label> <h5>${user.id}</h5>
<label>Password:</label> <h5>${user.password}</h5>



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

<!-- Nav tabs -->
<ul class="nav nav-tabs">
	<c:forEach items="${user.questions}" var="question">
	  <li><a href="#blog_${question.id}" data-toggle="tab"><c:out value="${question.title}" /></a></li>
	</c:forEach>
</ul>

<!-- Tab panes -->
<div class="tab-content">
<c:forEach items="${user.questions}" var="question">
  <div class="tab-pane" id="blog_${question.id}">
	<h1><c:out value="${question.title}" /></h1>
	<p>
	<%-- <a href='<spring:url value="/blog/remove/${question.id}.html" />' class="btn btn-danger triggerRemove">Remove Question</a> --%>
	<c:out value="${question.title}" /></p>

<%-- 	<table class="table table-bordered table-hover table-striped">
		<thead>
			<tr>
				<th>Title</th>
				<th>Link</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${question.items}" var="item">
				<tr>
					<td><c:out value="${question.title}" /></td>
					<td><c:out value="${question.link}" /></td>
				</tr>
			</c:forEach>
		</tbody>
	</table> --%>
  </div>
</c:forEach>
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



	