/**
 * Created by chenhansen on 2018/6/30.
 */

    function getPhoneList() {
    $.ajax({
        url: "phoneList",
        type: "get",
        dataType: "JSON",
        success: function (msg) {
            var htm="";
            var huawei_lists=$('#huawei');
            for (j in msg['华为']) {
                var phone_detail = msg['华为'][j];
                htm += getPhoneInfo(phone_detail);
            }
            huawei_lists.html(htm);
            console.log(msg['华为']);

            var xiaomi_lists=$('#xiaomi');
            htm="";
            for (j in msg['小米']) {
                var phone_detail = msg['小米'][j];
                htm += getPhoneInfo(phone_detail);
            }
            xiaomi_lists.html(htm);
            //console.log(htm)
        }

    })
    }

    function getPhoneInfo(phone){

        return '<li class="grid-items">'+
        '<div class="figure figure-img">'+
            '<a class="exposure" href="phone_detail?pid='+phone.phoneId+'">'+
            '<img src="/yphone'+phone.url+'" width="160" height="160" alt="">'+
            '</a>'+
            '</div>'+
            '<h3 class="title">'+phone.name+'</h3>'+
            '<p class="desc">'+phone.description+'</p>'+
        '<p class="price">'+phone.price+ '元</p>'+
        '</li>';
    }

