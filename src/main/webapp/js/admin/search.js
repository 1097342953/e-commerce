$(function () {


    getSearchList(sessionStorage.getItem("proName"))
    function getSearchList(proName){
        proName=proName===""?" ":proName
        $.ajax({
            url: "/search",
            type: "post",
            cache: false,
            async: false,
            dataType: 'json',
            contentType: 'application/json',
            data: proName,
            success: function (data) {
                handleList(data.data)
                sessionStorage.removeItem(proName)
            }
        })
    }
    $("#search").click(function () {
        var proName = $("#search-box").val()
        sessionStorage.setItem("proName",proName)
        window.location.href="/searchPage"
    })


    function handleList(data) {
        var html='';
        data.map(function (item,index) {
            html += '<div id="'+item.proId+'" class="item" style="margin-left: -15px">\t\t \n' +
                    '\t\t\t <div class="item_cont">    <!--图片文字的整个左右padding值套用-->\n' +
                    '\t\t\t\t <div class="img_item">\n' +
                    '\t\t\t\t\t   <a href="#"><img src="images/products/'+ item.image+'" alt="" /></a>\n' +
                    '\t\t\t\t\t </div>\n' +
                    '\t\t\t\t\t <p style="height: 40px"><a href="#">'+item.details+'</a></p>\n' +
                    '\t\t\t\t\t <p class="money" style="margin-top: 30px;margin-left: 80px">￥'+item.price+'</p>\n' +
                    '\t\t\t\t\t <p><a id="'+item.proId+'" href="#" class="addCar" style="margin-left: 60px">加入购物车</a></p>\n' +
                    '\t\t\t </div>\n' +
                    '\t\t\t <div class="hot"></div>\t\t     \n' +
                    '\t\t </div>'
        })

        $('#search-list').html(html)

        $('#p-number').html('<span class="shop_numble">共<i>'+data.length+'</i>件商品</span>')
    }

    $(".addCar").click(function (e) {
        var id = e.currentTarget.id
        var name =$("#user-name").text()
        console.log(name)
        $.ajax({
            url:"/addCart",
            type:"post",
            cache:false,
            async:false,
            dataType:'json',
            data: {"id":id,"name":name},
            success:function (data){
                if (data.success){
                    alert("添加成功")
                }else {
                    lightyear.notify("添加失败", 'danger', 100, 'mdi mdi-emoticon-sad', 'top', 'center' );
                }
            }
        })
    })

    $(".item").click(function (e) {
        var id = e.currentTarget.id
        window.location.href='/itemPage?id='+id
    })
})