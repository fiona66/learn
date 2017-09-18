<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN""http://www.w3.org/TR/html4/loose.dtd">

<html>


<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>66的实验</title>
</head>

<body>
<strong><h2>火车票实验查询</h2></strong>


<form action="/index" method="get">
    <h3>请输入ClientId : <span><input name="clientId" ></span>
    <input type="submit" value="查询"></h3>

</form>

你的机器命中实验情况如下: <br />
<%--<h5>${result}  </h5>--%>

<table border="1">
    <tr>
        <th>实验号</th>    <!-- tr是一行,th是表头. td是一个单元格-->
        <th>实验名</th>
        <th>命中版本</th>
    </tr>

    <c:forEach items="${result}" var="map">
    <tr>
            <c:forEach items="${map}" var="entry">
            <td>  ${entry.value}  </td>
            </c:forEach>
    </tr>
    </c:forEach>
</table>

</body>
</html>