/**
 * Created by chenhansen on 2018/7/5.
 */

var province="";
var city="";
var district="";
var index=1;
var cityPid=0;
var districtPid=0;


$(document).ready(function(){

    getAddressInfo(0);
    getAddressUsed();




    $('#address').click(function(){
        $('.address-info').show();

    });

    $('.province').click(function(){
        $('.address-head .left span').css('margin-left','25px');
        index=1;
        getAddressInfo(0);
    });

    $('.city').click(function(){
        if(index==1)
            return;
        index=2;
        $('.address-head .left span').css('margin-left','80px');
        getAddressInfo(cityPid);
    });
    $('.district').click(function(){
        if(index!=3)
            return;
        $('.address-head .left span').css('margin-left','140px');
        getAddressInfo(districtPid);
    });



    $('#address-submit').click(function(){
        var name=$('#name').val();
        var phone=$('#phone').val();
        var address=$('#address').val();
        var address_detail = $('#address-detail').val();
        if(name=="") {
            alert("请输入收货人姓名！");
            return;
        }
        if(phone=="") {
            return;
            alert('请输入联系电话');
        }
        if(address==""||address_detail=="") {
            alert('请输入详细地址');
            return;
        }
        $.ajax({
            url:"saveAddress",
            type:"post",
            data:{
                area:address,
                addressDetail:address_detail,
                phone:phone,
                receiver:name
            },
            success:function(msg){
                alert("success");
                appendAddress(name,phone,address,address_detail);
                $('#myModal').modal('hide');
            }


        })
    });


    $('.address-head .right a').click(function () {
        $('.address-info').hide();
    });


    function getAddressUsed() {
        $.ajax({
            url:"showAddress",
            type:"get",
            dataType:"json",
            success:function(msg){
                for(var key in msg){
                    appendAddress(msg[key].receiver,msg[key].phone,msg[key].area,msg[key].addressDetail);
                }
            }
        })

    }

})

function getAddressInfo(addressID){
    $.ajax({
        url:"addressInfo",
        type:"get",
        dataType:"json",
        data:{
            aid:addressID
        },
        success:function(msg){
            putAddress(msg);
        }

    })
}

function putAddress(msg){
    var htm="";
    for(i in msg){
        htm+='<li class="address-items">'+
            '<a  id="'+i+'" onclick="getAddress(this)" >'+msg[i]+'</a>'+
            '</li >';
    }

    $('.address-list').html(htm);
}

function getAddress(e) {



    if(index==3){

        district=$(e).html();
        $('#address').val(province+"-"+city+"-"+district);
        $('.address-info').hide();
    }

    else if(index==1){
        cityPid=parseInt($(e).attr('id'));
        province=$(e).html();
        $('.address-head .left span').css('margin-left','80px');
        getAddressInfo(cityPid);
        index++;
    }
    else if(index==2){
        districtPid=$(e).attr('id');
        city=$(e).html();
        $('.address-head .left span').css('margin-left','140px');
        getAddressInfo(districtPid);
        index++;

    }


}




function appendAddress(name,phone,address,address_detail){
    var h='<li >'+
        '<div class="namePhone item">'+
        '<span>'+name+'  '+phone+ '</span>'+
        '</div>'+

        '<div class=" item">'+
        '<span>'+address+'  '+address_detail+ '</span>'+
        '</div>'+

        '</li>';
    $('.order-address-list ul #address-empty').before(h);
}




