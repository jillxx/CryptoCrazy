<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<!-- Bootstrap CSS -->
 <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.1/css/bootstrap.min.css" integrity="sha384-WskhaSGFgHYWDcbwN70/dfYBj47jz9qbsMId/iRN3ewGhXQFZCSftd1LZCfmhktB" crossorigin="anonymous">  

<style>
body {
	background:
		url(https://images.unsplash.com/photo-1518546305927-5a555bb7020d?ixlib=rb-0.3.5&ixid=eyJhcHBfaWQiOjF9&s=9b23645c7536d17319d7c405820f01af&auto=format&fit=crop&w=1498&q=80)
		no-repeat center fixed;
	background-size: cover;
}

h1 {
	color: #d0c066;
	text-shadow: 2px 1px black;
	text-align: center;
	font-size: 50px;
	font-family: Impact;
}
button, .btn-primary {
	margin:auto;
	background-color: #d0c066;
	color: black;
	display: block;
}

h3 {
	color: #d0c066;
	text-shadow: 2px 1px black;
	text-align: center;
	font-size: 35px;
	font-family: Impact;
}

table {
	
	background-color: black;
	color: #d0c066;
	margin: 0px auto;
	padding: 15px 15px;
	font-weight: bold;
	width: 70%;
}

.row {
	display: flex;
}

.column {
	flex: 50%;
}

th {
    height: 35px;
}
td {
    height: 25px;
}

#boxbgrd
{
background: rgba(0, 0, 0, 0.5);
padding: 10px 10px;
margin: 40px auto;	


}
</style>

<title>LeaderBoard</title>
 

</head>
<body>
<div class="container">
	<div class="row">
		<div class="table column">
		<br>
		<br>
			<br>
			<h3>Your final amount:</h3>
			<h1>$ ${finalmoney}</h1>

			<br>
			<h3>Your investment change was  ${percentage }%</h3>
			<br>
			<a href="/"><button class="btn-primary btn-lg">Play Again?</button></a>
			
		</div>
		<br>
		<br>
		<div class="column" id="boxbgrd">

			
			<h3>Mode: ${mode}</h3>
			<table class="table" border="1">
				<thead class="thead">
					<tr>
						<th></th>
						<th>Name</th>
						<th>Score</th>


					</tr>
				</thead>
				<tbody>
					<c:forEach begin="0" end="19" var="leader" varStatus="loop"
						items="${leaderlist}">
						<tr>
							<td>${loop.count}</td>
							<td>${leader.name}</td>
							<td>${leader.score}</td>

						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
	</div>

</div>
</body>




</html>