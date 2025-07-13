<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>  
   <title>Student Registration</title>
</head>
<body>
    <h2>Register Student</h2><br>
    <form action="StudentServlet" method="post">
        Name: <input type="text" name="name"><br><br>
        Email: <input type="email" name="email"><br><br>
        Course: <input type="text" name="course"><br><br>      
        <input type="submit" value="Register">
    </form>
</body>
</html>
