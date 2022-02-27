$(function () {

    getList()

    function getList() {
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
                }else {
                    console.log("获取失败")
                }
            }
        })
    }

    function handleList(data) {
        var html='';
        data.map(function (item,index) {
            html += '<div class="item" id="'+item.proId +'" >\n' +
                '      <div class="item_cont">    <!--图片文字的整个左右padding值套用-->\n' +
                '         <div class="img_item">\n' +
                '             <a href="#"><img id="itemImg" style="width: 170px;height: 170px" src="/images/products/'+(item.image) +'" alt=""/></a>\n' +
                '         </div>\n' +
                '             <p><a href="#">'+ (item.details) +'</a></p>\n' +
                '              <p class="money">￥'+ (item.price) +'</p>\n' +
                '         </div>\n' +
                '    </div>'
        })
        $('#pro').html(html)
    }

    $(".item").click(function (e) {
        var id = e.currentTarget.id
        window.location.href='/itemPage?id='+id
    })

    // $("#user-name").click()


})