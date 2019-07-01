<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>用户编辑</title>
</head>
<%@include file="../home/css-head.jsp" %>
<body>
<div class="layui-form" lay-filter="layuiadmin-form-useradmin" id="layuiadmin-form-useradmin"
     style="padding: 20px 20px 0 0 ;">
    <input type="hidden" name="id" value="${entity.id}">
    <input type="hidden" name="userId" value="${entity.id}">
    <div class="layui-form-item">
        <label class="layui-form-label">用户角色</label>
        <div class="layui-input-block">
            <select name="roleId" lay-verify="required">
                <option value="">请选择角色</option>
                <c:forEach var="role" items="${roles}">
                    <option value="${role.id }">${role.roleName }</option>
                </c:forEach>
            </select>
        </div>
    </div>
    <div class="layui-form-item">
        <label class="layui-form-label">用户名称</label>
        <div class="layui-input-block">
            <input type="text" name="userName" lay-verify="required" value="${entity.userName}"
                   placeholder="请输入用户名" autocomplete="off" class="layui-input">
        </div>
    </div>
    <div class="layui-form-item">
        <label class="layui-form-label">真实姓名</label>
        <div class="layui-input-block">
            <input type="text" name="realName" lay-verify="required" value="${entity.realName}" placeholder="请输入真实姓名"
                   autocomplete="off" class="layui-input">
        </div>
    </div>
    <div class="layui-form-item">
        <label class="layui-form-label">手机号码</label>
        <div class="layui-input-block">
            <input type="text" name="mobile" lay-verify="phone" value="${entity.mobile}" placeholder="请输入号码"
                   autocomplete="off" class="layui-input">
        </div>
    </div>
    <div class="layui-form-item">
        <label class="layui-form-label">状态</label>
        <div class="layui-input-block">
            <input type="radio" name="status" value="1" title="启用" <c:if test="${entity.status==1 }">checked</c:if> >
            <input type="radio" name="status" value="0" title="停用" <c:if test="${entity.status==0 }">checked</c:if>>
        </div>
    </div>
    <div class="layui-form-item layui-hide">
        <div class="layui-input-block">
            <button class="layui-btn" lay-submit lay-filter="Mysubmit" id="Mysubmit">确定</button>
            <button type="reset" class="layui-btn layui-btn-primary">重置</button>
        </div>
    </div>
</div>
<%@include file="../home/js-foot.jsp" %>
<script>
    layui.use(["form", "table"], function () {
    });
</script>
</body>
</html>
