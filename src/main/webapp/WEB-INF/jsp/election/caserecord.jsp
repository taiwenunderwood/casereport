<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title></title>
    <link rel="stylesheet" href="../../../../lib/layui/css/layui.css">
    <style>



    </style>
</head>
<body>
    <div class="layui-layout layui-layout-admin">
        <div class="layui-header layui-bg-gray">
            <div class="layui-btn-container" style="padding-top: 15px;padding-bottom: 15px;padding-left: 20px">
                <a href="/casereport/election/record/show" target="_parent"><button id="button_show" type="button" class="layui-btn layui-btn-normal layui-btn-sm">查看</button></a>
                <a href="/casereport/election/record/add" target="_parent"><button id="button_add" type="button" class="layui-btn layui-btn-normal layui-btn-sm">添加</button></a>
                <a href="/casereport/election/record/update" target="_parent"><button id="button_update" type="button" class="layui-btn layui-btn-normal layui-btn-sm">修改</button></a>
            </div>
        </div>
    </div>
    <div id="table_div" class="layui-layout-body" >
        <table id="record_table"  ></table>
    </div>
</body>
<script src="../../../../lib/layui/layui.all.js" type="text/javascript"></script>
<script src="../../../../lib/js/jquery.min.js" type="text/javascript"></script>
<script>
    $(function () {
        $("#button_show").click(function () {
            $.post(

            )
        });
        //实现横向滚动条
        var width = 0;
        for (let i = 0; i < $('.nav_item').length; i++) {
            width += $('.nav_item').eq(i).outerWidth(true);
        }
        $('.nav_mine').width(width+20);  //width只是内容的宽度，需要加上padding的宽度

    })

    layui.use("table",function () {
        var recordtable = layui.table;
        //第一个实例
        recordtable.render({
            elem: '#record_table'
            ,height: 312
            ,url: '/casereport/election/caserecordlist' //数据接口
            ,page: true //开启分页
            ,toolbar: true
            ,loading: true
            // ,height: 'full-140'
            ,cols: [[ //表头
                {field: 'tid', title: 'ID', width:80, sort: true, fixed: 'left',hidden:true}
                ,{field: 'projectNo', title: '方案编号', width:80}
                ,{field: 'clinicalTestUnit', title: '临床实验组长单位', width:80}
                ,{field: 'fundedUnit', title: '项目资助单位', width:80}
                ,{field: 'patientNo', title: '受试者编号', width: 177}
                ,{field: 'patientSSNo', title: '受试者筛选号', width: 80}
                ,{field: 'xmsx', title: '受试者姓名拼音缩写', width: 80}
                ,{field: 'centerid', title: '试验中心编号', width: 80}
                ,{field: 'centername', title: '项目承担单位', width: 135}
                ,{field: 'searcherName', title: '研究者姓名', width: 135}
                ,{field: 'isTxStandard', title: '是否填写核对入选/排除标准', width: 135}
                ,{field: 'isTxPopularCharacter', title: '是否填写人口学特征', width: 135}
                ,{field: 'isTxPathologicDiagnosis', title: '是否填写病理诊断', width: 135}
                ,{field: 'visitNum', title: '随访次数', width: 135}
                ,{field: 'startTime', title: '开始时间', width: 135}
                ,{field: 'endTime', title: '结束时间', width: 135}
                ,{field: 'unfinishzb', title: '未完成备注', width: 135}
                ,{field: 'patientStopTime', title: '患者终止时期', width: 135}
                ,{field: 'firstStop', title: '首先终止试验方', width: 135}
                ,{field: 'otherManbz', title: '非患者/研究者备注', width: 135}
                ,{field: 'stopReason', title: '终止试验原因', width: 135}
                ,{field: 'withdrawTime', title: '受试者撤回知情同意书时间', width: 135}
                ,{field: 'againstReason', title: '违背研究方案说明', width: 135}
                ,{field: 'loseVisitInfo', title: '失访信息', width: 135}
                ,{field: 'sponsorStopInfo', title: '项目发起人终止原因', width: 135}
                ,{field: 'other', title: '其他', width: 135}
            ]]
            ,done: function () {
                AutoTableHeight();
            }
        });


    });
    // 在layui table加载完成后，重新设置表格高度为100%,不限制表格高度，不会在表格上出现垂直滚动条
    function AutoTableHeight()
    {
        var dev_obj = document.getElementById('table_div'); //table的父div
        var layuitable_main = dev_obj.getElementsByClassName("layui-table-main"); //在父div中找 layui-table-main 属性所在标签
        if (layuitable_main != null && layuitable_main.length > 0) {
            layuitable_main[0].style.height = '100%';
        }

        var layuitable = dev_obj.getElementsByClassName("layui-form"); //在父div中找 layui-form 属性所在标签
        if (layuitable != null && layuitable.length > 0) {
            layuitable[0].style.height = '100%';
        }
    }
</script>
</html>
