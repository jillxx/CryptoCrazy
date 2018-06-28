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
<title>Welcome</title>
<style>
body {
	background: url("images/digitalcoin.gif") no-repeat center fixed;
	background-size: cover;
}

h1{
	color: black;
	text-shadow: 3px 2px #d0c066;
	text-align: center;
	font-size: 80px;
	font-family: Impact;
}
span{

	color: #d0c066;
	text-shadow: 3px 2px black;
	text-align: center;
	font-size: 80px;
	font-family: Impact;

}


h2, span {
	font-size: 40px;
}

/* div {
    opacity: 0.5;
} */
</style>
</head>
<body>
	<br>
	<br>
	<h1>Crypto-Crazy!</h1>
	<br>
	<br>
	<div class="container">
		<div class="row">
			<div class="col-lg-3 col-md-3 col-sm-6 col-xs-12">

				<form action="addplayer"
					style="margin-bottom: 0px; background: rgba(0, 0, 0, 0.5)"
					class="form-control form-rounded" method="post">

					<span>Your Name:</span> <br> <input type="text"
						class="form-control form-rounded" name="name"
						style="width: 200px; height: 40px;" required> <br> <span>Select
						Mode:</span> <br> <select name="mode"
						style="width: 100px; height: 40px;">

						<option value="Easy">Easy</option>
						<option value="Medium">Medium</option>
						<option value="Difficult">Difficult</option>

					</select> <br> <br> <input class="btn btn-warning" type="submit"
						value="Submit" style="width: 80px;">
				</form>
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