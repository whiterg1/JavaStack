<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Results</title>
</head>
<body>
	<h2>Submitted Info</h2>
	<p>Name: <c:out value="${name}"/></p>
	<p>Dojo Location: <c:out value="${location}"/></p>
	<p>Favorite Language: <c:out value="${language}"/></p>
	<p>Comments: <c:out value="${comments}"/></p>
	<a href="/">Go Back</a>
</body>
</html>