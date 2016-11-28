<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%@include file="header.jsp" %>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Shop</title>
<link rel="stylesheet" href="resources/css/bootstrap.min.css">
<script src="resources/jquery/jquery-3.1.1.min.js"></script>
<script src="resources/js/bootstrap.min.js"></script>
</head>
<body>
	<h1>Registers Form</h1>
	<form:form action="register.do" method="POST" modelAttribute="register">
		<table>
			
			<tr>
				
				<td><form:label path="id">Register ID</form:label></td>
				<td><form:input path="id" /></td>
			</tr>
			<tr>
				<td><form:label path="firstname">Register First name</form:label></td>
				<td><form:input path="firstname"  /></td>
			</tr>
			<tr>
				<td><form:label path="lastname">Register Last Name</form:label></td>
				<td><form:input path="lastname"  /></td>
			</tr>
			<tr>
				<td><form:label path="mailid">Register mail id</form:label></td>
				<td><form:input path="mailid"  /></td>
				<td><form:errors path="mailid" cssClass="error"/></td>
			</tr>
			<tr>
				<td><form:label path="mobile">Register mobile</form:label></td>
				<td><form:input path="mobile" /></td>
			</tr>
			<tr>
				<td><form:label path="username">Register user name</form:label></td>
				<td><form:input path="username" /></td>
			</tr>
			<tr>
				<td><form:label path="password">Register password</form:label></td>
				<td><form:input path="password"  /></td>
			</tr>
			<tr>
				<td><form:label path="repassword">Register re-password</form:label></td>
				<td><form:input path="repassword"  /></td>
			</tr>
			<tr>
				<td><form:label path="address">Register address</form:label></td>
				<td><form:input path="address"  /></td>
				
			</tr>
			<tr>
				<td colspan="2"><input type="submit" name="action" value="Register" />
				<td colspan="2"><input type="submit" name="action" value="edit" />
				<td colspan="2"><input type="submit" name="action" value="delete" />
				<td colspan="2"><input type="submit" name="action" value="Retrieve" />
			</tr>
		</table>
<img src="<c:url value='resources/images/product/pree1.jpg'/>">
	</form:form>



</body>

</html>