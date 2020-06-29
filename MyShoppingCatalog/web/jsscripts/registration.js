

function doTask()
{
    var ans=dovalidate()
    
    if (ans==false)
    {
        return;
    }
    var mydata = {username:username , password:password};
    xhr=$.post("RegistrationControllerServlet",mydata,processresponce);
    xhr.error(handelError);
}




$(document).ready(function() {

    $('#password1').blur(
        function() {
          password=$("#password").val();
    password1=$("#password1").val();
    if(password!=password1)
    {
      $("#password1span").text("both should be same.");
      $("#password1span").css("font-size","10px");
      $("#password1span").css("color","red");
      $("#password1span").fadeOut(4000);  
    }
        }
        );
    }
    );
    
    
    
//    $('#username').blur(
//        function()
//    {
//        username=$("#username").val();
//        password=null;
//    usertype=null;
//    
//        var mydata = {username:username ,mode:"true"};
//        if(username.length!=0)
//        {
//         r=$.post("RegistrationControllerServlet",mydata,username);
//     r.error(handelError);
//         }
//     
//        }
//    );
//   
//
//});

//function username(responceText,TextStatus,xhr)
//{
//  
//  alert(responceText);
//         if(responceText=="false")
//         {$("#namespan").text("username not available");
//      $("#namespan").css("font-size","10px");
//      $("#namespan").css("color","red");
//      $("#namespan").fadeOut(4000);
//             
//    }
//    
//              
//    
//}
//







function handelError()
{
    
    $("#result").text("Some error occured in servlet.");
      
                $("#result").css("font-size","10px");
     
                $("#result").css("color","red");
    
}




function processresponce(responceText,TextStatus,xhr)
      
{
    
           resp=responceText;
           alert(resp);
           
        
           
           
            if(resp==0)
            {
                $("#result").text("username already present");
      
                $("#result").css("font-size","10px");
     
                $("#result").css("color","red");
     
                $("#result").fadeOut(4000);
            }
            else if(resp==1)
            {
                console.log(result);
                url=resp;
                $("#result").text("cluldnt register pls try after sometime.");
      
                $("#result").css("font-size","10px");
     
                $("#result").css("color","blue");
                setTimeout(redirect,300);
                
                
            }
            else
            setTimeout(redirect,300);
}







function redirect()
{
    
  window.location.href="Login.html";
}









function dovalidate()
{
    
    username=$("#username").val();  
    password=$("#password").val();
    password1=$("#password1").val();
    
    var status=true;
    if(username.length==0)
    {
      $("#namespan").text("required");
      $("#namespan").css("font-size","10px");
      $("#namespan").css("color","red");
      $("#namespan").fadeOut(4000);
      status=false;
 
    }
    else if(password.length==0)
    {
      $("#passwordspan").text("required:");
      $("#passwordspan").css("font-size","10px");
      $("#passwordspan").css("color","red");
      $("#passwordspan").fadeOut(4000);
      status=false;
 
    }
    else if(password1.length==0)
    {
      $("#password1span").text("required:");
      $("#password1span").css("font-size","10px");
      $("#password1span").css("color","red");
      $("#password1span").fadeOut(4000);
      status=false;
 
    }
     else if(password1!=password1)
    {
      $("#password1span").text("both should be same.");
      $("#password1span").css("font-size","10px");
      $("#password1span").css("color","red");
      $("#password1span").fadeOut(4000);
      status=false;
 
    }
    return status;
}

