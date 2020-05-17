<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<FORM action="updateRestaurant.do" method="POST">
		<P>
			<INPUT type="hidden" id="id" value="${restaurant.id}" name="id"><BR>
			
			<LABEL for="name">Restaurant name: </LABEL> <INPUT type="text" id="name"
				value="${restaurant.name}" name="name" maxlength="255"><BR>
				
			<LABEL for="meal">Meal/menu item: </LABEL> <INPUT type="text"id="meal"
			value="${restaurant.meal}" name="meal" maxlength="255"><BR>
				
			<LABEL for="price">Price: </LABEL> <INPUT type="number" min="0" id="price" 
			value="${restaurant.mealPrice}" name="price" maxlength="255"><BR>
				 
			<LABEL for="calories">Calories: </LABEL> <INPUT type="number" id="calories" 
			min="1" value="${restaurant.calories}" name="calories" maxlength="255"><BR>
			
			<INPUT type="submit" value="Send"> <INPUT type="reset">
			
		</P>
</FORM>
</body>
</html>