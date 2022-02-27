<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN"
        "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <title>电商网站</title>
    <link rel="stylesheet" href="/css/reset.css"/>
    <link rel="stylesheet" href="/css/main.css"/>
    <link rel='stylesheet' href="/css/shopping.css"  type='text/css' />
    <link rel='stylesheet' href="/css/shopcart.css"  type='text/css' />
</head>

<body>
<#include "headerBar.ftl"/>
<div class="hr_17"></div>
<div class="cart">
    <div class="cart1">
        <div class="cart1-left"><img style="float: left" src="/images/bag1.png"/><span style="float: left;margin-right: 140px;margin-top: 5px">我的购物车</span></div>
    </div>
    <div id="cart-List"></div>
    <br/>
    <br/>
    <br/>
    <div class="cart7">
        <div class="cart7-left"><a href="#">商品付款></a></div>
        <div class="cart7-right" style="margin-right: 210px"></div>
    </div>
</div>
<br/>
<br/>

<#include "footer.ftl"/>

<script type="text/javascript" src="/js/jquery/jquery-1.11.0.min.js"></script>
<script type="text/javascript" src="/js/admin/logout.js"></script>
<script type="text/javascript" src="/js/admin/common.js"></script>

<script type="text/javascript" src="/js/admin/cart.js"></script>
<script type="text/javascript" src="/js/admin/main.js"></script>
<script type="text/javascript" src="/js/admin/search.js"></script>
<script src="/js/bootstrap-notify.min.js"></script>
<script type="text/javascript" src="/js/lightyear.js"></script>
<script type="text/javascript">;</script>
</body>
</html>