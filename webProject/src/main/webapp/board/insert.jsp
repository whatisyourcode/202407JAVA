<%@page import="webProject.BoardDTO"%>
<%@page import="webProject.BoardDAO"%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
  <%
  	request.setCharacterEncoding("UTF-8");
  	String writer = request.getParameter("writer");
	String title = request.getParameter("title");
	String content = request.getParameter("content");
  	BoardDAO dao = new BoardDAO();
	BoardDTO dto = new BoardDTO(0,writer,title,content,"",0);
	dao.insertBoard(dto);
	response.sendRedirect("list.jsp");
%>