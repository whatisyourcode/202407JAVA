<%@page import="login.LoginDTO"%>
<%@page import="login.LoginDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>


<%
	String id = request.getParameter("id");
	String pw = request.getParameter("pw");
	String name = request.getParameter("name");
    request.setCharacterEncoding("utf-8");
	LoginDAO dao = new LoginDAO();

	if(dao.idCheck(id)){
		 	dao.signUp(id,pw,name);
            // 이미 있는 아이디이면 오류 표시
%>
            <script>
                alert('이미 등록된 아이디입니다.');
                history.back()
            </script>
<%          
        } else {           
        dao.signUp(id, pw, name);
        
%>
            <script>
                alert('가입이 완료되었습니다.');
                window.close();
            </script>
<%          
        }
%>
</body>
</html>