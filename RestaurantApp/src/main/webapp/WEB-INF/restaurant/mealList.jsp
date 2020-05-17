<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Meal Search Result</title>
</head>
<body>
	<h2>Your results</h2>
	<c:forEach var="results" items="${restaurants}">
	<a href="getMeal.do?rid=${restaurant.meal}">${restaurant.name}</a>
	</c:forEach>
	<br>
</body>
</html>