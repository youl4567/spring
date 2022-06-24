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
    <script>
	const rootPath = "${rootPath}"
</script>
<script src="${rootPath}/static/m_detail.js"></script>	
<title>Insert title here</title>
</head>
<body>
	<section>
		<table>
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
        	</tr>
    	    <tr>
				<td>${memo.m_seq}</td>
				<td>${memo.m_author}</td>
				<td>${memo.m_date}</td>
				<td>${memo.m_time}</td> 
			</tr>
		</table>
		<div id="m_memo">
			<h4>${memo.m_memo}</h4>
		</div>
		<div id="m_image">
			${memo.m_image}
		</div>
			
				<div class="update_btn">
				<a href="${rootPath}/" >리스트로</a>
				<a href="${rootPath}/${memo.m_seq}/update" class="update">수정</a>
				<a href="${rootPath}/${memo.m_seq}/delete" class="delete">삭제</a>
				</div>
	</section>
</body>
</html>