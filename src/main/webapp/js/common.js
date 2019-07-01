//提交窗口(url1:要打开的页面，url：请求地址，title:页面标题)
function openWindow(urlPage,url,title,width,height){
    //iframe窗
    var myEdit=layer.open({
        type: 2,
        title: title,
        shadeClose: true,
        shade: [0.6,'#000'],
        maxmin: false, 	//开启最大化最小化按钮
        area: [width+'px',height+'px'],
        offset: 'auto',	//位置垂直水平居中
        content: urlPage,
        btn: ['确定', '取消'],
        btnAlign: 'c',	//按钮居住对齐
        anim: 0,			//打开动画
        isOutAnim:true,	//关闭动画，默认开启
        yes: function(index, layero){	//确定按钮回调函数
            var iframeWin = window[layero.find('iframe')[0]['name']]; 	//得到iframe页的窗口对象
            var submit = layero.find('iframe').contents().find('#Mysubmit');
            iframeWin.layui.form.on('submit(Mysubmit)',function(e){		//给编辑页的按钮绑定提交事件
                $.ajax({
                    url:url,
                    data:e.field,
                    dataType:'json',
                    type:'post',
                    async:true,
                    success:function(data){
                        showTrueTip(data,index);
                    },
                    error:function(){
                        showFalseTip();
                    }
                });
                return false;
            });
            submit.trigger('click');
        }
    });
}

//成功提示框(res:ajax回调结果，index:关闭窗口)
function showTrueTip(data,index){
    if(data.success){
        if(index!=null){
            layer.close(index); 		//关闭窗口
        }
        layui.table.reload('myTable');	//表格重载
        layer.msg(data.msg,{'icon':1,'time':3000});
    }else{
        showFalseTip(data.msg);
    }
}

//失败提示框
function showFalseTip(msg){
    if(msg==null || msg==''){
        msg='系统错误';
    }
    layer.msg(msg,{'icon':2,'time':3000});
}