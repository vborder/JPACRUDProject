<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add a restaurant</title>
</head>
<body>
<h2>Add a restaurant</h2>
<form action="addRestaurant.do" method="POST">
		<p>
			<label for="name">Restaurant name: </label> <input type="text" id="name"
				placeholder="name" name="name" size="50" maxlength="255"  required><br>
				
			<label for="meal">Menu item: </label> <input type="text" id="meal"
			 placeholder="meal" name="meal" size="50" maxlength="255" required><br>
				
			<label for="price">Price: </label> <input type="number" step="0.01" min="0" id="mealPrice" 
			placeholder="price" name="mealPrice" size="30" maxlength="255"><br>
				
			<label for="calories">Calories: </label> <input type="number" id="calories" 
			min="1" placeholder="calories" name="calories" size="20" maxlength="255"><br>
			<br>
			
			<input type="submit" value="Add"> <input type="reset">
			
		</p>
</form>
				
</body>
</html>