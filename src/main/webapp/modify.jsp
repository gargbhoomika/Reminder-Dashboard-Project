<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link href="style.css" rel="stylesheet">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Reminder</title>
</head>
<body>
<div class="bg-image"></div>

<div class="bg-text">
<form action="modify">
Enter old reminder time: <input type="text" name="otime"><br><br>
Enter old reminder date: <input type="date" name="odate"><br><br>
Enter old Label: &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp;
<input type="text" name="olabel"><br><br>
Enter new reminder time: <input type="text" name="time"><br><br>
Enter new reminder date: <input type="date" name="date"><br><br>
Enter new Label: &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp;
<input type="text" name="label"><br><br>
 &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp;
  &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp; &nbsp;&nbsp;
  <input type="submit" value="Modify Reminder">
</form>
</div>

</body>
</html>