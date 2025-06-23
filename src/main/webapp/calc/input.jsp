<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 25. 6. 20.
  Time: 오전 11:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<% request.setCharacterEncoding("UTF-8"); %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%--action , 폼에서 입력한 데이터를 전달 할 곳의 도착지를 의미--%>
<%--method 전달 방식을 post, 데이터를 body에 담아서 보내고--%>
<%--get과 비교하면 공개되지 않는 데이터이다.--%>
<form action="calcResult.jsp" method="post">
    <label>이름 :     <input type="text" name="name"></label>
    <h1></h1>
    <label>나이 :     <input type="number" name="age"></label>
    <label>num1 :     <input type="number" name="num1"></label>
    <label>num2 :     <input type="number" name="num2"></label>

    <button type="submit">SEND</button>
</form>
</body>
</html>
