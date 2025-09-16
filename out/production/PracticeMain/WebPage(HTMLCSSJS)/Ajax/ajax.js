document.getElementById("button").addEventListener("click", loadText);

function loadText(){
    //console.log("clicked button");    
    let xhr = new XMLHttpRequest();

    xhr.open("GET","data.txt",true);

    console.log("ReadyState 1: ",xhr.readyState);
    
    xhr.onprogress = function(){
        console.log("ReadyState 2: ",xhr.readyState);        
    }

    //main
    xhr.onreadystatechange = function(){
       console.log("ReadyState 3: ",xhr.readyState);
        
        if(this.readyState == 4 && this.status == 200){
            console.log(this.responseText);            
        }
    }

    xhr.onerror =  function(){
        console.log("Error... ");
    }

    xhr.send();
}