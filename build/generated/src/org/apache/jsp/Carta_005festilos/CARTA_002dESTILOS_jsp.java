package org.apache.jsp.Carta_005festilos;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class CARTA_002dESTILOS_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <!-- Style Carta -->\n");
      out.write("        <link href=\"../lib/css/carta_estilos/carta_estilos.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <title>Carta de Estilos</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"card\">\n");
      out.write("            <div class=\"card-image\"></div>\n");
      out.write("            <div class=\"card-text\">\n");
      out.write("                <span class=\"date\">4 days ago</span>\n");
      out.write("                <h2>Post One</h2>\n");
      out.write("                <p>RPG Styles Card with Hover Effect - HTML/CSS RPG Styles Card with Hover Effect - HTML/CSS RPG Styles Card with Hover Effect - HTML/CSS</p>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"card-stats\">\n");
      out.write("                <div class=\"stat\">\n");
      out.write("                    <div class=\"value\">4<sup>m</sup></div>\n");
      out.write("                    <div class=\"type\">read</div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"stat border\">\n");
      out.write("                    <div class=\"value\">5123</div>\n");
      out.write("                    <div class=\"type\">views</div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"stat\">\n");
      out.write("                    <div class=\"value\">32</div>\n");
      out.write("                    <div class=\"type\">comments</div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
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
