<%@page import="webProject.UserDTO"%>
<%@page import="webProject.UserDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("utf-8");
	int id = Integer.parseInt(request.getParameter("id"));
	String name = request.getParameter("name");
	String password = request.getParameter("password");
	String tel = request.getParameter("tel");
	String address = request.getParameter("address");
	String gender = request.getParameter("gender");
	
	UserDTO dto = new UserDTO(id,name,password,tel,address,gender);
	UserDAO dao = new UserDAO();
	
	
	dao.userSet(dto);
	
	response.sendRedirect("index.jsp");
%>
