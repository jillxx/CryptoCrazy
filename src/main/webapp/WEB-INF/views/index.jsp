
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" integrity="sha384-WskhaSGFgHYWDcbwN70/dfYBj47jz9qbsMId/iRN3ewGhXQFZCSftd1LZCfmhktB" crossorigin="anonymous">
<title>Index</title>
<style>


body
 {
 	background: url("images/purple.gif") no-repeat center fixed;
 	background-size: cover;
    
}

h1, span {
    color: purple;
    text-shadow: 3px 2px black;
    text-align: center;
    font-size: 75px;
    font-family: Impact;
}

h2, span {
	color: purple;
    text-shadow: 2px 1px black;
    text-align: center;
    font-size: 45px;
    font-family: Impact;
}

.buttonstyle {
	color: purple;
	text: white;
	font-size: 35px;
	padding: 15px 32px;

}


</style>

<title>Index</title>
</head>
<body>
	<br>
	<br>
	<h1>Select Your Cryptocurrency:</h1>
	<br>
	<br>
<div class="container" align="center" >
	<form name="date-form" action="pricechange"	onsubmit="return checkDate()">
		<select class ="buttonstyle" name="currency">
			<option value="BTC">Bitcoin (BTC)</option>
			<option value="ETH">Ethereum (ETH)</option>
			<option value="XRP">Ripple (XRP)</option>
			<option value="BCH">Bitcoin Cash (BCH)</option>
			<option value="EOS">EOS (EOS)</option>
			<option value="LTC">Litecoin (LTC)</option>
			<option value="XLM">Stellar (XLM)</option>
			<option value="ADA">Cardano (ADA)</option>
			<option value="IOT">IOTA (IOT)</option>
			<option value="TRX">Tron (TRX)</option>
			<option value="USDT">Tether (USDT)</option>
			<option value="NEO">NEO (NEO)</option>
			<option value="DASH">Dash (DASH)</option>
			<option value="XMR">Monero (XMR)</option>
			<option value="XEM">NEM (XEM)</option>
			<option value="BNB">Binance Coin (BNB)</option>
			<option value="VEN">VeChain (VEN)</option>
			<option value="ETC">Ethereum Classic (ETC)</option>
			<option value="QTUM">Qtum (QTUM)</option>
			<option value="OMG">OmiseGO (OMG)</option>
		</select>
 		<br>
 		<br>
 		<br>
		<h2>Purchase Date:</h2>
		
		<input type="date" name="date1"  min="2000-01-02" max="2018-06-19" required>
		<br>
		<br>
		<h2>Sell Date:</h2>
		<input type="date" name="date2" min="2000-01-02" max="2018-06-19" required> 
		<br> <br> <br>
		<input style= "border-radius: 35%;" class="buttonstyle" type="submit" name="Submit">

	</form>
	
	${errormessage }
	</div>
<br> Purchase price: ${pricestart }
	<br> Sell price: ${priceend }
	<br> Percentage change: ${percent }%
	<br> Your Money: ${money }
	<br> Remaining Buys/Sells: ${counter }


<script type="text/javascript" src="js/file.js"></script>
</body>
</html>
