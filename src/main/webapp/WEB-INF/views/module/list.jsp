<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<body>
	<a href="/module/signup.do">등록</a>
	<table border="1">
		<tr>
			<td>번호</td>
			<td>아이디</td>
			<td>이름</td>
			<td>비밀번호</td>
			<td>이메일</td>
		</tr>

		<c:choose>
			<c:when test="${empty list }">
				<tr>
					<td>회원이 존재하지 않습니다.</td>
				</tr>
			</c:when>
			<c:otherwise>
				<c:forEach items="${list }" var="member">
					<tr>
						<td>${member.memNum }</td>
						<td>${member.memId }</td>
						<td>${member.memName }</td>
						<td>${member.memPw }</td>
						<td>${member.memEmail }</td>
					</tr>
				</c:forEach>
			</c:otherwise>
		</c:choose>
	</table>
</body>
</html>