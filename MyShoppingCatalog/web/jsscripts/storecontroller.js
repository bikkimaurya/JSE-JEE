
function dotask(a)
{
   url="StoreControllerServlet?itemid="+a;  
            window.location=url;
}
function doTask(a)
{
    e=a;
    item=document.getElementById(a);
    temp=item.innerHTML;
    sp=item.childNodes;
    
    if(temp.indexOf("+")!=-1)
    {
        item.innerHTML="-"+a;
        mydata={itemtype:a};
    xhr=$.post("StoreControllerServlet",mydata,processresponce);
    xhr.error(handelError);
        
    }
    else
    {
        item.innerHTML="+"+a;
        item.removeChild(document.getElementById(a));
    }
    
    
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
           s=document.createElement("span");
          
           s.innerHTML=resp;
           item.appendChild(s);
       }
       
    
           