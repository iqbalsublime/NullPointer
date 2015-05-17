<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<div id="loginModal" class="modal show" tabindex="-1" role="dialog" aria-hidden="true" style="padding-top: 5%">
  <div class="modal-dialog">
  <div class="modal-content">
      <div class="modal-header">
          <button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
          <h1 class="text-center">Login</h1>
      </div>
      <div class="modal-body">
          <form class="form col-md-12 center-block" action='/j_spring_security_check' method='POST'>
            <div class="form-group">
              <input type="text" class="form-control input-lg" placeholder="Name" name='j_username'>
            </div>
            <div class="form-group">
              <input type='password' name='j_password' class="form-control input-lg" placeholder="Password">
            </div>
            <div class="form-group">
              <input class="btn btn-primary btn-lg btn-block" name="submit" type="submit" value="Login"/>
              <span class="pull-right"><a href="#">Register</a></span><span><a href="#">Need help?</a></span>
            </div>
          </form>
      </div>
      <div class="modal-footer">
          <div class="col-md-12">
          <button class="btn" data-dismiss="modal" aria-hidden="true">Cancel</button>
		  </div>	
      </div>
  </div>
  </div>
</div>