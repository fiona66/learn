<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN""http://www.w3.org/TR/html4/loose.dtd">

<html>


<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>火车票实验查询</title>
    <style>
        .bottom {
            background-color: forestgreen;
            border-radius: 4px;
            padding:5px 10px;
            font-size: 12px;
            color: white;
            border-width: 0px;

        }

        .bottom:hover{
            background-color: lightgreen;
            box-shadow: #999999 0 0 2px;
            cursor: pointer;
        }
        #clientId{
            width: 150px;
            height: 20px;
        }
    </style>
</head>

<body>

<strong><h2>火车票实验查询</h2></strong>


<form action="/index" method="get">
    <h3>请输入ClientId : <span><input name="clientId" id="clientId" value="${clientId}"></span>
        <input class="bottom" type="submit" value="查询">
        <span id="clear" class="bottom">清空</span>
    </h3>

</form>
<div id="info-box">
    你的机器命中页面端实验情况如下: <br />
    <%--<h5>${result}  </h5>--%>

    <table border="1" bgcolor="#FDFFFF">
        <tr>
            <th>实验号</th>    <!-- tr是一行,th是表头. td是一个单元格-->
            <th>实验说明</th>
            <th>命中版本</th>
            <th>实验名称</th>
        </tr>
        <c:forEach items="${resultPage}" var="map">
            <tr>
                <c:forEach items="${map}" var="entry">
                    <td>  ${entry.value}  </td>
                </c:forEach>
            </tr>
        </c:forEach>
    </table>



    服务端实验下发情况如下： <br />
    <table border="1" bgcolor="#ECF5FF">
        <tr>
            <th>实验号</th>    <!-- tr是一行,th是表头. td是一个单元格-->
            <th>实验说明</th>
            <th>命中版本</th>
            <th>实验名称</th>
        </tr>
        <c:forEach items="${resultService}" var="map">
            <tr>
                <c:forEach items="${map}" var="entry">
                    <td>  ${entry.value}  </td>
                </c:forEach>
            </tr>
        </c:forEach>
    </table>
</div>


<script type="application/javascript">

    function GetQueryString(name) {
        var reg = new RegExp("(^|&)"+ name +"=([^&]*)(&|$)");
        var r = window.location.search.substr(1).match(reg);
        if(r!=null)return  unescape(r[2]); return null;
    }

    function clearBox(){
        if(!clientId){
            document.getElementById('info-box').style.visibility = 'hidden'
        }
    }

    var clientId = GetQueryString('clientId')
//    console.log(clientId)
    document.getElementById('clear').addEventListener('click', function() {
        document.getElementById('clientId').value = ''
        document.getElementById('info-box').style.visibility = 'hidden'
    })

    clearBox()
</script>
</body>
</html>