<%@page import="shop.BoardDAO"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<% 
String num = request.getParameter("num");
BoardDAO dao = new BoardDAO();
dao.deleteBoard(Integer.parseInt(num));
response.sendRedirect("list.jsp");
%>