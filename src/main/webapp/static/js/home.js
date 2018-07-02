/**
 * Created by chenhansen on 2018/6/30.
 */

    function getPhoneList() {
    $.ajax({
        url: "phoneList",
        type: "get",
        dataType: "JSON",
        success: function (msg) {
            console.log(msg)

            for(i in msg) {
                console.log(msg[i]);
                for(j in msg[i])
                    console.log(msg[i][j]);
            }
        }

    })
    }

    function getPhoneInfo(phone){

        return '<li class="grid-items">'+
        '<div class="figure figure-img">'+
            '<a class="exposure">'+
            '<img src="<%=request.getContextPath()%>/static/images/lunbo1.jpg" width="160" height="160" alt="">'+
            '</a>'+
            '</div>'+
            '<h3 class="title">红米6A</h3>'+
            '<p class="desc">AI人脸解锁，小巧全面屏，高性能处理</p>'+
        '<p class="price"> 599元</p>'+
        '</li>';
    }

    function appendTypeChild(parent,msg){
        var lists=$('.grid-list');
        var htm="";
        for(i in msg){
            obj=JSON.parse(data[i]);

        }

    }