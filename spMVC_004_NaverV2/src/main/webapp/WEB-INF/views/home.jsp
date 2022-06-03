<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:set value="${pageContext.request.contextPath}" var="rootPath" />
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8" />
<meta http-equiv="X-UA-Compatible" content="IE=edge" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<title>나의 API App</title>

<link rel="stylesheet"	href="${rootPath}/static/css/table.css?ver=2022-06-02-001">
<link rel="stylesheet"	href="${rootPath}/static/css/home.css?ver=2022-06-02-001">
<link rel="stylesheet"	href="${rootPath}/static/css/main.css?ver=2022-06-02-001">
<link rel="stylesheet"	href="${rootPath}/static/css/modal.css?ver=2022-06-02-001">
<link rel="stylesheet"	href="${rootPath}/static/css/input.css?ver=2022-06-02-001">

<script>
	const rootPath = '${rootPath}'
</script>
<script src="${rootPath}/static/js/input.js?ver=2022-06-02-001"></script>
</head>
<body>
	<header>
		<h1>My API</h1>
		<p>Naver API 를 활용한 도서, 뉴스, 영화 정보 서비스</p>
	</header>
		<nav>
		<ul>
			<li><a href="${rootPath}/">Home</a></li>
			<li><a href="${rootPath}/books/list">도서정보</a></li>
			<li><a href="${rootPath}/news">오늘의 뉴스</a></li>
			<li><a href="${rootPath}/movies">영화정보</a></li>
			<li><a href="${rootPath}/naver">네이버 체험</a></li>

			<% // 로그인하지 않았을 때 %>
			<c:if test="${empty MEMBER}"></c:if>
			<li><a href="${rootPath}/member/login">로그인</a></li>
			<li><a href="${rootPath}/member/join">회원가입</a></li>
			
			<li><a href="${rootPath}/member/mypage">My page</a></li>
			<li><a href="${rootPath}/member/logout">Logout</a></li>


		</ul>
		</nav>
		<section class="main">
		
		</section>
		
		<footer>
			<address>CopyRight &copy; callor@callor.com</address>
		</footer>
</body>
</html>

