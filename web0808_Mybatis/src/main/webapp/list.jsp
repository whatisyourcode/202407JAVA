<%@page import="shop.BoardDTO"%>
<%@page import="java.util.List"%>
<%@page import="shop.BoardDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
BoardDAO dao = new BoardDAO();
List<BoardDTO> list = dao.getBoardList();
request.setAttribute("list", list);
%>
<jsp:forward page="list_view.jsp"/>
