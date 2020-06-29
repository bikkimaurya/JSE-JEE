
function add()
{
    $("currdate").text("loading....")
    var a=$("#fno").val()
    var b=$("#sno").val()
    $.get("sum.jsp?fistnum="+a+"&secnum="+b)
    setTimeout(Add,5000)
    $("currdate").text("load....")
}
function Add()
{
    $("currdate").text("sum is"+(a+b))
    
}
