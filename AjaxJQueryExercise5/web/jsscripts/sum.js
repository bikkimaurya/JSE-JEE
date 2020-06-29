/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
function show()
{   var x = $("#fno").val();
    var y = $("#sno").val();
    var mydata = {firstnum:x , secnum:y};
    $.ajax("sum.jsp" , {data:mydata , success:function(result){
            $("#sum").html(result);
    }})
}
