<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="join.do" method="post" >
            <input type="text" placeholder="아이디" name="id"  /><br /><br />
            <input type="password" placeholder="비밀번호" name="pwd"  /><br /><br />
            <input type="email" placeholder="이메일 주소" name="email" /><br /><br />
            <input type="text" placeholder="이름" name="name"  /><br /><br />
            <input type="text" placeholder="핸드폰번호" name="phone"  /><br /><br />
            <p>
            <input type="submit" value="가입하기" id="signup" /><br /><br />
            </p>
        </form>
</body>
<script>
	alert("아이디를 입력하세요");
</script>
</html>