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
		pw.println("<br />");
		try{
			pw.println("<h2>TEAM DATA PIRATES</h2>");
			pw.println("<br />");
			
			int row = Integer.parseInt(req.getParameter("row"));
			int col = Integer.parseInt(req.getParameter("col"));
		
			if(row==0 || col==0 ) {
				pw.print("<body><h1>To generate table, row and column number should be greater than zero!</h1></body>");
				pw.close();
			}
			else {
				pw.println("<tr>");
		
				for(int i=0;i<row;i++) {
					pw.println("<HTML>");
					pw.println("<body>");
					pw.println("<CENTER>");
					pw.println("<table width=device-width initial-scale=1.0 BORDER=1 CELLPADDING=0 CELLSPACING=0 WIDTH=80%");
			
					pw.println("<tr>");
			
					for(int j=0;j<col;j++) {
						if(i%2==0)
							pw.println("<td bgcolor=Pink>r:"+(i+1)+",c:"+(j+1)+"</td> ");
						else if(i%2!=0)
							pw.print("<td bgcolor=  Blue>r:"+(i+1)+",c:"+(j+1)+"</td> ");
					}
					pw.println("</tr>");
					pw.println("</style>");
					pw.println("</table>");
					pw.println("</CENTER>");
					pw.println("</body>");
					pw.println("</HTML>"); 
				}
			}
		}
		catch(Exception e) {
			pw.println("<body><h1>Please give correct input to generate table!</hr></body>");
		}
		
		pw.close();
	}

}
