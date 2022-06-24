<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<script>
	const rootPath = "${rootPath}"
</script>
<style>
	section {
		align-items: center;
		width: 70%;
		height: 70%;
	}
</style>
</head>
<body>
	<section>
		<form method="POST" class="m_form">
		<c:if test="${not empty memo.m_seq}">
		</c:if>
			<input name="m_author" type="text" 	value="${memo.m_author}" placeholder="작성자 Email을 입력해주세요" />
			<input name="m_date" type="date" value="${memo.m_date}"  hidden="hidden" />
			<input name="m_time" type="time" value="${memo.m_time}" hidden="hidden" />
			<div id="content">
				<textarea rows="50" name="m_memo" placeholder="내용을 입력해주세요">${memo.m_memo}</textarea>
			</div>
			<div id="btn">
				<button type="submit">저장</button>
			</div>
		</form>
	</section>


</body>
</html>