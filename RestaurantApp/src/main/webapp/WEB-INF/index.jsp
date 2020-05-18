<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Restaurant Options</title>
</head>
<body>
	<h1>Welcome to the Mediterranean Diet MealFinder</h1>

	<form action="getRestaurant.do" method="GET">
	Search by restaurant ID: <input type="text" name="rid" /> 
	<input type="submit" value="Submit" />
	</form>
	<br>
	
	<table>
	<td><a href="addRestForm.do">Add<br>restaurant</a>	
	</table>
	
	<h4>Select a Restaurant:</h4>
	<table>
	<c:forEach var="r" items="${restaurants}">
	<tr>
	<td><a href="getRestaurant.do?rid=${r.id}">${r.name}</a></td>
	</tr>
	</c:forEach>
	</table>
	<br>
	
	
	
</body>
</html>