<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <%@include file="../home/css-head.jsp" %>
    <title>用户列表</title>
</head>
<body>
<div class="layui-fluid">
    <div class="layui-card">
        <div class="layui-form layui-card-header layuiadmin-card-header-auto">
            <div class="layui-form-item" style="text-align:left">
                <div class="layui-inline">
                    <label class="layui-form-label">菜单名称</label>
                    <div class="layui-input-block">
                        <input type="text" name="permName" id="permName" placeholder="请输入菜单名称" class="layui-input" value="">
                    </div>
                </div>
                <div class="layui-inline">
                    <label class="layui-form-label">菜单标签</label>
                    <div class="layui-input-block">
                        <input type="text" name="permTag" id="permTag" placeholder="请输入菜单标签" class="layui-input" value="">
                    </div>
                </div>
                <div class="layui-inline">
                    <button class="layui-btn layuiadmin-btn-useradmin" lay-submit lay-filter="search">
                        <i class="layui-icon layui-icon-search layuiadmin-button-btn"></i>
                    </button>
                </div>
            </div>
        </div>
        <div class="layui-card-body">
            <div style="">
                <button type="button" class="layui-btn" onclick="add()">
                    <i class="layui-icon">&#xe608;</i> 添加
                </button>
            </div>
        </div>
        <div class="layui-card-body">
            <table id="myTable" lay-filter="myTable"></table>
            <script type="text/html" id="toolTpl">
                <a class="layui-btn layui-btn-normal layui-btn-xs" lay-event="update"><i
                        class="layui-icon layui-icon-edit"></i>编辑</a>
                <a class="layui-btn layui-btn-normal layui-btn-xs" lay-event="delete"><i
                        class="layui-icon layui-icon-edit"></i>删除</a>
            </script>
        </div>
    </div>
</div>
</body>
<%@include file="../home/js-foot.jsp" %>
<script>
    layui.config({
        base:'${ctx}/js/layuiadmin/'	//静态资源所在路径
    }).extend({
        index:'lib/index'					//主入口模块
    }).use(['index','table'],function(){
        var $=layui.$;
        var table=layui.table;
        var form=layui.form;
        table.render({
            elem: "#myTable",
            url: "${ctx}/menu/findAll.do"
            , cellMinWidth: 80 	//全局定义常规单元格的最小宽度
            , page: true		 	//开启分页
            , height: 'full-220'
            , cols: [[
                {type: "checkbox", fixed: "left"}
                , { width: '6%',title: '序号',sort: true, align: 'center',templet: '<div>{{ d.LAY_TABLE_INDEX+1 }}</div>'}
                , {field: 'id', width: '10%', title: 'id', align: 'center'}
                , {field: 'permName', width: '20%', title: '菜单名称', align: 'center'}
                , {field: 'permTag', width: '20%', title: '菜单标签', align: 'center'}
                , {field: 'url', width: '20%', title: '菜单路径', align: 'center'}
                /*  ,{field:'activity_status', width:'6%', title: '状态', sort: true, align:'center',templet:'<div>{{ checkStatus(d.activity_status) }}</div>'} */
                , {title: '操作', align: 'center', toolbar: '#toolTpl'}
            ]]
        })
        //条件查询
        form.on('submit(search)', function (e) {
            //表格重载
            table.reload('myTable', {
                where: e.field
            });
        });
        //table上绑定事件
        table.on('tool(myTable)', function (e) {
            console.log(e.data);  //输出当前点击的对象的数据
            /*  var index = d.LAY_TABLE_INDEX+1;  */
            var id = e.data.id;	//获取表格数据id
            var layEvent = e.event;
            console.log(layEvent);
            if (layEvent == 'update') {
                var urlPage = "${ctx}/menu/toEdit.do?id="+id;
                var url = "${ctx}/user/edit.do";
                openWindow(urlPage,url,"用户编辑",400,500);
            } else if (e.event == 'delete') {
                var url = '${ctx}/menu/deleteById.do?id='+id;
                checkPassWordR(url);	//校验密码.
            }
        });
    })

    function add() {
        var urlPage = "${ctx}/menu/toAdd.do";
        var url = '${ctx}/menu/add.do';
        openWindow(urlPage,url,"添加菜单",500,400);
    }
</script>
</html>
