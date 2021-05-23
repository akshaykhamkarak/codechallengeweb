<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1">

<title>home</title>
 <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>
  <link rel="stylesheet" href="style.css">
</head>
<body>
	<form action="addplayer" method="post">
  <div class="container">
    <h1>Register</h1>
    <p>Please fill in this form to create an account.</p>
    <hr>

    <label for="pid"><b>Playerid:</b></label>
    <input type="text" placeholder="Enter player id" name="pid" id="pid" required>

    <label for="name"><b>Name:</b></label>
    <input type="text" placeholder="Enter Name" name="name" id="name" required>

    <label for="age"><b>Player Age:</b></label>
    <input type="text" placeholder="Enter Age" name="age" id="age" required>
    
      <label for="teamname"><b>Team name:</b></label>
    <input type="text" placeholder="Enter Team name" name="teamname" id="teamname" required>
   
    <hr>
    
   <label for="name">Gender:</label>
    <select name="gender" style="width: 100px">
						<option>Male</option>
						<option>Female</option>
				</select>
				
   
    <button type="submit" class="registerbtn">Register</button>
  </div>
  
  <div class="container signin">
    <p>Show Player Record?	<a href="viewPlayer.jsp">View Player</a>.</p>
  </div>
</form>
<br>


</body>
</html>