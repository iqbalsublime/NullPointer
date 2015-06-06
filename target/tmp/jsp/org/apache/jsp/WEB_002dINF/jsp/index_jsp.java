package org.apache.jsp.WEB_002dINF.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/WEB-INF/jsp/../layout/taglib.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_spring_url_value_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_spring_url_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_spring_url_value_nobody.release();
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("\r\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<div ng-app=\"mainApp\" ng-controller=\"indexController\">\r\n");
      out.write("<div class=\"container\">\r\n");
      out.write("\t<a data-ng-click=\"getData()\">Get Data</a>\r\n");
      out.write("\t<div class=\"row clearfix\">\r\n");
      out.write("\t\t<div class=\"col-md-12 column\">\r\n");
      out.write("\t\t\t\r\n");
      out.write("\t\t\t\t\t\t<div class=\"row clearfix\" ng-hide=\"searchBar\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-md-5 column\" style=\" text-align: right;\">\r\n");
      out.write("\t\t\t\t\t\t\t<label>filter is enabled,</label><a data-ng-click=\"disableFilter()\" style=\"\">disable?</a>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-md-2 column\" style=\" text-align: right;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<label>No of Items</label>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-md-1 column\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<form class=\"form-inline\" role=\"form\" data-placement='bottom'  data-toggle=\"tooltip\"  title=\"Select iteams per Page\">\r\n");
      out.write("\t\t\t\t\t\t   \t\t<div class=\"clientCount\">\r\n");
      out.write("\t\t\t\t\t\t        \t<!-- <label class=\"text-muted\" style=\"font-size: 85%\">{{itemRows}} : </label> -->\r\n");
      out.write("\t\t\t\t\t\t\t         <select class=\"form-control\" data-ng-model=\"pageSize\">\r\n");
      out.write("\t\t\t\t\t\t\t            <option>6</option>\r\n");
      out.write("\t\t\t\t\t\t\t         \t<option>9</option>\r\n");
      out.write("\t\t\t\t\t\t\t         \t<option>10</option>\r\n");
      out.write("\t\t\t\t\t\t\t         \t<option>20</option>\r\n");
      out.write("\t\t\t\t\t\t\t         \t<option>30</option>\r\n");
      out.write("\t\t\t\t\t\t\t         </select>\r\n");
      out.write("\t\t\t\t\t\t    \t</div>\r\n");
      out.write("\t\t\t\t\t\t    \t </form>   \r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-md-4 column\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<div>\r\n");
      out.write("\t\t\t\t\t\t\t        <input type=\"text\" name=\"table_search\" class=\"form-control input-sm clientSearch\" placeholder= \"Search\" data-ng-model=\"searchText\"/>\r\n");
      out.write("\t\t\t\t\t\t\t     </div>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"row clearfix\" ng-hide=\"filterEnableBar\">\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-md-5 column\" style=\" text-align: right;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<label>filter is disbaled,</label><a data-ng-click=\"enableFilter()\">enable?</a>\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-md-5 column\" >\r\n");
      out.write("\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-md-2 column\">\r\n");
      out.write("\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<h1>Latest Questions</h1>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<table class=\"table table-bordered table-hover table-striped\" ng-hide=\"hideQuestion\">\r\n");
      out.write("\t\t\t\t\t<thead>\r\n");
      out.write("\t\t\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t\t\t<th>Questions</th>\r\n");
      out.write("\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t</thead>\r\n");
      out.write("\t\t\t\t\t<tbody>\r\n");
      out.write("\t\t\t\t\t\t\t<tr data-ng-repeat=\"question in response\">\r\n");
      out.write("\t\t\t\t\t\t\t\t<td > \r\n");
      out.write("\t\t\t\t\t\t\t\t\t<strong>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<a href=\"");
      if (_jspx_meth_spring_url_0(_jspx_page_context))
        return;
      out.write("\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t{{question.title}}\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</a> \r\n");
      out.write("\t\t\t\t\t\t\t\t\t</strong>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<br />\r\n");
      out.write("\t\t\t\t\t\t\t\t\t{{question.description}}\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<br />\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\r\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"container\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"row clearfix\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"col-md-1 column\" style=\" text-align: right;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t <span class=\"label label-warning\" href=\"");
      if (_jspx_meth_spring_url_1(_jspx_page_context))
        return;
      out.write("\">{{question.tagName}}</span>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"col-md-4 column\"  style=\" text-align: left;\">\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t On {{question.publishedDate  | date:'medium'}} by <a href=\"");
      if (_jspx_meth_spring_url_2(_jspx_page_context))
        return;
      out.write("\" class=\"info\">{{question.userName}}</a>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t\t\t\t</td>\r\n");
      out.write("\t\t\t\t\t\t\t</tr>\r\n");
      out.write("\t\t\t\t\t</tbody>\r\n");
      out.write("\t\t\t\t</table>\r\n");
      out.write("\t\t\t<ul class=\"pagination\">\r\n");
      out.write("\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t<a href=\"#\">Prev</a>\r\n");
      out.write("\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t<a href=\"#\">1</a>\r\n");
      out.write("\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t<a href=\"#\">2</a>\r\n");
      out.write("\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t<a href=\"#\">3</a>\r\n");
      out.write("\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t<a href=\"#\">4</a>\r\n");
      out.write("\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t<a href=\"#\">5</a>\r\n");
      out.write("\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t<a href=\"#\">Next</a>\r\n");
      out.write("\t\t\t\t</li>\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script>\r\n");
      out.write("var mainApp = angular.module(\"mainApp\", []);\r\n");
      out.write("\r\n");
      out.write("mainApp.controller('indexController', function($scope, $http) {\r\n");
      out.write("\t\r\n");
      out.write("\t$scope.getData = function(){ \r\n");
      out.write("\t\t$http({\r\n");
      out.write("\t\t    url: '/getallquestion.json',\r\n");
      out.write("\t\t    method: 'GET',\r\n");
      out.write("\t\t    headers: {\r\n");
      out.write("\t\t    \t\"Content-Type\": \"application/json\"\r\n");
      out.write("\t\t    }\r\n");
      out.write("\t\t    }).success(function(response){\r\n");
      out.write("\t\t        console.log(response);\r\n");
      out.write("\t\t    }).error(function(error){\r\n");
      out.write("\t\t        $scope.s = error;\r\n");
      out.write("\t\t});\r\n");
      out.write("\t};\r\n");
      out.write("   \r\n");
      out.write("\r\n");
      out.write("   $scope.enableFilter = function(){\r\n");
      out.write("\t   $scope.searchBar = false;\r\n");
      out.write("\t   $scope.filterEnableBar = true;\r\n");
      out.write("\t   \r\n");
      out.write("   };\r\n");
      out.write("   \r\n");
      out.write("   $scope.disableFilter = function(){\r\n");
      out.write("\t   $scope.searchBar = true;\r\n");
      out.write("\t   $scope.filterEnableBar = false;\r\n");
      out.write("\t   \r\n");
      out.write("   };\r\n");
      out.write("   \r\n");
      out.write("   var getQuestions = function () {\r\n");
      out.write("\t   $http({\r\n");
      out.write("\t\t    url: '/getquestion.json',\r\n");
      out.write("\t\t    method: 'GET',\r\n");
      out.write("\t\t    headers: {\r\n");
      out.write("\t\t    \t\"Content-Type\": \"application/json\"\r\n");
      out.write("\t\t    }\r\n");
      out.write("\t\t    }).success(function(response){\r\n");
      out.write("\t\t        $scope.response = response;\r\n");
      out.write("\t\t        $scope.hideQuestion = false;\r\n");
      out.write("\t\t    }).error(function(error){\r\n");
      out.write("\t\t        $scope.response = error;\r\n");
      out.write("\t\t});\r\n");
      out.write("   };\r\n");
      out.write("  \r\n");
      out.write("   var init = function () {\r\n");
      out.write("\t   console.log(\"On page load\");\r\n");
      out.write("\t   $scope.hideQuestion = true;\r\n");
      out.write("\t   $scope.searchBar = true;\r\n");
      out.write("\t   $scope.filterEnableBar = false;\r\n");
      out.write("\t   getQuestions();\r\n");
      out.write("\t};\r\n");
      out.write("\t// and fire it after definition\r\n");
      out.write("\tinit();\r\n");
      out.write("   \r\n");
      out.write("});\r\n");
      out.write("</script>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_spring_url_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:url
    org.springframework.web.servlet.tags.UrlTag _jspx_th_spring_url_0 = (org.springframework.web.servlet.tags.UrlTag) _jspx_tagPool_spring_url_value_nobody.get(org.springframework.web.servlet.tags.UrlTag.class);
    _jspx_th_spring_url_0.setPageContext(_jspx_page_context);
    _jspx_th_spring_url_0.setParent(null);
    _jspx_th_spring_url_0.setValue("/question/{{question.id}}.html");
    int[] _jspx_push_body_count_spring_url_0 = new int[] { 0 };
    try {
      int _jspx_eval_spring_url_0 = _jspx_th_spring_url_0.doStartTag();
      if (_jspx_th_spring_url_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_url_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_url_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_url_0.doFinally();
      _jspx_tagPool_spring_url_value_nobody.reuse(_jspx_th_spring_url_0);
    }
    return false;
  }

  private boolean _jspx_meth_spring_url_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:url
    org.springframework.web.servlet.tags.UrlTag _jspx_th_spring_url_1 = (org.springframework.web.servlet.tags.UrlTag) _jspx_tagPool_spring_url_value_nobody.get(org.springframework.web.servlet.tags.UrlTag.class);
    _jspx_th_spring_url_1.setPageContext(_jspx_page_context);
    _jspx_th_spring_url_1.setParent(null);
    _jspx_th_spring_url_1.setValue("/tag/{{question.tagId}}.html");
    int[] _jspx_push_body_count_spring_url_1 = new int[] { 0 };
    try {
      int _jspx_eval_spring_url_1 = _jspx_th_spring_url_1.doStartTag();
      if (_jspx_th_spring_url_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_url_1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_url_1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_url_1.doFinally();
      _jspx_tagPool_spring_url_value_nobody.reuse(_jspx_th_spring_url_1);
    }
    return false;
  }

  private boolean _jspx_meth_spring_url_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:url
    org.springframework.web.servlet.tags.UrlTag _jspx_th_spring_url_2 = (org.springframework.web.servlet.tags.UrlTag) _jspx_tagPool_spring_url_value_nobody.get(org.springframework.web.servlet.tags.UrlTag.class);
    _jspx_th_spring_url_2.setPageContext(_jspx_page_context);
    _jspx_th_spring_url_2.setParent(null);
    _jspx_th_spring_url_2.setValue("/users/{{question.userId}}.html");
    int[] _jspx_push_body_count_spring_url_2 = new int[] { 0 };
    try {
      int _jspx_eval_spring_url_2 = _jspx_th_spring_url_2.doStartTag();
      if (_jspx_th_spring_url_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_url_2[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_url_2.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_url_2.doFinally();
      _jspx_tagPool_spring_url_value_nobody.reuse(_jspx_th_spring_url_2);
    }
    return false;
  }
}
