<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">


<style>
html {
	background:
		url(https://images.unsplash.com/photo-1518546305927-5a555bb7020d?ixlib=rb-0.3.5&ixid=eyJhcHBfaWQiOjF9&s=9b23645c7536d17319d7c405820f01af&auto=format&fit=crop&w=1498&q=80)
		no-repeat center fixed;
	background-size: cover;
}

h1 {
	color: #e6ac00;
	text-shadow: 2px 1px red;
	text-align: center;
	font-size: 50px;
	font-family: Impact;
}

h3 {
	color: #e6ac00;
	text-shadow: 2px 1px red;
	text-align: center;
	font-size: 35px;
	font-family: Impact;
}

table {
	opacity: 0.8;
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
</style>

<title>LeaderBoard</title>

</head>
<body>
	<div class="row">
		<div class="column">
			<h1>Your achievement!</h1>
			<br>
			<h3>Money you left with:</h3>
			<br><h3>${finalmoney}</h3> 
			<br>
			<h3>You investment changed  ${percentage }%.</h3>
			<br>
			<a href="/""><button>Start Again</button></a>
			
		</div>
		<div class="column">

			<h3>Mode: ${mode}</h1>
			<table class="table" border="1">
				<thead class="thead">
					<tr>
						<th></th>
						<th>Name</th>
						<th>Score</th>


					</tr>
				</thead>
				<tbody>
					<c:forEach begin="1" end="20" var="leader" varStatus="loop"
						items="${leaderlist}">
						<tr>
							<td>${loop.index }</td>
							<td>${leader.name}</td>
							<td>${leader.score}</td>

						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
	</div>


</body>




</html>