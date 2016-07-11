/**
 * Created by rxfeng on 2016/7/2.
 */
    //  排序
$('.table-sort').dataTable({
    "aaSorting": [[1, "desc"]],//默认第几个排序
    "bStateSave": true,//状态保存
    "aoColumnDefs": [
//    {"bVisible": false, "aTargets": [ 3 ]} //控制列的隐藏显示
        {"orderable": false, "aTargets": [0, 1, 2, 3, 4, 5]}// 不参与排序的列
    ]
});

//    1、点击编辑按钮，显示编辑框
$('#btnSylbedit').on('click', function () {
    $('#sylbedittk')[0].style.display = "block";
});
//    点击编辑里的确定按钮，关闭编辑框
$('#sylbeditqr').on('click', function () {
          $.ajax({
            url :'sylbedit?id=######',
            type: "get",
            data:'',
            dataType:"json",
            success: function(data) {
            	if (-1 > 0) {
            		$('#sylbedittk')[0].style.display = "none";
            		location.replace(location.href);//刷新
            	} else {
            		console.log('失败');
            		$('#mshsbk')[0].style.display = "block";
        //    点击失败框里的确定按钮，关闭删除框
            		$('#btnsbt').on('click', function () {
            			$('#mshsbk')[0].style.display = "none";
            		});
            	}
            }
       });
});
//    点击编辑框里的取消×按钮
$('#sylbeditdel').on('click', function () {
    $('#sylbedittk')[0].style.display = "none";
});

//    2、点击删除按钮，显示删除框
$('#sylbdel').on('click', function () {
    $('#sylbdeltk')[0].style.display = "block";
});
//    点击删除框里的确定按钮，关闭删除框
$('#btnqd').on('click', function () {
//          $.ajax({
//            url :'admin/sylbdel?id=######',
//            type: "get",
//            data:'',
//            dataType:"json",
//            success: function(data.ok) {
    if (-1>0) {
        $('#sylbdeltk')[0].style.display = "none";
        //刷新
        location.replace(location.href);
    } else {
        console.log('失败');
        $('#sylbdeltk')[0].style.display = "none";
        $('#mshsbk')[0].style.display = "block";
        //    点击失败框里的确定按钮，关闭删除框
        $('#btnsbt').on('click', function () {
            $('#mshsbk')[0].style.display = "none";
        });
    }

//            }
//        });
});
//    点击删除框里的取消×按钮
$('#btnqx').on('click', function () {
    $('#sylbdeltk')[0].style.display = "none";
});

//   3、 点击新增图片按钮，显示新增框
//$('#newimg').on('click', function () {
//    $('#sylbNewadd')[0].style.display = "block";
//});
//    点击编辑里的确定按钮，关闭编辑框
$('#newadd').on('click', function () {
//          $.ajax({
//            url :'admin/sylbdel?id=######',
//            type: "get",
//            data:'',
//            dataType:"json",
//            success: function(data) {
            if (-1 > 0) {
                $('#sylbNewadd')[0].style.display = "none";
                location.replace(location.href);    //刷新
            } else {
                console.log('失败');
                $('#mshsbk')[0].style.display = "block";
                //    点击失败框里的确定按钮，关闭删除框
                $('#btnsbt').on('click', function () {
                    $('#mshsbk')[0].style.display = "none";
                });
            }
//            }
//        });
});
//    点击新增框里的取消×按钮
$('#sylbadd').on('click', function () {
    $('#sylbNewadd')[0].style.display = "none";
});

/*新增*/
function article_add(title,url,id,w,h){
    var index = layer.open({
        type: 2,
        title: title,
        area: ['550px', '600px'],
        content: url+"?id="+id
    });
    //layer.full(index);
}
/*编辑*/
function article_edit(title,url,id,w,h){
    var index = layer.open({
        type: 2,
        title: title,
        area: ['550px', '650px'],
        content: url+"?id="+id
    });
    //layer.full(index);
}
