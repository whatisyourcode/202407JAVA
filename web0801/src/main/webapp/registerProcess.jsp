<%@page import="web0801.AccountDTO"%>
<%@page import="web0801.AccountDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
	request.setCharacterEncoding("UTF-8");
	AccountDAO dao = new AccountDAO();
	String username = request.getParameter("username"); 
	String password = request.getParameter("password");
	String email = request.getParameter("email");
	AccountDTO dto = new AccountDTO(0,username,password,email,0);
	dao.insertAccount(dto);
	response.sendRedirect("index.jsp");
%>