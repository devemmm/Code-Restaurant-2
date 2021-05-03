package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.src.helps.AccountError;
import com.src.dao.GeneralDao;
import com.src.domain.Account;
import com.src.service.RestaurantServiceImpl;
import com.src.service.RestaurantService;

public final class signupProcess_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<!DOCTYPE html>\n");

    
    AccountError accountError = new AccountError();
    AccountError errorData = (AccountError) session.getAttribute("errorData");
    if(errorData == null){
        errorData = new AccountError();
        session.setAttribute("errorData", errorData);
    }
    
    try{
       
        String email = request.getParameter("email");
        String fname = request.getParameter("fname");
        String lname = request.getParameter("lname");
        String phone = request.getParameter("phone");
        String password = request.getParameter("password");
        String password2 = request.getParameter("password2");

        if(!password.toString().equals(password2)){
            errorData.setGeneralError("Password dos not mutch");
            
      out.write("\n");
      out.write("                ");
      if (true) {
        _jspx_page_context.forward("signup.jsp");
        return;
      }
      out.write("\n");
      out.write("            ");

            return;
        }
        
        RestaurantService restaurantService = new RestaurantServiceImpl();
        Account account = new Account(email, fname, lname, phone, password);
        
        Account retAccount = restaurantService.signup(account);
        
        if(retAccount == null){
            errorData.setGeneralError("Email not found !");
            
      out.write("\n");
      out.write("                ");
      if (true) {
        _jspx_page_context.forward("signup.jsp");
        return;
      }
      out.write("\n");
      out.write("            ");

            return;
        }
        
        
      out.write("\n");
      out.write("            ");
      if (true) {
        _jspx_page_context.forward("signin.jsp");
        return;
      }
      out.write("\n");
      out.write("        ");

    }catch(Exception e){
        errorData.setGeneralError(e.getMessage());
        
      out.write("\n");
      out.write("            ");
      if (true) {
        _jspx_page_context.forward("signup.jsp");
        return;
      }
      out.write("\n");
      out.write("        ");

        return;
    }

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
