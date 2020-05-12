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
      <li class="active"><a href="/Training/add">Home</a></li>
      <li ><a href="/Training/show">Training</a></li>
      <li ><a href="/candidate/show">Candidate</a></li>
      <li ><a href="/assessment/show">Assessment</a></li>
    </ul>
  </div>
</nav>
<br>
<form action="insert" method="post">
<div class="row">
<div class="col-sm-3">
<table class="table table-striped" >
	<tr>
		<td>
		Training_Name
		</td>
		<td>
		<input type="text"  name="name">
		</td>
	</tr>
	<tr>
		<td>
		Trainer_Id
		</td>
		<td>
		<input type="text"  name="trainerId">
		</td>
	</tr>
	<tr>
		<td>
		Verticle
		</td>
		<td>
		<input type="text"  name="vertical">
		</td>
	</tr>
	<tr>
		<td>
		Start Date
		</td>
		<td>
		<input type="text"  name="startDate">
		</td>
	</tr>
	<tr>
		<td>
		End Date
		</td>
		<td>
		<input type="text"  name="endDate">
		</td>
	</tr>
	
	<tr>
		<td>
		Status
		</td>
		<td>
		<input type="text"  name="status">
		</td>
	</tr>
	<tr>
		<td>
		No. of Days
		</td>
		<td>
		<input type="text"  name="nodays">
		</td>
	</tr>
	<tr>
		<td>
		Room No
		</td>
		<td>
		<input type="text"  name="roomno">
		</td>
	</tr>
</table>
<input class="btn btn-primary" type="submit" value="ADD Data">
</div>
</div>
</form>
<br><br><br><br><br>
<form action="up" method="post">
<div class="row">
<div class="col-sm-4">
<table class="table table-striped" >
	<tr>
		<td>
		Update Status
		</td>
		<td>
		<input type="text" name="id" placeholder="Enter Training Id" >
		</td>
		<td>
		<select id="st" name="status">
		  <option value="Approved">Approved</option>
		  <option value="Started">Started</option>
		  <option value="Completed">Completed</option>
		  <option value="Rejected">Rejected</option>
		</select>
		</td>
		<td>
		<input class="btn btn-primary btn-lg" type="submit" value="Update">
		</td>
	</tr>
	</table>
	</div>
	</div>
	</form>
</body>
</html>