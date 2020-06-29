function doTask()
{
    var ans=dovalidate()
    
    if (ans==false)
    {
        return;
    }
    usertype=$("#usertype").val();
    var mydata = {username:username , password:password,usertype:usertype};
    xhr=$.post("LoginControllerServlet",mydata,processresponce);
    xhr.error(handelError);
}
function handelError()
{
    
    $("#result").text("Some error occured in servlet.");
      
                $("#result").css("font-size","10px");
     
                $("#result").css("color","red");
    
}




    
    function processresponce(responceText,TextStatus,xhr)
        {
           resp=responceText;
           resp=resp.trim();
           
           
           
            if(resp=="Error")
            {
                $("#result").text("username or password is incorrect.");
      
                $("#result").css("font-size","10px");
     
                $("#result").css("color","red");
     
                $("#result").fadeOut(4000);
            }
            else if(resp.indexOf("jsessionid")!=-1)
            {
                console.log(result);
                url=resp;
                $("#result").text("username varified.");
      
                $("#result").css("font-size","10px");
     
                $("#result").css("color","blue");
                setTimeout(redirect,300);
                
                
            }
            else
            {
                 $("#result").text("Some error occured.");
      
                $("#result").css("font-size","10px");
     
                $("#result").css("color","red");
     
                $("#result").fadeOut(8000);
            }
            
            
        }

function redirect()
{
    
  window.location=url;
}
function dovalidate()
{
    
    username=$("#username").val();  
    password=$("#password").val();
    
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
    return status;
}

