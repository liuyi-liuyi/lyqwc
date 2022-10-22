//注意：导航 依赖 element 模块，否则无法进行功能性操作
layui.use('element', function(){
    var element = layui.element;
    //监听提交
    form.on('submit(formDemo)', function(data){
        layer.msg(JSON.stringify(data.field));
        return false;
    });
});
//登录按钮，将前端的数据发送到后端
function login() {
    //前端是post方法传递,那么后端也得是post方法接收
    //前端是get方法传递,那么后端也得是get方法接收
    //前端更多的是对后端返回的数据处理结果进行相应的对用户的反馈
    //1. 邮箱输入框的值
    let staffname = $("#staffname").val();
    console.log(staffname);
    //2. 验证码
    let staffpassword = $("#staffpassword").val();
    console.log(staffpassword);
    //post请求
    $.post('/dev/staff/stafflogin', {staffname: staffname, staffpassword: staffpassword}, function (result) {
        if (result.code == "200") {
            //进行一个跳转 - 首页登录后的
            console.log(result.data);//用于显示data是否为空值
            localStorage.setItem("staffname", result.data);
            window.location = "../../homepage/homepage.html";
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