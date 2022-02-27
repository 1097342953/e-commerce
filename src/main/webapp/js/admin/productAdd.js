$(function () {
    //新增产品url
    var addProductUrl = '/products/insertProduct'
    //编辑产品信息url
    var editProductUrl = '/products/editProduct'
    //查看产品信息url
    var queryProductUrl = '/products/queryProductById'
    //从url中获取pro_id
    var pro_id = getURLString('proId')
    //从url中获取edit，判断是否是编辑操作
    var is_edit = getURLString('edit')

    //查看对应id的部门信息
    if(pro_id){

        $.post(queryProductUrl,{proId : pro_id},function (data) {
            console.log(data)
            $('#pro-name').val(data.data.proName)
            $('#pro-price').val(data.data.price)
            $('#pro-details').val(data.data.details)
            $('#pro-color').val(data.data.color)
            $('#pro-quantity').val(data.data.quantity)
            $('#pro-kind').val(data.data.kind)
            $('#pro-brand').val(data.data.brand)
            $('#pro-image').val(data.data.image)
        })
    }


    //新增或者编辑部门
    $('#submit').click(function () {
        var products={}
        //如果是编辑，就要传dep_id
        if(is_edit){
            products.proId = pro_id
        }
        products.proName=$('#pro-name').val()
        products.price=$('#pro-price').val()
        products.details=$('#pro-details').val()
        products.color=$('#pro-color').val()
        products.quantity=$('#pro-quantity').val()
        products.kind=$('#pro-kind').val()
        products.brand=$('#pro-brand').val()
        products.image=$('#pro-image').val()
        var formData =new FormData();
        formData.append('productStr',JSON.stringify(products));
        $.ajax({
            url: is_edit?editProductUrl:addProductUrl,
            type:"post",
            dataType: 'json',
            data: formData,
            contentType:false,
            processData:false,
            catch:false,
            async:false,
            success: function (data) {
                if (data.success) {
                    lightyear.notify('操作成功~', 'success', 100, 'mdi mdi-emoticon-happy', 'top', 'center' );
                    window.location.href='/products/toList'
                } else {
                    lightyear.notify(data.errMsg, 'danger', 100, 'mdi mdi-emoticon-sad', 'top', 'center' );
                }
            }
        });
    })
})