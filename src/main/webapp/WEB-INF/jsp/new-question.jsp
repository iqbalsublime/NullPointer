<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="../layout/taglib.jsp"%>

  <form:form commandName="question" cssClass="form-horizontal blogForm">
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
			 <div class="modal-footer">
		      <!--   <button type="button" class="btn btn-default" data-dismiss="modal">Close</button> -->
		        <input type="submit" value="Save" class="btn btn-success">
		      </div>
  </form:form>

