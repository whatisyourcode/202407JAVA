<%@page import="shop.ProductDAO"%>
<%@page import="shop.Product"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
request.setCharacterEncoding("UTF-8");
int id = Integer.parseInt(request.getParameter("id"));
String name = request.getParameter("name");
String description = request.getParameter("description");
double price = Double.parseDouble(request.getParameter("price"));
int stock = Integer.parseInt(request.getParameter("stock"));
Product product = new Product(id,name,description,price,stock);

ProductDAO dao = new ProductDAO();
dao.updateProduct(product);
%>

<jsp:forward page="insertProduct.jsp"/> 