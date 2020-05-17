<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Add the restaurant</title>
</head>
<body>

<FORM action="additionComplete.do" method="POST">
		<P>
			<LABEL for="name">Restaurant name: </LABEL> <INPUT type="text" id="name"
				placeholder="name" name="name" maxlength="255"  required><BR>
				
			<LABEL for="meal">Meal/menu item: </LABEL> <INPUT type="text"id="meal"
			 placeholder="meal" name="meal" maxlength="255" required><BR>
				
				
			<LABEL for="price">Price: </LABEL> <INPUT type="number" min="0" id="price" 
			placeholder="price" name="price" maxlength="255" required><BR>
				
				 
			<LABEL for="calories">Calories: </LABEL> <INPUT type="number" id="calories" 
			min="1" placeholder="calories" name="calories" maxlength="255"  required><BR>
			
			<INPUT type="submit" value="Send"> <INPUT type="reset">
			
		</P>
</FORM>
				
</body>
</html>