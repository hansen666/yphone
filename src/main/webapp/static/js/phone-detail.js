/**
 * Created by chenhansen on 2018/7/3.
 */

$(document).ready(function(){

    $('#pro-quantity-plus').click(function(){
        var val=$('#product-stock-text').val();
        val++;
        $('#product-stock-text').val(val);
    });
    $('#pro-quantity-minus').click(function(){
        var val=$('#product-stock-text').val();
        if(val<=1)
            return;
        val--;
        $('#product-stock-text').val(val);
    });
})
