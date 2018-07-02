/**
 * Created by chenhansen on 2018/6/30.
 */

    function getPhoneList() {
        $.ajax({
            url: "phoneList",
            type: "get",
            dataType: "json",
            success: function (msg) {
                alert("home");
                console.log(msg);
            }

        })
    }
