/**
 * Created by rxfeng on 2016/7/2.
 */
// 排序
$('.table-sort').dataTable({
	"aaSorting" : [ [ 1, "desc" ] ],// 默认第几个排序
	"bStateSave" : true,// 状态保存
	"aoColumnDefs" : [
	// {"bVisible": false, "aTargets": [ 3 ]} //控制列的隐藏显示
	{
		"orderable" : false,
		"aTargets" : [ 0, 1, 2, 3, 4, 5 ]
	} // 不参与排序的列
	]
});

function jpms(ProductId) {
	$.ajax({
		url : 'updateSp?ProductId=' + ProductId,
		type : "get",
		dataType : "json",
		async:false,
		success : function(data) {
			// 如果ThumbnailUrl8为1，是特价产品
			if (data.ThumbnailUrl8 = "1") {
				$(this).html("删除");
				$('#tejia').html('特价');
			} else {
				$(this).html("增加");
				$('#tejia').html('非特价');
			}
		}
	});
//	replace();
//	$('#info').load();
//	console.log(new Date())
	 location.replace(location.href);

}
function replace() {
	window.location.reload();
}

// 点击操作的按钮，可能是增加，可能是删除
$('#btnJpflcz').on('click', function() {
	/*
	 * $.ajax({ url : 'updateSp?ProductId='+ProductId, type : "get", dataType :
	 * "json", success : function(data) { // 如果ThumbnailUrl8为1，是特价产品 if
	 * (data.ThumbnailUrl8 = "1") { $(this).html("删除"); $('#tejia').html('特价') }
	 * else { $(this).html("增加"); $('#tejia').html('非特价') } } });
	 */
});

// 搜商品

function aj_post() {
	var key = $("#tejiassp").val();

	$.post("querySp", {
		tejiassp : tejiassp
	}, function(result) {

		$("#a").html(result)
	});
}
