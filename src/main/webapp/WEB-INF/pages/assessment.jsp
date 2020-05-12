<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Candidate Assessment Data</title>
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  
  
  <!--start reporting css -->
  <link rel="stylesheet" href="/assets/css/lib/datatable/dataTables.bootstrap.min.css">
	<link rel="stylesheet" href="/assets/css/lib/datatable/buttons.bootstrap.min.css">
	<link rel="stylesheet" href="/assets/css/lib/datatable/buttons.dataTables.min.css">
 	<link rel="stylesheet" href="/assets/css/lib/datatable/jquery.dataTables.min.css">
   <!--end reporting css -->
  <script>
  function filterArticles(marks){
	    $(".table div[class='marks']").each(function(){
	        if ($(this).text() <= marks){
	            $(this).closest("tr").show();
	        } 
	        else {
	            $(this).closest("tr").hide();
	        }
	    });
	}
  function filterArticles2(obj){
	  $(".table div[class='trid']").each(function(){
	 
		  if ($(this).text() == obj){
	            $(this).closest("tr").show();
	        } 
	        else {
	            $(this).closest("tr").hide();
	        }
	        
	    });
	  
  }
  
  function filterArticles1(){
	  $(".table div[class='trid']").each(function(){
	 
	            $(this).closest("tr").show();
	        
	    });
	  
  }
  </script>
  <style> 
.modal .modal-dialog {
  width: 90%;
}
</style>
</head>
<body>
<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="#">Module-3</a>
    </div>
    <ul class="nav navbar-nav">
      <li><a href="/Training/add">Home</a></li>
      <li ><a href="/Training/show">Training</a></li>
      <li ><a href="/candidate/show">Candidate</a></li>
      <li class="active"  ><a href="/assessment/show">Assessment</a></li>
    </ul>
  </div>
</nav>
<!-- ----------------------------------------------------------------------------------  -->
<button type="button" class="btn btn-info btn-lg" data-toggle="modal" data-target="#myModal1">Add Assessment</button>

<button type="button" class="btn btn-info btn-lg" data-toggle="modal" data-target="#myModal">Show Assessment</button>

<div class="modal fade" id="myModal" role="dialog">
    <div class="modal-dialog">
    
      <!-- Modal content-->
      <div class="modal-content">
        <div class="modal-header">
          <button type="button" class="close" data-dismiss="modal">&times;</button>
          <h4 class="modal-title"></h4>
        </div>
        <div class="modal-body">
             
	<div>
  <h2>Candidate List</h2>
   <table id="bootstrap-data-table-export" class="table table-striped table-bordered">
   <thead>
    <tr>
    <th scope="col">Training Id</th>
      <th scope="col">Candidate Id</th>
      <th scope="col">Name</th>
      <th scope="col">Date Of Submission</th>
      <th scope="col">Submitted Date</th>
      <th scope="col">Marks</th>
    </tr>
    </thead>
   <tbody>
    <c:forEach items="${list1 }" var="cand" >
     <tr>
     <td><div class="trid">${cand.id }</div></td>
      <td>${cand.candidateId }</td>
      <td>${cand.name }</td>
      <td>${cand.date }</td>
      <td>${cand.dateOfSubmission }</td>
      <td><div class="marks">${cand.marks }</div></td>
     </tr>
    </c:forEach>
   </tbody>
  </table>
 </div>

        </div>
        <div class="modal-footer">
        
         <   <!--start reporting tool -->
         <script src="https://code.jquery.com/jquery-1.12.3.js"></script> 
<script src="https://www.bubt.edu.bd/assets/backend/DataTables-1.10.13/DataTables-1.10.13/media/js/jquery.dataTables.js"></script>   
<script src="https://www.bubt.edu.bd/assets/backend/DataTables-1.10.13/DataTables-1.10.13/extensions/Buttons/js/dataTables.buttons.js"></script>  
<script src="https://www.bubt.edu.bd/assets/backend/DataTables-1.10.13/DataTables-1.10.13/extensions/Buttons/js/buttons.colVis.js"></script>
 

   
  <script src="/assets/js/lib/data-table/datatables.min.js"></script>
    <script src="/assets/js/lib/data-table/dataTables.bootstrap.min.js"></script>
    <script src="/assets/js/lib/data-table/dataTables.buttons.min.js"></script>
    <script src="/assets/js/lib/data-table/jszip.min.js"></script>
    <script src="/assets/js/lib/data-table/buttons.html5.min.js"></script>
    <script src="/assets/js/lib/data-table/buttons.print.min.js"></script>
    <script src="/assets/js/lib/data-table/buttons.colVis.min.js"></script>
  <script src="/assets/js/lib/data-table/pdfmake.min.js"></script>
    <script src="/assets/js/lib/data-table/vfs_fonts.js"></script>
    <script type="text/javascript">
        $(document).ready(function() {
       
    $('#bootstrap-data-table-export').DataTable({
        dom: 'lBfrtip',
        lengthMenu: [[10, 25, 50, -1], [10, 25, 50, "All"]],
        buttons: [
            'colvis','excel', 'print','pdf'
        ]
    });

        } );
        </script>
        
            <!--end reporting tool -->
        </div>
        
        
      </div>
      
    </div>
  </div>
  <!-- ------------------------------------------------------------------------------------------------------------------------ -->
  <form action="insert" method="post">

<div class="modal fade" id="myModal1" role="dialog">
    <div class="modal-dialog">
    
      <!-- Modal content-->
      <div class="modal-content">
        <div class="modal-header">
          <button type="button" class="close" data-dismiss="modal">&times;</button>
          <h4 class="modal-title"></h4>
        </div>
        <div class="modal-body">
             
	<div>
  <h2>Candidate List</h2>
   <table id="bootstrap-data-table-export" class="table table-striped table-bordered">
   <thead>
    <tr>
    <th scope="col">Training Id</th>
      <th scope="col">Candidate Id</th>
      <th scope="col">Date Of Submission</th>
      <th scope="col">Submitted Date</th>
      <th scope="col">Marks</th>
    </tr>
    </thead>
   <tbody>
     <tr>
     <td><input type="text"  name="id"></td>
      <td><input type="text"  name="candidateId"></td>
      <td><input type="text"  name="date"></td>
      <td><input type="text"  name="dateOfSubmission"></td>
      <td><input type="text"  name="marks"></td>
      <td><input class="btn btn-primary btn-lg" type="submit" value="Add"></td>
     </tr>
   </tbody>
  </table>
 </div>

        </div>
        <div class="modal-footer">
        </div>
        </div>
        </div>
        </div>
        </form>
</body>
</html>