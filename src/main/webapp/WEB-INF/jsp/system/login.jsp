<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>优讯病例报告系统登录</title>
    <style type="text/css">
        body{//清除样式,设置字体和背景
        margin: 0;
            padding: 0;
            font-family: sans-serif;
            background: #34495e;
        }
        .box{
            width: 300px;
            padding: 40px;
            position: absolute;
            top: 50%;
            left: 50%;
            transform: translate(-50%,-50%);
            background: #191919;
            text-align: center;
        }
        .box h1{
            color: white;
            text-transform: uppercase;
            font-weight: 500;
        }
        .box input[type ="text"],.box input[type="password"]{
            border: 0;
            background: none;
            display: block;
            margin: 20px auto;
            text-align: center;
            border: 2px solid #3498db;
            padding: 14px 10px;
            width: 200px;
            outline: none;
            color: white;
            border-radius: 24px;
            transition: 0.25s;
        }
        .box input[type ="text"]:focus,.box input[type="password"]:focus {
            width: 280px;
            border-color: #2ecc71;
        }
        .box input[type="submit"]{
            border: 0;
            background: none;
            display: block;
            margin: 20px auto;
            float: left;
            text-align: center;
            border: 2px solid #2ecc71;
            padding: 14px 40px;
            outline: none;
            color: white;
            border-radius: 24px;
            transition: 0.25s;
            cursor: pointer;
        }
        .box input[type="reset"]{
            border: 0;
            background: none;
            display: block;
            margin: 20px auto;
            float: right;
            text-align: center;
            border: 2px solid #2ecc71;
            padding: 14px 40px;
            outline: none;
            color: white;
            border-radius: 24px;
            transition: 0.25s;
            cursor: pointer;
        }
        .box input[type="submit"]:hover{
            background:#2ecc71 ;
        }
        .box input[type="reset"]:hover{
            background:#2ecc71 ;
        }
    </style>

    <script>
    </script>
</head>


<body>
<div id="app">
    <form class="box" action="/login/do_login" method="post">
        <h1>login</h1>
        <input type="text" v-model="username" placeholder="Enter the Username">
        <input type="password" v-model="password" placeholder="Enter the Password">
        <input type="text" v-model="code" placeholder="Enter the code">
        <div>
            <img id="randomCode" alt="验证码" src="/random_code" onclick="changeImg()" style="cursor: pointer;">
        </div>
        <input type="submit" @click="login" value="Login">
        <input type="reset" @click="login" value="Reset">
    </form>
</div>

<script type="text/javascript" src="../../../../lib/js/jquery.min.js"></script>
<script type="text/javascript" src="../../../../lib/js/vue.min.js"></script>

<script type="text/javascript">
    function changeImg() {
        // 拿到当前图片元素
        let randomCode = document.getElementById("randomCode");
        // 修改这张图片的src路径
        // 加上时间戳，因为如果访问路径和之前一样的话，浏览器为认为我们访问了相同的资源，就不会再刷新修改验证码图片
        randomCode.src = "/random_code?date=" + new Date();
    }

    let app = new Vue({
        el: "#app",
        data: {
            username: "",
            password: "",
            info: "",
            code: ""
        },
        methods: {
            login() {
                let _this = this;
                $.post("/login/do_login", {
                    username: this.username,
                    password: this.password,
                    code: this.code
                }, function (data) {
                    if (data.success) {
                        location.replace("/admin/index");
                    } else {
                        if (data.msg) {
                            _this.info = "<span style='background: grey; color: white'>" + data.msg + "</span>";
                        } else {
                            _this.info = "<span style='color: red'>未知错误</span>"
                        }
                    }
                });
            },
            reset() {
                this.username = "";
                this.password = "";
                this.code = "";
            }
        }
    })
</script>
</body>

</html>