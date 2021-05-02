<%-- 
    Document   : signin
    Created on : Mar 12, 2021, 7:44:26 PM
    Author     : emmanuel
--%>

<%@page import="com.src.helps.AccountError"%>
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
        String password = request.getParameter("password");
        
        RestaurantService restaurantService = new RestaurantServiceImpl();
        Account retAccount = restaurantService.signin(email, password);
        if(retAccount == null){

            errorData.setEmailError("Email Not Found");
            %>
            <jsp:forward page="signin.jsp"/>
            <%
            return;
        }
        
        Account account = (Account)session.getAttribute("AccountData");
        account = retAccount;
        session.setAttribute("AccountData", retAccount);        
        %>
            <jsp:forward page="index.jsp"/>
        <%
    }catch(Exception e){
        errorData.setGeneralError(e.getMessage());
             %>
            <jsp:forward page="signin.jsp"/>
            <%
        return;
    }
%>
