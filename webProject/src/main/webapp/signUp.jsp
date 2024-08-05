<%@page import="webProject.UserDTO"%>
<%@page import="webProject.UserDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("utf-8");
	String name = request.getParameter("name");
	String password = request.getParameter("password");
	String tel = request.getParameter("tel");
	String gender = request.getParameter("gender");
	String address = request.getParameter("address");
	UserDAO dao = new UserDAO();
	UserDTO dto = new UserDTO(0,name,password,tel,gender,address);
	System.out.println(dto);
	if(dao.userCheck(name)){
        // 이미 있는 아이디이면 오류 표시
%>
        <script>
            alert('이미 등록된 아이디입니다.');
            history.back()
        </script>
<%          
    } else {           
	 	dao.userSignUp(dto);
    
%>
        <script>
       	 	alert('가입이 완료되었습니다.');
        	window.location.href = 'index.jsp';
        </script>
<%          
    }
%> 

 	