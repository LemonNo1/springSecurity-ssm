<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <%@include file="../home/css-head.jsp" %>
</head>
<body>
<div class="layui-form" lay-filter="layuiadmin-form-useradmin" id="layuiadmin-form-useradmin" style="padding: 20px 20px 0 0 ;">
        <div class="layui-form-item">
                <label class="layui-form-label">用户角色</label>
                <div class="layui-input-block">
                        <select name="" lay-verify="required" id="menuType" lay-filter="changeType">
                                <option value="">请选择菜单类型</option>
                                <option value="son">子菜单</option>
                                <option value="father">父菜单</option>
                        </select>
                </div>
        </div>
        <div class="layui-form-item" id="father">
                <label class="layui-form-label">父菜单节点</label>
                <div class="layui-input-block">
                        <select name="parentId" lay-verify="required" id="fatherSelect">
                                <option value="">请选择父菜单</option>
                                <c:forEach var="parent" items="${menuParents}">
                                        <option value="${parent.id}">${parent.permName }</option>
                                </c:forEach>
                        </select>
                </div>
        </div>
        <div class="layui-form-item">
                <label class="layui-form-label">菜单名称</label>
                <div class="layui-input-block">
                        <input type="text" name="permName" lay-verify="required" value="" placeholder="请输入菜单名"
                        autocomplete="off" class="layui-input">
                </div>
        </div>
        <div class="layui-form-item" id="menuUrl">
                <label class="layui-form-label">菜单地址</label>
                <div class="layui-input-block">
                        <input type="text" name="url" lay-verify="required" value="" id="menuUrlInput"
                        placeholder="请输入菜单地址" autocomplete="off" class="layui-input">
                </div>
        </div>
        <div class="layui-form-item">
                <label class="layui-form-label">菜单标签</label>
                <div class="layui-input-block">
                        <input type="text" name="permTag" lay-verify="required" value="" placeholder="请输入菜单标签"
                        autocomplete="off" class="layui-input">
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
        layui.use(["form", "table"], function () {
                var form = layui.form;
                var $ = layui.$;
                form.on("select(changeType)",function(data) {
                              if(data.value == 'father'){
                                        $("#father").css("display","none");
                                        $("#menuUrl").css("display","none");
                                        $("#menuUrlInput").attr("lay-verify","");
                                        $("#fatherSelect").attr("lay-verify","");
                                }else{
                                        $("#father").css("display","block");
                                        $("#menuUrl").css("display","block");
                                        $("#menuUrlInput").attr("lay-verify","required");
                                        $("#fatherSelect").attr("lay-verify","required");
                                }
                })
        });
</script>
</html>
