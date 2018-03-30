<%@ taglib uri="http://www.springframework.org/tags/form" prefix="f" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
<link type="text/css" rel="stylesheet" href="<%=request.getContextPath()%>/resources/css/Style1.css"></link>
</head>
<body>
	<div id="exception" class="errors">
		${exception}
	</div>
	<div id="formCat" class="cadre">
		<f:form modelAttribute="categorie"  action="saveCat" method="post" enctype="multipart/form-data">
				
			<table id="table1" class="tab1">
				<tr>
					<td>ID CATEGORIE</td>
					<td><f:input path="idcategorie" disabled="true"/></td>
					<td><f:errors path="idcategorie" cssClass="errors"></f:errors></td>
				</tr>
				<tr>
					<td>NOM CATEGORIE</td>
					<td><f:input path="nomCategorie"/></td>
					<td><f:errors path="nomCategorie" cssClass="errors"></f:errors></td>
				</tr>
				<tr>
					<td>DESCRPTION CAT</td>
					<td><f:textarea path="description"/></td>
					<td><f:errors path="description" cssClass="errors"></f:errors></td>
				</tr>
				<tr>
					<td>PHOTO CAT</td>
					<c:if test="${categorie.idcategorie!=null}">
				    <td><img src="CatPhoto?idCat=${categorie.idcategorie}"/></td>
					</c:if>			
					<td><input type="file" name="file" /></td>
				</tr>
				<tr>
					<td><input type="submit" value="Valider" /></td>
					<!--td><a href="editCategValide"><input type="button" value="Editer" /></a></td-->
				</tr>
			</table>
		</f:form>
	</div>
	
	<div id="table" class="cadre">
	<table class="tab2">
		<tr>
			<th>ID</th><th>NOM CAT</th><th>DESCRIPTION</th><th>PHOTO</th><th colspan="2">GESTION</th>
		</tr>
			<c:forEach items="${categories}" var="categorie"> 
				<tr>
				 <td>${categorie.idcategorie}</td>
				 <td>${categorie.nomCategorie}</td>
				 <td>${categorie.description}</td>
				 <td><img src="CatPhoto?idCat=${categorie.idcategorie}"/></td>
				 <td><a href="suppCat?idCat=${categorie.idcategorie}">Supprimer</a></td>
				  <td><a href="editCat?idCat=${categorie.idcategorie}">Modifier</a></td>
				</tr>
		</c:forEach>
	</table>
	
	</div>
</body>
</html>