<%--
  Created by IntelliJ IDEA.
  User: 정현석
  Date: 2019-08-27
  Time: 오후 5:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <title>로그인</title>
</head>
<body>
<center>
    <h1>로그인</h1>
    <hr>
    <form action="login.do" method="post">
        <input type="hidden" name="seq" value="1">
        <!-- value 수정 필요 : 입력되는 id와 password에 따라 알맞은 seq가 들어가도록 해야함-->
        <table border="1" cellpadding="0" cellspacing="0">
            <tr>
                <td bgcolor="orange">아이디</td>
                <td><input type="text" name="id"/></td>
            </tr>
            <tr>
                <td bgcolor="orange">비밀번호</td>
                <td><input type="password" name="password"/></td>
            </tr>
            <tr>
                <td colspan="2" align="center">
                    <input type="submit" value="로그인"/>
                </td>
            </tr>
        </table>
    </form>
    </hr>
</center>
</body>
</html>
