<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Data Page</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script></head>
</head>
<body>
<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="#">Module-3</a>
    </div>
    <ul class="nav navbar-nav">
      <li><a href="/Training/add">Home</a></li>
      <li class="active"><a href="/Training/show">Data</a></li>
    </ul>
  </div>
</nav>
<br>
<form action="up" method="post">
<div class="row">
<div class="col-sm-3">
<table class="table table-striped" >
	<tr>
		<td>
		Training_Id 
		</td>
		<td>
		<input type="text" name="id" value="${train.id}" disabled>
		</td>
	</tr>
	<tr>
		<td>
		Training_Name
		</td>
		<td>
		<input type="text"  name="name" value="${train.name}" disabled>
		</td>
	</tr>
	<tr>
		<td>
		Trainer_Name
		</td>
		<td>
		<input type="text"  name="trainerId" value="${train.trainerId}" disabled>
		</td>
	</tr>
	<tr>
		<td>
		Verticle
		</td>
		<td>
		<input type="text"  name="vertical" value="${train.vertical}" disabled>
		</td>
	</tr>
	<tr>
		<td>
		Date_Of_Training
		</td>
		<td>
		<input type="text"  name="dateOfTraining" value="${train.dateOfTraining}" disabled>
		</td>
	</tr>
	<tr>
		<td>
		Day_Of_Training
		</td>
		<td>
		<input type="text"  name="dayOfTraining" value="${train.dayOfTraining}" disabled>
		</td>
	</tr>
	<tr>
		<td>
		Start_Time
		</td>
		<td>
		<input type="text"  name="startDate" value="${train.startDate}" disabled>
		</td>
	</tr>
	<tr>
		<td>
		End_Time
		</td>
		<td>
		<input type="text"  name="endDate" value="${train.endDate}" disabled>
		</td>
	</tr>
	
	<tr>
		<td>
		Status
		</td>
		<td>
		<input type="text"  name="status" value="${train.status}">
		</td>
	</tr>
</table>
<input type="submit">
</div>
</div>
</form>
</body>
</html>