<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Liste Article</title>

<%@include file="commons/header.jsp"%>

</head>
<body>

	<%@include file="commons/menu.jsp"%>
	
	<table>
		<thead>
			<tr>
				<th>N°</th>
				<th>Nom du produit</th>
				<th>Prix</th>
			</tr>
		</thead>

		<c:forEach items="${articles}" var="article">
			<tr>
				<td><c:out value="${article.id}" /></td>
				<td><c:out value="${article.nom}" /></td>
				<td><c:out value="${article.prix}" /></td>
			</tr>
		</c:forEach>

	</table>

	<a href="createArticle" class="waves-effect waves-light btn"> <c:out
			value="CREER ARTICLE" />
	</a>
	
	<%@include file="commons/footer.jsp"%>

</body>
</html>