package com.tj.hu;

import java.io.IOException;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class MemberServlet
 */
@WebServlet("*.do")
public class MemberServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    public MemberServlet() {
        super();
     }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String uri = request.getRequestURI();
		String path = request.getContextPath();
		String file = uri.substring(path.length());
		MemberDAO mdao = new MemberDAO();
		
		if(file.equals("/inputsave.do")) {
			System.out.println("서블릿");
			String name = request.getParameter("name");
			String id = request.getParameter("id");
			String nickname = request.getParameter("nickname");
			String password = request.getParameter("password");
			String email = request.getParameter("email");
			String phone = request.getParameter("phone");
			
			MemberBean dto = new MemberBean(name,id,nickname,password,email,phone);
			try {
				mdao.addmember(dto);
			} catch (SQLException e) {
				e.printStackTrace();
			}
			RequestDispatcher dispatcher = request.getRequestDispatcher("addMember.jsp");
			request.setAttribute("dto", dto);
			dispatcher.forward(request, response);
		
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		doGet(request, response);
	}

}
