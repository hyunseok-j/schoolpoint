<%--
  Created by IntelliJ IDEA.
  User: HyunSeok Jung
  Date: 2019-09-08
  Time: 오후 4:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>회원가입</title>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
</head>
<body>
<center>
    <h1>회원가입</h1>
    <hr>
    <form action="/register.do" method="post">
        <a href="home.jsp">뒤로가기</a>
        <table border="1" cellpadding="0" cellspacing="0">
            <tr>
                <td>아이디</td>
                <td><input name="id" type="text"></td>
            </tr>
            <tr>
                <td>비밀번호</td>
                <td><input name="password" type="password"></td>
            </tr>
            <tr>
                <td>이 름</td>
                <td><input name="name" type="text"></td>
            </tr>
            <tr>
                <td>학 번</td>
                <td><input name="schoolNumber" type="text"></td>
            </tr>
            <tr>
                <td colspan="2" align="center">
                    <input type="submit" value="회원가입" >
                </td>
            </tr>
        </table>
    </form>
    </hr>
</center>
</body>
</html>
