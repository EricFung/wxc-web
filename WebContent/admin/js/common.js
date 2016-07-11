/**
 * Created by rxfeng on 2016/6/30.
 */
/*资讯-添加*/
function article_add(title,url,w,h){
    var index = layer.open({
        type: 2,
        title: title,
        content: url
    });
    layer.full(index);
}
/*资讯-编辑*/
function article_edit(title,url,id,w,h){
    var index = layer.open({
        type: 2,
        title: title,
        area: ['500px', '300px'],
        content: url+"?id="+id
    });
    //layer.full(index);
}
/*资讯-编辑1*/
function article_edit1(title,url,id,w,h){
    var index = layer.open({
        type: 2,
        title: title,
        area: ['500px', '400px'],
        content: url+"?id="+id
    });
//  layer.full(index);
}
/*资讯-删除*/
function article_del(obj,id){
    layer.confirm('确认要删除吗？',function(index){
        $(obj).parents("tr").remove();
        layer.msg('已删除!',1);
    });
}

