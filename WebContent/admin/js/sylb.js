/**
 * Created by rxfeng on 2016/7/2.
 */
// 1、点击编辑按钮，显示编辑框
/*
 * $('#btnSylbedit').on('click', function () { $('#sylbedittk')[0].style.display =
 * "block"; });
 */
//页面加载 下拉菜单
$(function(){
	//ajax得到下拉数据
	$.ajax({
		url:"getCategories",
		type:"get",
		data:{},
		async:false,
		success:function(data){
			
			for(var i =0; i<data.length; i++){
//				$("#floorIdSelect")
				$("#floorIdSelect").append("<option value='" + data[i].CategoryId + "'>" + data[i].Name + "</option>");
				$("#selectAdd").append("<option value='" + data[i].CategoryId + "'>" + data[i].Name + "</option>");
			}
		}
	})
});


// 点击编辑里的确定按钮，关闭编辑框
$('#sylbeditqr').on('click', function() {
	$.ajax({
		url : 'sylbsave',
		type : "post",
		data : '',
		dataType : "json",
		success : function(data) {
			if (-1 > 0) {
				$('#sylbedittk')[0].style.display = "none";
				location.replace(location.href);// 刷新
			} else {
				console.log('失败');
				$('#mshsbk')[0].style.display = "block";
				// 点击失败框里的确定按钮，关闭删除框
				$('#btnsbt').on('click', function() {
					$('#mshsbk')[0].style.display = "none";
				});
			}
		}
	});
});
// 点击编辑框里的取消×按钮
$('#sylbeditdel').on('click', function() {
	$('#sylbedittk')[0].style.display = "none";
});

// 2、点击删除按钮，显示删除框
//$('#sylbdel').on('click', function() {
//	$('#sylbdeltk')[0].style.display = "block";
//});

function suredel(id){
	var conf = confirm("您确定要删除这条消息吗？");
	if(conf == true) {
		sysc(id);
        return true;
    } else {
        alert("您放弃了");
        return false;
    }
}

function sysc(id) {
	$.ajax({
		url : 'sylbdel?id=' + id,
		type : "get",
		data : {},
		success : function(data) {
			if (data.ok) {
				console.log(data.ok);
				$('#sylbdeltk')[0].style.display = "block";
				location.replace(location.href);

			} else {
				console.log(data.ok);
				$('#sylbdeltk')[0].style.display = "block";
				location.replace(location.href);

			}
		}
	})
}
$('#btnqd').on('click', function() {
	$('#sylbdeltk')[0].style.display = "none";
});

// 点击删除框里的取消×按钮
$('#btnqx').on('click', function() {
	$('#sylbdeltk')[0].style.display = "none";
});


// 点击编辑里的确定按钮，关闭编辑框

// 点击新增框里的取消×按钮
$('#sylbadd').on('click', function() {
	$('#sylbNewadd')[0].style.display = "none";

});

/* 新增 */
function article_add(title, url, id, w, h) {
	var index = layer.open({
		type : 2,
		title : title,
		area : [ '550px', '450px' ],
		content : url +"?id="+id
	});
	layer.full(index);
}
/* 编辑 */
function article_edit(title, url, id, w, h) {
	var index = layer.open({
		type : 2,
		title : title,
		area : [ '550px', '590px' ],
		content : url + "?id=" + id
	});
	 layer.full(index);
}


/**************************************************************************************/

//点击选择按钮
$('#btnSylbfindadd').on('click', function () {
    var index = parent.layer.getFrameIndex(window.name); //先得到当前iframe层的索引
    parent.layer.close(index); //再执行关闭
})
//点击下拉列表框，改变第二行内容
$('#select').on('change',function(){
//        如果为0
    if($(this).val()==0){
        $("#fenlei")[0].style.display="block";
        $("#danpin")[0].style.display="none";
        $("#huodong")[0].style.display="none";
        $("#adpv").val($("#floorIdSelect").val());
    }else if($(this).val()==1){
        $("#danpin")[0].style.display="block";
        $("#fenlei")[0].style.display="none";
        $("#huodong")[0].style.display="none";
        $("#adpv").val($("#dpv").val());
    }else{
        $("#huodong")[0].style.display="block";
        $("#fenlei")[0].style.display="none";
        $("#danpin")[0].style.display="none";
        $("#adpv").val($("#sylbljdz").val());
    }
});

function article_editfind(title,url,id,w,h){
    var index = layer.open({
        type: 2,
        title: title,
        area: ['950px', '620px'],    /*修改*/
        content: url
    });

}


/**
 * 2016-7-7 
 */

function newaddsp(){
    $('#htmsnewadd')[0].style.display = "block";
}
function btnxz(/*id*/){
    if (-1 > 0) {
        $('#htmsnewadd')[0].style.display = "none";
    } else {
        console.log('失败');
        $('#mshsbk')[0].style.display = "block";
        //    点击失败框里的确定按钮，关闭删除框
        $('#btnsbt').on('click', function () {
            $('#mshsbk')[0].style.display = "none";
        });
    }
}

/**
*2016 7 8
*/

$('#floorIdSelect').on('change',function(){
    $('#adpv').val($('#floorIdSelect').val());
});

$('#linkUrl').on('blur',function(){
    $('#adpv').val($('#linkUrl').val());
});
$('#sylbedit').on('click',function(){
	var index = parent.layer.getFrameIndex(window.name); //先得到当前iframe层的索引
	console.log(index);
	parent.layer.close(index); //再执行关闭
});
$('#sylbedit2').on('click',function(){
	$('#htmsnewadd')[0].style.display="none";
});


/**
*2016 7 11
*/

function subbtn(){
	alert(1);
}
