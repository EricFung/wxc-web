/**
 * Created by rxfeng on 2016/7/2.
 */
    //  排序
$('.table-sort').dataTable({
    "aaSorting": [[1, "desc"]],//默认第几个排序
    "bStateSave": true,//状态保存
    "aoColumnDefs": [
//            {"bVisible": false, "aTargets": [ 3 ]} //控制列的隐藏显示
        {"orderable": false, "aTargets": [0, 1, 2, 3, 4,5]}// 不参与排序的列
    ]
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

$(function(){
	//ajax得到下拉数据
	$.ajax({
		url:"getCategories",
		type:"get",
		data:{},
		success:function(data){
			for(var i =0; i<data.length; i++){
				$("#floorIdSelect").append("<option value='" + data[i].CategoryId + "'>" + data[i].Name + "</option>");
			}
		}
	})
});




function jpfl(id){
	$.ajax({
		url:'updateFl?id='+id,
		type:"get",
		dataType:"json",
		success:function(data){
			alert("操作结束");
		}
	});
	location.replace(location.href);
}

//点击操作的按钮，可能是增加，可能是删除
$('#btnJpflcz').on('click', function () {

});
