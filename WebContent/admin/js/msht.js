/**
 * Created by rxfeng on 2016/7/2.
 */

function mshteditbtn(){
	index = parent.layer.getFrameIndex(window.name); //先得到当前iframe层的索引
	parent.layer.close(index); //再执行关闭
}

//定义全局变量
var tempa;
function doVar(id){
	$('#mshtdel')[0].style.display = "block";
	tempa=id;
	console.log(tempa);
}

//增加秒杀
function doDel(){
	$.ajax({
		url : 'mshtdel?mid='+tempa,
		type : "get",
		data : '',
		dataType : "json",
		success : function(data) {
			if (data.ok==false) {
				console.log('修改成功');
				location.replace(location.href); // 刷新
			} else {
				console.log('失败');
			}
		}
	    });
}


// 点击删除框里的取消×按钮
$('#btnqxMsht').on('click', function () {
    $('#mshtdel')[0].style.display = "none";
});


//    点击新增框里的取消×按钮
$('#mshtadd').on('click', function () {
    $('#htmsnewadd')[0].style.display = "none";
});



//新增
function article_add(title,url,id){
    var index = layer.open({
        type: 2,
        title: title,
        area: ['900px', '570px'],
        content: url+"?pid="+id
    });
    layer.full(index);
}

function article_add2(title,url,id){
    var index = layer.open({
        type: 2,
        title: title,
        area: ['600px', '350px'],
        content: url+"?pid="+id
    });
    layer.full(index);
}
 
/*编辑*/
function article_edit(title,url,id,w,h){
    var index = layer.open({
        type: 2,
        title: title,
        area: ['550px', '450px'],
        content: url+"?id="+id
    });
    
    layer.full(index);
}

//循环option
$(function(){
	$.ajax({
		url:"allCategories",
		type:"GET",
		data:{},
		success:function(data){
			for(var i =0; i<data.length; i++){
				$("#floorIdSelect").append("<option value='" + data[i].CategoryId + "'>" + data[i].Name + "</option>");
			}
		}
	})
});