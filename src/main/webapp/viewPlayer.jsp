<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
 <link rel="stylesheet" href="style.css">
<title>view-Details</title>
</head>
<body>

<form action="viewplayer" method="post">
  <div class="container">
    <h1>View Player Record</h1>
    <p>Plase provide the team name so you got data.</p>
    <hr>

    <label for="pid"><b>Team Name:</b></label>
    <input type="text" placeholder="Enter team name" name="teamname" id="teamname" required>
	<hr>
	  <button type="submit" class="registerbtn">View</button>
  </div>
   </div>
</form>

</body>
</html>