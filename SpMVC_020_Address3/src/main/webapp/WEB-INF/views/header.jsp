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
</head>
<body>
	<header>
		<h1>주소록 2022</h1>
	</header>
	<nav>
		<ul>
			<li>HOME</li>
			<li><a href="${roothPath}/about">About</a></li>
			<li>JOIN</li>
			<li>LOGIN</li>
		</ul>
	</nav>
</body>
</html>