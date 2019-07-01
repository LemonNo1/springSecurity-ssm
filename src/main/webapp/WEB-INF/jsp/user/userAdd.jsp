<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <%@include file="../home/css-head.jsp" %>
</head>
<body>
<div class="layui-form" lay-filter="layuiadmin-form-useradmin" id="layuiadmin-form-useradmin" style="padding: 20px 20px 0 0 ;">
    <input type="hidden" name="id" value="${entity.id}">

    <div class="layui-form-item">
        <label class="layui-form-label">用户名称</label>
        <div class="layui-input-block">
            <input type="text" name="userName" lay-verify="required" value=""
                   placeholder="请输入用户名" autocomplete="off" class="layui-input">
        </div>
    </div>
    <div class="layui-form-item">
        <label class="layui-form-label">初始密码</label>
        <div class="layui-input-block">
            <input type="text" name="password" lay-verify="required" value=""
                   placeholder="请输入初始密码" autocomplete="off" class="layui-input">
        </div>
    </div>
    <div class="layui-form-item">
        <label class="layui-form-label">真实姓名</label>
        <div class="layui-input-block">
            <input type="text" name="realName" lay-verify="required" value="" placeholder="请输入真实姓名"
                   autocomplete="off" class="layui-input" >
        </div>
    </div>
    <div class="layui-form-item">
        <label class="layui-form-label">手机号码</label>
        <div class="layui-input-block">
            <input type="text" name="mobile" lay-verify="phone" value="" placeholder="请输入号码" autocomplete="off" class="layui-input">
        </div>
    </div>
    <div class="layui-form-item">
        <label class="layui-form-label">用户状态</label>
        <div class="layui-input-block">
            <input type="radio" name="status" value="1" title="启用" checked>
            <input type="radio" name="status" value="0" title="停用">
        </div>
    </div>
    <div class="layui-form-item layui-hide">
        <div class="layui-input-block">
            <button class="layui-btn" lay-submit lay-filter="Mysubmit" id="Mysubmit">确定</button>
            <button type="reset" class="layui-btn layui-btn-primary">重置</button>
        </div>
    </div>
</div>



</body>
<%@include file="../home/js-foot.jsp" %>
<script>
    layui.use(["form","table"], function(){

    });
</script>
</html>
