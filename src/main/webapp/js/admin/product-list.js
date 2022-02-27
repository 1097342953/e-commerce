$(function () {

    getList()

    //获取产品列表
    function getList() {
        // var name = $("#user-name").text()
        $.ajax({
            url:"/getList",
            type:"post",
            cache:false,
            async:false,
            dataType:'json',
            contentType:"application/json",
            success:function (data){
                if (data.success){
                    //将获取到的数据动态渲染
                    handleList(data.data)
                    // if(flag){
                    //     getPageInfo(data.data);
                    //     flag=false;
                    // }
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
                '       <td>'+item.proName+'</td>\n' +
                '       <td>'+item.price+'</td>\n' +
                '       <td style="width: 60px">'+item.details+'</td>\n' +
                '       <td>'+item.color+'</td>\n' +
                '       <td>'+item.quantity+'</td>\n' +
                '       <td>'+item.kind+'</td>\n' +
                '       <td>'+item.brand+'</td>\n' +
                '       <td><img src="/images/products/'+item.image+'"/></td>\n' +
                '<td>' +
                '<div class="btn-group">'+
                ' <a class="btn btn-xs btn-default" href="/products/goProductEdit?edit=true&proId='+(item.proId)+'" title="编辑" data-toggle="tooltip" ><i class="mdi mdi-pencil"></i></a>' +
                ' <a id="'+(item.proId)+'" class="btn btn-xs btn-default del" href="#" title="删除"data-toggle="tooltip"><i class="mdi mdi-delete"></i></a>'+
                '</div>'+
                '</td>'+
                '   </tr>'
        })
        //覆盖
        $('.product-wrap').html(html)
    }

    $(".del").click(function (e) {
        var id= e.currentTarget.id
        $.ajax({
            url:"/products/deletePro",
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