<%@ page contentType="text/html; charset=utf-8" %>
${joinForm}
<form method="POST">
    아이디 <input type="text" name="userId" value="${joinForm.userId}"><br>
    비밀번호 <input type="password" name="userPw"><br>
    비밀번호확인 <input type="password" name="userPwRe"><br>
    회원명 <input type="text" name="userNm" value="${joinForm.userNm}"><br>
    취미
    <input type="checkbox" name="hobby" value="축구">축구
    <input type="checkbox" name="hobby" value="농구">농구
    <input type="checkbox" name="hobby" value="야구">야구
    <input type="checkbox" name="hobby" value="피아노">피아노
    <label for="hobby"></label><br>

    <input type="checkbox" name="agree" value="true" id="agree">
    <label for="agree">약관동의</label><br>
    <button type="submit">가입하기</button>

</form>