/**
 * Created by Administrator on 2016/6/30.
 */
$('#tuichu').on('click', function () {
    window.location.href="login.html";
});


function wxcLogin(){
    var username = $('.wxc-username').val();
    var password = $('.wxc-pass').val();
    if (username == "admin" && password == "admin") {
        window.location.href="./";
    } else {
        $('#dlsb')[0].style.display="block";
    }
}
$('#loginBtn').on('click',function(){
    $('#dlsb')[0].style.display="none";
})

function _b()
{
    if(event.keyCode ==13)
        wxcLogin();
}
