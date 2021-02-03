<%@page import="java.io.File"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Nouveau client !</title>
<%@include file="commons/header.jsp"%>
</head>
<body>
 <%@include file="commons/menu.jsp"%>

<form action="createClient" method="post">
 <label for="nomClient">Nom</label> <input type="text" name="nomClient" />
 <label for="adresseClient">Adresse</label> <input type="text" name="adresseClient" />
 
 <input type="submit" value="Valider">
</form>
 <%@include file="commons/footer.jsp"%>

</body>
</html>