$(function () {

    getList()

    //获取用户列表
    function getList() {
        // var name = $("#user-name").text()
        $.ajax({
            url:"/user/getList",
            type:"post",
            cache:false,
            async:false,
            dataType:'json',
            contentType:"application/json",
            success:function (data){
                if (data.success){
                    //将获取到的数据动态渲染
                    handleList(data.data)
                }else {

                }
            }
        })
    }



    //动态渲染
    function handleList(data) {
        var html='';
        data.map(function (item,index) {
            html += '<tr>\n' +
                '       <td>'+item.username+'</td>\n' +
                '       <td>'+item.password+'</td>\n' +
                '       <td>'+item.identity+'</td>\n' +
                '<td>' +
                '<div class="btn-group">'+
                ' <a id="'+(item.id)+'" class="btn btn-xs btn-default del" href="#" title="删除"data-toggle="tooltip"><i class="mdi mdi-delete"></i></a>'+
                '</div>'+
                '</td>'+
                '   </tr>'
        })
        //覆盖
        $('.user-wrap').html(html)
    }

    $(".del").click(function (e) {
        var id= e.currentTarget.id
        console.log(id)
        $.ajax({
            url:"/user/deleteUser",
            type:"post",
            cache:false,
            async:false,
            dataType:'json',
            contentType:"application/json",
            data: id,
            success:function (data){
                if (data.success){
                    getList()
                }else {
                    console.log("获取失败")
                }
            }
        })
    })
})