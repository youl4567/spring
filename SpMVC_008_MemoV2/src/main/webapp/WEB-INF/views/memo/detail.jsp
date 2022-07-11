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
<title>메모 상세보기</title>
<link rel="stylesheet"
	href="${rootPath}/static/css/common.css?ver=2022-06-30-001">
<style>
section {
	height: 70%;
	border: 1px solid #aaa;
	padding: 10px;
}

#daytime {
	width: 100%;
	display: flex;
	flex-direction: row;
	justify-content: space-between;
}

#daytime div {
	display: flex;
	margin-bottom: 4px;
}

#d_image {
	display: flex;
	width: 100%;
	height: 60%;
	justify-content: center;
	align-item: center;
	width: 100%;
}
#d_memo {
	width: 90%;
	height: 30%;
}

#div_btn {
	display: flex;
	flex-direction: row;
	justify-content: flex-end;
	width : 100%;
	padding: 10px;
}

.home_btn {
	width: 10%;
	padding: 10px;
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
	<section>
		<!-- <div>작성자 : ${MEMO.m_author}</div> -->
		<div id="daytime">
			<div>날짜 : ${MEMO.m_date}</div>
			<div>시간 : ${MEMO.m_time}</div>
		</div>
		<div id="d_image">
			<img src="${rootPath}/upload/${MEMO.m_up_image}"
				alt="${MEMO.m_image}">
		</div>
		<div id="d_memo">${MEMO.m_memo}</div>

		<div id="div_btn">
		<div class="home_btn">
			<a href="${rootPath}/memo/${MEMO.m_seq}/update">수정</a>
		</div>
		<div class="home_btn">
				<a href="${rootPath}/memo/${MEMO.m_seq}/delete">삭제</a>
		</div>
		<div class="home_btn">
				 <a	href="${rootPath}/">홈으로</a>
		</div>
		</div>
	</section>

</body>
</html>