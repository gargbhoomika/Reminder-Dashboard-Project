<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="style.css" rel="stylesheet">
<title>Reminders</title>
</head>
<body>
<% String email = request.getAttribute("email").toString();
session.setAttribute("email",email);
%>
<div class="bg-image"></div>

<div class="bg-text">
<form action="add.jsp">
<input type="submit" value="Add Reminder" id="submit" onclick="f1()"><br>
</form><br>
<form action="del.jsp">
<input type="submit" value="Delete Reminder" id="submit" onclick="f2()"><br>
</form><br>
<form action="modify.jsp">
<input type="submit" value="Modify Reminder" id="submit" onclick="f3()"><br>
</form>
<div id="addr"></div>
</div>

</body>
<script>
function f1(){
    document.getElementById("addr").innerHTML='<object type="text/html" data="add.jsp" ></object>';}
function f2(){
    document.getElementById("addr").innerHTML='<object type="text/html" data="del.jsp" ></object>';}
function f3(){
    document.getElementById("addr").innerHTML='<object type="text/html" data="modify.jsp" ></object>';}
</script>
</html>