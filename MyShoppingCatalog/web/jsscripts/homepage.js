function doTask()
{
    var ans=dovalidate()
    if (ans==false)
    {
        return;
    }
    if(isRegChecked==true)
        window.location="registration.html"
    else if(isLogChecked==true)
        window.location="Login.html"

}


function dovalidate()
{
    
    isRegChecked=$("#rbtnReg").is(':checked');
    isLogChecked=$("#rbtnLog").is(':checked')
    var status=true;
    if(isRegChecked==false && isLogChecked==false)
    {
      $("#result").text("plase select an option first");
      $("#result").css("font-weight","bold");
      $("#result").css("color","red");
      $("#result").fadeOut(4000);
      status=false;
 
    }
    return status;
}

