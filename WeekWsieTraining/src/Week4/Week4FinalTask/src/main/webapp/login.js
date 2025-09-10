/**
 * 
 */
function showPassword(){
	let password = document.getElementById("password");
	password.type = password.type==="password"?"text":"password";
}


function onUserSubmit(e){
	e.preventDefault();
	
	let username = document.getElementById("username").value.trim();
	let password = document.getElementById("password").value.trim();
	
	if(username=="" || password==""){
		document.getElementById("message").innerHTML =
		                    "<span style='color:red;'>Username and Password cannot be blank!</span>";
		                return;
	}
	
	let xhr = new XMLHttpRequest();
	
	xhr.open("POST","LoginServlet",true);	
	xhr.setRequestHeader("Content-Type", "application/x-www-form-urlencoded");

	
	xhr.onreadystatechange = function(){
		if(xhr.readyState == 4 && xhr.status == 200){ //readyState codes 0-4
			//console.log(xhr.responseText);
			let response = JSON.parse(xhr.responseText);
			
			if(response.status == "success"){ // response HTTP status codes based on state 
				document.getElementById("message").innerHTML = "<span style='color:green;'>Login Successful! Redirecting...</span>";
								
				setTimeout(()=>{
					window.location.href = "index.jsp";
				},1000)
				
			}else{
				document.getElementById("message").innerHTML = "<span style='color:red;'>" + response.message + "</span>";
			}
				
		}
	}
	
	
	xhr.send("username=" + encodeURIComponent(username) + "&password=" + encodeURIComponent(password));
	
}
