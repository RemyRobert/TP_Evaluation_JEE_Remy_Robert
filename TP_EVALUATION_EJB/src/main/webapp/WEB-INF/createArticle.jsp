<%@page import="java.io.File"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Nouveau article !</title>
<%@include file="commons/header.jsp"%>
</head>
<body>
 <%@include file="commons/menu.jsp"%>

<form action="createArticle" method="post">
 <label for="nomArticle">Nom du produit</label> <input type="text" name="nomArticle" />
 <label for="prixArticle">Prix</label> <input type="number" step="0.01" name="prixArticle" />
 
 <input type="submit" value="Valider">
</form>
 <%@include file="commons/footer.jsp"%>

</body>
</html>