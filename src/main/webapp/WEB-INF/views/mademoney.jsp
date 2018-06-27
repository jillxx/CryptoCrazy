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
<title>Money Made</title>
<style>
body {
	background: url("images/coolcoin.gif") no-repeat center fixed;
	background-size: cover;
}

h1 {
	color: #d0c066;
	text-shadow: 2px 1px black;
	text-align: center;
	font-size: 60px;
	font-family: Impact;
}

h2 {
	color: darkolivegreen;
	text-align: center;
	font-size: 40px;
	font-family: Impact;
	background-color: white;
	width: 33%;
	height: 150px;
	border-radius: 5px;
	font-size: 27px;
	padding: 5px;
	margin: 5px;
}

h3 {
	color: #d0c066;
	text-align: center;
	font-size: 40px;
	font-family: Impact;
}

.buttonstyle {
	color: #d0c066;
	border-radius: 35%;
	text: white;
	font-size: 35px;
	padding: 15px 32px;
}


#boxbgrd {
	background: rgba(0, 0, 0, 0.7);
}

#boxbgrd2 {
	background: rgba(255,255,255, 0.80);
;
}
</style>
</head>
<body>
	<div class="container" align="center"
		style="display: flex; Padding: 30px">
		<div class="column" id="boxbgrd2">
			<h4>
				You invested in <br><img src="${image }" alt="logo" width="25"
					height="25"> ${name }  <br></h4> <p><b> Currency created:</b>
				${startdate }</p>
			
			<div id="target" style="overflow: scroll; width: 300px; height: 618px;">${description }</div>
		</div>

		<div class="column" id="boxbgrd">

			<br> <br>
			<h1>You Made Money!</h1>
			<br>

			<div class="container" style="display: flex">
				<h2>Purchase price: ${pricestart }</h2>
				<h2>Sell price: ${priceend }</h2>
				<h2>Percentage change: ${percent }%</h2>
			</div>
			<h3>
				Your Money: ${money }
			</h3>

			<br>
			<h3>
				Remaining Buys/Sells: ${counter }
			</h3>
			<br> <br> 
			<a href="/continue">
				<button class="buttonstyle">Continue</button>
			</a>
		</div>

		<div class="column" id="boxbgrd">
			<h3 style="font-size: 20px; background-color: white; margin: 0px; color: darkolivegreen" >
				${name} Trending News</h3>
			<div id="target"
				style="overflow: scroll; width: 300px; height: 700px;">${link }
			</div>
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