<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Dojo Survey</title>
</head>
<body>
<form method="POST" action="/validation">
	<label>Your Name: <input type="text" name="name"></input></label>
	<p>Dojo Location: 
		<select name="location">
			<option value = "1">Bellevue</option>
			<option value = "2">Boise</option>
			<option value = "3">Chicago</option>
			<option value = "4">Dallas</option>
			<option value = "5">Los Angeles</option>
			<option value = "6">San Jose</option>
		</select>
	</p>
		<p>Favorite Language: 
		<select name="language">
			<option value = "1">Python</option>
			<option value = "2">MERN</option>
			<option value = "3">JAVA</option>
			<option value = "4">C++</option>
			<option value = "5">Ruby</option>
			<option value = "6">Rust</option>
		</select>
	</p>
	<p>Comments(optional):</p>
	<textarea name="comments"></textarea>
	<button>Button</button>
</form>
</body>
</html>