<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>view-Details</title>
</head>
<body>
	<h1>View Player Details</h1>
	
	<form action="viewplayer" method="post">
		<table>
				<tr>
				<td>teamname:</td>
				<td><input type="text" name="teamname"></td>
			</tr>
		
			<tr><td><input type="submit" value="view-Player"/></td></tr>
		</table>
</form>


</body>
</html>