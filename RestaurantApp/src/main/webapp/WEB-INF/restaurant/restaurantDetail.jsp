<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Restaurant Details</title>
</head>
<body>
	<h2>${restaurant.name }</h2>

	<div>
	<table>
		<p class="text-black">
		Meal: ${restaurant.meal}<br>
		Calories: ${restaurant.calories}<br>
		Meal price: ${restaurant.mealPrice}<br>
		</p>
	</table>
	</div>
	
	<div>
	<table>
	<td><a href="updateRestForm.do?rid=${restaurant.id}">Update</a>
	</table>
	</div>
	
	<div>
	<table>
	<td><a href="deleteRestaurant.do?rid=${restaurant.id}">Delete</a>
	</table>
	</div>
	
</body>
</html>