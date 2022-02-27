$(function () {
    //登录验证的controller的url
    var loginUrl = 'checkLogin';
    //登录次数,累计超过3次登陆失败后,显示验证码
    var loginCount = 0;
    $('#submit').click(function () {
        //获取输入的账号
        var username = $('#username').val();
        //获取输入的密码
        var password = $('#password').val();
        //获取用户实际输入的验证码
        var verifyCodeActual = $('#j_captcha').val();
        //是否需要验证码校验
        var needVerify = false;
        //如果失败登录次数达到3次
        if (loginCount >= 3) {
            needVerify = true
            //非空也是true
            if (!verifyCodeActual) {
                lightyear.notify('请输入验证码~', 'warning', 100, 'mdi mdi-emoticon-sad', 'top', 'center' );
                return ;
            }
        }
        $.ajax({
            url:loginUrl,
            type:"post",
            cache: false,
            async: false,
            dataType: 'json',
            contentType: 'application/json',
            data: JSON.stringify({
                userName: username,
                password: password,
                verifyCodeActual: verifyCodeActual,
                needVerify: needVerify
            }),
            success: function (data) {
                if (data.success) {
                    lightyear.notify('登陆成功'+data.username, 'success', 100, 'mdi mdi-emoticon-happy', 'top', 'center' );
                    if (data.identity=="0"){
                        window.location.href = '/main';
                    }else {
                        window.location.href = '/manage';
                    }
                    console.log(data.username)

                } else {
                    lightyear.notify(data.errMsg, 'danger', 100, 'mdi mdi-emoticon-sad', 'top', 'center' );
                    loginCount++;
                    if (loginCount >= 3) {
                        $('#verifyPart').show();
                        $('#captcha').click();
                    }
                }
            }
        });
    })
});
//验证码图片更换
function chageVerificationCode(img) {
    img.src = "/Kaptcha?"+Math.floor(Math.random()*100);
}

