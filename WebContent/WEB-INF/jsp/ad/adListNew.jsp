<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="../inc/header.jsp"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>欢迎</title>
</head>
<body>
ad list table

<table border="1">
        <tr>
                        <th>编号</th>
                        <th>用户名</th>
                        <th>电子邮箱</th>
        </tr>
        <c:forEach items="${adList}" var="t" varStatus="status">
        <tr>
                        <td>${ t.actionType }</td>
                        <td>${ t.adName }</td>
                        <td>${ t.adAddTime }</td>
        </tr>
        </c:forEach>
    </table>
</body>
</html>