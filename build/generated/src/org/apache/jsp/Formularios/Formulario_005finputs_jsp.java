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
      out.write("        <!-- Estilos botones -->\n");
      out.write("        <link href=\"../lib/css/Formularios/Formulario_inputs.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <!-- Estilos iconos -->\n");
      out.write("        <link href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <br>\n");
      out.write("        <br>\n");
      out.write("        <div class=\"inputWithIcon\">\n");
      out.write("            <input type=\"text\" placeholder=\"Your name\" onkeypress=\"return soloLetras(event)\">\n");
      out.write("            <i class=\"fa fa-user fa-lg fa-fw\" aria-hidden=\"true\"></i>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"inputWithIcon\">\n");
      out.write("            <input type=\"text\" placeholder=\"Email\">\n");
      out.write("            <i class=\"fa fa-envelope fa-lg fa-fw\" aria-hidden=\"true\"></i>\n");
      out.write("        </div>\n");
      out.write("\n");
      out.write("        <div class=\"inputWithIcon\">\n");
      out.write("            <input type=\"text\" placeholder=\"Phone Number\" onkeypress=\"return soloNumeros(event)\">\n");
      out.write("            <i class=\"fa fa-phone fa-lg fa-fw\" aria-hidden=\"true\"></i>\n");
      out.write("        </div>\n");
      out.write("          <br>\n");
      out.write("          <br>\n");
      out.write("        <div class=\"inputWithIcon inputIconBg\">\n");
      out.write("            <input type=\"text\" placeholder=\"Your name\" onkeypress=\"return soloLetras(event)\"> \n");
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
      out.write("            <i class=\"fa fa-phone fa-lg fa-fw\" aria-hidden=\"true\" onkeypress=\"return soloNumeros(event)\"></i>\n");
      out.write("        </div>\n");
      out.write("          <br>\n");
      out.write("          <br>\n");
      out.write("        <input type=\"text\" placeholder=\"Age\" onkeypress=\"return soloNumeros(event)\">\n");
      out.write("    </body>\n");
      out.write("<script>\n");
      out.write("    function soloNumeros(e) {\n");
      out.write("              var key = window.Event ? e.which : e.keyCode\n");
      out.write("              return (key >= 48 && key <= 57)\n");
      out.write("        }\n");
      out.write("        \n");
      out.write("   function soloLetras(e){\n");
      out.write("       key = e.keyCode || e.which;\n");
      out.write("       tecla = String.fromCharCode(key).toLowerCase();\n");
      out.write("       letras = \" áéíóúabcdefghijklmnñopqrstuvwxyz\";\n");
      out.write("       especiales = \"8-37-39-46\";\n");
      out.write("\n");
      out.write("       tecla_especial = false\n");
      out.write("       for(var i in especiales){\n");
      out.write("            if(key == especiales[i]){\n");
      out.write("                tecla_especial = true;\n");
      out.write("                break;\n");
      out.write("            }\n");
      out.write("        }\n");
      out.write("        if(letras.indexOf(tecla)==-1 && !tecla_especial){\n");
      out.write("            return false;\n");
      out.write("        }\n");
      out.write("       }\n");
      out.write("</script>\n");
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
