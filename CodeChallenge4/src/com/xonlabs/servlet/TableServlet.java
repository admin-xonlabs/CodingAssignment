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
    		return "blue";
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
	    String [][] a = new String[r+1][c+1];
	    String u ="";
	    
	    for(int i=1; i<r+1; i++) {
	    	for(int j=1; j<c+1; j++) {
	    		String str = "R" +i +"C"+j;
	    	  
	    		a[i][j] = str;
	    	}
	    }
	    for(int i=1; i<r+1; i++) {
	    	u = get_color(u);
	    	for(int j=1; j<c+1; j++) {
	    	  
	    		pw.print("<p style='display:inline;color:"+u+"'>"+a[i][j]+"   "+"</p>");
	    	}
	    	pw.println("<br />");
	    }
	    
	}

}
