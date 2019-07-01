<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>首页</title>
</head>
<body>
以下是网站的功能：<br/>
<a href="${pageContext.request.contextPath}/prod/add">商品添加</a><br/>
<a href="${pageContext.request.contextPath}/prod/update">商品修改</a><br/>
<a href="${pageContext.request.contextPath}/prod/list">商品查询</a><br/>
<a href="${pageContext.request.contextPath}/prod/delete">商品删除</a><br/>
</body>
</html>
