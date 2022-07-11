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
<title>메모 홈</title>
<script>
	const rootPath = "${rootPath}"
</script>
<script src="${rootPath}/static/memo.js?20220627001"></script>
<style>
* {
	box-sizing: border-box;
	margin: 0;
	padding: 0;
}

a {
	text-decoration: none;
	color: black;
}

html {
	width: 100vw;
	height: 100vh;
}

body {
	width: 100%;
	height: 100%;
	display: flex;
	flex-direction: column;
	justify-content: center;
	align-items: center;
	color: white;
	background-color: rgb(25, 25, 25);
}

header {
	display: flex;
	height: 15%;
	align-items: center;
	justify-content: center;
}

section {
	display: flex;
	flex-direction: column;
	width: 80%;
	height: 50%;
	justify-content: center;
	align-items: center;
}

table {
	margin: 60px auto;
	text-align: center;
	width: 80%;
	border-collapse: collapse;
	font-size: 15px;
	border: 1px solid white;
}

#boardtable tr {
	height: 36px;
	border-bottom: 1px solid #aaa;
}

#boardtable tr:nth-child(odd) {
	background-color: rgb(80, 77, 77)
}

#boardtable tr:nth-child(1) {
	background-color: rgba(34, 33, 33, 0.542);
	border-bottom: 1.2px solid #aaa;
}

#boardtable tr:not(:first-of-type):hover {
	background-color: rgba(186, 107, 173, 0.772);
	font-weight: 900;
}

#div_btn {
	display: flex;
	flex-direction: row;
	justify-content: flex-end;
	padding: 10px;
	width: 80%;
}

.home_btn {
	width: 10%;
	padding: 15px;
	margin-left: 5px;
	border: 1px solid rgba(157, 198, 255, 0.994);
	border-radius: 5px;
	background-color: rgba(157, 198, 255, 0.994);
	text-align: center;
	color: black;
	font-weight: 600;
}

.home_btn:hover {
	background-color: rgb(80, 77, 77);
	border: 1px solid rgb(80, 77, 77);
	font-weight: 900;
}
</style>
</head>
<body>
	<header id="homeheader">
		<h1>${USERNAME}님의 메모장</h1>
	</header>

	<section>
		<table class="memo" id="boardtable">
		  <colgroup>
            <col width="10%" />
            <col width="15%" />
            <col width="15%" />
            <col width="60%" />
          </colgroup>
			<tr>
				<th>SEQ</th>
				<th>작성일자</th>
				<th>작성시각</th>
				<th>메모</th>
			</tr>
			<c:if test="${empty MEMOS}">
				<tr>
					<td colspan="4">메모가 없습니다.</td>
				</tr>
			</c:if>
			<c:forEach items="${MEMOS}" var="MEMO" varStatus="INDEX">
				<tr data-seq="${MEMO.m_seq}">
					<td>${INDEX.count}</td>
					<td>${MEMO.m_date}</td>
					<td>${MEMO.m_time}</td>
					<td>${MEMO.m_memo}</td>
				</tr>
			</c:forEach>

		</table>
		<div id="div_btn">
			<div class="home_btn">
				<a href="${rootPath}/memo/insert">작성하기</a>
			</div>
			<c:if test="${empty USERNAME}">
				<div class="home_btn">
					<a href="${rootPath}/user/login">로그인</a>
				</div>
			</c:if>
			<c:if test="${not empty USERNAME}">
				<div class="home_btn">
					<a href="${rootPath}/user/logout">로그아웃</a>
				</div>
			</c:if>
		</div>
	</section>

</body>
</html>