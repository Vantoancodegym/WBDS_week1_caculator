<%--
  Created by IntelliJ IDEA.
  User: THINKPADX240
  Date: 3/2/2021
  Time: 3:37 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Caculator</title>
</head>
<body>
<form method="post" >
<input name="input1"><br>
<input name="input2"><br>
<input type="submit" value="Addition(+)" name="check">
<input type="submit" value="Subtraction(-)" name="check">
<input type="submit" value="Multipliction(x)" name="check">
<input type="submit" value="Division(/)" name="check">
</form>
<h5>${check} ${result}</h5>
</body>
</html>
