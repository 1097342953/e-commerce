<div class="headerBar">
    <div class="topBar">
        <div class="comWidth">
            <div class="leftArea">
                <a href="/main" class="collection">收藏网站</a>
            </div>
            <div class="rightArea">
                <#if Session["user"]?exists>
                   欢迎,<a href="/toOrder" id="user-name">${Session["user"].username}</a>来到购物网！
                    <a id="log-out" href="#">[退出]</a>
                <#else>
                    <a id="log-in" href="/login">[登入]</a> <a href="/register">[免费注册]</a>
                </#if>

            </div>
        </div>
    </div>
    <div class="logoBar">
        <div class="comWidth">
            <div class="logo fl">
                <a href="/main"><img src="/images/icon/logo.png" alt="购物网" style="width: 70px;height: 70px"/></a>
            </div>
            <div class="search_box fl">
                <input id="search-box" type="text" class="search_text fl"/>
                <input id="search" type="button" class="search_btn fr" value="搜 索"/>
            </div>
            <#if Session["user"]?exists>
                <div id="shopCar" class="shopCar fr" style="width: 100px">
                    <img style="height: 35px;width: 35px;display: inline-block" src="/images/cart.png" alt="购物车"/>
                    <span style="float: right;margin-right:10px ">购物车</span>
                </div>
            </#if>

        </div>
    </div>
    <div class="navBox">
        <div class="comWidth">
            <div class="shopClass fl">
                <h3>全部商品分类<i></i></h3>
                <div class="shopClass_show hide "><!--hide-->
                    <div class="shopClass_item">
                        <dl>
                            <dt><a class="b" href="#">手机</a> <a class="b" href="#">数码</a> <a class="radius"
                                                                                             href="#">合约机</a></dt>
                            <dd><a href="#">荣耀3X</a> <a href="#">单反</a> <a href="#">智能设备</a>
                            </dd>
                        </dl>
                    </div>
                    <div class="shopClass_item ">
                        <dl>
                            <dt><a class="b" href="#">电脑</a> <a class="b" href="#">硬件外设</a> <a class="radius" href="#">装机宝</a>
                            </dt>
                            <dd><a href="#">笔记本</a> <a href="#">台式机</a> <a href="#">超极本</a> <a href="#">平板</a>
                            </dd>
                        </dl>
                    </div>
                    <div class="shopClass_item">
                        <dl>
                            <dt><a class="b" href="#">大家电</a></dt>
                            <dd><a href="#">电视</a> <a href="#">空调</a> <a href="#">冰箱</a> <a href="#">洗衣机</a>
                            </dd>
                        </dl>
                    </div>
                    <div class="shopClass_item">
                        <dl>
                            <dt><a class="b" href="#">厨房电器</a> <a class="b" href="#">生活电器</a></dt>
                            <dd><a href="#">空气净化器</a> <a href="#">微波炉</a> <a href="#">取暖设备</a>
                            </dd>
                        </dl>
                    </div>
                    <div class="shopClass_item">
                        <dl>
                            <dt><a class="b" href="#">食品/饮料/生鲜</a> <a class="radius" href="#">粮油</a></dt>
                            <dd><a href="#">进口</a> <a href="#">方便面</a> <a href="#">零食</a> <a href="#">保健</a>
                            </dd>
                        </dl>
                    </div>
                </div>
                <div class="shopClass_list hide">
                    <div class="shopClass_cont">
                        <dl class="shopList_item">
                            <dt>电脑整机</dt>
                            <dd>
                                <a href="#">笔记本</a><a href="#">超极本</a><a href="#">上网本</a><a href="#">平板电脑</a><a
                                        href="#">台式机</a></dd>
                        </dl>
                        <dl class="shopList_item">
                            <dt>装机配件</dt>
                            <dd>
                                <a href="#">CPU</a><a href="#">硬盘</a><a href="#">SSD固态硬盘</a><a href="#">内存</a><a
                                        href="#">显示</a><a href="#">器智能显示器</a><a href="#">主板</a><a href="#">显卡</a><a
                                        href="#">机箱</a><a href="#">电源</a><a href="#">散热器</a><a href="#">刻录机/光驱 </a><a
                                        href="#">声卡</a><a href="#">拓展卡</a><a href="#">服务器配件</a><a href="#">DIY小附件</a><a
                                        href="#">装机/配件安装</a></dd>
                        </dl>
                        <dl class="shopList_item">
                            <dt>电脑外设</dt>
                            <dd>
                                <a href="#">鼠标</a><a href="#">键盘</a><a href="#">游戏外设</a><a href="#">移动硬盘</a><a href="#">摄像头</a><a
                                        href="#">高清播放器</a><a href="#">外置盒</a><a href="#">移动硬盘包</a><a
                                        href="#">手写板/绘图板</a></dd>
                        </dl>
                        <dl class="shopList_item">
                            <dt>网络设备</dt>
                            <dd>
                                <a href="#">路由器</a><a href="#">网卡</a><a href="#">3G无线上网</a><a href="#">交换机</a><a
                                        href="#">网络存储</a><a href="#">布线工具</a><a href="#">网络配件</a><a href="#">正版软件</a>
                            </dd>
                        </dl>
                        <dl class="shopList_item">
                            <dt>音频设备</dt>
                            <dd>
                                <a href="#">音箱</a><a href="#">耳机/耳麦</a><a href="#">麦克风</a><a href="#">声卡</a><a href="#">音频附件</a><a
                                        href="#">录音笔</a></dd>
                        </dl>
                        <div class="shopList_links">
                            <a href="#">电脑整机频道<span></span></a><a href="#">硬件/外设频道<span></span></a></div>
                    </div>
                </div>
            </div>
            <ul class="nav fl">
                <li><a href="#">数码城</a></li>
                <li><a href="#">天黑黑</a></li>
                <li><a href="#">团购</a></li>
                <li><a href="#">发现</a></li>
                <li><a href="#">二手特卖</a></li>
                <li><a href="#">名品汇</a></li>
            </ul>
        </div>
    </div>
</div>