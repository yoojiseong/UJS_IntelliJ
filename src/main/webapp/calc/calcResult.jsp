<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 25. 6. 20.
  Time: 오전 11:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<% request.setCharacterEncoding("UTF-8"); %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>input.jsp에서 전달 받은 데이터를 출력</h1>
<h2>당신의 이름은 : ${param.name}</h2>
<h2>당신의 나이는 : ${param.age}</h2>
<h1>100 + 200</h1>
<h1>문자열 합 : ${param.num1} + ${param.num2}</h1>
<h1>문자열 합 -> 숫자 변환 합 : ${Integer.parseInt(param.num1) + Integer.parseInt(param.num2)}</h1>
<h2>위 정보가 맞다면 "확인"을 눌러주세요</h2>
<p>웹의 파라미터는 모두 문자열임
jsp가 브라우저에서 전달하는 데이터의 구성은 쉽지만 코드가 복잡하면 부적합하다.
num1,num2,가 문자열로 처리되기 때문에
    자바코드의 Wrapper클래스등을 이용해서 문자열을 숫자 형태로 변환해야한다</p>
</body>
</html>
