$(function(){
    var cartId = 0;
    var name =$("#user-name").text();

    $("#shopCar").click(function () {
        window.location.href ='/cart';
    })

    show()

    function show(){

        $.ajax({
            url:"/cartList",
            type:"post",
            cache:false,
            async:false,
            dataType:'json',
            contentType:"application/json",
            data:name,
            success:function (data){
                if (data.success){
                    handleList(data.products)
                    cartId=data.cartId
                }else {
                    console.log("获取失败")
                }
            }
        })
    }

    function handleList(data) {
        var html='';
        var total = 0;
        data.map(function (item,index) {
            total+=item.price;
            html += '<div class="cart2">\n' +
                '        <div class="cart2-left"><img src="/images/products/'+item.image+'" width="105px" height="142px"/></div>\n' +
                '        <div class="cart2-middle">\n' +
                '            <h4><a href=""><p style="word-break: break-all;width: 500px">'+ item.details+'</p></a></h4>\n' +
                '            <p> 颜色:</p>\n' +
                '            <p> '+ item.color+'</p>  '+
                '            <div id="'+item.proId+'"  class="middle-pic">\n' +
                '                <div class="middle-pic3"><img src="/images/s_icon3.png"/></div>\n' +
                '            </div>\n' +
                '        </div>\n' +
                '        <div class="cart2-right">\n' +
                '            <p>价格：<strong>限时优惠￥'+item.price+'</strong></p>\n' +
                '            <div id="'+item.proId+'" class="pay"><a href="#" >立刻购买&gt;</a></div>\n' +
                '        </div>\n' +
                '    </div>'
        })
        $("#cart-List").html(html)

        $(".cart7-right").html('<a href=\"#\">总计：￥'+total +'</a>')

    }

    $(".pay").click(function (e) {
        var proId=e.currentTarget.id
        $.ajax({
            url:"/toPay",
            type:"post",
            cache:false,
            async:false,
            dataType:'json',
            // contentType:"application/json",
            data:{"name":name,"proId":proId},
            success:function (data){
                if (data.success){
                    alert("支付成功")
                }else {
                    console.log("获取失败")
                }
            }
        })
    })

    $(".middle-pic").click(function (e) {
        console.log("aa")
        var proId=e.currentTarget.id
        $.ajax({
            url:"/deleteCart",
            type:"post",
            cache:false,
            async:false,
            dataType:'json',
            data:{"proId":proId,"cartId":cartId},
            success:function (data){
                if (data.success){
                    show()
                    // lightyear.notify('删除成功', 'success', 100, 'mdi mdi-emoticon-happy', 'top', 'center' );
                }else {
                    lightyear.notify("删除失败", 'danger', 100, 'mdi mdi-emoticon-sad', 'top', 'center' );
                }
            }
        })
    })
})
