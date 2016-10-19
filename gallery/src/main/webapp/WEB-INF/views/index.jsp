<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<body>
	<h1>Hello World!</h1>
<!-- 	<a href="abi?name=preetha&city=chennai">Click Here</a> -->
	<img src="resources/images/pree.jpg" />


	<img src="<c:url value='/resources/images/pree.jpg'/>" />
</body>
</html>