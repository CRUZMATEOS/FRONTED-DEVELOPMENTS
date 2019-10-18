package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"UTF-8\">\n");
      out.write("        <title>Formulario</title>\n");
      out.write("        <!-- Estilos botones -->\n");
      out.write("        <link href=\"lib/css/Login/boton.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <!-- Estilos font-awesome iconos -->\n");
      out.write("        <link href=\"lib/font-awesome-4.7.0/css/font-awesome.min.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <!-- Estilos principales del formulario -->\n");
      out.write("        <link href=\"lib/css/Login/formulario.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div id=\"menu\">\n");
      out.write("            <ul>\n");
      out.write("                <li><a href=\"#\" class=\"active\">Iniciar Sesión</a></li>\n");
      out.write("                <li><a href=\"#\">Registrarse</a></li>\n");
      out.write("            </ul>\n");
      out.write("        </div>\n");
      out.write("        <div id=\"formularios\">\n");
      out.write("            <form action=\"\" id=\"form_session\">\n");
      out.write("\n");
      out.write("                <p>Correo electrónico:</p>\n");
      out.write("                <div class=\"field-container\">\n");
      out.write("                    <i class=\"fa fa-envelope-o fa-lg\" aria-hidden=\"true\"></i>\t\n");
      out.write("                    <input type=\"text\" class=\"field\" placeholder=\"user@example.com\"> <br/>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <p>Contraseña:</p>\n");
      out.write("                <div class=\"field-container\">\n");
      out.write("                    <i class=\"fa fa-key fa-lg\" aria-hidden=\"true\"></i>\t\n");
      out.write("                    <input type=\"password\" class=\"field\" placeholder=\"*******\"> <br/>\n");
      out.write("                </div>\n");
      out.write("                <p class=\"center-content\">\n");
      out.write("                    <input type=\"submit\" class=\"btn btn-green\" value=\"Iniciar sesión\"> <br/><br/>\n");
      out.write("                </p>\n");
      out.write("            </form>\t\n");
      out.write("\n");
      out.write("            <form action=\"\" id=\"form_register\">\n");
      out.write("\n");
      out.write("                <div class=\"columns\">\n");
      out.write("                    <div class=\"field-container\">\n");
      out.write("                        <p> Nombre:</p>\n");
      out.write("                        <i class=\"fa fa-user-circle fa-lg\" aria-hidden=\"true\"></i>\t\n");
      out.write("                        <input type=\"text\" class=\"field\" placeholder=\" \"> <br/>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"field-container\">\n");
      out.write("                        <p> Apellido:</p>\n");
      out.write("                        <i class=\"fa fa-user-circle fa-lg\" aria-hidden=\"true\"></i>\t\n");
      out.write("                        <input type=\"text\" class=\"field\" placeholder=\"...\"> <br/>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("\n");
      out.write("                <p>Correo electrónico:</p>\n");
      out.write("                <div class=\"field-container\">\n");
      out.write("                    <i class=\"fa fa-envelope-o fa-lg\" aria-hidden=\"true\"></i>\t\n");
      out.write("                    <input type=\"text\" class=\"field\" placeholder=\"user@example.com\"> <br/>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <p>Contraseña:</p>\n");
      out.write("                <div class=\"field-container\">\n");
      out.write("                    <i class=\"fa fa-key fa-lg\" aria-hidden=\"true\"></i>\t\n");
      out.write("                    <input type=\"password\" class=\"field\" placeholder=\"*******\"> <br/>\n");
      out.write("                </div>\n");
      out.write("\n");
      out.write("                <div class=\"columns\">\n");
      out.write("                    <div class=\"field-container\">\n");
      out.write("                        <p> Compañía:</p>\n");
      out.write("                        <i class=\"fa fa-building fa-lg\" aria-hidden=\"true\"></i>\t\n");
      out.write("                        <input type=\"text\" class=\"field\" placeholder=\"Microsoft\"> <br/>\n");
      out.write("                    </div>\n");
      out.write("                    <div class=\"field-container\">\n");
      out.write("                        <p> Teléfono:</p>\n");
      out.write("                        <i class=\"fa fa-phone fa-lg\" aria-hidden=\"true\"></i>\t\n");
      out.write("                        <input type=\"text\" class=\"field\" placeholder=\"+52 55...\"> <br/>\n");
      out.write("                    </div>\n");
      out.write("\n");
      out.write("                </div>\n");
      out.write("                <p class=\"center-content\">\n");
      out.write("                    <input type=\"submit\" class=\"btn btn-green\" value=\"Crear cuenta\">\n");
      out.write("                </p>\n");
      out.write("            </form>\t\n");
      out.write("        </div>\n");
      out.write("        <!-- Funciones principales del formulario -->\n");
      out.write("        <script src=\"lib/js/Login/jquery.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script>\n");
      out.write("            $(function () {\n");
      out.write("                $(\"#menu li\").on(\"click\", function () {\n");
      out.write("                    var i = $(this).index();\n");
      out.write("                    $(\"#formularios form\").hide();\n");
      out.write("                    $(\"#formularios form\").eq(i).show();\n");
      out.write("                    $(\"#menu li a\").removeClass(\"active\");\n");
      out.write("                    $(this).find(\"a\").addClass(\"active\");\n");
      out.write("                });\n");
      out.write("            });\n");
      out.write("        </script>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
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
