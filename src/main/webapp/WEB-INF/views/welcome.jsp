<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Index</title>
</head>
<body>
	<h1>Crypto: Cash or Crash!!</h1>
	<br>

	<form action = "addplayer">
	Your Name: <input type="text" name="name">
	Select Mode: 
			<select name="mode">
			<option value="Easy">Easy</option>
			<option value="Medium">Medium</option>
			<option value="Difficult">Difficult</option>
			<option value="Survival">Survival</option>

		</select>
		<input type="submit" value="Submit">
	</form>
	
</body>
</html>