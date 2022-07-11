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
<title>Insert title here</title>
<script>
	const rootPath = "${rootPath}"
</script>
<script src="${rootPath}/static/m_detail.js?2022062400s"></script>
<script src="${rootPath}/static/m_detail.js"></script>
<style>
* {
	box-sizing: border-box;
	margin: 0;
	padding: 0;
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
}
#boardtable tr {
  height: 32px;
  border-bottom: 1px solid #aaa;
}
#boardtable tr:nth-child(odd) {
  background-color: rgb(218, 213, 213);
}
#boardtable tr:nth-child(1) {
  background-color: rgba(118, 201, 65, 0.1);
  border-bottom: 1.2px solid #aaa;
}
#boardtable tr:not(:first-of-type):hover {
  background-color: rgba(118, 201, 65, 0.1);
}
</style>
</head>
<body>
	<header>
		<h1>메모장</h1>
	</header>
	<section>
		<table id="boardtable" class="memo">
			<colgroup>
				<col width="15%" />
				<col width="15%" />
				<col width="15%" />
				<col width="15%" />
				<col width="40%" />
			</colgroup>
			<tr>
				<th>NO.</th>
				<th>작성자</th>
				<th>작성일</th>
				<th>작성시각</th>
				<th>메모내용</th>
			</tr>

			<!--
		서버로 부터 받은 데이터(도서리스트)를 보여주기 위한 부분
		BOOKS : 서버로부터 받을 데이터
		BOOK : forEach 를 사용하여 한개의 요소를 추출하여 저장할 변수
		 -->
			<c:forEach items="${memo}" var="Con">
				<tr data-m_seq="${Con.m_seq}">
					<td>${Con.m_seq}</td>
					<td>${Con.m_author}</td>
					<td>${Con.m_date}</td>
					<td>${Con.m_time}</td>
					<td>${Con.m_memo}</td>
				</tr>
			</c:forEach>
		</table>
		<div id="pagebutton">
			<a href="${rootPath}/m_write"><button>추가</button></a>
		</div>
	</section>
</body>
</html>