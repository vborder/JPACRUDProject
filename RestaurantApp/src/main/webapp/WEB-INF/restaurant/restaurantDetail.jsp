<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Restaurant Details</title>
</head>
<body>
	<h2>Restaurant: ${restaurant.name }</h2>

	<div>
		<p class="text-black">
		Meal: ${restaurant.meal}<br>
		Calories: ${restaurant.calories}<br>
		Meal price: ${restaurant.mealPrice}<br>
		</p>
	</div>
	
	<div>
	<table>
	<td><a href="updateRestForm.do?rid=${restaurant.id}">Update</a>
	</div>
	
	<div>
	<table>
	<td><a href="deleteRestaurant.do?rid=${restaurant.id}">Delete Restaurant</a>
	</div>
	
</body>
</html>