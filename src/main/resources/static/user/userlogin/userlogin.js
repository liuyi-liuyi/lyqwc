function login() {
    //前端是post方法传递,那么后端也得是post方法接收
    //前端是get方法传递,那么后端也得是get方法接收
    //前端更多的是对后端返回的数据处理结果进行相应的对用户的反馈
    //1. 邮箱输入框的值
    let username = $("#username").val();
    console.log(username);
    //2. 验证码
    let userpassword = $("#useruserpassword").val();
    console.log(userpassword);
    //post请求
    $.post('/dev/user/login', {username: username, userpassword: userpassword}, function (result) {
        if (result.code == "200") {
            //进行一个跳转 - 首页登录后的
            // console.log(result.data);//用于显示data是否为空值
            localStorage.setItem("username", result.data);
            window.location = "../Adminindex/adminindex.html";
        } else if (result.code == "404") {
            alert(result.msg);
        } else if (result.code == "500") {
            alert(result.msg);
        } else {
            alert(result.msg);
            window.location = result.data;
        }
    })
}