/**
 * Created by rxfeng on 2016/7/2.
 */
//定义全局变量
var tempa;

/*//editform 提交
function mshteditSubmit(){
	var dt = $('#editform1').serialize();
	$.ajax({
		url:'mshtsave',
		type:'POST',
		data:$('#editform1').serialize(),
		dataType:"json",
		contentType:"multipart/form-data",
		success:function(data){
			console.log(data);
			if(data.ok){
				window.location.href = "msht.html";
			}
		
		}
	})
}*/

//1、编辑按钮
//    点击编辑里的确定按钮，关闭编辑框
/*function mshtedit(id){
         $.ajax({
           url :'tejiapush',
           type: "POST",
           data:$('#myform1').serialize(),
           dataType:"json",
           success: function(data) {
        	   if (data.ok==true) {
        		   console.log('提交成功'+data);
        		   var index = parent.layer.getFrameIndex(window.name); //先得到当前iframe层的索引
        		   parent.layer.close(index); //再执行关闭
        	   } else {
        		   console.log('提交失败');
        		   $('#mshsbk')[0].style.display = "block";
        		   $('#btnsbt').on('click', function () {
        			   $('#mshsbk')[0].style.display = "none";
        		   });
        		   var index = parent.layer.getFrameIndex(window.name); //先得到当前iframe层的索引
       				parent.layer.close(index); //再执行关闭
        	   }
           }
         	
      });
}*/


//	2、删除
//    点击删除按钮，显示删除框

//    点击删除框里的确定按钮，关闭删除框


function mshteditbtn(){
	index = parent.layer.getFrameIndex(window.name); //先得到当前iframe层的索引
	parent.layer.close(index); //再执行关闭
}
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
				//$('#mshtdel')[0].style.display = "none";
				//$('#mshsbk')[0].style.display = "block";
				// 点击失败框里的确定按钮，关闭删除框
				//$('#btnsbt').on('click', function() {
				//	$('#mshsbk')[0].style.display = "none";
				//});
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


//  搜完商品后点增加
/*$('#btnMshtadd').on('click', function () {
         $.ajax({
          url :'sylbdel?id=',
          type: "get",
          data:'',
          dataType:"json",
          success: function(data) {
            if (-1 > 0) {
                //添加到页面上
            } else {
                console.log('失败');
                //失败弹出框
                $('#mshsbk')[0].style.display = "block";
                //    点击失败框里的确定按钮，关闭删除框
                $('#btnsbt').on('click', function () {
                    $('#mshsbk')[0].style.display = "none";
                });
            }
          }
        });
});*/




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
		type:"POST",
		data:{},
		success:function(data){
			for(var i =0; i<data.length; i++){
				$("#floorIdSelect").append("<option value='" + data[i].CategoryId + "'>" + data[i].Name + "</option>");
			}
		}
	})
});