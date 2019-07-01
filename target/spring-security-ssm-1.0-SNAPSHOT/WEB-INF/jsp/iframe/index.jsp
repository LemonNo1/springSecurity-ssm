<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="../home/css-head.jsp" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<div class="layui-fluid">
    <div class="layui-row layui-col-space15">
        <div class="layui-col-md8">
            <div class="layui-row layui-col-space15">
                <div class="layui-col-md6">
                    <div class="layui-card">
                        <div class="layui-card-header">快捷方式</div>
                        <div class="layui-card-body">

                            <div class="layui-carousel layadmin-carousel layadmin-shortcut">
                                <div carousel-item>
                                    <ul class="layui-row layui-col-space10">
                                        <li class="layui-col-xs3">
                                            <a lay-href="home/homepage1.html">
                                                <i class="layui-icon layui-icon-console"></i>
                                                <cite>主页一</cite>
                                            </a>
                                        </li>
                                        <li class="layui-col-xs3">
                                            <a lay-href="home/homepage2.html">
                                                <i class="layui-icon layui-icon-chart"></i>
                                                <cite>主页二</cite>
                                            </a>
                                        </li>
                                        <li class="layui-col-xs3">
                                            <a lay-href="component/layer/list.html">
                                                <i class="layui-icon layui-icon-template-1"></i>
                                                <cite>弹层</cite>
                                            </a>
                                        </li>
                                        <li class="layui-col-xs3">
                                            <a layadmin-event="im">
                                                <i class="layui-icon layui-icon-chat"></i>
                                                <cite>聊天</cite>
                                            </a>
                                        </li>
                                        <li class="layui-col-xs3">
                                            <a lay-href="component/progress/index.html">
                                                <i class="layui-icon layui-icon-find-fill"></i>
                                                <cite>进度条</cite>
                                            </a>
                                        </li>
                                        <li class="layui-col-xs3">
                                            <a lay-href="app/workorder/list.html">
                                                <i class="layui-icon layui-icon-survey"></i>
                                                <cite>工单</cite>
                                            </a>
                                        </li>
                                        <li class="layui-col-xs3">
                                            <a lay-href="user/user/list.html">
                                                <i class="layui-icon layui-icon-user"></i>
                                                <cite>用户</cite>
                                            </a>
                                        </li>
                                        <li class="layui-col-xs3">
                                            <a lay-href="set/system/website.html">
                                                <i class="layui-icon layui-icon-set"></i>
                                                <cite>设置</cite>
                                            </a>
                                        </li>
                                    </ul>
                                    <ul class="layui-row layui-col-space10">
                                        <li class="layui-col-xs3">
                                            <a lay-href="set/user/info.html">
                                                <i class="layui-icon layui-icon-set"></i>
                                                <cite>我的资料</cite>
                                            </a>
                                        </li>
                                        <li class="layui-col-xs3">
                                            <a lay-href="set/user/info.html">
                                                <i class="layui-icon layui-icon-set"></i>
                                                <cite>我的资料</cite>
                                            </a>
                                        </li>
                                        <li class="layui-col-xs3">
                                            <a lay-href="set/user/info.html">
                                                <i class="layui-icon layui-icon-set"></i>
                                                <cite>我的资料</cite>
                                            </a>
                                        </li>
                                        <li class="layui-col-xs3">
                                            <a lay-href="set/user/info.html">
                                                <i class="layui-icon layui-icon-set"></i>
                                                <cite>我的资料</cite>
                                            </a>
                                        </li>
                                        <li class="layui-col-xs3">
                                            <a lay-href="set/user/info.html">
                                                <i class="layui-icon layui-icon-set"></i>
                                                <cite>我的资料</cite>
                                            </a>
                                        </li>
                                        <li class="layui-col-xs3">
                                            <a lay-href="set/user/info.html">
                                                <i class="layui-icon layui-icon-set"></i>
                                                <cite>我的资料</cite>
                                            </a>
                                        </li>
                                        <li class="layui-col-xs3">
                                            <a lay-href="set/user/info.html">
                                                <i class="layui-icon layui-icon-set"></i>
                                                <cite>我的资料</cite>
                                            </a>
                                        </li>
                                        <li class="layui-col-xs3">
                                            <a lay-href="set/user/info.html">
                                                <i class="layui-icon layui-icon-set"></i>
                                                <cite>我的资料</cite>
                                            </a>
                                        </li>
                                    </ul>

                                </div>
                            </div>

                        </div>
                    </div>
                </div>
                <div class="layui-col-md6">
                    <div class="layui-card">
                        <div class="layui-card-header">待办事项</div>
                        <div class="layui-card-body">

                            <div class="layui-carousel layadmin-carousel layadmin-backlog">
                                <div carousel-item>
                                    <ul class="layui-row layui-col-space10">
                                        <li class="layui-col-xs6">
                                            <a lay-href="app/content/comment.html" class="layadmin-backlog-body">
                                                <h3>待审评论</h3>
                                                <p><cite>66</cite></p>
                                            </a>
                                        </li>
                                        <li class="layui-col-xs6">
                                            <a lay-href="app/forum/list.html" class="layadmin-backlog-body">
                                                <h3>待审帖子</h3>
                                                <p><cite>12</cite></p>
                                            </a>
                                        </li>
                                        <li class="layui-col-xs6">
                                            <a lay-href="template/goodslist.html" class="layadmin-backlog-body">
                                                <h3>待审商品</h3>
                                                <p><cite>99</cite></p>
                                            </a>
                                        </li>
                                        <li class="layui-col-xs6">
                                            <a href="javascript:;" onclick="layer.tips('不跳转', this, {tips: 3});"
                                               class="layadmin-backlog-body">
                                                <h3>待发货</h3>
                                                <p><cite>20</cite></p>
                                            </a>
                                        </li>
                                    </ul>
                                    <ul class="layui-row layui-col-space10">
                                        <li class="layui-col-xs6">
                                            <a href="javascript:;" class="layadmin-backlog-body">
                                                <h3>待审友情链接</h3>
                                                <p><cite style="color: #FF5722;">5</cite></p>
                                            </a>
                                        </li>
                                    </ul>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="layui-col-md12">
                    <div class="layui-card">
                        <div class="layui-card-header">数据概览</div>
                        <div class="layui-card-body">

                            <div class="layui-carousel layadmin-carousel layadmin-dataview" data-anim="fade"
                                 lay-filter="LAY-index-dataview">
                                <div carousel-item id="LAY-index-dataview">
                                    <div><i class="layui-icon layui-icon-loading1 layadmin-loading"></i></div>
                                    <div></div>
                                    <div></div>
                                </div>
                            </div>

                        </div>
                    </div>
                    <div class="layui-card">
                        <div class="layui-tab layui-tab-brief layadmin-latestData">
                            <ul class="layui-tab-title">
                                <li class="layui-this">今日热搜</li>
                                <li>今日热帖</li>
                            </ul>
                            <div class="layui-tab-content">
                                <div class="layui-tab-item layui-show">
                                    <table id="LAY-index-topSearch"></table>
                                </div>
                                <div class="layui-tab-item">
                                    <table id="LAY-index-topCard"></table>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>

        <div class="layui-col-md4">
            <div class="layui-card">
                <div class="layui-card-header">版本信息</div>
                <div class="layui-card-body layui-text">
                    <table class="layui-table">
                        <colgroup>
                            <col width="100">
                            <col>
                        </colgroup>
                        <tbody>
                        <tr>
                            <td>当前版本</td>
                            <td>
                                <script type="text/html" template>
                                    <a href="#" target="_blank" style="padding-left: 15px;">更新日志</a>
                                </script>
                            </td>
                        </tr>
                        <tr>
                            <td>基于框架</td>
                            <td>
                                <script type="#" template>
                                </script>
                            </td>
                        </tr>
                        <tr>
                            <td></td>
                            <td></td>
                        </tr>
                        <tr>
                            <td>获取渠道</td>
                            <td style="padding-bottom: 0;">
                                <div class="layui-btn-container">
                                    <a href="#" target="_blank"
                                       class="layui-btn layui-btn-danger">red</a>
                                    <a href="#" target="_blank"
                                       class="layui-btn">lemon</a>
                                </div>
                            </td>
                        </tr>
                        </tbody>
                    </table>
                </div>
            </div>

            <div class="layui-card">
                <div class="layui-card-header">效果报告</div>
                <div class="layui-card-body layadmin-takerates">
                    <div class="layui-progress" lay-showPercent="yes">
                        <h3>转化率（日同比 28% <span class="layui-edge layui-edge-top" lay-tips="增长" lay-offset="-15"></span>）
                        </h3>
                        <div class="layui-progress-bar" lay-percent="65%"></div>
                    </div>
                    <div class="layui-progress" lay-showPercent="yes">
                        <h3>签到率（日同比 11% <span class="layui-edge layui-edge-bottom" lay-tips="下降"
                                              lay-offset="-15"></span>）</h3>
                        <div class="layui-progress-bar" lay-percent="32%"></div>
                    </div>
                </div>
            </div>

            <div class="layui-card">
                <div class="layui-card-header">实时监控</div>
                <div class="layui-card-body layadmin-takerates">
                    <div class="layui-progress" lay-showPercent="yes">
                        <h3>CPU使用率</h3>
                        <div class="layui-progress-bar" lay-percent="58%"></div>
                    </div>
                    <div class="layui-progress" lay-showPercent="yes">
                        <h3>内存占用率</h3>
                        <div class="layui-progress-bar layui-bg-red" lay-percent="90%"></div>
                    </div>
                </div>
            </div>

            <div class="layui-card">
                <div class="layui-card-header">产品动态</div>
                <div class="layui-card-body">
                    <div class="layui-carousel layadmin-carousel layadmin-news" data-autoplay="true" data-anim="fade"
                         lay-filter="news">
                        <div carousel-item>
                            <div><a href="#" target="_blank" class="layui-bg-red">layuiAdmin
                                </a></div>
                            <div><a href="#" target="_blank"
                                    class="layui-bg-green">会员讨论专区</a></div>
                            <div><a href="#" target="_blank" class="layui-bg-blue">获得
                                官方后台模板系统</a></div>
                        </div>
                    </div>
                </div>
            </div>

            <div class="layui-card">
                <div class="layui-card-header">
                    作者心语
                    <i class="layui-icon layui-icon-tips" lay-tips="要支持的噢" lay-offset="5"></i>
                </div>
                <div class="layui-card-body layui-text layadmin-text">
                    <p>南京柠鸿科技有限公司是美国领先的硅谷高科技创业企业LimeBike的中国分公司。
                        LimeBike旨在通过先进的无桩共享单车模式来解决美国最后1英里的出行问题，已于2017年3月获得硅谷顶级风投安德森-霍洛维茨基金(A16Z)领投，
                        </p>
                    <p>IDG、DCM、滴滴和ofo的早期投资人王刚、腾讯早期创始人之一曾李青的德讯投资、原腾讯集团副总裁吴宵光等跟投的1200万美金的A轮投资。</p>
                    <p>作为LimeBike在国内的分公司，深圳柠创负责LimeBike整车和智能硬件的设计、研发与制造 <a href="#"
                                                        target="_blank"></a>！</p>
                    <p>—— 贤心（<a href="#" target="_blank"></a>）</p>
                </div>
            </div>
        </div>
    </div>
</div>
<%@ include file="../home/js-foot.jsp" %>
</body>
</html>
