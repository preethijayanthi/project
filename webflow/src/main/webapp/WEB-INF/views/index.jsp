<%@include file="header.jsp" %>
<body>

<%-- <c:forEach items="${registerList}" var="user">
     <tr
      style="background-color: white; color: black; text-align: center;"
      height="30px">
      <td><c:out value="${user.firstname}" />
      </td>
     </tr>
    </c:forEach> --%>
  
	<div class="container">
  <br>
  <div id="myCarousel" class="carousel slide" data-ride="carousel">
    <!-- Indicators -->
    <ol class="carousel-indicators">
      <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
      <li data-target="#myCarousel" data-slide-to="1"></li>
      <li data-target="#myCarousel" data-slide-to="2"></li>
      <li data-target="#myCarousel" data-slide-to="3"></li>
    </ol>

    <!-- Wrapper for slides -->
    <div class="carousel-inner" role="listbox">
      <div class="item active">
        <img src="resources/images/h.jpg" alt="Chania" width="460" height="345">
      </div>

      <div class="item">
        <img src="resources/images/pree1.jpg" alt="Chania" width="460" height="345">
      </div>
    
      <div class="item">
        <img src="resources/images/pree2.jpg" alt="Flower" width="460" height="345">
      </div>

      <div class="item">
        <img src="resources/images/pree3.jpg" alt="Flower" width="460" height="345">
      </div>
    </div>

    <!-- Left and right controls -->
    <a class="left carousel-control" href="#myCarousel" role="button" data-slide="prev">
      <span class="glyphicon glyphicon-chevron-left" aria-hidden="true"></span>
      <span class="sr-only">Previous</span>
    </a>
    <a class="right carousel-control" href="#myCarousel" role="button" data-slide="next">
      <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
      <span class="sr-only">Next</span>
    </a>
  </div>
</div>
<br>
<br>
<br>
<a href="user/samsung">checking</a>
<a href="lenova">admin</a>
<a href="sony">PRODUCTPAGE</a>
<a href="motorola">POPUP</a>
<center>
	<iframe width="854" height="480" src="https://www.youtube.com/embed/xLBaVFi9uUU" frameborder="0" allowfullscreen></iframe>
	</center>
	<a href="upload">UPLOADFILE</a>
<a href="lenova">LENOVA</a>
</body>
</html>