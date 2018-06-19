
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

	<br> Purchase price: ${pricestart }
	<br> Sell price: ${priceend }
	<br> Percentage change: ${percent }%
	<br> Your Money: ${money }
	<br>
	<h1>Select your Cryptocurrency:</h1>

	<form name="date-form" action="pricechange"	onsubmit="return checkDate()">
		<select name="currency">
			<option value="BTC">BTC</option>
			<option value="ETH">ETH</option>
			<option value="XRP">XRP</option>
			<option value="BCH">BCH</option>
			<option value="EOS">EOS</option>
			<option value="LTC">LTC</option>
			<option value="XLM">XLM</option>
			<option value="ADA">ADA</option>
			<option value="IOT">IOT</option>
			<option value="TRX">TRX</option>
			<option value="USDT">USDT</option>
			<option value="NEO">NEO</option>
			<option value="DASH">DASH</option>
			<option value="XMR">XMR</option>
			<option value="XEM">XEM</option>
			<option value="BNB">BNB</option>
			<option value="VEN">VEN</option>
			<option value="ETC">ETC</option>
			<option value="QTUM">QTUM</option>
			<option value="OMG">OMG</option>
		</select>

		<h1>Select a Start Date</h1>
		Date: <input type="date" name="date1">

		<h1>Select an End Date</h1>
		Date: <input type="date" name="date2"> 
		<br> <br> 
		<input type="submit" name="Submit">

	</form>
</body>
</html>

<script type="text/javascript" src="js/file.js"></script>
