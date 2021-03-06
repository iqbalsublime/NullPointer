<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="../layout/taglib.jsp"%>

<div class="container">
	<div class="row clearfix">
		<div class="col-md-11 column">
			<div class="panel panel-default">
				<div class="panel-heading">
					<h3 class="panel-title">
						Details of <c:out value="${user.name}" />
					</h3>
				</div>
				<div class="panel-body">
					<div class="container">
						<div class="row clearfix">
							<div class="col-md-10 column">
								<div class="row clearfix">
									<div class="col-md-1 column">
										<label>Name:</label>
									</div>
									<div class="col-md-5 column">
										<h5>${user.name}</h5>
									</div>
									
								</div>
								<div class="row clearfix">
									<div class="col-md-1 column">
										<label>ID:</label>
									</div>
									<div class="col-md-5 column">
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
														<c:out value="${question.title}" />
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
														<c:out value="${answer.question.title}" />
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



	