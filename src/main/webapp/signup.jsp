<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="style.css" rel="stylesheet">
<title>Login Page</title>
</head>
<body>
<div class="bg-image"></div>

<div class="bg-text">
<form action="/sign">
	<input type="text" placeholder=" Full Name" name="name"><br><br>
  <input type="email" name="email" placeholder=" Email Address"><br><br>
  <input type="number" name="phone" placeholder=" Contact Number"><br><br>
  <input type="password" name="pass" placeholder=" Password"><br><br>
  <input type="submit" value="Sign Up" id="submit"><br><br>
  </form>
</div>
</body>
</html>