<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>LeaderBoard</title>
</head>
<body>



<h1>LEADERBOARD</h1>

		<table class="table" border="1">
			<thead class="thead">
				<tr>
					<th>Name</th>
					<th>Score</th>
					<th>Mode</th>
		
				</tr>
			</thead>
			<tbody>
				<c:forEach var="leader" items="${leaderlist}">
					<tr>
						<td>${leader.name}</td>
						<td>${leader.score}</td>
						<td>${leader.mode}</td>
					
					</tr>
				</c:forEach>
			</tbody>
		</table>

</body>
</html>