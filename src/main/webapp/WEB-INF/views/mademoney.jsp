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
<title>Index</title>
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
	color: #d0c066;
	text-shadow: 2px 1px black;
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

.row {
	display: flex;
}

.column {
	flex: 30%;
}

.boxbgrd {
	background: rgba(0, 0, 0, 0.5);
	padding: 10px 10px;
	margin: 40px auto;
}

#boxbgrd2 {
	background: rgba(192, 1929, 192, 0.80);
	padding: 10px 10px;
	margin: 40px auto;
}
</style>
</head>
<body>
	<div class="container" align="center">
		<div class="row">
			<div class="column boxbgrd" color="#d0c066">
				<br> <br>
				<h1>You Made Some Cash!!</h1>
				<br>
				<h2>Purchase price: ${pricestart }</h2>			   	<h2>Sell price: ${priceend }</h2>
				<br>
				<h2>Percentage change: ${percent }%</h2>			<h2>Your Money: ${money }</h2>
				<br>
				<h2>Remaining Buys/Sells: ${counter }</h2>
				<br> <br> <a href="/continue">
					<button class="buttonstyle">Continue</button>
				</a>
			</div>
		</div>
		<div class="row">
			<div class="column" id="boxbgrd2">
				<h4>
					You invested in <img src="${image }" alt="logo" width="50"
						height="50"> ${name } <br> Currency Start Date:
					${startdate }
				</h4>
				<!-- collapse function -->
				<div class="container">
					<div class="panel-group">
						<div class="panel panel-default">
							<div class="panel-heading">
								<h4 class="panel-title">
									<a data-toggle="collapse" href="#collapse1">Currency
										Description</a>
								</h4>
							</div>
							<div id="collapse1" class="panel-collapse collapse">
								<div class="panel-body">${description }</div>

							</div>
						</div>
					</div>
				</div>
			</div>

			<div class="column boxbgrd">
				<div id="target"
					style="overflow: scroll; width: 560px; height: 500px;">
					${link }</div>
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