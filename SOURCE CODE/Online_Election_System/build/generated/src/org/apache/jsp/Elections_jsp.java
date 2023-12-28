package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import DBconnection.SQLconnection;
import java.sql.Statement;
import java.sql.Connection;

public final class Elections_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("    <head>\n");
      out.write("        <!-- Required meta tags -->\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("        <title>Online Election System</title>\n");
      out.write("        <!-- Favicon -->\n");
      out.write("        <link rel=\"shortcut icon\" type=\"image/icon\" href=\"assets/images/favicon.ico\"/>\n");
      out.write("        <!-- Font Awesome -->\n");
      out.write("        <link href=\"https://maxcdn.bootstrapcdn.com/font-awesome/4.6.3/css/font-awesome.min.css\" rel=\"stylesheet\">\n");
      out.write("        <!-- Bootstrap CSS -->\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/css/bootstrap.min.css\" integrity=\"sha384-/Y6pD6FV/Vv2HJnA6t+vslU6fwYXjCFtcEpHbNJ0lyAFsXTsjBbfaDjzALeQsN6M\" crossorigin=\"anonymous\">\n");
      out.write("        <!-- Slick slider -->\n");
      out.write("        <link href=\"assets/css/slick.css\" rel=\"stylesheet\">\n");
      out.write("        <!-- Gallery Lightbox -->\n");
      out.write("        <link href=\"assets/css/magnific-popup.css\" rel=\"stylesheet\">\n");
      out.write("        <!-- Skills Circle CSS  -->\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"https://unpkg.com/circlebars@1.0.3/dist/circle.css\">\n");
      out.write("        <!-- Main Style -->\n");
      out.write("        <link href=\"assets/css/style.css\" rel=\"stylesheet\">\n");
      out.write("        <!-- Google Fonts Raleway -->\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css?family=Raleway:300,400,400i,500,500i,600,700\" rel=\"stylesheet\">\n");
      out.write("        <!-- Google Fonts Open sans -->\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css?family=Open+Sans:400,400i,600,700,800\" rel=\"stylesheet\">\n");
      out.write("    </head>\n");
      out.write("    <script>\n");
      out.write("        var loadFile = function (event) {\n");
      out.write("            var reader = new FileReader();\n");
      out.write("            reader.onload = function () {\n");
      out.write("                var output = document.getElementById('output');\n");
      out.write("                output.src = reader.result;\n");
      out.write("            };\n");
      out.write("            reader.readAsDataURL(event.target.files[0]);\n");
      out.write("        };\n");
      out.write("    </script>\n");
      out.write("    <body>\n");
      out.write("        <!--START SCROLL TOP BUTTON -->\n");
      out.write("        <a class=\"scrollToTop\" href=\"#\">\n");
      out.write("            <i class=\"fa fa-angle-up\"></i>\n");
      out.write("        </a>\n");
      out.write("        <!-- END SCROLL TOP BUTTON -->\n");
      out.write("        <!-- Start Header -->\n");
      out.write("        <header id=\"mu-hero\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <nav class=\"navbar navbar-expand-lg navbar-light mu-navbar\">\n");
      out.write("                    <!-- Text based logo -->\n");
      out.write("                    <a class=\"navbar-brand mu-logo\" href=\"index.html\"><span></span></a>\n");
      out.write("                    <!-- image based logo -->\n");
      out.write("                    <!-- <a class=\"navbar-brand mu-logo\" href=\"index.html\"><img src=\"assets/images/logo.png\" alt=\"logo\"></a> -->\n");
      out.write("                    <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("                        <span class=\"fa fa-bars\"></span>\n");
      out.write("                    </button>\n");
      out.write("                    <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\n");
      out.write("                        <ul class=\"navbar-nav mr-auto mu-navbar-nav\">\n");
      out.write("                            <li class=\"nav-item\"><a href=\"User_Home.jsp\">Home</a></li>\n");
      out.write("                            <li class=\"nav-item active\"><a href=\"Elections.jsp\">Elections</a></li>\n");
      out.write("                            <li class=\"nav-item\"><a href=\"index.html\">Logout</a></li>\n");
      out.write("                        </ul>\n");
      out.write("                    </div>\n");
      out.write("                </nav>\n");
      out.write("            </div>\n");
      out.write("        </header>\n");
      out.write("        <!-- End Header -->\n");
      out.write("        <!-- Start slider area -->\n");
      out.write("        <div id=\"mu-page-header\" style=\"background-image: url(images/slide2.jpg);\">\n");
      out.write("            <div class=\"container\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-md-12\">\n");
      out.write("                        <div class=\"mu-page-header-area\">\n");
      out.write("                            <h1 class=\"mu-page-header-title\">Online Election System</h1>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <main>\n");
      out.write("            <section id=\"mu-contact\">\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-md-12\">\n");
      out.write("                            <div class=\"mu-contact-area\">\n");
      out.write("                                <!-- Title -->\n");
      out.write("                                <div class=\"row\">\n");
      out.write("                                    <div class=\"col-md-12\">\n");
      out.write("                                        <div class=\"mu-title\">\n");
      out.write("                                            <h2>Elections</h2>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <!-- Start Contact Content -->\n");
      out.write("                                ");

                                    String uid = "0";
                                    String vid = (String) session.getAttribute("uid");
                                    Connection con = SQLconnection.getconnection();
                                    Statement st = con.createStatement();
                                    Statement st1 = con.createStatement();
                                    Statement st2 = con.createStatement();
                                    try {

                                        ResultSet rs = st.executeQuery("SELECT * FROM add_election WHERE end_date > now()");


                                
      out.write("\n");
      out.write("                                <div class=\"mu-contact-content\">\n");
      out.write("                                    <div class=\"row\">\n");
      out.write("                                        <div class=\"col-md-12\">\n");
      out.write("                                            <div class=\"mu-contact-form-area\">\n");
      out.write("                                                <div id=\"form-messages\"></div>\n");
      out.write("                                                <form method=\"post\" action=\"Elections1.jsp\" class=\"mu-contact-form\">\n");
      out.write("                                                    <div class=\"form-group\">  \n");
      out.write("                                                        <span class=\"fa fa-comment mu-contact-icon\"></span>   \n");
      out.write("                                                        <select class=\"form-control\" name=\"election_name\" required=\"required\"><option value=\"\">&nbsp;&nbsp;&nbsp;Select Election</option>\n");
      out.write("                                                            ");
  while (rs.next()) {
      out.write("\n");
      out.write("                                                            <option value=\"");
      out.print(rs.getString(2));
      out.write("\">&nbsp;&nbsp;&nbsp;");
      out.print(rs.getString(2));
      out.write("</option>\n");
      out.write("                                                            ");
}
      out.write(" \n");
      out.write("                                                        </select>\n");
      out.write("                                                    </div>\n");
      out.write("                                                    <div class=\"form-group\"> \n");
      out.write("                                                        <button type=\"submit\" class=\"mu-send-msg-btn\"><span>Submit</span></button>\n");
      out.write("                                                    </div> \n");
      out.write("                                                </form>\n");
      out.write("                                                ");


                                                        
                                                    } catch (Exception ex) {
                                                        ex.printStackTrace();
                                                    }

                                                
      out.write("\n");
      out.write("                                            </div>\n");
      out.write("                                        </div>\n");
      out.write("                                    </div>\n");
      out.write("                                </div>\n");
      out.write("                                <!-- End Contact Content -->\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </section>\n");
      out.write("        </main>\n");
      out.write("        <!-- End main content -->\t\n");
      out.write("        <!-- Start footer -->\n");
      out.write("        <footer id=\"mu-footer\">\n");
      out.write("            <div class=\"mu-footer-bottom\">\n");
      out.write("                <div class=\"container\">\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-md-12\">\n");
      out.write("                            <div class=\"mu-footer-bottom-area\">\n");
      out.write("                                <p class=\"mu-copy-right\">&copy;\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </footer>\n");
      out.write("        <!-- End footer -->\n");
      out.write("        <!-- JavaScript -->\n");
      out.write("        <!-- jQuery first, then Popper.js, then Bootstrap JS -->\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js\"></script>\n");
      out.write("        <script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.11.0/umd/popper.min.js\" integrity=\"sha384-b/U6ypiBEHpOf/4+1nzFpr53nxSS+GLCkfwBdFNTxtclqqenISfwAzpKaMNFNmj4\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0-beta/js/bootstrap.min.js\" integrity=\"sha384-h0AbiXch4ZDo7tp9hKZ4TsHbi047NrKGLO3SEJAg45jXxnGIfYzk4Si90RDIqNm1\" crossorigin=\"anonymous\"></script>\n");
      out.write("        <!-- Slick slider -->\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/2.1.1/jquery.min.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"assets/js/slick.min.js\"></script>\n");
      out.write("        <!-- Progress Bar -->\n");
      out.write("        <script src=\"https://unpkg.com/circlebars@1.0.3/dist/circle.js\"></script>\n");
      out.write("        <!-- Filterable Gallery js -->\n");
      out.write("        <script type=\"text/javascript\" src=\"assets/js/jquery.filterizr.min.js\"></script>\n");
      out.write("        <!-- Gallery Lightbox -->\n");
      out.write("        <script type=\"text/javascript\" src=\"assets/js/jquery.magnific-popup.min.js\"></script>\n");
      out.write("        <!-- Counter js -->\n");
      out.write("        <script type=\"text/javascript\" src=\"assets/js/counter.js\"></script>\n");
      out.write("        <!-- Ajax contact form  -->\n");
      out.write("        <script type=\"text/javascript\" src=\"assets/js/app.js\"></script>\n");
      out.write("        <!-- Custom js -->\n");
      out.write("        <script type=\"text/javascript\" src=\"assets/js/custom.js\"></script>\n");
      out.write("        <!-- About us Skills Circle progress  -->\n");
      out.write("        <script>\n");
      out.write("        // First circle\n");
      out.write("        new Circlebar({\n");
      out.write("            element: \"#circle-1\",\n");
      out.write("            type: \"progress\",\n");
      out.write("            maxValue: \"90\"\n");
      out.write("        });\n");
      out.write("\n");
      out.write("        // Second circle\n");
      out.write("        new Circlebar({\n");
      out.write("            element: \"#circle-2\",\n");
      out.write("            type: \"progress\",\n");
      out.write("            maxValue: \"84\"\n");
      out.write("        });\n");
      out.write("\n");
      out.write("        // Third circle\n");
      out.write("        new Circlebar({\n");
      out.write("            element: \"#circle-3\",\n");
      out.write("            type: \"progress\",\n");
      out.write("            maxValue: \"60\"\n");
      out.write("        });\n");
      out.write("\n");
      out.write("        // Fourth circle\n");
      out.write("        new Circlebar({\n");
      out.write("            element: \"#circle-4\",\n");
      out.write("            type: \"progress\",\n");
      out.write("            maxValue: \"74\"\n");
      out.write("        });\n");
      out.write("\n");
      out.write("        </script>\n");
      out.write("    </body>\n");
      out.write("</html>");
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
