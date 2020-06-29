/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
function showDate()
{
    $("#currentdate").text("Loading...");
    setTimeout(show , 3000);
}

function show()
{
        $("#currentdate").load("getdate.jsp #time" , processResponse);
}

function processResponse(responseText , textStatus , xhr)
{
    if(textStatus === "error"){
        $("#currentdate").text("An error occured during your request:" + xhr.status);
    }
}

