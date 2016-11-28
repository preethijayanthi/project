<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="en">
<head>
<title>Bootstrap Case</title>
<link rel="stylesheet" href="resources/css/bootstrap.min.css">
<script src="resources/jquery/jquery-3.1.1.min.js"></script>
<script src="resources/js/bootstrap.min.js"></script>
 <%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<style>
.carousel-inner>.item>img, .carousel-inner>.item>a>img {
	width: 50%;
	margin: auto;
}
</style>


<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="#">LAPKART</a>
    </div>
    <ul class="nav navbar-nav navbar-left">
      <li><a href="home"><span class="glyphicon glyphicon-user"></span> HOME</a></li>
      <li><a href="#"><span class="glyphicon glyphicon-log-in"></span>CONTACT US</a></li>
      <li><a href="category"><span class="glyphicon glyphicon-log-in"></span>CATEGORY</a></li>
   
   </ul>
   <div class="dropdown">
    <button class="btn btn-primary dropdown-toggle" type="button" data-toggle="dropdown">Dropdown Example
    <!-- <span class="caret"></span> --></button>
    <ul class="dropdown-menu">
      
       <c:forEach items="${categoryList}" var="user">
     <tr
      style="background-color: white; color: black; text-align: center;"
      height="30px">
      <li><a href="productpage?pdt=${user.categoryname}">${user.categoryname}</a></li>
     
     </tr>
     
    </c:forEach> 
  
    </ul>
  </div>
    <ul class="nav navbar-nav navbar-right"> 
    <li><a href="login"><span class="glyphicon glyphicon-log-in"></span>LOGIN</a></li>
   	<li><a href="register"><span class="glyphicon glyphicon-log-in"></span>REGISTER</a></li>
   	<li><a href="product"><span class="glyphicon glyphicon-log-in"></span>ADD PRODUCT</a></li>
	</ul>
  </div>

   
<form class="navbar-form" role="search">
<center>
    <input type="search" class="form-control id="search" placeholder="Search for a Product">
    </center>
	</form>
</nav>
</head>