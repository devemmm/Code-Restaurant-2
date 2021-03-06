package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.src.helps.AccountError;

public final class signin_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("\r\n");
      out.write("    <head>\r\n");
      out.write("        <meta charset=\"utf-8\">\r\n");
      out.write("        <meta content=\"width=device-width, initial-scale=1.0\" name=\"viewport\">\r\n");
      out.write("\r\n");
      out.write("        <title>Code | Restaurant | Signin</title>\r\n");
      out.write("        <meta content=\"\" name=\"description\">\r\n");
      out.write("        <meta content=\"\" name=\"keywords\">\r\n");
      out.write("\r\n");
      out.write("        <!-- Favicons -->\r\n");
      out.write("        <!-- <link href=\"assets/img/favicon.png\" rel=\"icon\"> -->\r\n");
      out.write("        <link href=\"assets/img/apple-touch-icon.png\" rel=\"apple-touch-icon\">\r\n");
      out.write("\r\n");
      out.write("        <!-- Google Fonts -->\r\n");
      out.write("        <link\r\n");
      out.write("            href=\"https://fonts.googleapis.com/css?family=Open+Sans:300,300i,400,400i,600,600i,700,700i|Playfair+Display:ital,wght@0,400;0,500;0,600;0,700;1,400;1,500;1,600;1,700|Poppins:300,300i,400,400i,500,500i,600,600i,700,700i\"\r\n");
      out.write("            rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("        <!-- Vendor CSS Files -->\r\n");
      out.write("        <link href=\"assets/vendor/animate.css/animate.min.css\" rel=\"stylesheet\">\r\n");
      out.write("        <link href=\"assets/vendor/aos/aos.css\" rel=\"stylesheet\">\r\n");
      out.write("        <link href=\"assets/vendor/bootstrap/css/bootstrap.min.css\" rel=\"stylesheet\">\r\n");
      out.write("        <link href=\"assets/vendor/bootstrap-icons/bootstrap-icons.css\" rel=\"stylesheet\">\r\n");
      out.write("        <link href=\"assets/vendor/boxicons/css/boxicons.min.css\" rel=\"stylesheet\">\r\n");
      out.write("        <link href=\"assets/vendor/glightbox/css/glightbox.min.css\" rel=\"stylesheet\">\r\n");
      out.write("        <link href=\"assets/vendor/swiper/swiper-bundle.min.css\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("        <!-- Bootstrap CSS -->\r\n");
      out.write("        <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/css/bootstrap.min.css\" rel=\"stylesheet\"\r\n");
      out.write("              integrity=\"sha384-eOJMYsd53ii+scO/bJGFsiCZc+5NDVN2yr8+0RDqr0Ql0h+rP48ckxlpbzKgwra6\" crossorigin=\"anonymous\">\r\n");
      out.write("\r\n");
      out.write("        <!-- Template Main CSS File -->\r\n");
      out.write("        <link href=\"assets/css/style.css\" rel=\"stylesheet\">\r\n");
      out.write("    </head>\r\n");
      out.write("\r\n");
      out.write("    <body>\r\n");
      out.write("\r\n");
      out.write("        ");

            AccountError accountError = new AccountError();
            AccountError errorData = (AccountError) session.getAttribute("errorData");
            if (errorData == null) {
                errorData = new AccountError();
                session.setAttribute("errorData", errorData);
            }
        
      out.write("\r\n");
      out.write("        <!-- ======= Top Bar ======= -->\r\n");
      out.write("        <div id=\"topbar\" class=\"d-flex align-items-center fixed-top\">\r\n");
      out.write("            <div class=\"container d-flex justify-content-center justify-content-md-between\">\r\n");
      out.write("\r\n");
      out.write("                <div class=\"contact-info d-flex align-items-center\">\r\n");
      out.write("                    <i class=\"bi bi-phone d-flex align-items-center\"><span>+250 788 596 281</span></i>\r\n");
      out.write("                    <i class=\"bi bi-clock d-flex align-items-center ms-4\"><span> Mon-Sat: 11AM - 23PM</span></i>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <!-- ======= Header ======= -->\r\n");
      out.write("        <header id=\"header\" class=\"fixed-top d-flex align-items-cente\">\r\n");
      out.write("            <div class=\"container-fluid container-xl d-flex align-items-center justify-content-lg-between\">\r\n");
      out.write("\r\n");
      out.write("                <h1 class=\"logo me-auto me-lg-0\"><a href=\"index.jsp\">CODE | Restaurant</a></h1>\r\n");
      out.write("            </div>\r\n");
      out.write("        </header><!-- End Header -->\r\n");
      out.write("\r\n");
      out.write("    <main id=\"main\">\r\n");
      out.write("        <section class=\"breadcrumbs\">\r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("\r\n");
      out.write("                <div class=\"d-flex justify-content-between align-items-center\">\r\n");
      out.write("                    <h2>Sign In</h2>\r\n");
      out.write("                    <ol>\r\n");
      out.write("                        <li><a href=\"index.jsp\">Home</a></li>\r\n");
      out.write("                        <li>Sign In</li>\r\n");
      out.write("                    </ol>\r\n");
      out.write("                </div>\r\n");
      out.write("\r\n");
      out.write("            </div>\r\n");
      out.write("        </section>\r\n");
      out.write("\r\n");
      out.write("        <section class=\"inner-page\">\r\n");
      out.write("            <div class=\"contain\">\r\n");
      out.write("                <p id=\"message\">");
      out.print(errorData.getEmailError());
      out.print(errorData.getPasswordError());
      out.write(' ');
      out.print(errorData.getGeneralError());
      out.write("</p>\r\n");
      out.write("\r\n");
      out.write("                <div class=\"row content\">\r\n");
      out.write("                    <div class=\"col-md-6 mb-3\">\r\n");
      out.write("                        <img src=\"assets/img/personalization.svg\" alt=\"background image\" class=\"img-fluid\">\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"col-md-6\">\r\n");
      out.write("                        <h3 class=\"signin-text mb-3\"> Sign In</h3><br>\r\n");
      out.write("                        <form action=\"signinProcess.jsp\" method=\"POST\">\r\n");
      out.write("                            <div class=\"form-group\">\r\n");
      out.write("                                <input type=\"email\" name=\"email\" class=\"form-control\" placeholder=\"Enter your Email\"\r\n");
      out.write("                                       style=\"background-color: #0c0b09; color: #fff; border-color: #cda45e;\" required>\r\n");
      out.write("                            </div><br>\r\n");
      out.write("\r\n");
      out.write("                            <div class=\"form-group\">\r\n");
      out.write("                                <input type=\"password\" name=\"password\" class=\"form-control\" placeholder=\"Enter your password\"\r\n");
      out.write("                                       style=\"background-color: #0c0b09; color: #fff; border-color: #cda45e;\" required>\r\n");
      out.write("                            </div>\r\n");
      out.write("\r\n");
      out.write("                            <div class=\"form-group form-check\">\r\n");
      out.write("                                <input type=\"checkbox\" name=\"checkbox\" class=\"form-check-input\" id=\"checkbox\"\r\n");
      out.write("                                       style=\"background-color: #0c0b09; color: #fff; border-color: #cda45e;\">\r\n");
      out.write("                                <label for=\"checkbox\" class=\"form-check-label\">Remember Me</label>\r\n");
      out.write("                            </div>\r\n");
      out.write("\r\n");
      out.write("                            <div class=\"float-end forgot-password\">\r\n");
      out.write("                                <a href=\"#\">Forgot Password?</a>\r\n");
      out.write("                            </div><br><br>\r\n");
      out.write("\r\n");
      out.write("                            <button class=\"btn btn-class\" id=\"login\">Login</button><br><br>\r\n");
      out.write("                            <div class=\"signUp\">\r\n");
      out.write("                                <p>Don???t have an account?<a href=\"signup.jsp\" class=\"sign-up\" id=\"signup\"> Sign Up</a></p>\r\n");
      out.write("                            </div>\r\n");
      out.write("\r\n");
      out.write("                        </form>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </section>\r\n");
      out.write("\r\n");
      out.write("    </main><!-- End #main -->\r\n");
      out.write("\r\n");
      out.write("    <!-- ======= Footer ======= -->\r\n");
      out.write("    <footer id=\"footer\">\r\n");
      out.write("        <div class=\"footer-top\">\r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("                <div class=\"row\">\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"col-lg-3 col-md-6\">\r\n");
      out.write("                        <div class=\"footer-info\">\r\n");
      out.write("                            <h3>Restaurantly</h3>\r\n");
      out.write("                            <p>\r\n");
      out.write("                                A108 Adam Street <br>\r\n");
      out.write("                                NY 535022, USA<br><br>\r\n");
      out.write("                                <strong>Phone:</strong> +1 5589 55488 55<br>\r\n");
      out.write("                                <strong>Email:</strong> info@example.com<br>\r\n");
      out.write("                            </p>\r\n");
      out.write("                            <div class=\"social-links mt-3\">\r\n");
      out.write("                                <a href=\"#\" class=\"twitter\"><i class=\"bx bxl-twitter\"></i></a>\r\n");
      out.write("                                <a href=\"#\" class=\"facebook\"><i class=\"bx bxl-facebook\"></i></a>\r\n");
      out.write("                                <a href=\"#\" class=\"instagram\"><i class=\"bx bxl-instagram\"></i></a>\r\n");
      out.write("                                <a href=\"#\" class=\"google-plus\"><i class=\"bx bxl-skype\"></i></a>\r\n");
      out.write("                                <a href=\"#\" class=\"linkedin\"><i class=\"bx bxl-linkedin\"></i></a>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"col-lg-2 col-md-6 footer-links\">\r\n");
      out.write("                        <h4>Useful Links</h4>\r\n");
      out.write("                        <ul>\r\n");
      out.write("                            <li><i class=\"bx bx-chevron-right\"></i> <a href=\"#\">Home</a></li>\r\n");
      out.write("                            <li><i class=\"bx bx-chevron-right\"></i> <a href=\"#\">About us</a></li>\r\n");
      out.write("                            <li><i class=\"bx bx-chevron-right\"></i> <a href=\"#\">Services</a></li>\r\n");
      out.write("                            <li><i class=\"bx bx-chevron-right\"></i> <a href=\"#\">Terms of service</a></li>\r\n");
      out.write("                            <li><i class=\"bx bx-chevron-right\"></i> <a href=\"#\">Privacy policy</a></li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"col-lg-3 col-md-6 footer-links\">\r\n");
      out.write("                        <h4>Our Services</h4>\r\n");
      out.write("                        <ul>\r\n");
      out.write("                            <li><i class=\"bx bx-chevron-right\"></i> <a href=\"#\">Web Design</a></li>\r\n");
      out.write("                            <li><i class=\"bx bx-chevron-right\"></i> <a href=\"#\">Web Development</a></li>\r\n");
      out.write("                            <li><i class=\"bx bx-chevron-right\"></i> <a href=\"#\">Product Management</a></li>\r\n");
      out.write("                            <li><i class=\"bx bx-chevron-right\"></i> <a href=\"#\">Marketing</a></li>\r\n");
      out.write("                            <li><i class=\"bx bx-chevron-right\"></i> <a href=\"#\">Graphic Design</a></li>\r\n");
      out.write("                        </ul>\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                    <div class=\"col-lg-4 col-md-6 footer-newsletter\">\r\n");
      out.write("                        <h4>Our Newsletter</h4>\r\n");
      out.write("                        <p>Tamen quem nulla quae legam multos aute sint culpa legam noster magna</p>\r\n");
      out.write("                        <form action=\"\" method=\"post\">\r\n");
      out.write("                            <input type=\"email\" name=\"email\"><input type=\"submit\" value=\"Subscribe\">\r\n");
      out.write("                        </form>\r\n");
      out.write("\r\n");
      out.write("                    </div>\r\n");
      out.write("\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("\r\n");
      out.write("        <div class=\"container\">\r\n");
      out.write("            <div class=\"copyright\">\r\n");
      out.write("                &copy; Copyright <strong><span>Restaurantly</span></strong>. All Rights Reserved\r\n");
      out.write("            </div>\r\n");
      out.write("            <div class=\"credits\">\r\n");
      out.write("                <!-- All the links in the footer should remain intact. -->\r\n");
      out.write("                <!-- You can delete the links only if you purchased the pro version. -->\r\n");
      out.write("                <!-- Licensing information: https://bootstrapmade.com/license/ -->\r\n");
      out.write("                <!-- Purchase the pro version with working PHP/AJAX contact form: https://bootstrapmade.com/restaurantly-restaurant-template/ -->\r\n");
      out.write("                Designed by <a href=\"https://bootstrapmade.com/\">BootstrapMade</a>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("    </footer><!-- End Footer -->\r\n");
      out.write("\r\n");
      out.write("    <div id=\"preloader\"></div>\r\n");
      out.write("    <a href=\"#\" class=\"back-to-top d-flex align-items-center justify-content-center\"><i\r\n");
      out.write("            class=\"bi bi-arrow-up-short\"></i></a>\r\n");
      out.write("\r\n");
      out.write("    <!-- Vendor JS Files -->\r\n");
      out.write("    <script src=\"assets/vendor/aos/aos.js\"></script>\r\n");
      out.write("    <script src=\"assets/vendor/bootstrap/js/bootstrap.bundle.min.js\"></script>\r\n");
      out.write("    <script src=\"assets/vendor/glightbox/js/glightbox.min.js\"></script>\r\n");
      out.write("    <script src=\"assets/vendor/isotope-layout/isotope.pkgd.min.js\"></script>\r\n");
      out.write("    <script src=\"assets/vendor/php-email-form/validate.js\"></script>\r\n");
      out.write("    <script src=\"assets/vendor/swiper/swiper-bundle.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("    <!-- Bootstrap js -->\r\n");
      out.write("    <script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta3/dist/js/bootstrap.bundle.min.js\"\r\n");
      out.write("            integrity=\"sha384-JEW9xMcG8R+pH31jmWH6WWP0WintQrMb4s7ZOdauHnUtxwoG2vI5DkLtS3qm9Ekf\"\r\n");
      out.write("    crossorigin=\"anonymous\"></script>\r\n");
      out.write("\r\n");
      out.write("    <!-- Template Main JS File -->\r\n");
      out.write("    <script src=\"assets/js/main.js\"></script>\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("\r\n");
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
