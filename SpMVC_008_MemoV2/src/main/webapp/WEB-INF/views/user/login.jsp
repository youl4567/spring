<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:set value="${pageContext.request.contextPath}" var="rootPath" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=edge" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
<title>Insert title here</title>
<link rel="stylesheet"
	href="${rootPath}/static/css/common.css?ver=2022-06-30-001">
<style>
	
	form {
		width: 50%;
		text-align: center;
	}
	input {
		padding: 1rem;
		width: 100%;
	}
</style>
</head>
<body>
	<form method="POST">
		<input name="username" placeholder="USERNAME 입력 후 ENTER">
	
	</form>
</body>
</html>