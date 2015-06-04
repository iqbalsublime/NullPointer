<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="../layout/taglib.jsp"%>

	

  <form:form commandName="question" cssClass="form-horizontal blogForm">
  
		    <c:if test="${param.success eq true}">
				<div class="alert alert-success">Question posted successfull!</div>
			</c:if> 
			
  			<div class="form-group">
				<label for="title" class="col-sm-2 control-label">Title:</label>
				<div class="col-sm-10">
					<form:input path="title" cssClass="form-control"/>
					<form:errors path="title"/>
				</div>
			</div> 
			<div class="form-group">
				<label for="description" class="col-sm-2 control-label">Descrption:</label>
				<div class="col-sm-10">
					<form:textarea path="description" cssClass="form-control" />
					<form:errors path="description"/>
				</div>
			</div>
			<div class="form-group">
				<label for="tag" class="col-sm-2 control-label">Tag:</label>
				<div class="col-sm-10">
					<form:select path="tag.id" class="form-control required">
						<option value="" label="--- Select Tag ---" />
						<c:forEach var="tag" items="${tags}">
							<option value="${tag.id}">
								${tag.name}</option>
						</c:forEach>
					</form:select>
				</div>
			</div>
			 <div class="modal-footer">
		      <!--   <button type="button" class="btn btn-default" data-dismiss="modal">Close</button> -->
		        <input type="submit" value="Save" class="btn btn-info btn-lg round-btn" >
		      </div>
  </form:form>

<style>
.round-btn{
border-radius: 28px;
}

</style>
