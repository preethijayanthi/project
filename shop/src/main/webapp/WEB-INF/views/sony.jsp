<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<p>failed</p>
<c:url value="/login?logout" var="logoutUrl" />
<h3><a href="${logoutUrl}">Logout</a></h3>
<%-- <img src="<c:url value = '/resources/images/${img}.jpg'/>"alt="pree" class="img-responsive" /> --%>
</body>
</html>