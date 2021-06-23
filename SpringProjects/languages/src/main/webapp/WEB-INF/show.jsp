<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%> 
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Show Language</title>
</head>
<body>
		<div><a href="/languages">Dashboard</a></div>
		<div><c:out value="${language.name}"/></div>
		<div><c:out value="${language.creator}"/></div>
		<div><c:out value="${language.version}"/></div>
		<div><a href="/languages/${language.id}/edit">Edit</a></div>
		<div><a href="/languages/${language.id}/delete">Delete</a></div>
</body>
</html>