/**
 * Created by chenhansen on 2018/7/5.
 */

$(document).ready(function(){
    var province="";
    var city="";
    var district="";
    var index=1;
    var cityPid=0;
    var districtPid=0;




    $('#address').click(function(){
        $('.address-info').show();

    })

    $('.province').click(function(){
        index=1;
        getAddressInfo(0);
    })

    $('.city').click(function(){
        if(index==3)
            return;
        index=2;
        getAddressInfo(cityPid);
    })

    $('address-items a').click(function(){
        if(index==3){
            district=$(this).val();
            $('#address').html(province+"-"+city+"-"+district);
            $('.address-info').hide();
        }
        if(index==1){
            var cityPid=$(this).attr('id');
            province=$(this).val();
            getAddressInfo(cityPid);
        }
        if(index==2){
            var districtPid=$(this).attr('id');
            city=$(this).val();
            getAddressInfo(districtPid);

        }

    })

    $('#address-submit').click(function(){
        var name=$('#name').val();
        var phone=$('#phone').val();
        var address=$('#address').val();
        var address_detail = $('#address-detail').val();
        if(name=="")
            alert("请输入收货人姓名！");
        if(phone=="")
            alert('请输入联系电话');
        if(address==""||address_detail=="")
            alert('请输入详细地址');

        $.ajax({
            url:"putAddressDetail",
            type:"post",
            data:{
                area:address,
                addressDetail:address_detail,
                phone:phone,
                receiver:name
            },
            success:function(){

            }
        })
    })




})

function getAddressInfo(addressID){
    $.ajax({
        url:"addressInfo",
        type:"get",
        dataType:"jason",
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
            '<a href="" id="'+msg.id+'" >'+msg.name+'</a>'+
            '</li >';
    }

    $('.address-list').html(htm);
}