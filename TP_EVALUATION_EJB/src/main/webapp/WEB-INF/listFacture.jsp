<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Liste Facture</title>

<%@include file="commons/header.jsp"%>

</head>
<body>

	<%@include file="commons/menu.jsp"%>
	
	<table>
		<thead>
			<tr>
				<th>N°</th>
				<th>Date</th>
				<th>Client</th>
				<th>Prix</th>
			</tr>
		</thead>

		<c:forEach items="${factures}" var="facture">
			<tr>
				<td><a href="defatilFacture?id=${facture.id}"><c:out value="${facture.id}" /></a></td>
				<td><c:out value="${facture.date}" /></td>
				<td><c:out value="${facture.idclient.nom}" /></td>
				<td><c:out value="${facture.prix}" /></td>
			</tr>
		</c:forEach>

	</table>
	
	<%@include file="commons/footer.jsp"%>

</body>
</html>