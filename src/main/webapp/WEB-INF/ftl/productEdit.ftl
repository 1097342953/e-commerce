<!DOCTYPE html>
<html lang="zh">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no"/>
    <title>编辑商品</title>
    <link href="/css/bootstrap.min.css" rel="stylesheet">
    <link href="/css/materialdesignicons.min.css" rel="stylesheet">
    <link href="/css/style.min.css" rel="stylesheet">
    <link href="/css/pagination.css" rel="stylesheet">
</head>

<body>
<div class="lyear-layout-web">
    <div class="lyear-layout-container">
        <#--   头部信息  -->
        <#include "topbar.ftl" />
        <#--   侧边栏  -->
        <#include "slider.ftl"/>
        <!--页面主要内容-->
        <main class="lyear-layout-content">
            <div class="container-fluid">
                <div class="row">
                    <div class="col-lg-12">
                        <div class="card">
                            <div class="card-body">
                                <div class="row">
                                    <div class="form-group col-md-12">
                                        <label for="dep-name">商品名</label>
                                        <input type="text" class="form-control" id="pro-name" name="pro-name" value=""
                                               placeholder="请输入商品名"/>
                                    </div>
                                    <div class="form-group col-md-12">
                                        <label for="dep-address">商品价格</label>
                                        <input type="text" class="form-control" id="pro-price" name="pro-price"
                                               value="" placeholder="请输入商品价格"/>
                                    </div>
                                    <div class="form-group col-md-12">
                                        <label for="dep-address">商品描述</label>
                                        <input type="text" class="form-control" id="pro-details" name="pro-details"
                                               value="" placeholder="请输入商品描述"/>
                                    </div>
                                    <div class="form-group col-md-12">
                                        <label for="dep-address">商品颜色</label>
                                        <input type="text" class="form-control" id="pro-color" name="pro-color"
                                               value="" placeholder="请输入商品颜色"/>
                                    </div>
                                    <div class="form-group col-md-12">
                                        <label for="dep-address">商品数量</label>
                                        <input type="text" class="form-control" id="pro-quantity" name="pro-quantity"
                                               value="" placeholder="请输入商品数量"/>
                                    </div>
                                    <div class="form-group col-md-12">
                                        <label for="dep-address">商品种类</label>
                                        <input type="text" class="form-control" id="pro-kind" name="pro-kind"
                                               value="" placeholder="请输入商品种类"/>
                                    </div>
                                    <div class="form-group col-md-12">
                                        <label for="dep-address">商品品牌</label>
                                        <input type="text" class="form-control" id="pro-brand" name="pro-brand"
                                               value="" placeholder="请输入商品品牌"/>
                                    </div>
                                    <div class="form-group col-md-12">
                                        <label for="dep-address">商品图片</label>
                                        <input type="text" class="form-control" id="pro-image" name="pro-image"
                                               value="" placeholder="请输入商品图片"/>
                                    </div>
                                    <div class="form-group col-md-12">
                                        <a id="submit" type="submit" class="btn btn-primary">确定</a>
                                        <a type="button" class="btn btn-default" onclick="javascript:history.back(-1);return false;">返 回</a>
                                    </div>
                                </div>

                            </div>
                        </div>
                    </div>

                </div>

            </div>

        </main>
        <!--End 页面主要内容-->

    </div>
</div>


<script type="text/javascript" src="/js/jquery.min.js"></script>
<script type="text/javascript" src="/js/bootstrap.min.js"></script>
<script type="text/javascript" src="/js/perfect-scrollbar.min.js"></script>
<script type="text/javascript" src="/js/main.min.js"></script>
<!--消息提示-->
<script src="/js/bootstrap-notify.min.js"></script>
<script type="text/javascript" src="/js/lightyear.js"></script>
<script type="text/javascript" src="/js/admin/common.js"></script>
<script type="text/javascript" src="/js/admin/logout.js"></script>
<script type="text/javascript" src="/js/admin/productAdd.js"></script>


</body>
</html>