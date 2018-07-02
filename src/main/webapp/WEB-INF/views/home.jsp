<%--
  Created by IntelliJ IDEA.
  User: chenhansen
  Date: 2018/6/19
  Time: 17:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>E购网</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="<%=request.getContextPath()%>/static/css/bootstrap.min.css">
    <link rel="stylesheet" href="<%=request.getContextPath()%>/static/css/global.css">
    <link rel="stylesheet" href="<%=request.getContextPath()%>/static/css/home.css">
</head>
<body>

<div class="site-topbar">
    <div class="container">
        <div class="topbar-nav">
            <div class="nav-left">
                嗨，欢迎来到
                <span class="cr">E购网</span>
            </div>
            <a href="">网点代售</a>
            <a href="">帮助中心</a>
        </div>
        <div class="topbar-cart">
            <a href="order">我的订单</a>
            <span class="glyphicon glyphicon-shopping-cart" aria-hidden="true"></span>
            <a href="cart">购物车(<span id="header-cart-total">0</span>)</a>
        </div>
        <div class="topbar-info">
            <div class="" id="login-register">
                <a class="link" href="login?uaername=hansen" >登录</a>
                <a class="link" href="register">注册</a>
            </div>

            <div class="dropdown user-item" id="user-item">
                <a href="" class="dropdown-toggle" data-toggle="dropdown">${userName}</a>
                <span class="caret"></span>
                </button>
                <ul class="dropdown-menu" role="menu" aria-labelledby="dropdownMenu1">
                    <li role="presentation">
                        <a role="menuitem" tabindex="-1" href="#">个人中心</a>
                    </li>
                    <li role="presentation">
                        <a role="menuitem" tabindex="-1" href="#">退出登录</a>
                    </li>

                </ul>
            </div>
        </div>
    </div>
</div>
<div class="site-header">
    <div class="container container-head">
        <div class="header-logo">
            <a class="logo ir" href="home" title="E购网">
                <img class="imgstyle" src="<%=request.getContextPath()%>/static/images/logo.png"  alt="E购网">
            </a>
        </div>
        <div class="header-nav">
            <ul class="nav navbar-nav header-navbar-nav">
                <li class="nav-item"><a href="#"><span>华为</span></a></li>

                <li class="nav-item">
                    <a href="#"><span>小米</span></a>

                </li>
                <li class="nav-item">
                    <a href="#"><span>荣耀</span></a>

                </li>
                <li class="nav-item"><a href="#"><span>iphone</span></a></li>
                <li class="nav-item"><a href="#"><span>vivo</span></a></li>
                <li class="nav-item"><a href="#"><span>oppo</span></a></li>
                <li class="nav-item"><a href="#"><span>魅族MEIZU</span></a></li>
            </ul>
            <div class="site-category">
                <ul id="J_categoryList" class="site-category-list clearfix">
                    <li class="category-item">
                        <a class="title">华为
                            <span class="glyphicon glyphicon-chevron-right chevron"></span>
                        </a>
                        <div class="children clearfix children-col-2">
                            <ul class="children-list children-list-col children-list-col-1">
                                <li><a class="link" href="#"><span class="text">小米8</span></a></li>
                                <li><a class="link" href="#"><span class="text">小米7</span></a></li>
                                <li><a class="link" href="#"><span class="text">小米6</span></a></li>
                                <li><a class="link" href="#"><span class="text">小米5</span></a></li>
                                <li><a class="link" href="#"><span class="text">小米4</span></a></li>
                                <li><a class="link" href="#"><span class="text">小米3</span></a></li>
                            </ul>
                            <ul class="children-list children-list-col children-list-col-2">
                                <li><a class="link" href="#"><span class="text">小米8</span></a></li>
                                <li><a class="link" href="#"><span class="text">小米7</span></a></li>
                                <li><a class="link" href="#"><span class="text">小米6</span></a></li>
                                <li><a class="link" href="#"><span class="text">小米5</span></a></li>
                                <li><a class="link" href="#"><span class="text">小米4</span></a></li>
                                <li><a class="link" href="#"><span class="text">小米3</span></a></li>
                            </ul>
                        </div>
                    </li>
                    <li class="category-item">
                        <a class="title">小米
                            <span class="glyphicon glyphicon-chevron-right chevron"></span>
                        </a>
                        <div class="children clearfix children-col-2">
                            <ul class="children-list children-list-col children-list-col-1">
                                <li><a class="link" href="#"><span class="text">小米8</span></a></li>
                                <li><a class="link" href="#"><span class="text">小米7</span></a></li>
                                <li><a class="link" href="#"><span class="text">小米6</span></a></li>
                                <li><a class="link" href="#"><span class="text">小米5</span></a></li>
                                <li><a class="link" href="#"><span class="text">小米4</span></a></li>
                                <li><a class="link" href="#"><span class="text">小米3</span></a></li>
                            </ul>
                            <ul class="children-list children-list-col children-list-col-2">
                                <li><a class="link" href="#"><span class="text">小米8</span></a></li>
                                <li><a class="link" href="#"><span class="text">小米7</span></a></li>
                                <li><a class="link" href="#"><span class="text">小米6</span></a></li>
                                <li><a class="link" href="#"><span class="text">小米5</span></a></li>
                                <li><a class="link" href="#"><span class="text">小米4</span></a></li>
                                <li><a class="link" href="#"><span class="text">小米3</span></a></li>
                            </ul>
                        </div>

                    </li>
                    <li class="category-item">
                        <a class="title">荣耀
                            <span class="glyphicon glyphicon-chevron-right chevron"></span>
                        </a>
                        <div class="children clearfix children-col-2">
                            <ul class="children-list children-list-col children-list-col-1">
                                <li><a class="link" href="#"><span class="text">小米8</span></a></li>
                                <li><a class="link" href="#"><span class="text">小米7</span></a></li>
                                <li><a class="link" href="#"><span class="text">小米6</span></a></li>
                                <li><a class="link" href="#"><span class="text">小米5</span></a></li>
                                <li><a class="link" href="#"><span class="text">小米4</span></a></li>
                                <li><a class="link" href="#"><span class="text">小米3</span></a></li>
                            </ul>
                            <ul class="children-list children-list-col children-list-col-2">
                                <li><a class="link" href="#"><span class="text">小米8</span></a></li>
                                <li><a class="link" href="#"><span class="text">小米7</span></a></li>
                                <li><a class="link" href="#"><span class="text">小米6</span></a></li>
                                <li><a class="link" href="#"><span class="text">小米5</span></a></li>
                                <li><a class="link" href="#"><span class="text">小米4</span></a></li>
                                <li><a class="link" href="#"><span class="text">小米3</span></a></li>
                            </ul>
                        </div>
                    </li>
                    <li class="category-item">
                        <a class="title">iphone
                            <span class="glyphicon glyphicon-chevron-right chevron"></span>
                        </a>
                    </li>
                    <li class="category-item">
                        <a class="title">vivo
                            <span class="glyphicon glyphicon-chevron-right chevron"></span>
                        </a>
                    </li>
                    <li class="category-item">
                        <a class="title">oppo
                            <span class="glyphicon glyphicon-chevron-right chevron"></span>
                        </a>
                    </li>
                    <li class="category-item">
                        <a class="title">魅族MEIZU
                            <span class="glyphicon glyphicon-chevron-right chevron"></span>
                        </a>
                    </li>
                </ul>
            </div>
        </div>
        <div class="header-search">
            <form class="search-text" method="GET">
                <div class="input-group">
                    <input class="form-control phone" name="phone" id="login_phone" required placeholder="华为" maxlength="11" autocomplete="off" type="text">
                    <div class="search-icon input-group-addon">
                        <span class="glyphicon glyphicon-zoom-out" aria-hidden="true"></span>
                    </div>
                </div>
            </form>
        </div>
    </div>
</div>
<div class="home-hero-container container">
    <div id="myCarousel" class="carousel slide">
        <!-- 轮播（Carousel）指标 -->
        <ol class="carousel-indicators">
            <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
            <li data-target="#myCarousel" data-slide-to="1"></li>
            <li data-target="#myCarousel" data-slide-to="2"></li>
        </ol>
        <!-- 轮播（Carousel）项目 -->
        <div class="carousel-inner">
            <div class="item active">
                <img src="<%=request.getContextPath()%>/static/images/lunbo1.jpg" alt="First slide">
            </div>
            <div class="item">
                <img src="<%=request.getContextPath()%>/static/images/lunbo2.jpg" alt="Second slide">
            </div>
            <div class="item">
                <img class="inner-img" src="<%=request.getContextPath()%>/static/images/lunbo3.jpg" alt="Third slide">
            </div>
        </div>
        <!-- 轮播（Carousel）导航 -->
        <a class="left carousel-control chevron-left" href="#myCarousel" role="button" data-slide="prev">
            <span class="glyphicon glyphicon-chevron-left " aria-hidden="true"></span>
            <span class="sr-only">Previous</span>
        </a>
        <a class="right carousel-control" href="#myCarousel" role="button" data-slide="next">
            <span class="glyphicon glyphicon-chevron-right" aria-hidden="true"></span>
            <span class="sr-only">Next</span>
        </a>
    </div>
</div>
<div class="home-main">
    <div class="container container-home">
        <div class="phone-type huawei">
            <div class="h">
                <h2 class="title">华为</h2>
            </div>
            <div class="b">
                <div class="goods-list">
                    <ul class="grid-list clearfix">
                        <li class="grid-items">
                            <div class="figure figure-img">
                                <a class="exposure">
                                    <img src="<%=request.getContextPath()%>/static/images/lunbo1.jpg" width="160" height="160" alt="">
                                </a>
                            </div>
                            <h3 class="title">红米6A</h3>
                            <p class="desc">AI人脸解锁，小巧全面屏，高性能处理</p>
                            <p class="price"> 599元</p>
                        </li>
                        <li class="grid-items">
                            <div class="figure figure-img">
                                <a class="exposure">
                                    <img src="<%=request.getContextPath()%>/static/images/lunbo1.jpg" width="160" height="160" alt="">
                                </a>
                            </div>
                            <h3 class="title">红米6A</h3>
                            <p class="desc">AI人脸解锁，小巧全面屏，高性能处理</p>
                            <p class="price"> 599元</p>
                        </li>
                        <li class="grid-items">
                            <div class="figure figure-img">
                                <a class="exposure">
                                    <img src="<%=request.getContextPath()%>/static/images/lunbo1.jpg" width="160" height="160" alt="">
                                </a>
                            </div>
                            <h3 class="title">红米6A</h3>
                            <p class="desc">AI人脸解锁，小巧全面屏，高性能处理</p>
                            <p class="price"> 599元</p>
                        </li>
                        <li class="grid-items">
                            <div class="figure figure-img">
                                <a class="exposure">
                                    <img src="<%=request.getContextPath()%>/static/images/lunbo1.jpg" width="160" height="160" alt="">
                                </a>
                            </div>
                            <h3 class="title">红米6A</h3>
                            <p class="desc">AI人脸解锁，小巧全面屏，高性能处理</p>
                            <p class="price"> 599元</p>
                        </li>
                        <li class="grid-items">
                            <div class="figure figure-img">
                                <a class="exposure">
                                    <img src="<%=request.getContextPath()%>/static/images/lunbo1.jpg" width="160" height="160" alt="">
                                </a>
                            </div>
                            <h3 class="title">红米6A</h3>
                            <p class="desc">AI人脸解锁，小巧全面屏，高性能处理</p>
                            <p class="price"> 599元</p>
                        </li>
                        <li class="grid-items">
                            <div class="figure figure-img">
                                <a class="exposure">
                                    <img src="<%=request.getContextPath()%>/static/images/lunbo1.jpg" width="160" height="160" alt="">
                                </a>
                            </div>
                            <h3 class="title">红米6A</h3>
                            <p class="desc">AI人脸解锁，小巧全面屏，高性能处理</p>
                            <p class="price"> 599元</p>
                        </li>
                        <li class="grid-items">
                            <div class="figure figure-img">
                                <a class="exposure">
                                    <img src="<%=request.getContextPath()%>/static/images/lunbo1.jpg" width="160" height="160" alt="">
                                </a>
                            </div>
                            <h3 class="title">红米6A</h3>
                            <p class="desc">AI人脸解锁，小巧全面屏，高性能处理</p>
                            <p class="price"> 599元</p>
                        </li>
                        <li class="grid-items">
                            <div class="figure figure-img">
                                <a class="exposure">
                                    <img src="<%=request.getContextPath()%>/static/images/lunbo1.jpg" width="160" height="160" alt="">
                                </a>
                            </div>
                            <h3 class="title">红米6A</h3>
                            <p class="desc">AI人脸解锁，小巧全面屏，高性能处理</p>
                            <p class="price"> 599元</p>
                        </li>
                        <li class="grid-items">
                            <div class="figure figure-img">
                                <a class="exposure">
                                    <img src="<%=request.getContextPath()%>/static/images/lunbo1.jpg" width="160" height="160" alt="">
                                </a>
                            </div>
                            <h3 class="title">红米6A</h3>
                            <p class="desc">AI人脸解锁，小巧全面屏，高性能处理</p>
                            <p class="price"> 599元</p>
                        </li>
                        <li class="grid-items">
                            <div class="figure figure-img">
                                <a class="exposure">
                                    <img src="<%=request.getContextPath()%>/static/images/lunbo1.jpg" width="160" height="160" alt="">
                                </a>
                            </div>
                            <h3 class="title">红米6A</h3>
                            <p class="desc">AI人脸解锁，小巧全面屏，高性能处理</p>
                            <p class="price"> 599元</p>
                        </li>
                        <li class="grid-items">
                            <div class="figure figure-img">
                                <a class="exposure">
                                    <img src="<%=request.getContextPath()%>/static/images/lunbo1.jpg" width="160" height="160" alt="">
                                </a>
                            </div>
                            <h3 class="title">红米6A</h3>
                            <p class="desc">AI人脸解锁，小巧全面屏，高性能处理</p>
                            <p class="price"> 599元</p>
                        </li>
                    </ul>
                </div>
            </div>
        </div>
        <div class="phone-type xiaomi">
            <div class="h">
                <h2 class="title">小米</h2>
            </div>
            <div class="b"></div>
        </div>
    </div>

</div>

<script src="<%=request.getContextPath()%>/static/js/jquery-3.1.1.min.js"></script>
<script src="<%=request.getContextPath()%>/static/js/bootstrap.min.js"></script>
<script>
    $(document).ready(function () {
        var p = '<%=request.getAttribute("username")%>';
        console.log("hansen" + p);
        if(p=="null") {
            $('#login-register').show();
        }
        else {
            $('#user-item').show();
        }

        getPhoneList();
    })

</script>
</body>
</html>
