<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Dojo Survey</title>
</head>
<body>
<form method="POST" action="/process_form">
	<p>Your Name: <input type="text" name="name"></input> </p]>
	<p>Dojo Location:
		<select name="location">
			<option value = "Bellevue">Bellevue</option>
			<option value = "Boise">Boise</option>
			<option value = "Chicago">Chicago</option>
			<option value = "Dallas">Dallas</option>
			<option value = "Los Angeles">Los Angeles</option>
			<option value = "San Jose">San Jose</option>
		</select>
		</p>
		<p>Favorite Language: 
		<select name="language">
			<option value = "Python">Python</option>
			<option value = "Mern">MERN</option>
			<option value = "Java">Java</option>
			<option value = "C++">C++</option>
			<option value = "Ruby">Ruby</option>
			<option value = "Rust">Rust</option>
		</select>
		</p>
	<p>Comments(optional) <textarea name="comments"></textarea></p>
	<button>Button</button>
</form>
</body>
</html>