<%-- 
    Document   : signin
    Created on : Mar 12, 2021, 7:44:26 PM
    Author     : emmanuel
--%>

<%@page import="com.src.helps.AccountError"%>
<%@page import="com.src.dao.GeneralDao"%>
<%@page import="com.src.domain.Account"%>
<%@page import="com.src.service.RestaurantServiceImpl"%>
<%@page import="com.src.service.RestaurantService"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
    
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
            %>
                <jsp:forward page="signup.jsp"/>
            <%
            return;
        }
        
        RestaurantService restaurantService = new RestaurantServiceImpl();
        Account account = new Account(email, fname, lname, phone, password);
        
        Account retAccount = restaurantService.signup(account);
        
        if(retAccount == null){
            errorData.setGeneralError("Email not found !");
            %>
                <jsp:forward page="signup.jsp"/>
            <%
            return;
        }
        
        %>
            <jsp:forward page="signin.jsp"/>
        <%
    }catch(Exception e){
        errorData.setGeneralError(e.getMessage());
        %>
            <jsp:forward page="signup.jsp"/>
        <%
        return;
    }
%>