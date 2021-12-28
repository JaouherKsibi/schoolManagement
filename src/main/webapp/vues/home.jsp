<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c"      uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="webjars/bootstrap/3.3.6/css/bootstrap.min.css" rel="stylesheet">
	<link href="static/font-awesome/4.6.2/css/font-awesome.css" type="text/css" rel="stylesheet"/>
</head>
<body>

<div class="container">
	<div class="row">
		<h1>liste des administrateurs </h1>

		<table class="table">
		  <thead>
		    <tr>
		      <th scope="col">#</th>
		      <th scope="col">email</th>
		      <th scope="col">password</th>
		    </tr>
		  </thead>
		  <tbody>
		  	<c:forEach items="${listeAdmins}" var="admin">
				<tr>
		      		<th scope="row">${admin.id}</th>
    		  		<td>${admin.login}</td>
   			   		<td>${admin.password} </td>
   			 	</tr>

			</c:forEach>
    
		  </tbody>
		</table>
	
	
	</div>
	
	<div class="row">
		<h1>Courses List </h1>
		
		<table class="table">
			<thead>
				<tr>
					<th scope="col">#</th>
					<td scope="col">Name</td>
					<td scope="col">Professor</td>
				</tr>
			</thead>
			
			<tbody>
				<c:forEach items="${listeCourse}" var="course">
					<tr>
						<th scope="row">${course.id}</th>
						<td scope="row"> ${course.name }</td>
						<td scope="row">${course.professor.firstName }</td>
					</tr>
				</c:forEach>
			</tbody>
		
		</table>
	
	</div>
	
	<div class="row">
		<h1>Groups List</h1>
		
		<table class="table">
			<thead>
				<tr>
					<th scope="col">#</th>
					<td scope="col">Name</td>
				</tr>
			
			</thead>
			<tbody>
				<c:forEach items="${liste }" var="g">
					<tr>
						<th scope="row"> ${g.id}</th>
						<td scope="row">${g.name}</td>
					</tr>
				</c:forEach>
			
			</tbody>
		
		</table>
	
	</div>

	
	<div class="row">
		<h1>Professors List</h1>
		
		<table class="table">
			<thead>
				<tr>
					<th scope=col>#</th>
					<td scope="col">firstName</td>
					<td scope="col">lastName</td>
					<td scope="col">serialNumber</td>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${listeProf }" var="prof">
					<tr>
						<th scope="row"> ${prof.id }</th>
						<td scope="row"> ${prof.firstName }</td>
						<td scope="row"> ${prof.lastName }</td>
						<td scope="row"> ${prof.serialNumber }</td>
					</tr>
				
				</c:forEach>
			</tbody>
		</table>
	</div>
	<div class="row">
		<h1>Students List</h1>
		
		<table class="table">
			<thead>
				<tr>
					<th scope="col">#</th>
					<td scope="col">firstName</td>
					<td scope="col">lastName</td>
					<td scope="col">CIN</td>
					<td scope="col">login</td>
					<td scope="col">password</td>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${listeStudent }" var="student">
					<tr>
						<th scope="row"> ${student.id }</th>
						<td scope="row"> ${student.firstnName }</td>
						<td scope="row"> ${student.lastName }</td>
						<td scope="row"> ${student.cin }</td>
						<td scope="row"> ${student.login }</td>
						<td scope="row"> ${student.password }</td>
					</tr>
				
				</c:forEach>
			</tbody>
		</table>
	</div>

</div>





	<script src="webjars/jquery/1.9.1/jquery.min.js"></script>
	<script src="webjars/bootstrap/3.3.6/js/bootstrap.min.js"></script>
</body>
</html>