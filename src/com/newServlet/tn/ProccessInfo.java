package com.newServlet.tn;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;

@WebServlet("/ProccessInfo")
public class ProccessInfo extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public ProccessInfo() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String url = "/DisplayInfo.jsp";
		String name = request.getParameter("name");
		
		updateDB(name);
		people ppl = new people(name);
		
		request.setAttribute("ppl", ppl);
		getServletContext()
		.getRequestDispatcher(url)
		.forward(request, response);
	}
	
	protected void updateDB(String name) {
		Connection con;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			String url = "jdbc:mysql://46.252.181.108:3306/bxnsoxaphlnph1s2sl85";
			String user = "uur3f2ugv5ykn6ck";
			String pw = "Ejq08b9L87559DJ6HlNb";
			
			
			
			
			
			con = DriverManager.getConnection(url, user, pw);
			Statement s = con.createStatement();
			String query = "INSERT INTO people(naame) VALUES('" + name + "')";
			s.executeUpdate(query);
		}catch(ClassNotFoundException e) {
			e.printStackTrace();
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}

}
