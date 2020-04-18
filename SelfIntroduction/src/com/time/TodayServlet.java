package com.time;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class TodayServlet
 */
@WebServlet("/TodayServlet")
public class TodayServlet extends HttpServlet {
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		 response.setContentType("text/html;charset=UTF-8");
        LocalDateTime time = LocalDateTime.now();
        PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<head>");
        out.println("<body>");
        out.println("<a href=\"index.html\">메인화면</a>");
        out.println("<div style=\"height:200px;line-height:700px;margin-left:auto;margin-right:auto;font-size:100px;text-align:center;\">");
        out.println("현재시간 : " + time);
        out.println("</div>");
        out.println("</body>");
        out.println("</html>");
	}

}
