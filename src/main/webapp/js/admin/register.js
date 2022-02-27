$(function () {
    var url="register_submit";
    // $("#submit2").click(function () {
    //     window.location.href="/register"
    // })

    $("#register").click(function () {
        var username= $("#username").val();
        var password= $("#password").val();
        var password1= $("#password1").val();
        console.log(username)
        if(username !="" && password !=""){
            if (password1==password){
                $.ajax({
                    url:url,
                    type:"post",
                    cache: false,
                    async: false,
                    dataType: 'json',
                    contentType: 'application/json',
                    data: JSON.stringify({
                        username: username,
                        password: password
                    }),
                    success: function (data) {
                        if (data.success){
                            lightyear.notify('注册成功','success',100,'mdi mdi-emoticon-happy','top','center');
                            window.location.href ='/login';
                        }else {
                            lightyear.notify("提交失败，请重试", 'danger', 100, 'mdi mdi-emoticon-sad', 'top', 'center');
                        }
                    }
                })
            }else {
                lightyear.notify("两次密码不同", 'danger', 100, 'mdi mdi-emoticon-sad', 'top', 'center');
            }

        }else {
            lightyear.notify("注册信息为空", 'danger', 100, 'mdi mdi-emoticon-sad', 'top', 'center');
        }


    })


})