package org.apache.jsp.Formularios;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Formulario_005finputs_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
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
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <style>\n");
      out.write("            /*Don't forget to add Font Awesome CSS : \"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.css\"*/\n");
      out.write("            input[type=\"text\"] {\n");
      out.write("                width: 100%;\n");
      out.write("                border: 2px solid #aaa;\n");
      out.write("                border-radius: 4px;\n");
      out.write("                margin: 8px 0;\n");
      out.write("                outline: none;\n");
      out.write("                padding: 8px;\n");
      out.write("                box-sizing: border-box;\n");
      out.write("                transition: 0.3s;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            input[type=\"text\"]:focus {\n");
      out.write("                border-color: dodgerBlue;\n");
      out.write("                box-shadow: 0 0 8px 0 dodgerBlue;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .inputWithIcon input[type=\"text\"] {\n");
      out.write("                padding-left: 40px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .inputWithIcon {\n");
      out.write("                position: relative;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .inputWithIcon i {\n");
      out.write("                position: absolute;\n");
      out.write("                left: 0;\n");
      out.write("                top: 8px;\n");
      out.write("                padding: 9px 8px;\n");
      out.write("                color: #aaa;\n");
      out.write("                transition: 0.3s;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .inputWithIcon input[type=\"text\"]:focus + i {\n");
      out.write("                color: dodgerBlue;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .inputWithIcon.inputIconBg i {\n");
      out.write("                background-color: #aaa;\n");
      out.write("                color: #fff;\n");
      out.write("                padding: 9px 4px;\n");
      out.write("                border-radius: 4px 0 0 4px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .inputWithIcon.inputIconBg input[type=\"text\"]:focus + i {\n");
      out.write("                color: #fff;\n");
      out.write("                background-color: dodgerBlue;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"inputWithIcon\">\n");
      out.write("            <input type=\"text\" placeholder=\"Your name\">\n");
      out.write("            <i class=\"fa fa-user fa-lg fa-fw\" aria-hidden=\"true\"></i>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"inputWithIcon\">\n");
      out.write("            <input type=\"text\" placeholder=\"Email\">\n");
      out.write("            <i class=\"fa fa-envelope fa-lg fa-fw\" aria-hidden=\"true\"></i>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"inputWithIcon\">\n");
      out.write("            <input type=\"text\" placeholder=\"Phone Number\">\n");
      out.write("            <i class=\"fa fa-phone fa-lg fa-fw\" aria-hidden=\"true\"></i>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"inputWithIcon inputIconBg\">\n");
      out.write("            <input type=\"text\" placeholder=\"Your name\">\n");
      out.write("            <i class=\"fa fa-user fa-lg fa-fw\" aria-hidden=\"true\"></i>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"inputWithIcon inputIconBg\">\n");
      out.write("            <input type=\"text\" placeholder=\"Email\">\n");
      out.write("            <i class=\"fa fa-envelope fa-lg fa-fw\" aria-hidden=\"true\"></i>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"inputWithIcon inputIconBg\">\n");
      out.write("            <input type=\"text\" placeholder=\"Phone Number\">\n");
      out.write("            <i class=\"fa fa-phone fa-lg fa-fw\" aria-hidden=\"true\"></i>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <input type=\"text\" placeholder=\"Age\">\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
}
