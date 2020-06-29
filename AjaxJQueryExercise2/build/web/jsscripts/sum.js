/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
function show()
{   var x = $("#fno").val();
    var y = $("#sno").val();
    var data = {firstnum:x , secnum:y};
    var jqxhr = $.get("sum.jsp" , data , processResponse);
    jqxhr.error(handle);
}
function processResponse(responseText , textStatus , xhr)
{
        $("#esal").html(responseText);
}
function handle(xhr)
{
    $("#esal").text("An error occured during your request:" + xhr.status + "...." + "xhr.statusText");
}