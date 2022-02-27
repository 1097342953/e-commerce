$(function () {
    $('#log-out').click(function () {
        //清除session
        $.ajax({
            url: '/logout',
            type: 'POST',
            async: false,
            cache: false,
            dataType: 'json',
            success: function (data) {
                if (data.success){
                    //清除session成功,跳转到登录页面
                    window.location.href = '/main';
                }
            },
            error: function (data, error) {
                alert(error);
            }
        })
    })
})