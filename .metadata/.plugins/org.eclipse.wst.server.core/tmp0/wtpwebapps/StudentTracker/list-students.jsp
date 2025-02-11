<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Tracker</title>

	<link type="text/css" rel="stylesheet" href="css/style1.css">
	
</head>
<body>
	<div id="wrapper">
		<div id="header">
			<h2>Ryhty University</h2>
		</div>
	</div>
	
	<div id="container">
		<div id="content">
			<!-- put new button: Add Student -->
			
			<input type="button" value="Add Student"
				onclick="window.location.href='add-student-form.jsp'; return false;"
				class="add-student-button"
				/>
				
				<table>
				
				<tr>
					<th>First Name</th>
					<th>Last Name</th>
					<th>Email</th>
					<th>Action</th>
				</tr>	
				
				<c:forEach var="tempStudent" items="${STUDENT_LIST}">
					
				<!-- set up a link for each student -->
				
				<c:url var="templink" value="StudentControllerServlet">
					<c:param name="command" value="LOAD" />
					<c:param name="studentId" value="${tempStudent.id}"/>
				</c:url>
			<!-- set up link to delete a student -->
			
				<c:url var="deletelink" value="StudentControllerServlet">
						<c:param name="command" value="DELETE" />
						<c:param name="studentId" value="${tempStudent.id}" />
					</c:url>
			<tr>
				<td> ${tempStudent.firstName} </td>
				<td> ${tempStudent.lastName} </td>
				<td> ${tempStudent.email} </td>
				<td> 
					<a href="${templink}">Update</a>
					
					<a href="${deletelink}"
					onclick="if (!(confirm('Are you sure you want to delete this student?')))return false">
					Delete</a>
				</td>
			</tr>
		</c:forEach>
	</table>			
		</div>
	</div>
</body>
</html>