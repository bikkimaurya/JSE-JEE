/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
function validate()
{
    var success = true;
    userid = document.getElementById("uid").value;
    password = document.getElementById("pwd").value;
    if(userid === "")
    {
        var sp1 = document.getElementById("sp1");
        sp1.innerHTML="Userid Required";
        sp1.style.color="red";
        success = false;
    }
    if(password === "")
    {
        var sp2 = document.getElementById("sp2");
        sp2.innerHTML = "Password Required";
        sp2.style.color="red";
        success = false;
    }
    return success;
}

function connect()
{
    if(validate())
    {
        ajaxreq = new XMLHttpRequest();
        ajaxreq.onreadystatechange = processresponse;
        ajaxreq.open("Post" , "LoginController" , true);
        ajaxreq.setRequestHeader("Content-type" , "application/x-www-form-urlencoded");
        var qry = "uid=" + userid + "&pwd=" + password;
        ajaxreq.send(qry);
    }
}

function processresponse()
{
    if(ajaxreq.readyState === 4)
    {
        sp3 = document.getElementById("sp3");
        sp3.innerHTML = ajaxreq.responseText;
    }
}