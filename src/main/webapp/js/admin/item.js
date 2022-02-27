$(function () {
    var id = getURLString("id");
    var name =$("#user-name").text();
    console.log(id)

    show(id)
    function show(id){
        $.ajax({
            url:"/item",
            type:"post",
            cache:false,
            async:false,
            dataType:'json',
            contentType:"application/json",
            data: id,
            success:function (data){
                if (data.success){
                    handleList(data.data)
                }else {
                    console.log("获取失败")
                }
            }
        })
    }

    function handleList(data) {
        var html='';
            html += '<div class="rightArea">\n' +
                '            <div class="des_content">\n' +
                '                <h2>'+ data.details+'</h2>\n' +
                '                <dl>\n' +
                '                    <dt>网站价</dt>\n' +
                '                    <dd><big>￥'+data.price+'</big></dd>\n' +
                '                    <dt>优惠</dt>\n' +
                '                    <dd><b class="hg_icon">换购价</b>购ipad加价优惠够配件或USB充电插座</dd>\n' +
                '                </dl>\n' +
                '                <div class="opn">\n' +
                '                    <dl>\n' +
                '                        <dt>送到</dt>\n' +
                '                        <dd><select>\n' +
                '                                <option>北京市 海淀区 五环内</option>\n' +
                '                                <option>杭州市 江干区 下沙</option>\n' +
                '                            </select><span>有货，可当日出库</span></dd>\n' +
                '                    </dl>\n' +
                '                    <dl class="des_dl1">\n' +
                '                        <dt>选择颜色</dt>\n' +
                '                        <dd><a href="#" class="active des_item">白色</a><a href="#" class="des_item">黑色</a><a href="#" class="des_item">灰色</a>\n' +
                '                        </dd>  <!--或者用button标签-->\n' +
                '                    </dl>\n' +
                '                    <dl class="des_dl2">\n' +
                '                        <dt>选择规格</dt>\n' +
                '                        <dd>\n' +
                '                            <a href="#" class="active des_item des_item_sm">WIFI 16G</a>\n' +
                '                            <a href="#" class="des_item des_item_sm">WIFI 64G</a>\n' +
                '                            <a href="#" class="des_item des_item_sm">WIFI 128G</a>\n' +
                '                            <a href="#" class="des_item des_item_sm">WIFI 256G</a>\n' +
                '                            <a href="#" class="des_item des_item_sm">WIFI 512G</a>\n' +
                '                        </dd>  <!--或者用button标签-->\n' +
                '                    </dl>\n' +
                '                    <dl class="des_dl3">\n' +
                '                        <dt>数量</dt>\n' +
                '                        <dd>\n' +
                '                            <button>-</button>\n' +
                '                            <input type="text" placeholder="1"/>\n' +
                '                            <button>+</button>\n' +
                '                            <span>限购<i>9</i>件</span>\n' +
                '                    </dl>\n' +
                '                </div>\n' +
                '                <div class="des_shop">\n' +
                '                    <a href="#" class="shop_btn"></a>\n' +
                '                    <span></span>\n' +
                '                    <a href="#" class="buy_btn"></a>\n' +
                '                </div>\n' +
                '                <p class="notes">注意：此商品可提供普通发票，不提供增值税发票。</p>\n' +
                '            </div>\n' +
                '        </div>'+
                '<div class="leftArea">\n' +
                '            <div class="description_imgs">\n' +
                '                <div class="big">\n' +
                '                    <img style="width: 300px; height: 400px" src="images/products/'+data.image+'" alt=""/>\n' +
                '                </div>\n' +
                '            </div>\n' +
                '        </div>'
        $('#detail').html(html)
    }
    $(".buy_btn").click(function () {

        var proId=id
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

    $(".shop_btn").click(function () {
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

    getEvaluateList()

    function getEvaluateList() {
        $.ajax({
            url:"/getEvaluateList",
            type:"post",
            cache:false,
            async:false,
            dataType:'json',
            contentType:"application/json",
            data: id,
            success:function (data){
                if (data.success){
                    handleList2(data.data)
                }else {
                    console.log("获取失败")
                }
            }
        })
    }

    function handleList2(data) {
        var html='';
        data.map(function (item,index) {
            html += '<div class="user_head fl"style="margin-top: 30px">\n' +
                '                <img src="images/user.gif"/>\n' +
                '                <p style="margin-left: 5px">'+item.username+'</p>\n' +
                '                <span style="margin-left: -30px">'+ item.time+'</span>\n' +
                '    </div>\n' +
                '            <div class="view_cont">\n' +
                '                <ul class="starsBox">\n' +
                '                    <li style="margin-top: 20px">\n' +
                '                        <p>'+item.content +'</p>'+
                '                    </li>\n' +
                '                </ul>\n' +
                '            </div>\n' +
                '    <div style="height: 100px"></div>'
        })

        $('.view_list').html(html)
    }

    getProList()
    
    function getProList() {
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
                    handleList3(data.data)
                }else {
                    console.log("获取失败")
                }
            }
        })
    }

    function handleList3(data) {
        var html='';
        data.map(function (item,index) {
            html += '<div id="'+ item.proId+'" class="item">\n' +
                '                <div class="item_cont"> \n' +
                '                    <div class="img_item">\n' +
                '                        <a style="margin-left: -20px" href="#"><img src="images/products/'+item.image +'" alt=""/></a>\n' +
                '                    </div>\n' +
                '                    <p><a href="#" style="font-size: 3px">'+item.details+'</a></p>\n' +
                '                    <p class="money">￥'+item.price+'</p>\n' +
                '                </div>\n' +
                '     </div>'
        })

        $('.tit').html(html)
    }

    $(".item").click(function (e) {
        var id = e.currentTarget.id
        window.location.href='/itemPage?id='+id
    })

})