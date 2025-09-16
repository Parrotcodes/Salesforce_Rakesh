document.getElementById("button").addEventListener('click',LoadDummyData);
document.getElementById("user").addEventListener('click',LoadUser);
document.getElementById("users").addEventListener('click',LoadUsers);
document.getElementById("gitusers").addEventListener('click',LoadGitHubUsers);
document.getElementById("process").addEventListener('click',LoadProcess); //process


function LoadDummyData(){
    console.log("clicked...");

    let xhr = new XMLHttpRequest();

    xhr.open("GET","data.txt",true);

    xhr.onload = function(){
        console.log(xhr.responseText);
        document.getElementById ("dummydata").innerHTML = xhr.responseText;
    }

    xhr.send();
    
}

function LoadUser(){
    // console.log("clicked...");

    let xhr = new XMLHttpRequest();
    // console.log(xhr);

    // xhr.open("GET","data.txt",true); //docu.innerHTML & console.log(data)
    xhr.open("GET","user.json",true); //using onreadystatechange
    // xhr.open("GET","users.json",true); //using onload

    xhr.onreadystatechange = function(){ //using onreadystatechange
        if(this.readyState == 4 && this.status==200){
            console.log(xhr.responseText);
            // document.getElementById("data").innerHTML = xhr.responseText;   
            let user = JSON.parse(xhr.responseText);       
            document.getElementById("data").innerHTML = `
                           <div> Name: ${user.name}<br/>
                            Age: ${user.age}<br/>
                            City: ${user.city}<br/>
                            isEmployee: ${user.isEmployee}<br/>
                            <div>
                            `;
        }
    }

    xhr.send();
    
}

function LoadUsers(){
    let xhr = new XMLHttpRequest();

    xhr.open("GET","users.json",true);

    xhr.onload = function(){
        if(this.status == 200){
            console.log(xhr.responseText);
            document.getElementById("datas").innerHTML = xhr.responseText;
            let users = JSON.parse(xhr.responseText);

            let output = '';

            for(let i in users){
                output += `
                            <div> Name: ${users[i].name}<br/>
                                Age: ${users[i].age}<br/>
                                City: ${users[i].city}<br/>
                                isEmployee: ${users[i].isEmployee}<br/>
                                <div>
                                <br/><br/>
                                `;
            }

            document.getElementById("datas").innerHTML =  output;
        }
        
    }

    xhr.send();
    
}

function LoadGitHubUsers(){
    let xhr = new XMLHttpRequest();

    xhr.open("GET","https://api.github.com/users",true);

    xhr.onload = function(){
        if(this.status == 200){
            const data = JSON.parse(xhr.responseText)
            console.log(data);

            let user = '';

            for(let i in data){
                user += `
                            <div id="info">
                              <img src="${data[i].avatar_url}" style="width:100px; height:100px;"/><br/> 
                              <ul>
                                <li>Id: ${data[i].id}</li><br/>
                                <li>Name: ${data[i].login}</li><br/>
                                <li>UserType: ${data[i].type}</li><br/>
                            <ul>
                            </div>
                                <br/>
                                `;
            }

            document.getElementById("gitinfo").innerHTML = user;
        }
    }

    xhr.onerror = function(){
        document.getElementById("gitinfo").innerHTML = `<p style="color:red;">connection error..</p>`;
    }

    xhr.send();
}

function LoadProcess(){
    let xhr = new XMLHttpRequest();

    xhr.open("GET","process.php",true);

    xhr.onprogress = function(){
        console.log(this.responseText);
    }

    xhr.send();
}