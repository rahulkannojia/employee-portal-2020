<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title></title>
</head>
<body >
<h1>Employee Details</h1>
<table id= "myTable" border=10>
	<tr>
		<th>EmployeeId</th>
		<th>EmployeeName</th>
		<th>Salary</th>
		<th>MGR</th>
		<th>Job</th>
		<th>Hire Date</th>
	</tr>
	<c:forEach items="${list}" var="emp">
		<tr>

			<td><c:out value="${emp.empId}" /></td>
			<td><c:out value="${emp.ename}" /></td>
			<td><c:out value="${emp.salary}" /></td>
			<td><c:out value="${emp.mgr}" /></td>
			<td><c:out value="${emp.job}" /></td>
			<td><c:out value="${emp.hiredate}" /></td>
		</tr>	
			<%-- <td><a href="delete?id=${list.id}">DELETE</a></td>
			<td><a href="edit?id=${list.id}">EDIT</a></td> --%>
	</c:forEach>
</table>	
<!-- <script type="text/javascript" src="https://cdn.datatables.net/v/dt/dt-1.10.20/datatables.min.js"></script>
	<script>
	$(document).ready( function () {
		console.log("Pagination");
	    $('#myTable').DataTable({
	    	
	    	 "scrollY":        "200px",
	         "scrollCollapse": true,
	         "paging":         false
	    });
	} );
	</script> -->
	</body>
	
	</html>