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
<link rel="stylesheet"
	href="${rootPath}/static/css/common.css?ver=2022-06-30-001">
<title>Insert title here</title>
<style>
form {
	width: 50%;
	text-align: center;
}

input {
	padding: 1rem;
	width: 100%;
}

button, form input::file-selector-button{
	padding: 10px;
	margin-left: 5px;
	border: 1px solid rgba(157, 198, 255, 0.994);
	border-radius: 5px;
	background-color: rgba(157, 198, 255, 0.994);
	text-align: center;
	color: black;
	font-weight: 600;
}

button:hover, form input::file-selector-button:hover {
	background-color: rgb(80, 77, 77);
	border: 1px solid rgb(80, 77, 77);
}
</style>
</head>
<body>
	<form method="POST" enctype="multipart/form-data">
		<input name="m_seq" type="hidden"
			value='<c:out value="${MEMO.m_seq}" default="0"/>'>
			 <input	name="m_memo" placeholder="메모를 입력하세요" value="${MEMO.m_memo}">
		<div id="div_btn">
			<input name="file" type="file" accept="images/*">
			<button>메모 기록</button>
		</div>
	</form>

</body>
</html>