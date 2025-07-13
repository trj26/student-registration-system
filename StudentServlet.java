package StudentPackage;

import java.io.*;
import javax.servlet.*; 
import javax.servlet.http.*; 
import java.sql.*;
public class StudentServlet extends HttpServlet {     
	protected void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException { 
		String name = request.getParameter("name");
        String email = request.getParameter("email");    
        String course = request.getParameter("course");
        try {      
        	Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentdb", "root", "Root123");
            String sql = "INSERT INTO students (name, email, course) VALUES (?, ?, ?)";     
            PreparedStatement ps = conn.prepareStatement(sql);            
            ps.setString(1, name);           
            ps.setString(2, email);          
            ps.setString(3, course);
            int rows = ps.executeUpdate();   
            if (rows > 0) {     
            	response.sendRedirect("success.jsp");   
            	} else {               
            		response.getWriter().println("Failed to register");     
            		}       
            } catch (Exception e)
        {
            e.printStackTrace(); 
        }
    }
}
