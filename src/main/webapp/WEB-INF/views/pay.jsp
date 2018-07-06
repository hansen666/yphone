<%--
  Created by IntelliJ IDEA.
  User: chenhansen
  Date: 2018/7/5
  Time: 21:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>

<head>
    <title>Bootstrap 实例</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="<%=request.getContextPath()%>/static/css/bootstrap.min.css">
    <link rel="stylesheet" href="<%=request.getContextPath()%>/static/css/global.css">
    <link rel="stylesheet" href="<%=request.getContextPath()%>/static/css/pay.css">

</head>

<body>

<div class="header order-herader container">
    <div class="left">
        <div class="logo">
            <a href="home">
                <img class="imgstyle" src="<%=request.getContextPath()%>/static/images/logo.png" alt="E购网">
            </a>
            <span class="text">确认订单</span>
        </div>

    </div>

</div>

<div class="mainBody clearfix">
    <div class="hr2"></div>
    <div class="order-logo left">
        <img class="imgstyle" src="<%=request.getContextPath()%>/static/images/success_icon.png">
    </div>
    <div class="order-info  left">
        <div class="order_info_word01 clearfix">
            <h4>订单提交成功，只差付款了</h4>
            <div class="orderNum left">
                <span class="msg_orderNum">订单号：</span>
                <span  style="color:#da3232;">12344</span>
            </div>

            <div class="payNum right">
                <span class="payNumAll right">￥1200元</span>
                <span class="payTitle right">应付总额:</span>
            </div>
        </div>
        <h5 class="order_info_word02 clearfix">
                <span>请您在
                    <em class="time">30分钟</em>内完成支付，否则订单将自动取消</span>
            <div class="order_detail_nav right">
                <a data-toggle="collapse" data-parent="accordion" href="#orderDetails">订单详情</a>
                <span class="glyphicon glyphicon-chevron-down"></span>
            </div>
            <div id="orderDetails" class="panel-collapse collapse">
                <div class="panel-body">
                    <ul class="nav nav-pills nav-stacked">
                    <li>
                        订单编号： ${order.orderId}
                    </li>
                    <li>
                        收货信息：${order.receiver}    ${order.phone}
                    </li>
                    <li>
                        商品名称：${phone_detail}
                    </li>
                    <li>
                        购买时间：$(order.gmtCreate)
                    </li>
                    </ul>
                </div>
            </div>
        </h5>



    </div>

</div>
<div class="order_platform">
    <h4>选择以下支付方式</h4>
    <hr>
    <div>
        <h5>
            支付平台
        </h5>
        <div class="pay_list">
            <ul>
                <li>
                    <a>
                        <img src="<%=request.getContextPath()%>/static/images/weixinpay0701.png">
                    </a>
                </li>
                <li>
                    <a>
                        <img src="<%=request.getContextPath()%>/static/images/payOnline_zfb.png">
                    </a>
                </li>
            </ul>
        </div>
    </div>
</div>

<script src="<%=request.getContextPath()%>/static/js/jquery-3.1.1.min.js"></script>
<script src="<%=request.getContextPath()%>/static/js/bootstrap.min.js"></script>
</body>

</html>
