<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Testing Page</title>
</head>
<body>
<p>${train}</p>
<p>What is the code?</p>
<form method="POST" action ="/code">
<input type="text" name="input"></input>
<button>Try Code</button>
</form>
</body>
</html>