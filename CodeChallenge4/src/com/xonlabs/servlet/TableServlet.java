package com.xonlabs.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class TableServlet extends HttpServlet {

	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doPost(req, resp);
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter pw = resp.getWriter();
		pw.print("Welcome to the world of Servlet Programming");
                pw.println("<html><head><title></title><meta charset=\"UTF-8\">\r\n" + 
				"<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\"><style type = text/css></style><margin:10px</head><body><center><table class= t1 border=2px cellpadding=0 cellspacing=0 width=70%>");
		try {
			int r = Integer.parseInt(req.getParameter("rows"));
			int c = Integer.parseInt(req.getParameter("cols"));
			if(r==0||c==0) {
				pw.println("<h1>Enter row and column value greater than 0!</h1>");
			}
			else if(r>0||c>0)
			{   
				for (int k = 1; k <= r; k++ )
			   {     
				 pw.println("<tr>");
				 if(k%2==0)
					 pw.println("<tr bgcolor= blue>");
				 else
					 pw.println("<tr bgcolor=yellow>");
				for(int j =1; j <= c; j++) {
					pw.println("<td>"+"Row"+k+","+"Col "+j+"</td>");
				}
			pw.println("</tr>");
			}
				pw.println("</table>");
		   }
		}
	catch(NumberFormatException e) {
		pw.println("<body><h1>Enter digits only!</hr></body>");
	}
		pw.println("</body></html>");
		pw.close();
	}

}
