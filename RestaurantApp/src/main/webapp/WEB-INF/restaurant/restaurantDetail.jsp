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
		<p class="text-black">>
		Meal: ${restaurant.meal}
		Calories: ${restaurant.calories}
		</p>
	</div>
	
</body>
</html>