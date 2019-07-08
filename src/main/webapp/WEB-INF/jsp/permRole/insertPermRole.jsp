<%--
  Created by IntelliJ IDEA.
  User: LIMENG
  Date: 2019/7/4
  Time: 23:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div class="layui-form" lay-filter="layuiadmin-form-useradmin" id="layuiadmin-form-useradmin"
     style="padding: 20px 20px 0 0 ;">
    <fieldset class="layui-elem-field layui-field-title" style="margin-top: 30px;">
        <legend>权限分配</legend>
    </fieldset>
    <c:forEach var="menu" items="${menus}">
        <div class="layui-form-item">
            <label class="layui-form-label">${menu.permName}</label>
            <div class="layui-input-block">
                <c:forEach items="${menu.child}" var="child">
                    <input type="checkbox" name="permId" title="${child.permName}">
                </c:forEach>
            </div>
        </div>
    </c:forEach>
</div>
</body>
</html>
