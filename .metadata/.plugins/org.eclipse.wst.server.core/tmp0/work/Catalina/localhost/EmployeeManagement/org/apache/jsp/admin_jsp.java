/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.37
 * Generated at: 2021-05-16 17:56:29 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class admin_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("\r\n");
      out.write("<head>\r\n");
      out.write("    <meta charset=\"UTF-8\">\r\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("    <title>Document</title>\r\n");
      out.write("\r\n");
      out.write("    <!-- fonaswome -->\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/all.css\">\r\n");
      out.write("\r\n");
      out.write("    <!-- Bootstrap cdn -->\r\n");
      out.write("    <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css\"\r\n");
      out.write("        integrity=\"sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm\" crossorigin=\"anonymous\">\r\n");
      out.write("\r\n");
      out.write("    <!-- google fonts -->\r\n");
      out.write("    <link rel=\"preconnect\" href=\"https://fonts.gstatic.com\">\r\n");
      out.write("    <link href=\"https://fonts.googleapis.com/css2?family=Montserrat&display=swap\" rel=\"stylesheet\">\r\n");
      out.write("    <style>\r\n");
      out.write("        .container {\r\n");
      out.write("            margin: 0;\r\n");
      out.write("            padding: 0;\r\n");
      out.write("            background-color:#fff;\r\n");
      out.write("            overflow: hidden;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .text{\r\n");
      out.write("       \tpadding-right:30%;\r\n");
      out.write("        background-color:#fff;\r\n");
      out.write("            color:#18a1b4;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .container-fluid {\r\n");
      out.write("            padding-top: 5%;\r\n");
      out.write("            padding-left: 10%;\r\n");
      out.write("            /* overflow-y: hidden; */\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        h1 {\r\n");
      out.write("            font-family: 'Montserrat', sans-serif;\r\n");
      out.write("            color: #fff;\r\n");
      out.write("            background-color: #62daea;\r\n");
      out.write("            text-align: center;\r\n");
      out.write("            padding: 2%;\r\n");
      out.write("             padding-left: 36%;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        h2 {\r\n");
      out.write("            padding: 2% 0 0 3%;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        h5,\r\n");
      out.write("        h6 {\r\n");
      out.write("            text-align: center;\r\n");
      out.write("        }\r\n");
      out.write("        \r\n");
      out.write("        .btnl{\r\n");
      out.write("            margin-left: 50%;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .btn {\r\n");
      out.write("            /* background-color: #81b214; */\r\n");
      out.write("            border-radius: 15px;\r\n");
      out.write("            border: none;\r\n");
      out.write("            opacity: 1;\r\n");
      out.write("            transform: scale(1.15);\r\n");
      out.write("            transition: transform 0.5s, opacity 0.5s;\r\n");
      out.write("            color: #fff;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .btn:hover {\r\n");
      out.write("            box-shadow: 0 8px 16px 0 rgba(0, 0, 0, 0.2);\r\n");
      out.write("            transition: 0.5s ease;\r\n");
      out.write("            transform: scale(1.03);\r\n");
      out.write("            opacity: 1.5;\r\n");
      out.write("            color: #fff;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .btn4 {\r\n");
      out.write("            background-color: #81b214;\r\n");
      out.write("            color: #fff;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .btn3 {\r\n");
      out.write("            background-color: #18a1b4;\r\n");
      out.write("            color: #fff;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .btn2 {\r\n");
      out.write("            background-color: red;\r\n");
      out.write("            color: #fff;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .btn1 {\r\n");
      out.write("            background-color: #f7ea00;\r\n");
      out.write("            color: #fff;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        .update {\r\n");
      out.write("            background-color: #f7ea00;\r\n");
      out.write("            border: none;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .delete {\r\n");
      out.write("            background-color: red;\r\n");
      out.write("            border: none;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .add {\r\n");
      out.write("            background-color: #81b214;\r\n");
      out.write("            border: none;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .list {\r\n");
      out.write("            background-color: #18a1b4;\r\n");
      out.write("            border: none;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        .row {\r\n");
      out.write("            padding-bottom: 10%;\r\n");
      out.write("        }\r\n");
      out.write("    </style>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("    <h1>Welcome to Rythy\r\n");
      out.write("    \t<a href=\"emphome.jsp\" type=\"button\" class=\"btn btn-info btnl\">Logout</a>\r\n");
      out.write("    </h1>\r\n");
      out.write("\r\n");
      out.write("    <div class=\"container-fluid\">\r\n");
      out.write("        <div class=\"row\">\r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("            <center>\r\n");
      out.write("                <h1 class=\"text\">\r\n");
      out.write("                    Employee Details\r\n");
      out.write("                </h1>\r\n");
      out.write("                </center>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"col-lg-3\">\r\n");
      out.write("                <a href=\"EmployeeControllerServelet\" class=\"btn btn3\">\r\n");
      out.write("                    <div class=\"card list\">\r\n");
      out.write("                        <div class=\"card-body\">\r\n");
      out.write("                            <h5 class=\"card-title\">EMPLOYEE LIST</h5>\r\n");
      out.write("                            <h6 class=\"sub-title\"><i class=\"fas fa-user-tie fa-3x\"></i></h6>\r\n");
      out.write("                            <p>You can View Employee</p>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </a>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <div class=\"col-lg-3\">\r\n");
      out.write("                <a href=\"add-emp-form.jsp\" class=\"btn btn4\">\r\n");
      out.write("                    <div class=\"card add\">\r\n");
      out.write("                        <div class=\"card-body\">\r\n");
      out.write("                            <h5 class=\"card-title\">ADD EMPLOYEE</h5>\r\n");
      out.write("                            <h6 class=\"sub-title\"><i class=\"fas fa-user-plus fa-3x\"></i></h6>\r\n");
      out.write("                            <p>You can Add Employee</p>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </a>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <div class=\"col-lg-3\">\r\n");
      out.write("                <a href=\"EmployeeControllerServelet\" class=\"btn btn1\">\r\n");
      out.write("                    <div class=\"card update\">\r\n");
      out.write("                        <div class=\"card-body\">\r\n");
      out.write("                            <h5 class=\"card-title\">UPDATE EMPLOYEE</h5>\r\n");
      out.write("                            <h6 class=\"sub-title\"><i class=\"fas fa-user-edit fa-3x\"></i></h6>\r\n");
      out.write("                            <p>You can Update Employee</p>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </a>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <div class=\"col-lg-3\">\r\n");
      out.write("                <a href=\"EmployeeControllerServelet\" class=\"btn btn2\">\r\n");
      out.write("                    <div class=\"card delete\">\r\n");
      out.write("                        <div class=\"card-body\">\r\n");
      out.write("                            <h5 class=\"card-title\">DELETE EMPLOYEE</h5>\r\n");
      out.write("                            <h6 class=\"sub-title\"><i class=\"fas fa-user-minus fa-3x\"></i></h6>\r\n");
      out.write("                            <p>You can Delete Employee</p>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </a>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"row\">\r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("                <h1 class=\"text\">\r\n");
      out.write("                    Project Details\r\n");
      out.write("                </h1>\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"col-lg-3\">\r\n");
      out.write("                <a href=\"ProjectControllerServlet\" class=\"btn btn3\">\r\n");
      out.write("                    <div class=\"card list\">\r\n");
      out.write("                        <div class=\"card-body\">\r\n");
      out.write("                            <h5 class=\"card-title\">ROJECT LIST</h5>\r\n");
      out.write("                            <h6 class=\"sub-title\"><i class=\"fas fa-user-tie fa-3x\"></i></h6>\r\n");
      out.write("                            <p>You can View Project</p>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </a>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <div class=\"col-lg-3\">\r\n");
      out.write("                <a href=\"add-project.jsp\" class=\"btn btn4\">\r\n");
      out.write("                    <div class=\"card add\">\r\n");
      out.write("                        <div class=\"card-body\">\r\n");
      out.write("                            <h5 class=\"card-title\">ADD PROJECT</h5>\r\n");
      out.write("                            <h6 class=\"sub-title\"><i class=\"fas fa-user-plus fa-3x\"></i></h6>\r\n");
      out.write("                            <p>You can Add Project</p>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </a>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <div class=\"col-lg-3\">\r\n");
      out.write("                <a href=\"ProjectControllerServlet\" class=\"btn btn1\">\r\n");
      out.write("                    <div class=\"card update\">\r\n");
      out.write("                        <div class=\"card-body\">\r\n");
      out.write("                            <h5 class=\"card-title\">UPDATE PROJECT</h5>\r\n");
      out.write("                            <h6 class=\"sub-title\"><i class=\"fas fa-user-edit fa-3x\"></i></h6>\r\n");
      out.write("                            <p>You can Update Project</p>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </a>\r\n");
      out.write("            </div>\r\n");
      out.write("\r\n");
      out.write("            <div class=\"col-lg-3\">\r\n");
      out.write("                <a href=\"ProjectControllerServlet\" class=\"btn btn2\">\r\n");
      out.write("                    <div class=\"card delete\">\r\n");
      out.write("                        <div class=\"card-body\">\r\n");
      out.write("                            <h5 class=\"card-title\">DELETE PROJECT</h5>\r\n");
      out.write("                            <h6 class=\"sub-title\"><i class=\"fas fa-user-minus fa-3x\"></i></h6>\r\n");
      out.write("                            <p>You can Delete Project</p>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </a>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("    <!-- Script js -->\r\n");
      out.write("    <script src=\"https://code.jquery.com/jquery-3.2.1.slim.min.js\"\r\n");
      out.write("        integrity=\"sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN\"\r\n");
      out.write("        crossorigin=\"anonymous\"></script>\r\n");
      out.write("    <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js\"\r\n");
      out.write("        integrity=\"sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q\"\r\n");
      out.write("        crossorigin=\"anonymous\"></script>\r\n");
      out.write("    <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js\"\r\n");
      out.write("        integrity=\"sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl\"\r\n");
      out.write("        crossorigin=\"anonymous\"></script>\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
