<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Liste Client</title>

<%@include file="commons/header.jsp"%>

</head>
<body>

	<%@include file="commons/menu.jsp"%>
	
	<table>
		<thead>
			<tr>
				<th>Nom</th>
				<th>Adresse</th>
			</tr>
		</thead>

		<c:forEach items="${clients}" var="client">
			<tr>
				<td><c:out value="${client.nom}" /></td>
				<td><c:out value="${client.adresse}" /></td>
			</tr>
		</c:forEach>

	</table>

	<a href="createClient" class="waves-effect waves-light btn"> <c:out
			value="CREER CLIENT" />
	</a>
	
	<%@include file="commons/footer.jsp"%>

</body>
</html>