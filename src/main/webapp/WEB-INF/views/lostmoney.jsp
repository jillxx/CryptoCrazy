<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>

<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<!-- Bootstrap CSS -->
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css"
	integrity="sha384-WskhaSGFgHYWDcbwN70/dfYBj47jz9qbsMId/iRN3ewGhXQFZCSftd1LZCfmhktB"
	crossorigin="anonymous">
<title>lostmoney</title>
<style>
body {
	background: url("images/MoneyByeBye.gif") no-repeat center fixed;
	background-size: cover;
}

h1, span {
	color: red;
	text-shadow: 2px 1px black;
	text-align: center;
	font-size: 80px;
	font-family: Impact;
}

h2, span {
	color: red;
	text-shadow: 2px 1px black;
	text-align: center;
	font-size: 40px;
	font-family: Impact;
}

.buttonstyle {
	color: red;
	text: black;
	font-size: 35px;
	padding: 15px 32px;
}

.row {
	display: flex;
}

.column {
	flex: 35%;
}
</style>
</head>
<body>
	<div class="row">
		<div class="column">
			<div class="container" align="center">
				<br> <br>
				<h1>You Lost Your Cash!!</h1>
				<br> <br>
				<h2>Purchase price: ${pricestart }</h2>
				<br>
				<h2>Sell price: ${priceend }</h2>
				<br>
				<h2>Percentage change: ${percent }%</h2>
				<br>
				<h2>Your Money: ${money }</h2>
				<br>
				<h2>Remaining Buys/Sells: ${counter }</h2>
				<br> <br> <br> <a href="/continue"
					style="border-radius: 35%;" class="buttonstyle"><button>Continue</button></a>
			</div>
		<div class="column">
		<img src="${image }">
			  ${name } <br>${description } ${startdate }
		</div>
		</div>

		<!-- Optional JavaScript -->
		<!-- jQuery first, then Popper.js, then Bootstrap JS -->
		<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
			integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
			crossorigin="anonymous"></script>
		<script
			src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js"
			integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49"
			crossorigin="anonymous"></script>
		<script
			src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/js/bootstrap.min.js"
			integrity="sha384-smHYKdLADwkXOn1EmN1qk/HfnUcbVRZyYmZ4qpPea6sjB/pTJ0euyQp0Mk8ck+5T"
			crossorigin="anonymous"></script>
	</div>
</body>
</html>