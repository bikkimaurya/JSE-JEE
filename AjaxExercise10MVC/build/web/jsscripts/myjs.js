/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
function validate()
{
    var success = true;
    userid = document.getElementById("uid").value;
    username = document.getElementById("uname").value;
    password = document.getElementById("pwd").value;
    if(userid === "")
    {
        var sp1 = document.getElementById("sp1");
        sp1.innerHTML="Userid Required";
        sp1.style.color="red";
        success = false;
    }
    if(username === "")
    {
        var sp2 = document.getElementById("sp2");
        sp2.innerHTML = "Username Required";
        sp2.style.color="red";
        success = false;
    }
    if(password === "")
    {
        var sp3 = document.getElementById("sp3");
        sp3.innerHTML = "Password Required";
        sp3.style.color="red";
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
        ajaxreq.open("Post" , "RegistrationController" , true);
        ajaxreq.setRequestHeader("Content-type" , "application/x-www-form-urlencoded");
        var qry = "uid=" + userid + "&uname=" + username + "&pwd=" + password;
        ajaxreq.send(qry);
    }
}

function processresponse()
{
    if(ajaxreq.readyState === 4)
    {
        sp4 = document.getElementById("sp4");
        sp4.innerHTML = ajaxreq.responseText;
    }
}