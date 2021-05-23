<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>home</title>
 <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
</head>
<body>
	<h1 style="align-items: center;">Player Registration From</h1>
	<h2>Add new player record</h2>

<form action="addplayer" method="post">
  <div class="form-group">
    <label for="pid">Pid:</label>
    <input type="number" class="form-control" name="pid" style="width: 300px;margin-left: 30px;">
  </div>
  <div class="form-group">
    <label for="name">Name:</label>
    <input type="name" class="form-control" name="name" required="required" style="width: 300px;margin-left: 30px;">
  </div>
    <div class="form-group">
    <label for="name">Age:</label>
    <input type="number" class="form-control" name="age" style="width: 300px;margin-left: 30px;">
  </div>
    <div class="form-group">
    <label for="name">Teamname:</label>
    <input type="name" class="form-control" name="teamname"style="width: 300px;margin-left: 30px;">
  </div>
 </div>
    <div class="form-group">
    <label for="name">Gender:</label>
    <select name="gender" style="width: 100px">
						<option>Male</option>
						<option>Female</option>
				</select>
  </div>  



  <button type="submit" class="btn btn-primary" style="margin-left: 30px;">Submit</button>
</form>
<br>

	<a href="viewPlayer.jsp">View Player</a>
</body>
</html>