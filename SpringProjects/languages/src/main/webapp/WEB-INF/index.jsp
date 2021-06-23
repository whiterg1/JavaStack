<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%> 
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%> 
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Index</title>
</head>
<body>
	<table>
		<thead>
			<tr>
				<th>Name</th>
				<th>Creator</th>
				<th>Version</th>
				<th>action</th>
			</tr>
		</thead>
		<tbody>
		<c:forEach items="${languages}" var="language">
			<tr>
				<td><a href="/languages/${language.id}">${language.name}</a></td>
				<td>${language.creator}</td>
				<td>${language.version}</td>
				<td>
					<a href="/languages/${language.id}/delete">delete</a> 
					<a href="/languages/${language.id}/edit">edit</a>
				</td>
			</tr>
		</c:forEach>
		</tbody>
	
	</table>
	<form:form action="/languages" method="POST" modelAttribute="language">
		<p>
			<form:label path="name">Name</form:label>
			<form:errors path="name"/>
			<form:input path="name"/>
		</p>
		<p>
			<form:label path="creator">Creator</form:label>
			<form:errors path="creator"/>
			<form:input path="creator"/>
		</p>
		<p>
			<form:label path="version">Version</form:label>
			<form:errors path="version"/>
			<form:input path="version"/>

		</p>

		<input type="submit" value="Submit"/>
	</form:form>
</body>
</html>