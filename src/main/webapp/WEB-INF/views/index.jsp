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
	<h1>Crypto Currency Welcome Page</h1>
	<br>
	<h1>Select your Cryptocurrency:</h1>

	<form action="pricechange">
		<select name="form">
			<option value="BCH">BCH</option>
			<option value="BTC">BTC</option>
			<option value="ETH">ETH</option>
			<option value="XRP">XRP</option>


		</select>

	</form>


	<h1>Select a Start Date</h1>
	Date:
	<input type="date" name="date1">
	

	<h1>Select an End Date</h1>
	Date:
	<input type="date" name="date2">
	<br>
	<br>
	<input type="submit" name="Submit">
	
	
</body>
</html>