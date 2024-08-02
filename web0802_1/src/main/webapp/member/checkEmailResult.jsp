<%@page import="util.Cookies"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	String email = request.getParameter("email");
	String rememberMe = request.getParameter("rememberMe");
	System.out.println(rememberMe);
	
	if("on".equals(rememberMe)){ // 쿠키 생성
		response.addCookie(Cookies.createCookie("email",email,"/",-1)
				
		);
	}else {	// 쿠키 삭제
		response.addCookie(Cookies.createCookie("email","","/",0)	
		);
	}
	
	response.sendRedirect("saveEmail.jsp");
%>