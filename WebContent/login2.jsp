<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="login.do" method="post">
	 <input type="text" placeholder="아이디" name="id"  /><br /><br />
      <input type="password" placeholder="비밀번호" name="pwd"  /><br /><br />
      <p>
            <input type="submit" value="회원가입" id="signup" /><br /><br />
            </p>
	</form>
</body>
<script>
alter("아이디 혹은 비밀번호가 틀렸습니다");
</script>
</html>