<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <title>病例报告系统-优讯医学检验实验室</title>
    <link rel="stylesheet" href="../../../lib/layui/css/layui.css">
</head>
<body class="layui-layout-body">
<div class="layui-layout layui-layout-admin">
    <div class="layui-header">
        <div class="layui-logo">病例报告系统</div>
        <!-- 头部区域（可配合layui已有的水平导航） -->
        <%--        <ul class="layui-nav layui-layout-left">--%>
        <%--            <li class="layui-nav-item"><a href="">控制台</a></li>--%>
        <%--            <li class="layui-nav-item"><a href="">商品管理</a></li>--%>
        <%--            <li class="layui-nav-item"><a href="">用户</a></li>--%>
        <%--            <li class="layui-nav-item">--%>
        <%--                <a href="javascript:;">其它系统</a>--%>
        <%--                <dl class="layui-nav-child">--%>
        <%--                    <dd><a href="">邮件管理</a></dd>--%>
        <%--                    <dd><a href="">消息管理</a></dd>--%>
        <%--                    <dd><a href="">授权管理</a></dd>--%>
        <%--                </dl>--%>
        <%--            </li>--%>
        <%--        </ul>--%>
        <%--        <ul class="layui-nav layui-layout-right">--%>
        <%--            <li class="layui-nav-item">--%>
        <%--                <a href="javascript:;">--%>
        <%--                    <img src="http://t.cn/RCzsdCq" class="layui-nav-img">--%>
        <%--                    贤心--%>
        <%--                </a>--%>
        <%--                <dl class="layui-nav-child">--%>
        <%--                    <dd><a href="">基本资料</a></dd>--%>
        <%--                    <dd><a href="">安全设置</a></dd>--%>
        <%--                </dl>--%>
        <%--            </li>--%>
        <%--            <li class="layui-nav-item"><a href="">退了</a></li>--%>
        <%--        </ul>--%>
    </div>

    <div class="layui-side layui-bg-black">
        <div class="layui-side-scroll">
            <!-- 左侧导航区域（可配合layui已有的垂直导航） -->
            <ul class="layui-nav layui-nav-tree"  lay-filter="test">
                <li class="layui-nav-item layui-nav-itemed">
                    <a class="" href="javascript:;">筛选期记录</a>
                    <dl class="layui-nav-child">
                        <dd class="main_left"><a  data-src="/casereport/election/recordInfo"  target="_top" >信息记录</a></dd>
                        <dd><a href="javascript:;">基本信息</a></dd>
                        <dd><a href="javascript:;">核对入选排除标准</a></dd>
                        <dd><a href="javascript:;">人口学特征</a></dd>
                        <dd><a href="javascript:;">病理诊断</a></dd>
                    </dl>
                </li>
                <li class="layui-nav-item">
                    <a href="javascript:;">随访期记录</a>
                    <dl class="layui-nav-child">
                        <dd><a href="javascript:;">信息记录</a></dd>
                        <dd><a href="javascript:;">基本信息</a></dd>
                        <dd><a href="javascript:;">癌胚抗原检查</a></dd>
                        <dd><a href="javascript:;">影像学检查</a></dd>
                        <dd><a href="javascript:;">肿瘤治疗记录</a></dd>
                    </dl>
                </li>
                <li class="layui-nav-item">
                    <a href="javascript:;">实验中心管理</a>
                    <dl class="layui-nav-child">
                        <dd><a href="javascript:;">实验中心管理</a></dd>
                    </dl>
                </li>
                <li class="layui-nav-item">
                    <a href="javascript:;">实验中心权限管理</a>
                    <dl class="layui-nav-child">
                        <dd><a href="javascript:;">用户管理</a></dd>
                        <dd><a href="javascript:;">角色管理</a></dd>
                    </dl>
                </li>
            </ul>
        </div>
    </div>

    <div class="layui-body">
        <!-- 内容主体区域 -->
        <%--        <div style="padding: 15px;">内容主体区域</div>--%>
        <%--        <div class="main_right">--%>
        <iframe frameborder="0" scrolling="yes" style="width: 100%" src="" id="aa">
        </iframe>
        <%--        </div>--%>
    </div>

    <div class="layui-footer">
        <!-- 底部固定区域 -->
        © layui.com - 底部固定区域
    </div>
</div>
<script src="../../../lib/layui/layui.all.js" type="text/javascript"></script>
<script src="../../../lib/js/jquery.min.js" type="text/javascript"></script>
<script>
    //JavaScript代码区域
    layui.use('element', function(){
        var element = layui.element;

    });
    $(function(){
        //获取src值
        $(".main_left a").on("click",function(){
            var address =$(this).attr("data-src");
            $("iframe").attr("src",address);
        });
        $(".main_left a:first-child").click();
        //一下代码是根据窗口高度在设置iframe的高度
        var frame = $("#aa");
        var frameheight = $(window).height();
        console.log(frameheight);
        frame.css("height",frameheight);
    });
</script>
</body>
</html>