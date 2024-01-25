package com.callor.server;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet :Server Applet Java 코드를 사용하는 Server 어플리케이션 클래스 HttpServlet 클래스를
 * 상송받고 @WebSevlet Annotation 을 부착한다 doGet(), doPost() method 를 기본적으로 구현한다.
 */
@WebServlet({ "/index" })
public class IndexServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public IndexServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	// router.get("/",(req,res)=>{})
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		String view = "/WEB-INF/views/index.jsp";
		RequestDispatcher dispatcher = req.getRequestDispatcher(view);
		dispatcher.forward(req, res);// forward 가 render와 비슷한 뜻
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
