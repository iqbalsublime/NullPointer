package org.apache.jsp.WEB_002dINF.layout;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class classics_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fspring_005furl_0026_005fvalue_005fnobody;
  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fsecurity_005fauthorize_0026_005faccess;

  private javax.el.ExpressionFactory _el_expressionfactory;
  private org.apache.AnnotationProcessor _jsp_annotationprocessor;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fspring_005furl_0026_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _005fjspx_005ftagPool_005fsecurity_005fauthorize_0026_005faccess = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
    _jsp_annotationprocessor = (org.apache.AnnotationProcessor) getServletConfig().getServletContext().getAttribute(org.apache.AnnotationProcessor.class.getName());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fspring_005furl_0026_005fvalue_005fnobody.release();
    _005fjspx_005ftagPool_005fsecurity_005fauthorize_0026_005faccess.release();
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<title>");
      if (_jspx_meth_tiles_005fgetAsString_005f0(_jspx_page_context))
        return;
      out.write("</title>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script src=\"https://ajax.googleapis.com/ajax/libs/angularjs/1.3.15/angular.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("<script src=\"http://ajax.aspnetcdn.com/ajax/jquery.validate/1.13.1/jquery.validate.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"");
      if (_jspx_meth_spring_005furl_005f0(_jspx_page_context))
        return;
      out.write("\" type=\"text/css\"/>\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      if (_jspx_meth_spring_005furl_005f1(_jspx_page_context))
        return;
      out.write("\" />\r\n");
      out.write("    <script src=\"");
      if (_jspx_meth_spring_005furl_005f2(_jspx_page_context))
        return;
      out.write("\"></script>\r\n");
      out.write("    <script src=\"");
      if (_jspx_meth_spring_005furl_005f3(_jspx_page_context))
        return;
      out.write("\"></script>\r\n");
      out.write("    \r\n");
      out.write("    \r\n");
      out.write("    <meta charset=\"utf-8\">\r\n");
      out.write("  \r\n");
      out.write("    <meta content=\"IE=edge,chrome=1\" http-equiv=\"X-UA-Compatible\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("    <meta name=\"description\" content=\"\">\r\n");
      out.write("    <meta name=\"author\" content=\"\">\r\n");
      out.write("\r\n");
      out.write("    <link href='http://fonts.googleapis.com/css?family=Open+Sans:400,700' rel='stylesheet' type='text/css'>\r\n");
      out.write("\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      if (_jspx_meth_spring_005furl_005f4(_jspx_page_context))
        return;
      out.write("\" type=\"text/css\"/>\r\n");
      out.write("    \r\n");
      out.write("    <link rel=\"stylesheet\" href=\"//maxcdn.bootstrapcdn.com/font-awesome/4.3.0/css/font-awesome.min.css\">\r\n");
      out.write("  \r\n");
      out.write("\t<script src=\"");
      if (_jspx_meth_spring_005furl_005f5(_jspx_page_context))
        return;
      out.write("\"></script>\r\n");
      out.write("    <script type=\"text/javascript\">\r\n");
      out.write("        $(function() {\r\n");
      out.write("            $(\".knob\").knob();\r\n");
      out.write("        });\r\n");
      out.write("    </script>\r\n");
      out.write("\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      if (_jspx_meth_spring_005furl_005f6(_jspx_page_context))
        return;
      out.write("\" type=\"text/css\"/>\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"");
      if (_jspx_meth_spring_005furl_005f7(_jspx_page_context))
        return;
      out.write("\" type=\"text/css\"/>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body class=\" theme-blue\">\r\n");
      out.write("\r\n");
      //  tilesx:useAttribute
      org.apache.tiles.jsp.taglib.UseAttributeTag _jspx_th_tilesx_005fuseAttribute_005f0 = new org.apache.tiles.jsp.taglib.UseAttributeTag();
      org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_tilesx_005fuseAttribute_005f0);
      _jspx_th_tilesx_005fuseAttribute_005f0.setJspContext(_jspx_page_context);
      // /WEB-INF/layout/classics.jsp(51,0) name = name type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_tilesx_005fuseAttribute_005f0.setName("current");
      _jspx_th_tilesx_005fuseAttribute_005f0.doTag();
      java.lang.Object current = null;
      current = (java.lang.Object) _jspx_page_context.findAttribute("current");
      org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_tilesx_005fuseAttribute_005f0);
      out.write("\r\n");
      out.write("    <!-- Demo page code -->\r\n");
      out.write("\r\n");
      out.write("    <script type=\"text/javascript\">\r\n");
      out.write("        $(function() {\r\n");
      out.write("            var match = document.cookie.match(new RegExp('color=([^;]+)'));\r\n");
      out.write("            if(match) var color = match[1];\r\n");
      out.write("            if(color) {\r\n");
      out.write("                $('body').removeClass(function (index, css) {\r\n");
      out.write("                    return (css.match (/\\btheme-\\S+/g) || []).join(' ')\r\n");
      out.write("                })\r\n");
      out.write("                $('body').addClass('theme-' + color);\r\n");
      out.write("            }\r\n");
      out.write("\r\n");
      out.write("            $('[data-popover=\"true\"]').popover({html: true});\r\n");
      out.write("            \r\n");
      out.write("        });\r\n");
      out.write("    </script>\r\n");
      out.write("    <style type=\"text/css\">\r\n");
      out.write("        #line-chart {\r\n");
      out.write("            height:300px;\r\n");
      out.write("            width:800px;\r\n");
      out.write("            margin: 0px auto;\r\n");
      out.write("            margin-top: 1em;\r\n");
      out.write("        }\r\n");
      out.write("        .navbar-default .navbar-brand, .navbar-default .navbar-brand:hover { \r\n");
      out.write("            color: #fff;\r\n");
      out.write("        }\r\n");
      out.write("    </style>\r\n");
      out.write("\r\n");
      out.write("    <script type=\"text/javascript\">\r\n");
      out.write("        $(function() {\r\n");
      out.write("            var uls = $('.sidebar-nav > ul > *').clone();\r\n");
      out.write("            uls.addClass('visible-xs');\r\n");
      out.write("            $('#main-menu').append(uls.clone());\r\n");
      out.write("        });\r\n");
      out.write("    </script>\r\n");
      out.write("\r\n");
      out.write("    \r\n");
      out.write("\r\n");
      out.write("    <div class=\"navbar navbar-default\" role=\"navigation\">\r\n");
      out.write("        <div class=\"navbar-header\">\r\n");
      out.write("          <button type=\"button\" class=\"navbar-toggle collapsed\" data-toggle=\"collapse\" data-target=\".navbar-collapse\">\r\n");
      out.write("            <span class=\"sr-only\">Toggle navigation</span>\r\n");
      out.write("            <span class=\"icon-bar\"></span>\r\n");
      out.write("            <span class=\"icon-bar\"></span>\r\n");
      out.write("            <span class=\"icon-bar\"></span>\r\n");
      out.write("          </button>\r\n");
      out.write("          <a class=\"\" href=\"");
      if (_jspx_meth_spring_005furl_005f8(_jspx_page_context))
        return;
      out.write("\"><span class=\"navbar-brand\"><span class=\"fa fa-paper-plane\"></span> Null Pointer</span></a></div>\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t ");
      if (_jspx_meth_security_005fauthorize_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    \r\n");
      out.write("\r\n");
      out.write("    <div class=\"sidebar-nav\">\r\n");
      out.write("    <ul>\r\n");
      out.write("    ");
      if (_jspx_meth_security_005fauthorize_005f1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("    \r\n");
      out.write("    ");
      if (_jspx_meth_security_005fauthorize_005f2(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      out.write("     ");
      if (_jspx_meth_security_005fauthorize_005f3(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <li><a href=\"#\" data-target=\".legal-menu\" class=\"nav-header collapsed\" data-toggle=\"collapse\"><i class=\"fa fa-fw fa-legal\"></i> Legal<i class=\"fa fa-collapse\"></i></a></li>\r\n");
      out.write("        <li><ul class=\"legal-menu nav nav-list collapse\">\r\n");
      out.write("            <li ><a href=\"privacy-policy.html\"><span class=\"fa fa-caret-right\"></span> Privacy Policy</a></li>\r\n");
      out.write("            <li ><a href=\"terms-and-conditions.html\"><span class=\"fa fa-caret-right\"></span> Terms and Conditions</a></li>\r\n");
      out.write("    </ul></li>\r\n");
      out.write("\r\n");
      out.write("        <li><a href=\"help.html\" class=\"nav-header\"><i class=\"fa fa-fw fa-question-circle\"></i> Help</a></li>\r\n");
      out.write("            <li><a href=\"faq.html\" class=\"nav-header\"><i class=\"fa fa-fw fa-comment\"></i> Faq</a></li>\r\n");
      out.write("                <li><a href=\"http://portnine.com/bootstrap-themes/aircraft\" class=\"nav-header\" target=\"blank\"><i class=\"fa fa-fw fa-heart\"></i> Get Premium</a></li>\r\n");
      out.write("            </ul>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <div class=\"content\">\r\n");
      out.write("        <div class=\"header\">\r\n");
      out.write("            <div class=\"stats\">\r\n");
      out.write("    <p class=\"stat\"><span class=\"label label-info\">5</span> Tickets</p>\r\n");
      out.write("    <p class=\"stat\"><span class=\"label label-success\">27</span> Tasks</p>\r\n");
      out.write("    <p class=\"stat\"><span class=\"label label-danger\">15</span> Overdue</p>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("            <h1 class=\"page-title\">Dashboard</h1>\r\n");
      out.write("                    <ul class=\"breadcrumb\">\r\n");
      out.write("            <li><a href=\"index.html\">Home</a> </li>\r\n");
      out.write("            <li class=\"active\">Dashboard</li>\r\n");
      out.write("        </ul>\r\n");
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"main-content\">\r\n");
      out.write("            ");
      if (_jspx_meth_tiles_005finsertAttribute_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\r\n");
      out.write("\t\t\t<center>\r\n");
      out.write("\t\t\t\t");
      if (_jspx_meth_tiles_005finsertAttribute_005f1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t\t\t</center>\r\n");
      out.write("    \t</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <script src=\"lib/bootstrap/js/bootstrap.js\"></script>\r\n");
      out.write("    <script type=\"text/javascript\">\r\n");
      out.write("        $(\"[rel=tooltip]\").tooltip();\r\n");
      out.write("        $(function() {\r\n");
      out.write("            $('.demo-cancel-click').click(function(){return false;});\r\n");
      out.write("        });\r\n");
      out.write("    </script>\r\n");
      out.write("    \r\n");
      out.write("  \r\n");
      out.write("</body></html>\r\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try { out.clearBuffer(); } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_tiles_005fgetAsString_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tiles:getAsString
    org.apache.tiles.jsp.taglib.GetAsStringTag _jspx_th_tiles_005fgetAsString_005f0 = new org.apache.tiles.jsp.taglib.GetAsStringTag();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_tiles_005fgetAsString_005f0);
    _jspx_th_tiles_005fgetAsString_005f0.setJspContext(_jspx_page_context);
    // /WEB-INF/layout/classics.jsp(11,7) name = name type = java.lang.String reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_tiles_005fgetAsString_005f0.setName("title");
    _jspx_th_tiles_005fgetAsString_005f0.doTag();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_tiles_005fgetAsString_005f0);
    return false;
  }

  private boolean _jspx_meth_spring_005furl_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:url
    org.springframework.web.servlet.tags.UrlTag _jspx_th_spring_005furl_005f0 = (org.springframework.web.servlet.tags.UrlTag) _005fjspx_005ftagPool_005fspring_005furl_0026_005fvalue_005fnobody.get(org.springframework.web.servlet.tags.UrlTag.class);
    _jspx_th_spring_005furl_005f0.setPageContext(_jspx_page_context);
    _jspx_th_spring_005furl_005f0.setParent(null);
    // /WEB-INF/layout/classics.jsp(19,30) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005furl_005f0.setValue("/resources/css/bootstrap.min.css");
    int[] _jspx_push_body_count_spring_005furl_005f0 = new int[] { 0 };
    try {
      int _jspx_eval_spring_005furl_005f0 = _jspx_th_spring_005furl_005f0.doStartTag();
      if (_jspx_th_spring_005furl_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_005furl_005f0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_005furl_005f0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_005furl_005f0.doFinally();
      _005fjspx_005ftagPool_005fspring_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_spring_005furl_005f0);
    }
    return false;
  }

  private boolean _jspx_meth_spring_005furl_005f1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:url
    org.springframework.web.servlet.tags.UrlTag _jspx_th_spring_005furl_005f1 = (org.springframework.web.servlet.tags.UrlTag) _005fjspx_005ftagPool_005fspring_005furl_0026_005fvalue_005fnobody.get(org.springframework.web.servlet.tags.UrlTag.class);
    _jspx_th_spring_005furl_005f1.setPageContext(_jspx_page_context);
    _jspx_th_spring_005furl_005f1.setParent(null);
    // /WEB-INF/layout/classics.jsp(20,33) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005furl_005f1.setValue("/resources/css/bootstrap-theme.min.css");
    int[] _jspx_push_body_count_spring_005furl_005f1 = new int[] { 0 };
    try {
      int _jspx_eval_spring_005furl_005f1 = _jspx_th_spring_005furl_005f1.doStartTag();
      if (_jspx_th_spring_005furl_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_005furl_005f1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_005furl_005f1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_005furl_005f1.doFinally();
      _005fjspx_005ftagPool_005fspring_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_spring_005furl_005f1);
    }
    return false;
  }

  private boolean _jspx_meth_spring_005furl_005f2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:url
    org.springframework.web.servlet.tags.UrlTag _jspx_th_spring_005furl_005f2 = (org.springframework.web.servlet.tags.UrlTag) _005fjspx_005ftagPool_005fspring_005furl_0026_005fvalue_005fnobody.get(org.springframework.web.servlet.tags.UrlTag.class);
    _jspx_th_spring_005furl_005f2.setPageContext(_jspx_page_context);
    _jspx_th_spring_005furl_005f2.setParent(null);
    // /WEB-INF/layout/classics.jsp(21,17) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005furl_005f2.setValue("/resources/js/jquery-2.1.1.min.js");
    int[] _jspx_push_body_count_spring_005furl_005f2 = new int[] { 0 };
    try {
      int _jspx_eval_spring_005furl_005f2 = _jspx_th_spring_005furl_005f2.doStartTag();
      if (_jspx_th_spring_005furl_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_005furl_005f2[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_005furl_005f2.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_005furl_005f2.doFinally();
      _005fjspx_005ftagPool_005fspring_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_spring_005furl_005f2);
    }
    return false;
  }

  private boolean _jspx_meth_spring_005furl_005f3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:url
    org.springframework.web.servlet.tags.UrlTag _jspx_th_spring_005furl_005f3 = (org.springframework.web.servlet.tags.UrlTag) _005fjspx_005ftagPool_005fspring_005furl_0026_005fvalue_005fnobody.get(org.springframework.web.servlet.tags.UrlTag.class);
    _jspx_th_spring_005furl_005f3.setPageContext(_jspx_page_context);
    _jspx_th_spring_005furl_005f3.setParent(null);
    // /WEB-INF/layout/classics.jsp(22,17) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005furl_005f3.setValue("/resources/js/bootstrap.min.js");
    int[] _jspx_push_body_count_spring_005furl_005f3 = new int[] { 0 };
    try {
      int _jspx_eval_spring_005furl_005f3 = _jspx_th_spring_005furl_005f3.doStartTag();
      if (_jspx_th_spring_005furl_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_005furl_005f3[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_005furl_005f3.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_005furl_005f3.doFinally();
      _005fjspx_005ftagPool_005fspring_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_spring_005furl_005f3);
    }
    return false;
  }

  private boolean _jspx_meth_spring_005furl_005f4(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:url
    org.springframework.web.servlet.tags.UrlTag _jspx_th_spring_005furl_005f4 = (org.springframework.web.servlet.tags.UrlTag) _005fjspx_005ftagPool_005fspring_005furl_0026_005fvalue_005fnobody.get(org.springframework.web.servlet.tags.UrlTag.class);
    _jspx_th_spring_005furl_005f4.setPageContext(_jspx_page_context);
    _jspx_th_spring_005furl_005f4.setParent(null);
    // /WEB-INF/layout/classics.jsp(34,33) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005furl_005f4.setValue("/resources/css/font-awesome.css");
    int[] _jspx_push_body_count_spring_005furl_005f4 = new int[] { 0 };
    try {
      int _jspx_eval_spring_005furl_005f4 = _jspx_th_spring_005furl_005f4.doStartTag();
      if (_jspx_th_spring_005furl_005f4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_005furl_005f4[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_005furl_005f4.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_005furl_005f4.doFinally();
      _005fjspx_005ftagPool_005fspring_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_spring_005furl_005f4);
    }
    return false;
  }

  private boolean _jspx_meth_spring_005furl_005f5(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:url
    org.springframework.web.servlet.tags.UrlTag _jspx_th_spring_005furl_005f5 = (org.springframework.web.servlet.tags.UrlTag) _005fjspx_005ftagPool_005fspring_005furl_0026_005fvalue_005fnobody.get(org.springframework.web.servlet.tags.UrlTag.class);
    _jspx_th_spring_005furl_005f5.setPageContext(_jspx_page_context);
    _jspx_th_spring_005furl_005f5.setParent(null);
    // /WEB-INF/layout/classics.jsp(38,14) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005furl_005f5.setValue("/resources/js/jquery.knob.js");
    int[] _jspx_push_body_count_spring_005furl_005f5 = new int[] { 0 };
    try {
      int _jspx_eval_spring_005furl_005f5 = _jspx_th_spring_005furl_005f5.doStartTag();
      if (_jspx_th_spring_005furl_005f5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_005furl_005f5[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_005furl_005f5.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_005furl_005f5.doFinally();
      _005fjspx_005ftagPool_005fspring_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_spring_005furl_005f5);
    }
    return false;
  }

  private boolean _jspx_meth_spring_005furl_005f6(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:url
    org.springframework.web.servlet.tags.UrlTag _jspx_th_spring_005furl_005f6 = (org.springframework.web.servlet.tags.UrlTag) _005fjspx_005ftagPool_005fspring_005furl_0026_005fvalue_005fnobody.get(org.springframework.web.servlet.tags.UrlTag.class);
    _jspx_th_spring_005furl_005f6.setPageContext(_jspx_page_context);
    _jspx_th_spring_005furl_005f6.setParent(null);
    // /WEB-INF/layout/classics.jsp(45,33) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005furl_005f6.setValue("/resources/css/theme.css");
    int[] _jspx_push_body_count_spring_005furl_005f6 = new int[] { 0 };
    try {
      int _jspx_eval_spring_005furl_005f6 = _jspx_th_spring_005furl_005f6.doStartTag();
      if (_jspx_th_spring_005furl_005f6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_005furl_005f6[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_005furl_005f6.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_005furl_005f6.doFinally();
      _005fjspx_005ftagPool_005fspring_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_spring_005furl_005f6);
    }
    return false;
  }

  private boolean _jspx_meth_spring_005furl_005f7(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:url
    org.springframework.web.servlet.tags.UrlTag _jspx_th_spring_005furl_005f7 = (org.springframework.web.servlet.tags.UrlTag) _005fjspx_005ftagPool_005fspring_005furl_0026_005fvalue_005fnobody.get(org.springframework.web.servlet.tags.UrlTag.class);
    _jspx_th_spring_005furl_005f7.setPageContext(_jspx_page_context);
    _jspx_th_spring_005furl_005f7.setParent(null);
    // /WEB-INF/layout/classics.jsp(46,33) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005furl_005f7.setValue("/resources/css/premium.css");
    int[] _jspx_push_body_count_spring_005furl_005f7 = new int[] { 0 };
    try {
      int _jspx_eval_spring_005furl_005f7 = _jspx_th_spring_005furl_005f7.doStartTag();
      if (_jspx_th_spring_005furl_005f7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_005furl_005f7[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_005furl_005f7.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_005furl_005f7.doFinally();
      _005fjspx_005ftagPool_005fspring_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_spring_005furl_005f7);
    }
    return false;
  }

  private boolean _jspx_meth_spring_005furl_005f8(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:url
    org.springframework.web.servlet.tags.UrlTag _jspx_th_spring_005furl_005f8 = (org.springframework.web.servlet.tags.UrlTag) _005fjspx_005ftagPool_005fspring_005furl_0026_005fvalue_005fnobody.get(org.springframework.web.servlet.tags.UrlTag.class);
    _jspx_th_spring_005furl_005f8.setPageContext(_jspx_page_context);
    _jspx_th_spring_005furl_005f8.setParent(null);
    // /WEB-INF/layout/classics.jsp(99,28) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005furl_005f8.setValue("/");
    int[] _jspx_push_body_count_spring_005furl_005f8 = new int[] { 0 };
    try {
      int _jspx_eval_spring_005furl_005f8 = _jspx_th_spring_005furl_005f8.doStartTag();
      if (_jspx_th_spring_005furl_005f8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_005furl_005f8[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_005furl_005f8.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_005furl_005f8.doFinally();
      _005fjspx_005ftagPool_005fspring_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_spring_005furl_005f8);
    }
    return false;
  }

  private boolean _jspx_meth_security_005fauthorize_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  security:authorize
    org.springframework.security.taglibs.authz.JspAuthorizeTag _jspx_th_security_005fauthorize_005f0 = (org.springframework.security.taglibs.authz.JspAuthorizeTag) _005fjspx_005ftagPool_005fsecurity_005fauthorize_0026_005faccess.get(org.springframework.security.taglibs.authz.JspAuthorizeTag.class);
    _jspx_th_security_005fauthorize_005f0.setPageContext(_jspx_page_context);
    _jspx_th_security_005fauthorize_005f0.setParent(null);
    // /WEB-INF/layout/classics.jsp(101,3) name = access type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_security_005fauthorize_005f0.setAccess("isAuthenticated()");
    int _jspx_eval_security_005fauthorize_005f0 = _jspx_th_security_005fauthorize_005f0.doStartTag();
    if (_jspx_eval_security_005fauthorize_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      out.write("\r\n");
      out.write("        <div class=\"navbar-collapse collapse\" style=\"height: 1px;\">\r\n");
      out.write("          <ul id=\"main-menu\" class=\"nav navbar-nav navbar-right\">\r\n");
      out.write("            <li class=\"dropdown hidden-xs\">\r\n");
      out.write("                <a href=\"#\" class=\"dropdown-toggle\" data-toggle=\"dropdown\">\r\n");
      out.write("                    <span class=\"glyphicon glyphicon-user padding-right-small\" style=\"position:relative;top: 3px;\"></span> Iqbal\r\n");
      out.write("                    <i class=\"fa fa-caret-down\"></i>\r\n");
      out.write("                </a>\r\n");
      out.write("              <ul class=\"dropdown-menu\">\r\n");
      out.write("                <li><a href=\"");
      if (_jspx_meth_spring_005furl_005f9(_jspx_th_security_005fauthorize_005f0, _jspx_page_context))
        return true;
      out.write("\">My Account</a></li>\r\n");
      out.write("                <li class=\"divider\"></li>\r\n");
      out.write("                <li class=\"dropdown-header\">Admin Panel</li>\r\n");
      out.write("                <li><a href=\"./\">Users</a></li>\r\n");
      out.write("                <li><a href=\"./\">Security</a></li>\r\n");
      out.write("                <li><a tabindex=\"-1\" href=\"./\">Payments</a></li>\r\n");
      out.write("                <li class=\"divider\"></li>\r\n");
      out.write("                <li><a tabindex=\"-1\" href=\"");
      if (_jspx_meth_spring_005furl_005f10(_jspx_th_security_005fauthorize_005f0, _jspx_page_context))
        return true;
      out.write("\">Logout</a></li>\r\n");
      out.write("              </ul>\r\n");
      out.write("              \r\n");
      out.write("            </li>\r\n");
      out.write("          </ul>\r\n");
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("        ");
    }
    if (_jspx_th_security_005fauthorize_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fsecurity_005fauthorize_0026_005faccess.reuse(_jspx_th_security_005fauthorize_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fsecurity_005fauthorize_0026_005faccess.reuse(_jspx_th_security_005fauthorize_005f0);
    return false;
  }

  private boolean _jspx_meth_spring_005furl_005f9(javax.servlet.jsp.tagext.JspTag _jspx_th_security_005fauthorize_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:url
    org.springframework.web.servlet.tags.UrlTag _jspx_th_spring_005furl_005f9 = (org.springframework.web.servlet.tags.UrlTag) _005fjspx_005ftagPool_005fspring_005furl_0026_005fvalue_005fnobody.get(org.springframework.web.servlet.tags.UrlTag.class);
    _jspx_th_spring_005furl_005f9.setPageContext(_jspx_page_context);
    _jspx_th_spring_005furl_005f9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_security_005fauthorize_005f0);
    // /WEB-INF/layout/classics.jsp(110,29) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005furl_005f9.setValue("/account.html");
    int[] _jspx_push_body_count_spring_005furl_005f9 = new int[] { 0 };
    try {
      int _jspx_eval_spring_005furl_005f9 = _jspx_th_spring_005furl_005f9.doStartTag();
      if (_jspx_th_spring_005furl_005f9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_005furl_005f9[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_005furl_005f9.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_005furl_005f9.doFinally();
      _005fjspx_005ftagPool_005fspring_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_spring_005furl_005f9);
    }
    return false;
  }

  private boolean _jspx_meth_spring_005furl_005f10(javax.servlet.jsp.tagext.JspTag _jspx_th_security_005fauthorize_005f0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:url
    org.springframework.web.servlet.tags.UrlTag _jspx_th_spring_005furl_005f10 = (org.springframework.web.servlet.tags.UrlTag) _005fjspx_005ftagPool_005fspring_005furl_0026_005fvalue_005fnobody.get(org.springframework.web.servlet.tags.UrlTag.class);
    _jspx_th_spring_005furl_005f10.setPageContext(_jspx_page_context);
    _jspx_th_spring_005furl_005f10.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_security_005fauthorize_005f0);
    // /WEB-INF/layout/classics.jsp(117,43) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005furl_005f10.setValue("/logout");
    int[] _jspx_push_body_count_spring_005furl_005f10 = new int[] { 0 };
    try {
      int _jspx_eval_spring_005furl_005f10 = _jspx_th_spring_005furl_005f10.doStartTag();
      if (_jspx_th_spring_005furl_005f10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_005furl_005f10[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_005furl_005f10.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_005furl_005f10.doFinally();
      _005fjspx_005ftagPool_005fspring_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_spring_005furl_005f10);
    }
    return false;
  }

  private boolean _jspx_meth_security_005fauthorize_005f1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  security:authorize
    org.springframework.security.taglibs.authz.JspAuthorizeTag _jspx_th_security_005fauthorize_005f1 = (org.springframework.security.taglibs.authz.JspAuthorizeTag) _005fjspx_005ftagPool_005fsecurity_005fauthorize_0026_005faccess.get(org.springframework.security.taglibs.authz.JspAuthorizeTag.class);
    _jspx_th_security_005fauthorize_005f1.setPageContext(_jspx_page_context);
    _jspx_th_security_005fauthorize_005f1.setParent(null);
    // /WEB-INF/layout/classics.jsp(131,4) name = access type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_security_005fauthorize_005f1.setAccess("hasRole('ROLE_ADMIN')");
    int _jspx_eval_security_005fauthorize_005f1 = _jspx_th_security_005fauthorize_005f1.doStartTag();
    if (_jspx_eval_security_005fauthorize_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      out.write("\r\n");
      out.write("    <li><a href=\"#\" data-target=\".dashboard-menu\" class=\"nav-header\" data-toggle=\"collapse\"><i class=\"fa fa-fw fa-dashboard\"></i> Admin Panel<i class=\"fa fa-collapse\"></i></a></li>\r\n");
      out.write("    <li><ul class=\"dashboard-menu nav nav-list collapse\">\r\n");
      out.write("            <li><a href=\"");
      if (_jspx_meth_spring_005furl_005f11(_jspx_th_security_005fauthorize_005f1, _jspx_page_context))
        return true;
      out.write("\"><span class=\"fa fa-caret-right\"></span> Users</a></li>\r\n");
      out.write("    </ul></li>\r\n");
      out.write("      ");
    }
    if (_jspx_th_security_005fauthorize_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fsecurity_005fauthorize_0026_005faccess.reuse(_jspx_th_security_005fauthorize_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fsecurity_005fauthorize_0026_005faccess.reuse(_jspx_th_security_005fauthorize_005f1);
    return false;
  }

  private boolean _jspx_meth_spring_005furl_005f11(javax.servlet.jsp.tagext.JspTag _jspx_th_security_005fauthorize_005f1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:url
    org.springframework.web.servlet.tags.UrlTag _jspx_th_spring_005furl_005f11 = (org.springframework.web.servlet.tags.UrlTag) _005fjspx_005ftagPool_005fspring_005furl_0026_005fvalue_005fnobody.get(org.springframework.web.servlet.tags.UrlTag.class);
    _jspx_th_spring_005furl_005f11.setPageContext(_jspx_page_context);
    _jspx_th_spring_005furl_005f11.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_security_005fauthorize_005f1);
    // /WEB-INF/layout/classics.jsp(134,25) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005furl_005f11.setValue("/users.html");
    int[] _jspx_push_body_count_spring_005furl_005f11 = new int[] { 0 };
    try {
      int _jspx_eval_spring_005furl_005f11 = _jspx_th_spring_005furl_005f11.doStartTag();
      if (_jspx_th_spring_005furl_005f11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_005furl_005f11[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_005furl_005f11.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_005furl_005f11.doFinally();
      _005fjspx_005ftagPool_005fspring_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_spring_005furl_005f11);
    }
    return false;
  }

  private boolean _jspx_meth_security_005fauthorize_005f2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  security:authorize
    org.springframework.security.taglibs.authz.JspAuthorizeTag _jspx_th_security_005fauthorize_005f2 = (org.springframework.security.taglibs.authz.JspAuthorizeTag) _005fjspx_005ftagPool_005fsecurity_005fauthorize_0026_005faccess.get(org.springframework.security.taglibs.authz.JspAuthorizeTag.class);
    _jspx_th_security_005fauthorize_005f2.setPageContext(_jspx_page_context);
    _jspx_th_security_005fauthorize_005f2.setParent(null);
    // /WEB-INF/layout/classics.jsp(138,4) name = access type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_security_005fauthorize_005f2.setAccess("hasRole('ROLE_USER')");
    int _jspx_eval_security_005fauthorize_005f2 = _jspx_th_security_005fauthorize_005f2.doStartTag();
    if (_jspx_eval_security_005fauthorize_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      out.write("\r\n");
      out.write("    <li><a href=\"#\" data-target=\".dashboard-menu\" class=\"nav-header\" data-toggle=\"collapse\"><i class=\"fa fa-fw fa-dashboard\"></i> My Menu<i class=\"fa fa-collapse\"></i></a></li>\r\n");
      out.write("    <li><ul class=\"dashboard-menu nav nav-list collapse\">\r\n");
      out.write("            <li><a href=\"");
      if (_jspx_meth_spring_005furl_005f12(_jspx_th_security_005fauthorize_005f2, _jspx_page_context))
        return true;
      out.write("\"><span class=\"fa fa-caret-right\"></span> Ask Question</a></li>\r\n");
      out.write("             <li><a href=\"");
      if (_jspx_meth_spring_005furl_005f13(_jspx_th_security_005fauthorize_005f2, _jspx_page_context))
        return true;
      out.write("\"><span class=\"fa fa-caret-right\"></span> Home</a></li>\r\n");
      out.write("    </ul></li>\r\n");
      out.write("\t");
    }
    if (_jspx_th_security_005fauthorize_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fsecurity_005fauthorize_0026_005faccess.reuse(_jspx_th_security_005fauthorize_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fsecurity_005fauthorize_0026_005faccess.reuse(_jspx_th_security_005fauthorize_005f2);
    return false;
  }

  private boolean _jspx_meth_spring_005furl_005f12(javax.servlet.jsp.tagext.JspTag _jspx_th_security_005fauthorize_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:url
    org.springframework.web.servlet.tags.UrlTag _jspx_th_spring_005furl_005f12 = (org.springframework.web.servlet.tags.UrlTag) _005fjspx_005ftagPool_005fspring_005furl_0026_005fvalue_005fnobody.get(org.springframework.web.servlet.tags.UrlTag.class);
    _jspx_th_spring_005furl_005f12.setPageContext(_jspx_page_context);
    _jspx_th_spring_005furl_005f12.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_security_005fauthorize_005f2);
    // /WEB-INF/layout/classics.jsp(141,25) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005furl_005f12.setValue("/newquestion.html");
    int[] _jspx_push_body_count_spring_005furl_005f12 = new int[] { 0 };
    try {
      int _jspx_eval_spring_005furl_005f12 = _jspx_th_spring_005furl_005f12.doStartTag();
      if (_jspx_th_spring_005furl_005f12.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_005furl_005f12[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_005furl_005f12.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_005furl_005f12.doFinally();
      _005fjspx_005ftagPool_005fspring_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_spring_005furl_005f12);
    }
    return false;
  }

  private boolean _jspx_meth_spring_005furl_005f13(javax.servlet.jsp.tagext.JspTag _jspx_th_security_005fauthorize_005f2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:url
    org.springframework.web.servlet.tags.UrlTag _jspx_th_spring_005furl_005f13 = (org.springframework.web.servlet.tags.UrlTag) _005fjspx_005ftagPool_005fspring_005furl_0026_005fvalue_005fnobody.get(org.springframework.web.servlet.tags.UrlTag.class);
    _jspx_th_spring_005furl_005f13.setPageContext(_jspx_page_context);
    _jspx_th_spring_005furl_005f13.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_security_005fauthorize_005f2);
    // /WEB-INF/layout/classics.jsp(142,26) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005furl_005f13.setValue("/");
    int[] _jspx_push_body_count_spring_005furl_005f13 = new int[] { 0 };
    try {
      int _jspx_eval_spring_005furl_005f13 = _jspx_th_spring_005furl_005f13.doStartTag();
      if (_jspx_th_spring_005furl_005f13.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_005furl_005f13[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_005furl_005f13.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_005furl_005f13.doFinally();
      _005fjspx_005ftagPool_005fspring_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_spring_005furl_005f13);
    }
    return false;
  }

  private boolean _jspx_meth_security_005fauthorize_005f3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  security:authorize
    org.springframework.security.taglibs.authz.JspAuthorizeTag _jspx_th_security_005fauthorize_005f3 = (org.springframework.security.taglibs.authz.JspAuthorizeTag) _005fjspx_005ftagPool_005fsecurity_005fauthorize_0026_005faccess.get(org.springframework.security.taglibs.authz.JspAuthorizeTag.class);
    _jspx_th_security_005fauthorize_005f3.setPageContext(_jspx_page_context);
    _jspx_th_security_005fauthorize_005f3.setParent(null);
    // /WEB-INF/layout/classics.jsp(146,5) name = access type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_security_005fauthorize_005f3.setAccess("!isAuthenticated()");
    int _jspx_eval_security_005fauthorize_005f3 = _jspx_th_security_005fauthorize_005f3.doStartTag();
    if (_jspx_eval_security_005fauthorize_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      out.write("\r\n");
      out.write("        <li><a href=\"#\" data-target=\".accounts-menu\" class=\"nav-header collapsed\" data-toggle=\"collapse\"><i class=\"fa fa-fw fa-briefcase\"></i> Account <span class=\"label label-info\">+3</span></a></li>\r\n");
      out.write("        <li><ul class=\"accounts-menu nav nav-list collapse\">\r\n");
      out.write("            <li ><a href=\"");
      if (_jspx_meth_spring_005furl_005f14(_jspx_th_security_005fauthorize_005f3, _jspx_page_context))
        return true;
      out.write("\"><span class=\"fa fa-caret-right\"></span> Register</a></li>\r\n");
      out.write("            <li ><a href=\"");
      if (_jspx_meth_spring_005furl_005f15(_jspx_th_security_005fauthorize_005f3, _jspx_page_context))
        return true;
      out.write("\"><span class=\"fa fa-caret-right\"></span> Login</a></li>\r\n");
      out.write("    </ul></li>\r\n");
      out.write("    ");
    }
    if (_jspx_th_security_005fauthorize_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fsecurity_005fauthorize_0026_005faccess.reuse(_jspx_th_security_005fauthorize_005f3);
      return true;
    }
    _005fjspx_005ftagPool_005fsecurity_005fauthorize_0026_005faccess.reuse(_jspx_th_security_005fauthorize_005f3);
    return false;
  }

  private boolean _jspx_meth_spring_005furl_005f14(javax.servlet.jsp.tagext.JspTag _jspx_th_security_005fauthorize_005f3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:url
    org.springframework.web.servlet.tags.UrlTag _jspx_th_spring_005furl_005f14 = (org.springframework.web.servlet.tags.UrlTag) _005fjspx_005ftagPool_005fspring_005furl_0026_005fvalue_005fnobody.get(org.springframework.web.servlet.tags.UrlTag.class);
    _jspx_th_spring_005furl_005f14.setPageContext(_jspx_page_context);
    _jspx_th_spring_005furl_005f14.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_security_005fauthorize_005f3);
    // /WEB-INF/layout/classics.jsp(149,26) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005furl_005f14.setValue("/register.html");
    int[] _jspx_push_body_count_spring_005furl_005f14 = new int[] { 0 };
    try {
      int _jspx_eval_spring_005furl_005f14 = _jspx_th_spring_005furl_005f14.doStartTag();
      if (_jspx_th_spring_005furl_005f14.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_005furl_005f14[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_005furl_005f14.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_005furl_005f14.doFinally();
      _005fjspx_005ftagPool_005fspring_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_spring_005furl_005f14);
    }
    return false;
  }

  private boolean _jspx_meth_spring_005furl_005f15(javax.servlet.jsp.tagext.JspTag _jspx_th_security_005fauthorize_005f3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  spring:url
    org.springframework.web.servlet.tags.UrlTag _jspx_th_spring_005furl_005f15 = (org.springframework.web.servlet.tags.UrlTag) _005fjspx_005ftagPool_005fspring_005furl_0026_005fvalue_005fnobody.get(org.springframework.web.servlet.tags.UrlTag.class);
    _jspx_th_spring_005furl_005f15.setPageContext(_jspx_page_context);
    _jspx_th_spring_005furl_005f15.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_security_005fauthorize_005f3);
    // /WEB-INF/layout/classics.jsp(150,26) name = value type = null reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_spring_005furl_005f15.setValue("/login.html");
    int[] _jspx_push_body_count_spring_005furl_005f15 = new int[] { 0 };
    try {
      int _jspx_eval_spring_005furl_005f15 = _jspx_th_spring_005furl_005f15.doStartTag();
      if (_jspx_th_spring_005furl_005f15.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_spring_005furl_005f15[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_spring_005furl_005f15.doCatch(_jspx_exception);
    } finally {
      _jspx_th_spring_005furl_005f15.doFinally();
      _005fjspx_005ftagPool_005fspring_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_spring_005furl_005f15);
    }
    return false;
  }

  private boolean _jspx_meth_tiles_005finsertAttribute_005f0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tiles:insertAttribute
    org.apache.tiles.jsp.taglib.InsertAttributeTag _jspx_th_tiles_005finsertAttribute_005f0 = new org.apache.tiles.jsp.taglib.InsertAttributeTag();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_tiles_005finsertAttribute_005f0);
    _jspx_th_tiles_005finsertAttribute_005f0.setJspContext(_jspx_page_context);
    // /WEB-INF/layout/classics.jsp(182,12) name = name type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_tiles_005finsertAttribute_005f0.setName("body");
    _jspx_th_tiles_005finsertAttribute_005f0.doTag();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_tiles_005finsertAttribute_005f0);
    return false;
  }

  private boolean _jspx_meth_tiles_005finsertAttribute_005f1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  tiles:insertAttribute
    org.apache.tiles.jsp.taglib.InsertAttributeTag _jspx_th_tiles_005finsertAttribute_005f1 = new org.apache.tiles.jsp.taglib.InsertAttributeTag();
    org.apache.jasper.runtime.AnnotationHelper.postConstruct(_jsp_annotationprocessor, _jspx_th_tiles_005finsertAttribute_005f1);
    _jspx_th_tiles_005finsertAttribute_005f1.setJspContext(_jspx_page_context);
    // /WEB-INF/layout/classics.jsp(185,4) name = name type = java.lang.String reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_tiles_005finsertAttribute_005f1.setName("footer");
    _jspx_th_tiles_005finsertAttribute_005f1.doTag();
    org.apache.jasper.runtime.AnnotationHelper.preDestroy(_jsp_annotationprocessor, _jspx_th_tiles_005finsertAttribute_005f1);
    return false;
  }
}
