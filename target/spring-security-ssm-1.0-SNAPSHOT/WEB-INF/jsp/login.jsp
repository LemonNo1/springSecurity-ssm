<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <meta name="viewport"
          content="width=device-width, initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=0">
    <title>登录页面</title>
    <%@ include file="/WEB-INF/jsp/home/css-head.jsp" %>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/js/layuiadmin/style/login.css" media="all">
    <style>
        .white{
            background-color: white;
        }

    </style>
</head>
<body style="background-color: #f2f2f2">
<div class="layadmin-user-login layadmin-user-display-show" id="LAY-user-login" style="display: none;">
    <div class="layadmin-user-login-main">
        <div class="layui-row layui-col-space white">
            <div class="layadmin-user-login-box layadmin-user-login-header">
                <h2>LemonRed Java-Home</h2>
                <p>柠鸿科技后台管理登录入口-java</p>
            </div>
            <div class="layadmin-user-login-box layadmin-user-login-body layui-form">
                <%--用户名--%>
                <div class="layui-form-item">
                    <label class="layadmin-user-login-icon layui-icon layui-icon-username"
                           for="LAY-user-login-username"></label>
                    <input type="text" name="username" id="LAY-user-login-username" lay-verify="required"
                           placeholder="用户名"
                           class="layui-input">
                </div>
                <%--密码--%>
                <div class="layui-form-item">
                    <label class="layadmin-user-login-icon layui-icon layui-icon-password"
                           for="LAY-user-login-password"></label>
                    <input type="password" name="password" id="LAY-user-login-password" lay-verify="required"
                           placeholder="密码" class="layui-input">
                </div>
                <%--图形验证码--%>
                <div class="layui-form-item">
                    <div class="layui-row">
                        <div class="layui-col-xs7">
                            <label class="layadmin-user-login-icon layui-icon layui-icon-vercode"
                                   for="LAY-user-login-vercode"></label>
                            <input type="text" id="inputCode" name="imageCode" id="LAY-user-login-vercode"
                                   lay-verify="required"
                                   placeholder="图形验证码" class="layui-input">
                        </div>
                        <div class="layui-col-xs5">
                            <div style="margin-left: 10px;">
                                <img src="${pageContext.request.contextPath}/imageCode" id="imageCode"
                                     class="layadmin-user-login-codeimg"
                                     id="LAY-user-get-vercode">
                            </div>
                        </div>
                    </div>
                </div>
                <%--注册、记住密码--%>
                <div class="layui-form-item" style="margin-bottom: 20px;">
                    <input type="checkbox" name="remember-me" title="记住密码">
                    <%--lay-skin="primary"--%>
                    <div class="layui-unselect layui-form-checkbox">
                        <span style="height: 1rem;">记住密码</span>
                        <i class="layui-icon layui-icon-ok"></i>
                    </div>
                    <a href="forget.html" class="layadmin-user-jump-change layadmin-link"
                       style="margin-top: 7px;">忘记密码？</a>
                </div>
                <%--登录--%>
                <div class="layui-form-item">
                    <button class="layui-btn layui-btn-fluid" lay-submit lay-filter="login">登 录</button>
                </div>
                <%--社交账号登录--%>
                <div class="layui-trans layui-form-item layadmin-user-login-other">
                    <label>社交账号登入</label>
                    <a href="javascript:msgS('以后会有的',6,1500);"><i class="layui-icon layui-icon-login-qq"></i></a>
                    <a href="javascript:msgS('以后会有的',6,1500)"><i class="layui-icon layui-icon-login-wechat"></i></a>
                    <a href="javascript:msgS('以后会有的',6,1500)"><i class="layui-icon layui-icon-login-weibo"></i></a>
                    <a href="javascript:;msgS('仅限猛哥哥自己使用',6,1500)"
                       class="layadmin-user-jump-change layadmin-link">注册帐号</a>
                </div>
            </div>
        </div>
    </div>
</div>
</body>
<%@ include file="/WEB-INF/jsp/home/js-foot.jsp" %>
<script>
    layui.use(['layer', 'form'], function () {
        var layer = layui.layer, form = layui.form;
        form.on('submit(login)', function (data) {
            $.ajax({
                type: "post",
                url: "${pageContext.request.contextPath}/securityLogin",
                data: data.field,
                dataType: "json",
                success: function (data) {
                    if (data.success) {
                        window.location.href = "${pageContext.request.contextPath}/mainDo";
                    } else {
                        if (data.errorMsg != null) {
                            layer.tips(data.errorMsg, "#inputCode");
                        } else {
                            msgS("用户名或密码错误", 2, 2000);
                        }
                    }
                },
                error: function () {
                    alert("系统错误！！！");
                }
            })
        });

    })

    $(function () {
        $("#loginBtn").click(function () {

        })
        $("#imageCode").click(function () {
            $("#imageCode").attr("src", "${pageContext.request.contextPath}/imageCode");
        })
    })

    function msgS(context, icon, time) {
        layer.msg(context, {
            icon: icon,
            time: time //2秒关闭（如果不配置，默认是3秒）
        });
    }
</script>
</html>
