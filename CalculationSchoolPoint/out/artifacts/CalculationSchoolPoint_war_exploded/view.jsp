<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: 정현석
  Date: 2019-08-22
  Time: 오후 5:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE HTML>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <title>회원 목록</title>
</head>
<body>
<center>
    <h1>회원 목록</h1>
    <h3>${user.name}님 환영합니다....<!--<a href="logout.do">Log-out</a>--></h3>
    <form action="view.jsp" method="post">
    <table border="1" cellpadding="0" cellspacing="0" width="300">
        <tr>
            <th bgcolor="orange" width="200">아이디</th>
        </tr>
        <c:forEach items="${userList}" var="user">
        <tr>
            <td align="left"><!--<a href="getBoard.do?seq=board.getSeq()>-->${user.id}</td>
        </tr>
        </c:forEach>
    </table>
    <br>
</center>
</body>
</html>
