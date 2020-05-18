<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Update Restaurant</title>
</head>
<body>
<h3>Update the restaurant record</h3>
<form action="updateRestaurant.do" method="POST">
		<p>
			<input type="hidden" id="id" value="${restaurant.id}" name="id"><br>
			
			<label for="name">Restaurant name: </label> <input type="text" id="name"
				value="${restaurant.name}" name="name" size="50" maxlength="255"><br>
				
			<label for="meal">Menu item: </label> <input type="text" id="meal"
			value="${restaurant.meal}" name="meal" size="50" maxlength="255"><br>
				
			<label for="price">Price: </label> <input type="number" step="0.01" id="mealPrice" 
			min="0" value="${restaurant.mealPrice}" name="mealPrice" size="30" maxlength="255"><br>
				 
			<label for="calories">Calories: </label> <input type="number" id="calories" 
			min="1" value="${restaurant.calories}" name="calories" size="20" maxlength="255"><br>
			<br>
			
			<input type="submit" value="Update"> <input type="reset">
			
		</p>
</form>
</body>
</html>