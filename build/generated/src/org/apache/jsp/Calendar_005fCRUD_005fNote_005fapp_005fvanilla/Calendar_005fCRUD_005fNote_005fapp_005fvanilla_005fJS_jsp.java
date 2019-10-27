package org.apache.jsp.Calendar_005fCRUD_005fNote_005fapp_005fvanilla;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Calendar_005fCRUD_005fNote_005fapp_005fvanilla_005fJS_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"utf-8\" />\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <title>Cards Hover2</title>\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("    <link rel=\"stylesheet\" type=\"text/css\" media=\"screen\" href=\"style.css\" />\n");
      out.write("    <link href=\"https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css\" rel=\"stylesheet\" integrity=\"sha384-wvfXpqpZZVQGK6TAh5PVlGOfQNHSoD2xbE+QkPxCAFlNEevoEH3Sl0sibVcOQVnN\"\n");
      out.write("        crossorigin=\"anonymous\">\n");
      out.write("    <link href=\"../lib/css/Calendar_CRUD_Note_app_vanilla_JS/newcssCalendar_CRUD_Note_app_vanilla_JS.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <div class=\"card\">\n");
      out.write("            <div class=\"face face1\">\n");
      out.write("                <div class=\"content\">\n");
      out.write("                    <div class=\"icon\">\n");
      out.write("                        <i class=\"fa fa-linkedin-square\" aria-hidden=\"true\"></i>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"face face2\">\n");
      out.write("                <div class=\"content\">\n");
      out.write("                    <h3>\n");
      out.write("                        <a href=\"https://www.linkedin.com/in/adamdipinto/\" target=\"_blank\">_adamdipinto</a>\n");
      out.write("                    </h3>\n");
      out.write("                    <p>This is where I network and build my professional protfolio.</p>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"card\">\n");
      out.write("            <div class=\"face face1\">\n");
      out.write("                <div class=\"content\">\n");
      out.write("                    <div class=\"icon\">\n");
      out.write("                        <i class=\"fa fa-twitter-square\" aria-hidden=\"true\"></i>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"face face2\">\n");
      out.write("                <div class=\"content\">\n");
      out.write("                    <h3>\n");
      out.write("                        <a href=\"https://twitter.com/AdamDipinto\" target=\"_blank\">@AdamDipinto</a>\n");
      out.write("                    </h3>\n");
      out.write("                    <p>This is where I read news and network with different social groups.</p>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"card\">\n");
      out.write("            <div class=\"face face1\">\n");
      out.write("                <div class=\"content\">\n");
      out.write("                    <div class=\"icon\">\n");
      out.write("                        <i class=\"fa fa-github-square\" aria-hidden=\"true\"></i>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"face face2\">\n");
      out.write("                <div class=\"content\">\n");
      out.write("                    <h3>\n");
      out.write("                        <a href=\"https://github.com/atom888\" target=\"_blank\">atom888</a>\n");
      out.write("                    </h3>\n");
      out.write("                    <p>This is where I share code and work on projects.</p>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("</body>\n");
      out.write("\n");
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
