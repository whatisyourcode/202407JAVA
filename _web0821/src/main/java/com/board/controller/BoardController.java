package com.board.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.board.db.BoardDto;
import com.board.db.MemberDto;
import com.board.service.BoardService;
import com.board.service.MemberService;

@WebServlet("/")
public class BoardController extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public BoardController() {
        super();
    }

    protected void doGet(HttpServletRequest request,
                         HttpServletResponse response)
                                 throws ServletException, IOException {
        String view = null;

        // URL에서 프로젝트 이름 뒷 부분의 문자열 얻어내기
        String uri = request.getRequestURI();
        String conPath = request.getContextPath();
        String com = uri.substring(conPath.length());

        // 주어진 URL에 따라 지정된 동작 수행
        if(com.equals("/") || com.equals("/index")) {
        	view = "index.jsp";
        } else if (com.equals("/list")) {
            String tmp = request.getParameter("page");
            int pageNo = (tmp != null && tmp.length() > 0)
                    ? Integer.parseInt(tmp) : 1;

            request.setAttribute("msgList",
                    new BoardService().getMsgList(pageNo));
            request.setAttribute("pgnList",
                    new BoardService().getPagination(pageNo));
            view = "list.jsp";

        } else if (com.equals("/view")){
            int num = Integer.parseInt(request.getParameter("num"));

            request.setAttribute("msg", new BoardService().getMsg(num));
            view = "view.jsp";

        } else if (com.equals("/write")){
            String tmp = request.getParameter("num");
            int num = (tmp != null && tmp.length() > 0)
                    ? Integer.parseInt(tmp) : 0;

            BoardDto dto = new BoardDto();
            String action = "insert";

            if (num > 0) {
                dto = new BoardService().getMsgForWrite(num);
                action = "update?num=" + num;
            }

            request.setAttribute("msg", dto);
            request.setAttribute("action", action);
            view = "write.jsp";

        } else if (com.equals("/insert")){
            request.setCharacterEncoding("utf-8");
            String writer  = request.getParameter("writer" );
            String title   = request.getParameter("title"  );
            String content = request.getParameter("content");

            try {
                new BoardService().writeMsg(writer, title, content);
                view = "redirect:list";
              
            } catch(Exception e) {
                request.setAttribute("errorMessage", e.getMessage());
                view = "errorBack.jsp";
            }

        } else if (com.equals("/update")){
            request.setCharacterEncoding("utf-8");
            int num = Integer.parseInt(request.getParameter("num"));
            String writer  = request.getParameter("writer" );
            String title   = request.getParameter("title"  );
            String content = request.getParameter("content");

            try {
                new BoardService().updateMsg(writer, title, content, num);
                view = "redirect:list";

            } catch(Exception e) {
                request.setAttribute("errorMessage", e.getMessage());
                view = "errorBack.jsp";
            }

        } else if (com.equals("/delete")){
            int num = Integer.parseInt(request.getParameter("num"));

            new BoardService().deleteMsg(num);
            view = "redirect:list";
        } else if (com.equals("/loginForm")) {
        	view = "loginForm.jsp";
        	
        
        } else if (com.equals("/login")){
        	request.setCharacterEncoding("utf-8");
        	String email = request.getParameter("email");
        	String pw = request.getParameter("pw");
        	
        	MemberDto dto = new MemberService().loginMember(email, pw);
        	HttpSession session = request.getSession();
        	session.setAttribute("memberNo" ,new MemberService().loginMember(email, pw));
        	view = "index.jsp";
        	
        } else if (com.equals("/signUpForm")) {
        	view = "signUpForm.jsp";
        } else if(com.equals("/signUp")) {
        	 request.setCharacterEncoding("utf-8");
        	 String email = request.getParameter("email");
        	 String pw = request.getParameter("pw");
        	 String name = request.getParameter("name");
        	 String tel = request.getParameter("tel");
        	 String gender = request.getParameter("gender");
        	 
        	 try {
                 new MemberService().registerMember(email, pw, name, tel, gender);
                 view = "redirect:index";
               
             } catch(Exception e) {
                 request.setAttribute("errorMessage", e.getMessage());
                 view = "errorBack.jsp";
             }
        	 
        } else if (com.equals("/logout")) {
        	HttpSession session = request.getSession();
        	session.removeAttribute("memberNo");
        	view = "redirect:index";
        }

        // view에 담긴 문자열에 따라 포워딩 또는 리다이렉팅
        if (view.startsWith("redirect:")) {
            response.sendRedirect(view.substring(9));
        } else {
            request.getRequestDispatcher(view).forward(request, response);
        }
    }

    protected void doPost(HttpServletRequest request,
                          HttpServletResponse response)
                                  throws ServletException, IOException {
        doGet(request, response);
    }
}