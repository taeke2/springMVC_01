<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>index.jsp</title>
</head>
<body>
	<h1>get 방식 전송</h1>
	<from action="result">
		이름<input type="text" name="name"><br>
		나이<input type="text" name="age"><br>
		<input type="submit" value="전송">
	</from>
	
	<h1>post 방식 전송</h1>
	<from action="result" method="post">
		이름<input type="text" name="name"><br>
		나이<input type="text" name="age"><br>
		<input type="submit" value="전송">
	</from>
</body>
</html>