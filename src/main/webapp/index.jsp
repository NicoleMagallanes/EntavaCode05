<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
  <title>JDBC</title>
</head>
<body>
<form action="computegradeservlet.action" method="post">
  <p>
    Enter Name:
    <input id="name" type="text" required/>
  </p>
  <p>
    Enter Student ID:
    <input id="studentID" type="number" required/>
  </p>
  <p>
    Enter Midterm Grade:
    <input id="midterm" type="number" required/>
  </p>
  <p>
    Enter Prefinal Grade:
    <input id="prefinal" type="number" required/>
  </p>
  <p>
    <input type="submit" value="SUBMIT">
  </p>

</form>
<h1><%= "Hello World!" %></h1>
<br/>
<a href="hello-servlet">Hello Servlet</a>
</body>
</html>