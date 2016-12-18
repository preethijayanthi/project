<%@include file="header.jsp" %>

<body>
<div class="container">
<div class="row">
<div class="panel panel-primary">
<div class="panel-body">
<div class="form-group">
</div>
<form:form action="product.do" method="POST" commandName="product" enctype="multipart/form-data">
		<table>
			
			<tr>
				
				<td><form:label path="id">Product ID</form:label></td>
				<td><form:input path="id" /></td>
			
			</tr>
			<div class="form-group">
  			<label class="col-lg-4 control-label" >PRODUCT CATEGORY</label>
 			 <div class="col-lg-4">   
    		<form:select path="categoryname" class="form-control">
    
   			 <c:forEach items="${categoryList}" var="user">
    
    			<form:option value="${user.categoryname}">${user.categoryname}</form:option>
  
    		</c:forEach>
    <form:errors path="categoryname"  cssClass="error" />
  </form:select>
  
  </div>
</div>
			
			
			<tr>
				<td><form:label path="Productname">Product Name</form:label></td>
				<td><form:input path="Productname"  /></td>
			</tr>
			<tr>
				<td><form:label path="Productprice">Productprice</form:label></td>
				<td><form:input path="Productprice"  /></td>
			</tr>
			<tr>
				<td><form:label path="Productdescription">Product Description</form:label></td>
				<td><form:input path="Productdescription"  /></td>
			</tr>
		    <tr>
				<td><form:label path="Name">IMAGE NAME</form:label></td>
				<td><form:input path="Name"  /></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" name="action" value="add" />
				<td colspan="2"><input type="submit" name="action" value="edit" />
				<td colspan="2"><input type="submit" name="action" value="delete" />
				<td colspan="2"><input type="submit" name="action" value="Retrieve" />
			</tr>
		</table>

			File to upload: <input type="file" name="file">
		        <!-- Name: <input type="text" name="name"> -->
		
		
	</form:form>


</body>
</html>