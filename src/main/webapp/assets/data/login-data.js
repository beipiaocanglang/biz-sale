$(function () {
    logindata();
});

function logindata() {
    $("#loginbtn").click(function () {
        var username = $("#loginuser input").val();
        var passworld = $("#loginpass input").val();


        if(username == "" || username == undefined || username == null) {
            return false
        }
        if(passworld == "" || passworld == undefined || passworld == null) {
            return false
        }
        $.ajax({
            type: 'GET',
            url: 'api/user/login/'+username+'/'+passworld,
            cache: false,
            dataType: 'json',
            success: function (datas) {
                if (datas.success == true) {
                    location.href = 'index.html';
                } else {
                    console.log(datas.errMsg);
                }
            }
        });
    })
}