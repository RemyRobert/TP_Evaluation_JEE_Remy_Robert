<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Detail de la facture</title>
<%@include file="commons/header.jsp"%>
</head>
<body>
	<%@include file="commons/menu.jsp"%>
	<br>${facture.idclient.nom}
	<br>${facture.idclient.adresse}
	<br> Date de facturation : ${facture.date} 
	<br> Numéro de facture : ${facture.numero}

	<table>
		<thead>
			<tr>
				<th>Article</th>
				<th>Quantité</th>
				<th>Prix</th>
			</tr>
		</thead>

		<c:forEach items="${lignefactures}" var="lignefacture">
			<tr>
				<td><c:out value="${lignefacture.idarticle.nom}" /></td>
				<td><c:out value="${lignefacture.qte}" /></td>
				<td><c:out value="${lignefacture.prix}" /></td>
			</tr>
		</c:forEach>
	</table>
	
	<br> <h2>Total : ${total} EUR</h2>
	<%@include file="commons/footer.jsp"%>
</body>
</html>