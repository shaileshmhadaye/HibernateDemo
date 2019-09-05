<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Spring demo</title>
</head>
<body>

	<form action="add">  <!-- the request for add servlet -->
		<input type="text" name="a"><br>
		<input type="text" name="b"><br>
		<input type="submit">  <!-- after clicking submit button the request for "add" is sent to the "web.xml" file with the parameters 'a' and 'b' -->
	
	</form>

</body>
</html>