<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<jsp:useBean id="dto" class="com.tj.hu.MemberDTO"/>

</head>
<body>
<h3>자바 빈 객체 생성 후 저장된 정보 출력하기</h3>
이름 : <%=dto.getName() %><br>
아이디 : <%=dto.getId() %><br>
<br><hr><br>
<% dto.setName("전수빈");
dto.setId("pinksubin"); %>
<h3>정보 변경한 후 변경된 정보 출력하기</h3>
이름 : ${dto.name }<br>
아이디 : ${dto.id }<br>

</body>
</html>

