$(function () {

    var name =$("#user-name").text();
    getOrder()

    function getOrder() {
        $.ajax({
            url: "/orderList",
            type: "post",
            cache: false,
            async: false,
            dataType: 'json',
            contentType: "application/json",
            data: name,
            success: function (data) {
                if (data.success) {
                    handleList(data.data);
                } else {
                    console.log("获取失败")
                }
            }
        })
    }

    function handleList(data) {
        var html='';
        data.map(function (item,index) {
            html += '<tr>\n' +
                '          <td>'+ item.orderId+'</td>\n' +
                '          <td><img style="height: 170px;width: 170px" src="/images/products/'+item.image+'"/></td>\n' +
                '          <td style=" padding-left: 25px">'+item.pronName+'</td>\n' +
                '          <td style=" padding-left: 10px"> ￥'+item.price+'</td>\n' +
                '          <td>'+item.time+'</td>\n' +
                '          <td><button class="back" id="'+item.orderId+'" style="margin-left: 7px">退单</button></td>'+
                '    </tr>'
        })
        $(".order-wrap").html(html)
    }

    $(".back").click(function (e) {
        var orderId = e.currentTarget.id
        $.ajax({
            url: "/deleteOrder",
            type: "post",
            cache: false,
            async: false,
            dataType: 'json',
            contentType: "application/json",
            data: orderId,
            success: function (data) {
                if (data.success) {
                    getOrder()
                } else {
                    console.log("获取失败")
                }
            }
        })
    })




})
