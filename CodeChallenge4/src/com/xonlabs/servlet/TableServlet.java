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
		try {
		int row = Integer.parseInt(req.getParameter("rowSize"));
		int col = Integer.parseInt(req.getParameter("colSize"));
		
		
		if(row ==0 || col==0) {
			pw.write("Row or Column value cannot be zero.. ");
		}
		
		else if(row==(int)row && col==(int)col) {
		
		pw.print("<div style='background-color: #444' >");
		pw.print("<table style='border: 1px solid black' width='100%'>");
		for(int i=0; i<row; i++) {
			pw.print("<tr >");
			for(int j=0; j < col; j++) {
				if(i%2 == 0) {
				pw.print("<td style='background-color:#eb8f8f' align='center' >"+"Row "+(i+1)+", Col "+(j+1)+"</td>");
				} else {
					pw.print("<td style='background-color:#40a8c4' align='center'>"+"Row "+(i+1)+", Col "+(j+1)+"</td>");
				}
				
			}
			pw.print("</tr>");
		}
		
		pw.print("</table>");
		pw.print("</div>");
		}
		}
		
		catch(Exception e) {
			pw.print("Please Enter a valid input xD ");
		}
		pw.print(" Thank You!! <br> Created by Team - TechnoStars* ");
		pw.close();
	}

}
