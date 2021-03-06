
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" integrity="sha384-WskhaSGFgHYWDcbwN70/dfYBj47jz9qbsMId/iRN3ewGhXQFZCSftd1LZCfmhktB" crossorigin="anonymous">
<title>Choose Your Crypto</title>
<style>


body
 {
 	background: url("images/digital2.gif") no-repeat center fixed;
 	background-size: cover;
    
}

h1, span {
    color: #d0c066;
    text-shadow: 3px 2px black;
    text-align: center;
    font-size: 75px;
    font-family: Impact;
}

h2, span {
	color: #d0c066;
    text-shadow: 2px 1px black;
    text-align: center;
    font-size: 45px;
    font-family: Impact;
}

h3, span {
	color: #d0c066;
    text-align: center;
    font-size: 25px;
    text-shadow: 2px 1px black;
    font-family: Impact;
}

.buttonstyle {
	color: black;
	text: white;
	font-size: 20px;
	padding: 15px 32px;

}

form { display: inline; }

</style>

</head>
<body>


		<div class="row">
		<div class="col-lg-2 col-md-4 col-sm-6 col-xs-12" ></div> 
			<div class="col-lg-8 col-md-4 col-sm-6 col-xs-12"  class="form-control form-rounded">


<div class="container form-control form-rounded" align="center" style = "margin-bottom: 0x; background: rgba(0, 0, 0, 0.8)">
	<br>
	<br>
	<h1>Select Your Cryptocurrency:</h1>
	<br>
	
	<h3>Go back in time, select your buy and sell dates.</h3>
	<h3>Make sure they are in consecutive order!</h3>
	<h3>Player starts with $1,000</h3>
	<br>
	<form name="date-form" action="pricechange"	onsubmit="return checkDate()" method="post">
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
		<h2>Purchase Date:</h2>
		
		<input type="date" name="date1"  min="2009-01-01" max="2018-06-27" required>
		<p id="invaliddate"></p>
		
	
		<h2>Sell Date:</h2>
		<input type="date" name="date2" min="2009-01-01" max="2018-06-28" required> 
		<br> <br> <br>
		
		<input class="btn-warning btn-lg" style = "background-color:#d0c066; border-color:#d0c066 " type="submit" name="Submit">   
	</form>	
		<a href="/quit"><button style = "background-color:#d0c066; border-color:#d0c066 " class="btn-warning btn-lg">&nbsp&nbspQuit&nbsp&nbsp</button></a>
		

		<br>
		<br>
		<br>

	<p style = "color: red">
	${errormessage }
	</p>
			</div>
		</div>
	</div>
	
<%-- <br> Purchase price: ${pricestart }
	<br> Sell price: ${priceend }
	<br> Percentage change: ${percent }%
	<br> Your Money: ${money }
	<br> Remaining Buys/Sells: ${counter } --%>


<script type="text/javascript" src="js/file.js"></script>
</body>
</html>
