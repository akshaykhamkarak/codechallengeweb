<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>home</title>
</head>
<body>
	<h1>Hello this is code challenge...</h1>
	<h2>Add new player record</h2>
	<form action="addplayer" method="post">
		<table>
			<tr>
				<td>pid:</td>
				<td><input type="number" name="pid"></td>
			</tr>
			<tr>
				<td>Name:</td>
				<td><input type="text" name="name" /></td>
			</tr>
			<tr>
				<td>age:</td>
				<td><input type="number" name="age" /></td>
			</tr>
			<tr>
				<td>teamname:</td>
				<td><input type="text" name="teamname"></td>
			</tr>
			<tr>
				<td>Gender:</td>
				<td><select name="gender" style="width: 100px">
						<option>Male</option>
						<option>Female</option>
				</select></td>
			</tr>
			<tr><td><input type="submit" value="Save-Player"/></td></tr>
		</table>



	
	</form>
	<br/>

	<a href="viewPlayer.jsp">View Player</a>
</body>
</html>