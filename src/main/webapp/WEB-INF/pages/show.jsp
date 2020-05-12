<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>    
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
 <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
 <title>Training List</title>
 <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/font-awesome/4.5.0/css/font-awesome.min.css">
 <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script></head>
       <!--start reporting css -->
  <link rel="stylesheet" href="/assets/css/lib/datatable/dataTables.bootstrap.min.css">
	<link rel="stylesheet" href="/assets/css/lib/datatable/buttons.bootstrap.min.css">
	<link rel="stylesheet" href="/assets/css/lib/datatable/buttons.dataTables.min.css">
 	<link rel="stylesheet" href="/assets/css/lib/datatable/jquery.dataTables.min.css">
   <!--end reporting css -->
  <script>
  function filterArticles(yearFilter){
	    $(".table_blog div[class='status']").each(function(){
	        if ($(this).text() == yearFilter){
	            $(this).closest("tr").show();
	        } 
	        else {
	            $(this).closest("tr").hide();
	        }
	    });
	}
  
  function filterArticles1(){
	  $(".table_blog div[class='status']").each(function(){
	 
	            $(this).closest("tr").show();
	        
	    });
	  
  }
/* function myFunction() {
  var x = document.getElementById("myDIV");
  if(x.style.visibility == "visible"){
	  x.style.visibility = "hidden";
	  
  }
  else
	  {
	  x.style.visibility = "visible";
	  }
  
  
  var table, rows, switching, i, x, y, shouldSwitch;
  table = document.getElementById("myTable");
  switching = true;
  while (switching) {
    switching = false;
    rows = table.rows;
    for (i = 1; i < (rows.length - 1); i++) {
      shouldSwitch = false;
      x = rows[i].getElementsByTagName("TD")[0];
      y = rows[i + 1].getElementsByTagName("TD")[0];
      if (x.innerHTML.toLowerCase() > y.innerHTML.toLowerCase()) {
        shouldSwitch = true;
        break;
      }
    }
    if (shouldSwitch) {
      rows[i].parentNode.insertBefore(rows[i + 1], rows[i]);
      switching = true;
    }
  } */
  /* var tables, rowss, switchings,j , k;
  tables = document.getElementById("my");
  switchings = true;
  while (switchings) {
    switchings = false;
    rowss = tables.rows;
    for (j = 1; j < (rowss.length - 1); j++) {
      k = rowss[j].getElementsByTagName("TD")[8];
      if (k.innerHTML == "Started") {
        alert("Completed");
      }
    }
  } 
}*/
/* function myfun()
{
	var tables, rowss, switchings,j , k;
	//var element = document.getElementById("myd");
	  tables = document.getElementById("my");
	  switchings = true;
	  while (switchings) {
	    switchings = false;
	    rowss = tables.rows;
	    for (j = 1; j < (rowss.length - 1); j++) {
	      k = rowss[j].getElementsByTagName("TD")[8];
	      if (k.innerHTML == "Started") {
	    	  alert("OK Completed");
	    	element.classList.add("fa fa-tick");
	        
	      }
	    }
	  }
	} */
	
	/* 
	function myFunct() {
		  var x = document.getElementById("myDI");
		  if(x.style.visibility == "visible"){
			  x.style.visibility = "hidden";
			  
		  }
		  else
			  {
			  x.style.visibility = "visible";
			  }
		 
		}
	
	function myFunctions() {
		  var x = document.getElementById("myDIVS");
		  if(x.style.visibility == "visible"){
			  x.style.visibility = "hidden";
			  
		  }
		  else
			  {
			  x.style.visibility = "visible";
			  }
		 
		} */
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
      <li class="active"><a href="/Training/show">Training</a></li>
      <li ><a href="/candidate/show">Candidate</a></li>
      <li ><a href="/assessment/show">Assessment</a></li>
    </ul>
  </div>
</nav>
<br>
<button  type="button" class="btn btn-info btn-lg" data-toggle="modal" data-target="#myModal">Training Details</button>
	

<br>
<br>
<br>

 
 <div class="modal fade" id="myModal" role="dialog">
    <div class="modal-dialog">
    
      <!-- Modal content-->
      <div class="modal-content">
        <div class="modal-header">
          <button type="button" class="close" data-dismiss="modal">&times;</button>
          <h4 class="modal-title">List</h4>
        </div>
        <div class="modal-body">
           <div >
 <div>
  <!--  <table class="table table-striped table_blog" id="my">-->
    <table id="bootstrap-data-table-export" class="table table-striped table-bordered table_blog">
 
   <thead>
    <tr>
      <th scope="col">Training Id</th>
      <th scope="col">Training Name</th>
      <th scope="col">Trainer Id</th>
      <th scope="col">Vertical</th>
      <th scope="col">Start Date</th>
      <th scope="col">End Date</th>
      <th scope="col">No. of Days</th>
      <th scope="col">Room No</th>
      <th scope="col">Status</th>
       <th scope="col">Action</th>
    </tr>
    </thead>
   <tbody>
    <c:forEach items="${list }" var="train" >
     <tr>
      <td>${train.id }</td>
      <td>${train.name }</td>
      <td>${train.trainerId }</td>
      <td>${train.vertical }</td>
      <td>${train.startDate }</td>
      <td>${train.endDate }</td>
      <td>${train.nodays }</td>
      <td>${train.roomno }</td>
      <td><div class="status">${train.status }</div></td>
      <td>
       <spring:url value="/Training/delete/${train.id }" var="deleteURL" />
       <a class="btn btn-primary" href="/Training/delete/${train.id }" role="button">Delete</a>
      </td>
     </tr>
    </c:forEach>
   </tbody>
  </table>
 </div>
</div>
        </div>
        <div class="modal-footer">
             <!--start reporting tool -->
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
 <br>
 <br>
 <br>
 <br>
</body>
</html>