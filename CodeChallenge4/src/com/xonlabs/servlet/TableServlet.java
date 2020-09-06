package com.xonlabs.servlet;

import java.io.IOException;

import javax.servlet.*;
import java.io.PrintWriter;
import java.util.Scanner;

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
	public static String get_color(String c) {
		if(c =="red") {
    		return "yellow";
    	}
    	else
    	{
    		return "red";
    	}
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html");
		PrintWriter pw = resp.getWriter();
		pw.println("Welcome to the world of Servlet Programming <br />");
		
	    String row = req.getParameter("row");
	    String col = req.getParameter("col");
	    int r = Integer.parseInt(row);
	    int c = Integer.parseInt(col);
	    if (r<1 || c<1) {
	    	pw.print("Enter a number greater than 0");
	    }
	    else {
	    	
		    String [][] a = new String[r+1][c+1];
		    String u ="";
		    
		    for(int i=1; i<r+1; i++) {
		    	for(int j=1; j<c+1; j++) {
		    		String str = "Row " +i +",Col "+j;
		    	  
		    		a[i][j] = str;
		    	}
		    }
		    pw.print("<table style='border: 1px solid black;width=100%; margin:0px'> ");
		    for(int i=1; i<r+1; i++) {
		    	u = get_color(u);
		    	pw.print("<tr >");
		    	for(int j=1; j<c+1; j++) {
		    	  
		    		pw.print("<td style='display:inline;background-color:"+u+";margin-right:2px;border: 1px solid black'>"+a[i][j]+"   "+"</td>");
		    	}pw.print("</tr>");
		    	pw.println("<br />");
		    }
		    pw.print("</table>");
	    }
	    
	}

}
