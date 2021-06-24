<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2>입력 완료된 회원 정보</h2>
<table>
<tr><td>이름 :</td><td>${dto.name }</td></tr>
<tr><td>아이디 :</td><td>${dto.id }</td></tr>
<tr><td>별명 :</td><td>${dto.nickname }</td></tr>
<tr><td>비밀번호 :</td><td>${dto.password }</td></tr>
<tr><td>이메일 :</td><td>${dto.email }</td></tr>
<tr><td>전화번호 :</td><td>${dto.phone }</td></tr>
</table>
</body>
</html>
