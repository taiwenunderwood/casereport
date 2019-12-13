<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title></title>
    <link rel="stylesheet" href="../../../../lib/layui/css/layui.css">
    <style>
        .layui-form-label{
            width: 100px;
        }
        .layui-input-block{
            margin-left: 130px;
        }
        body{
            font-weight: bold;
        }
        input{
            border: #0C0C0C 0.5px;
        }
    </style>
</head>
<body>
    <div class="layui-container">
        <div class="layui-col-md9">
            <div style="">
                <div class="layui-btn-container">
                    <button type="button" class="layui-btn">返回</button>
                </div>
            </div>
        </div>
        <div class="layui-col-md3">
            <div style="float: right">
                <div class="layui-btn-container">
                    <button type="button" class="layui-btn">保存</button>
                </div>
            </div>
        </div>
    </div>
    <div class="layui-container">
        <div class="layui-col-md2"></div>
        <div class="layui-col-md8">
            <form class="layui-form" action="">


                <ul class="layui-timeline">
                    <li class="layui-timeline-item">
                        <i class="layui-icon layui-timeline-axis">&#xe63f;</i>
                        <div class="layui-timeline-content layui-text">
                            <h3 class="layui-timeline-title">基本信息</h3>
                            <div class="layui-form-item">
                                <label class="layui-form-label">方案编号</label>
                                <div class="layui-input-block">
                                    <input type="text" name="projectNo" required  lay-verify="required" placeholder="" autocomplete="off" class="layui-input">
                                </div>
                            </div>
                            <div class="layui-form-item">
                                <label class="layui-form-label">临床实验组长单位</label>
                                <div class="layui-input-block">
                                    <input type="text" name="clinicalTestUnit" required  lay-verify="required" placeholder="" autocomplete="off" class="layui-input">
                                </div>
                            </div>
                            <div class="layui-form-item">
                                <label class="layui-form-label">项目资助单位</label>
                                <div class="layui-input-block">
                                    <input type="text" name="fundedUnit" required  lay-verify="required" placeholder="" autocomplete="off" class="layui-input">
                                </div>
                            </div>
                            <div class="layui-form-item">
                                <label class="layui-form-label">受试者编号</label>
                                <div class="layui-input-block">
                                    <input type="text" name="patientNo" required  lay-verify="required" placeholder="" autocomplete="off" class="layui-input">
                                </div>
                            </div>
                            <div class="layui-form-item">
                                <label class="layui-form-label">受试者筛选号</label>
                                <div class="layui-input-block">
                                    <input type="text" name="patientSSNo" required  lay-verify="required" placeholder="" autocomplete="off" class="layui-input">
                                </div>
                            </div>
                            <div class="layui-form-item">
                                <label class="layui-form-label">受试者姓名拼音缩写</label>
                                <div class="layui-input-block">
                                    <input type="text" name="xmsx" required  lay-verify="required" placeholder="四位，要求大写" autocomplete="off" class="layui-input">
                                </div>
                            </div>
                            <div class="layui-form-item">
                                <label class="layui-form-label">实验中心编号</label>
                                <div class="layui-input-block">
                                    <input type="text" name="centerid" required  lay-verify="required" placeholder="" autocomplete="off" class="layui-input">
                                </div>
                            </div>
                            <div class="layui-form-item">
                                <label class="layui-form-label">实验中心名称</label>
                                <div class="layui-input-block">
                                    <input type="text" name="centername" required  lay-verify="required" placeholder="" autocomplete="off" class="layui-input">
                                </div>
                            </div>
                            <div class="layui-form-item">
                                <label class="layui-form-label">研究者姓名</label>
                                <div class="layui-input-block">
                                    <input type="text" name="searcherName" required  lay-verify="required" placeholder="" autocomplete="off" class="layui-input">
                                </div>
                            </div>
                        </div>
                    </li>
                    <li class="layui-timeline-item">
                        <i class="layui-icon layui-timeline-axis">&#xe63f;</i>
                        <div class="layui-timeline-content layui-text">
                            <h3 class="layui-timeline-title">核对入选/排除标准</h3>
                            <div class="layui-form-item" >
                                <label class="layui-form-label">患者是否签署知情同意书</label>
                                <div class="layui-input-inline">
                                    <input type="radio" name="isSign" value="是" title="是">
                                    <input type="radio" name="isSign" value="否" title="否">
                                </div>
                                <label class="layui-form-label">签署日期</label>
                                <div class="layui-input-inline">
                                    <input type="text" name="signTime" id="signTime" placeholder="" autocomplete="off" class="layui-input">
                                </div>
                            </div>
                            <div class="layui-form-item">
                                <label class="layui-form-label">年龄30-60周岁</label>
                                <div class="layui-input-block">
                                    <input type="radio" name="ruxuan1" value="是" title="是">
                                    <input type="radio" name="ruxuan1" value="否" title="否">
                                </div>
                            </div>
                            <div class="layui-form-item">
                                <label class="layui-form-label">经病理确诊为浸润性乳腺癌，且AJCC癌症分期为I/II期初治患者</label>
                                <div class="layui-input-block">
                                    <input type="radio" name="ruxuan2" value="是" title="是">
                                    <input type="radio" name="ruxuan2" value="否" title="否">
                                </div>
                            </div>
                            <div class="layui-form-item">
                                <label class="layui-form-label">激素受体阳性（免疫组化检测2+以上或者Fish检测50%以上）</label>
                                <div class="layui-input-block">
                                    <input type="radio" name="ruxuan3" value="是" title="是">
                                    <input type="radio" name="ruxuan3" value="否" title="否">
                                </div>
                            </div>
                            <div class="layui-form-item">
                                <label class="layui-form-label">Her2阴性（免疫组化（-/+/++）或Fish<50%）</label>
                                <div class="layui-input-block">
                                    <input type="radio" name="ruxuan4" value="是" title="是">
                                    <input type="radio" name="ruxuan4" value="否" title="否">
                                </div>
                            </div>
                            <div class="layui-form-item">
                            <label class="layui-form-label">淋巴结阴性或具有1-3个淋巴结转移</label>
                                <div class="layui-input-block">
                                    <input type="radio" name="ruxuan5" value="是" title="是">
                                    <input type="radio" name="ruxuan5" value="否" title="否">
                                </div>
                            </div>
                            <div class="layui-form-item">
                                <label class="layui-form-label">签署知情同意书</label>
                                <div class="layui-input-block">
                                    <input type="radio" name="ruxuan6" value="是" title="是">
                                    <input type="radio" name="ruxuan6" value="否" title="否">
                                </div>
                            </div>
                            <div class="layui-form-item">
                                <label class="layui-form-label">入组前出现第二原发肿瘤者</label>
                                <div class="layui-input-block">
                                    <input type="radio" name="paichu1" value="是" title="是">
                                    <input type="radio" name="paichu1" value="否" title="否">
                                </div>
                            </div>
                            <div class="layui-form-item">
                                <label class="layui-form-label">男性乳腺癌患者</label>
                                <div class="layui-input-block">
                                    <input type="radio" name="paichu2" value="是" title="是">
                                    <input type="radio" name="paichu2" value="否" title="否">
                                </div>
                            </div>
                            <div class="layui-form-item">
                                <label class="layui-form-label">依从性差或存在研究者认为不适宜纳入研究的情况</label>
                                <div class="layui-input-block">
                                    <input type="radio" name="paichu3" value="是" title="是">
                                    <input type="radio" name="paichu3" value="否" title="否">
                                </div>
                            </div>
                        </div>
                    </li>
                    <li class="layui-timeline-item">
                        <i class="layui-icon layui-timeline-axis">&#xe63f;</i>
                        <div class="layui-timeline-content layui-text">
                            <h3 class="layui-timeline-title">人口学特征</h3>
                            <div class="layui-form-item">
                                <label class="layui-form-label">出生日期</label>
                                <div class="layui-input-block">
                                    <input type="text" name="birthday" id="birthday" placeholder="" autocomplete="off" class="layui-input">
                                </div>
                            </div>
                            <div class="layui-form-item">
                                <label class="layui-form-label">性别</label>
                                <div class="layui-input-block">
                                    <input type="radio" name="sex" value="男" title="男">
                                    <input type="radio" name="sex" value="女" title="女">
                                </div>
                            </div>
                            <div class="layui-form-item">
                                <label class="layui-form-label">婚否</label>
                                <div class="layui-input-block">
                                    <input type="radio" name="isMarry" value="是" title="是">
                                    <input type="radio" name="isMarry" value="否" title="否">
                                </div>
                            </div>
                            <div class="layui-form-item">
                                <label class="layui-form-label">育否</label>
                                <div class="layui-input-block">
                                    <input type="radio" name="isBirth" value="是" title="是">
                                    <input type="radio" name="isBirth" value="否" title="否">
                                </div>

                            </div>
                            <div class="layui-form-item">
                                <label class="layui-form-label">孩子数量</label>
                                <div class="layui-input-inline">
                                    <input type="text" name="birthNum" required  lay-verify="required" placeholder="" autocomplete="off" class="layui-input">
                                </div>
                                <label class="layui-form-label">首胎生育年龄(岁)</label>
                                <div class="layui-input-inline">
                                    <input type="text" name="firthBirthAge" required  lay-verify="required" placeholder="" autocomplete="off" class="layui-input">
                                </div>
                            </div>
                            <div class="layui-form-item">
                                <label class="layui-form-label">是否绝经</label>
                                <div class="layui-input-inline layui-col-md3">
                                    <input type="radio" name="isMenopause" value="是" title="是">
                                    <input type="radio" name="isMenopause" value="否" title="否">
                                </div>
                                <label class="layui-form-label">绝经年龄(岁)</label>
                                <div class="layui-input-inline">
                                    <input type="text" name="menopauseAge" required  lay-verify="required" placeholder="" autocomplete="off" class="layui-input">
                                </div>
                            </div>
                            <div class="layui-form-item">
                                <label class="layui-form-label">民族</label>
                                <div class="layui-input-inline">
                                    <input type="radio" name="nation" value="汉" title="汉">
                                    <input type="radio" id="nation" name="nation" value="其他" title="其他">
                                </div>
                                <label class="layui-form-label"></label>
                                <div class="layui-input-inline">
                                    <input type="text" name="othernation" required  lay-verify="required" placeholder="请输入民族名称" autocomplete="off" class="layui-input">
                                </div>
                            </div>
                            <div class="layui-form-item">
                                <label class="layui-form-label">职业</label>
                                <div class="layui-input-block">
                                    <input type="radio" name="occupation" value="体力" title="体力">
                                    <input type="radio" name="occupation" value="非体力" title="非体力">
                                </div>
                            </div>
                            <div class="layui-form-item">
                                <label class="layui-form-label">身高</label>
                                <div class="layui-input-block">
                                    <input type="text" name="height" required  lay-verify="required" placeholder="厘米 保留一位小数" autocomplete="off" class="layui-input">
                                </div>
                            </div>
                            <div class="layui-form-item">
                                <label class="layui-form-label">体重</label>
                                <div class="layui-input-block">
                                    <input type="text" name="weight" required  lay-verify="required" placeholder="公斤 保留一位小数" autocomplete="off" class="layui-input">
                                </div>
                            </div>
                            <div class="layui-form-item">
                                <label class="layui-form-label">肿瘤家族史</label>
                                <div class="layui-input-block">
                                    <input type="radio" name="havecancerHistory" value="无" title="无">
                                    <input type="radio" name="hvaecancerHistory" value="有" title="有">
                                </div>
                            </div>
                            <div class="layui-form-item">
                                <div class="layui-input-inline" style="width: 300px">
                                    <input type="radio" name="cancerHistory" value="乳腺癌" title="乳腺癌">
                                    <input type="radio" name="cancerHistory" value="卵巢癌" title="卵巢癌">
                                    <input type="radio" name="cancerHistory" value="其他" title="其他">
                                </div>
                                <div class="layui-input-inline">
                                    <input type="text" name="otherCancerHistory" required  lay-verify="required" placeholder="身高" autocomplete="off" class="layui-input">
                                </div>
                            </div>
                        </div>
                    </li>
                    <li class="layui-timeline-item">
                        <i class="layui-icon layui-timeline-axis">&#xe63f;</i>
                        <div class="layui-timeline-content layui-text">
                            <h3 class="layui-timeline-title">病理诊断</h3>
                            <div class="layui-form-item">
                                <label class="layui-form-label">就诊日期:</label>
                                <div class="layui-input-block">
                                    <input type="text" name="treatTime" autocomplete="off" class="layui-input">
                                </div>
                            </div>
                            <div class="layui-form-item">
                                <label class="layui-form-label">AJCC癌症临床分期:</label>
                                <div class="layui-input-inline">
                                    <input type="radio" name="ajcc" value="I期" title="I期">
                                    <input type="radio" name="ajcc" value="II期" title="II期">
                                </div>
                            </div>
                            <div class="layui-form-item">
                                <label class="layui-form-label"></label>
                                <label class="layui-form-label" style="width: 50px">PT </label>
                                <div class="layui-input-inline" style="width: 50px">
                                    <input type="text" name="PT" required  lay-verify="required" placeholder="" autocomplete="off" class="layui-input" style="width: 50px">
                                </div>
                                <label class="layui-form-label" style="width: 50px">PN </label>
                                <div class="layui-input-inline" style="width: 50px">
                                    <input type="text" name="PN" required  lay-verify="required" placeholder="" autocomplete="off" class="layui-input" style="width: 50px">
                                </div>
                                <label class="layui-form-label" style="width: 50px">PM </label>
                                <div class="layui-input-inline" style="width: 50px">
                                    <input type="text" name="PM" required  lay-verify="required" placeholder="" autocomplete="off" class="layui-input" style="width: 50px">
                                </div>
                            </div>
                            <div class="layui-form-item">
                                <label class="layui-form-label">分化程度:</label>
                                <div class="layui-input-block">
                                    <input type="radio" name="fenhuadegree" value="低分化" title="低分化">
                                    <input type="radio" name="fenhuadegree" value="中分化" title="中分化">
                                    <input type="radio" name="fenhuadegree" value="高分化" title="高分化">
                                    <input type="radio" name="fenhuadegree" value="不详" title="不详">
                                    <input type="radio" name="fenhuadegree" value="伴黏液分泌" title="伴黏液分泌">
                                </div>
                            </div>
                            <div class="layui-form-item">
                                <label class="layui-form-label"></label>
                                <div class="layui-input-inline">
                                    <input type="radio" name="fenhuadegree" value="其他" title="其他">
                                </div>
                                <label class="layui-form-label">其他分化内容:</label>
                                <div class="layui-input-inline">
                                    <input type="text" name="otherfenhuadegree" required  lay-verify="required" placeholder="" autocomplete="off" class="layui-input" style="width: 200px">
                                </div>
                            </div>
                            <div class="layui-form-item">
                                <label class="layui-form-label">免疫组化:</label>

                                <div class="layui-input-inline">
                                    <label class="layui-form-label" style="width: 50px">ER≥80</label>
                                    <input type="radio" name="ERout80Present" value="是" title="是">
                                    <input type="radio" name="ERout80Present" value="否" title="否">
                                </div>
                                <div class="layui-input-inline">
                                    <label class="layui-form-label" style="width: 50px">PR≥80</label>
                                    <input type="radio" name="PRout80Present" value="是" title="是">
                                    <input type="radio" name="PRout80Present" value="否" title="否">
                                </div>
                            </div>
                            <div class="layui-form-item">
                                <label class="layui-form-label">HER2</label>
                                <div class="layui-input-inline">
                                    <input type="radio" name="HER2" value="-/+" title="-/+">
                                    <input type="radio" name="HER2" value="++" title="++">
                                </div>
                                <label class="layui-form-label" style="width: 50px">FISH</label>
                                <div class="layui-input-inline" style="width: 200px">
                                    <input type="radio" name="FISH" value="-" title="-">
                                    <input type="radio" name="FISH" value="+" title="+">
                                </div>
                            </div>
                            <div class="layui-form-item">
                                <label class="layui-form-label">Ki67(%)</label>
                                <div class="layui-input-inline">
                                    <input type="text" name="ki67" required  lay-verify="required" placeholder="" autocomplete="off" class="layui-input" style="width: 100px">
                                </div>
                            </div>
                            <div class="layui-form-item">
                                <label class="layui-form-label">肿瘤组织大小</label>
                                <div class="layui-input-inline" style="width: 50px">
                                    <input type="text" name="firthBirthAge" required  lay-verify="required" placeholder="" autocomplete="off" class="layui-input" style="width: 50px">
                                </div>
                                <label class="layui-form-label" style="width: 40px">cm X</label>
                                <div class="layui-input-inline" style="width: 50px">
                                    <input type="text" name="firthBirthAge" required  lay-verify="required" placeholder="" autocomplete="off" class="layui-input" style="width: 50px">
                                </div>
                                <label class="layui-form-label" style="width: 40px">cm X</label>
                                <div class="layui-input-inline" style="width: 50px">
                                    <input type="text" name="firthBirthAge" required  lay-verify="required" placeholder="" autocomplete="off" class="layui-input" style="width: 50px">
                                </div>
                            </div>
                            <div class="layui-form-item">
                                <label class="layui-form-label">淋巴结转移:</label>
                                <div class="layui-input-inline" style="width: 50px">
                                    <input type="radio" name="" value="否" title="否">
                                    <input type="radio" name="" value="1个" title="1个">
                                    <input type="radio" name="" value="2个" title="2个">
                                    <input type="radio" name="" value="3个" title="3个">
                                </div>
                            </div>
                            <div class="layui-form-item">
                                <label class="layui-form-label">手术日期</label>
                                <div class="layui-input-block">
                                    <input type="text" name="" required lay-verify="required" placeholder="" autocomplete="off" class="layui-input">
                                </div>
                            </div>
                            <div class="layui-form-item">
                                <label class="layui-form-label">手术名称</label>
                                <div class="layui-input-block">
                                    <input type="text" name="" required lay-verify="required" placeholder="" autocomplete="off" class="layui-input">
                                </div>
                            </div>
                            <div class="layui-form-item">
                                <label class="layui-form-label">手术性质</label>
                                <div class="layui-input-block">
                                    <input type="text" name="" required lay-verify="required" placeholder="" autocomplete="off" class="layui-input">
                                </div>
                            </div>
                            <div class="layui-form-item">
                                <label class="layui-form-label">基因检测样本采集时间：</label>
                                <div class="layui-input-block">
                                    <input type="text" name="" required lay-verify="required" placeholder="" autocomplete="off" class="layui-input">
                                </div>
                            </div>

                        </div>
                    </li>
                    <li class="layui-timeline-item">
                        <i class="layui-icon layui-timeline-axis">&#xe63f;</i>
                        <div class="layui-timeline-content layui-text">
                            <div class="layui-timeline-title">结束</div>
                        </div>
                    </li>
                </ul>
                <div class="layui-form-item">
                    <div class="layui-input-block">
                        <button class="layui-btn" lay-submit lay-filter="formDemo">立即提交</button>
                        <button type="reset" class="layui-btn layui-btn-primary">重置</button>
                    </div>
                </div>
            </form>
        </div>
        <div class="layui-col-md2"></div>
    </div>


</body>
<script src="../../../../lib/layui/layui.all.js" type="text/javascript"></script>
<script src="../../../../lib/js/jquery.min.js" type="text/javascript"></script>
<script type="text/javascript">
    //时间组件
    layui.use('laydate', function(){
        var laydate = layui.laydate;

        //执行一个laydate实例
        laydate.render({
            elem: '#signTime' //指定元素
        });
        //执行一个laydate实例
        laydate.render({
            elem: '#birthday' //指定元素
        });
    });

</script>
</html>
