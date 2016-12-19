<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@include file="header.jsp" %>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="resources/css/bootstrap.min.css">
<script src="resources/jquery/jquery-3.1.1.min.js"></script>
<script src="resources/js/bootstrap.min.js"></script>
</head>
<body>
<div class="container">
<div class="row">
<div class="panel panel-primary">
<div class="panel-body">
<div class="form-group">
</div>
<form:form action="category.do" method="POST" commandName="category">
		<table>
			
			<tr>
				
				<td><form:label path="Categoryid">Category ID</form:label></td>
				<td><form:input path="Categoryid" /></td>
			</tr>
			<tr>
				<td><form:label path="Categoryname">Category Name</form:label></td>
				<td><form:input path="Categoryname"  /></td>
			</tr>
			<tr>
				<td><form:label path="Categorydescription">Category Description</form:label></td>
				<td><form:input path="Categorydescription"  /></td>
			</tr>

			<tr>
				<td colspan="2"><input type="submit" name="action" value="add" />
				<td colspan="2"><input type="submit" name="action" value="edit" />
				<td colspan="2"><input type="submit" name="action" value="delete" />
				<td colspan="2"><input type="submit" name="action" value="Retrieve" />
			</tr>
		</table>

	</form:form>


</body>
</html>