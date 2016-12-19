<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="resources/css/bootstrap.min.css"/>
<script src="resources/jquery/jquery-3.1.1.min.js"></script>
<script src="resources/js/bootstrap.min.js"></script>
<script src="resources/js/js.txt"></script>
<title>Insert title here</title>
<style>
  .glyphicon { margin-right:5px; }
.thumbnail
{
    margin-bottom: 20px;
    padding: 0px;
    -webkit-border-radius: 0px;
    -moz-border-radius: 0px;
    border-radius: 0px;
}

.item.list-group-item
{
    float: none;
    width: 100%;
    background-color: #fff;
    margin-bottom: 10px;
}
.item.list-group-item:nth-of-type(odd):hover,.item.list-group-item:hover
{
    background: #428bca;
}

.item.list-group-item .list-group-image
{
    margin-right: 10px;
}
.item.list-group-item .thumbnail
{
    margin-bottom: 0px;
}
.item.list-group-item .caption
{
    padding: 9px 9px 0px 9px;
}
.item.list-group-item:nth-of-type(odd)
{
    background: #eeeeee;
}

.item.list-group-item:before, .item.list-group-item:after
{
    display: table;
    content: " ";
}

.item.list-group-item img
{
    float: left;
}
.item.list-group-item:after
{
    clear: both;
}
.list-group-item-text
{
    margin: 0 0 11px;
}
  </style>
</head>
<body>
<div class="container">
    <div class="well well-sm">
        <strong>Display</strong>
        <div class="btn-group">
            <a href="#" id="list" class="btn btn-default btn-sm"><span class="glyphicon glyphicon-th-list">
            </span>List</a> <a href="#" id="grid" class="btn btn-default btn-sm"><span
                class="glyphicon glyphicon-th"></span>Grid</a>
        </div>
    </div>
    <div class="row">
    <c:forEach items="${productList}" var="user">
    <div id="products" class="row list-group">
     
         <div class=" item  col-xs-10 col-lg-10 "> 
            <div class="thumbnail">
            <img src="<c:url value = '/resources/images/${user.name}.jpg'/>"alt="${user.name}" class="img-responsive" width="400" height "250"/>
            <!-- <img src="resources/images/pree1.jpg" alt="Chania" width="400" height="250"> -->
                <div class="caption">
                <%-- <c:forEach items="${categoryList}" var="user"> --%>
                    <h4 class="group inner list-group-item-heading">${user.productname}</h4> 
             <%--  ${user.categoryname} --%>
                    <%-- </c:forEach> --%>
                    <p class="group inner list-group-item-text">
                        Product description... Lorem ipsum dolor sit amet, consectetuer adipiscing elit,
                        sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat.</p>
                    <div class="row">
                        <div class="col-xs-12 col-md-6">
                            <p class="lead">
                                ${user.productprice}</p>
                        </div>
                        <div class="col-xs-12 col-md-6">
                            <a class="btn btn-success" href="http://www.jquery2dotnet.com">Add to cart</a>
                        </div>
                    </div>
                </div>
            </div>
       
       </c:forEach>
        </div>
        
        
    </div>
    
    </div>
   
    <%-- <c:forEach items="${categoryList}" var="user">
               ${user.categoryname}
                    </c:forEach> --%>
    <%-- </c:forEach> --%>
</div>

</body>
</html>