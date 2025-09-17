 const form = document.getElementById("registrationForm");

      form.addEventListener("submit", event=> {
        event.preventDefault(); // stop form submit preventing default behaviour
        validateForm();
      });

     const validateForm = () =>{
        //collecting all inputs
        const inputs = [...document.querySelectorAll('input')]; //spread
        const [name,email,phone,password,confirm] = inputs; //destruct
        // const name = document.getElementById("name");

        // Name
        name.value.trim() === "" ? showError(name, "Name is required"):showSuccess(name); //(input,msg)
    

        // Email
        // const email = document.getElementById("email");
        const emailPattern = /@/;
        !email.value.match(emailPattern) ? showError(email, "Enter a valid email") : showSuccess(email);

        // Phone 
        // const phone = document.getElementById("phone");
        const phonePattern = /^[0-9]{10}$/;
        !phone.value.match(phonePattern)
            ? showError(phone, "Enter a valid 10-digit phone number")
            : showSuccess(phone);

        // Password 
        // const password = document.getElementById("password");
        password.value.length < 6 ?
          showError(password, "Password must be at least 6 characters")
         :
          showSuccess(password);
        

        // Confirm
        // const confirm = document.getElementById("confirm");
      confirm.value !== password.value || confirm.value === "" ?
          showError(confirm, "Passwords do not match")
        :
          showSuccess(confirm);


      if ([name, email, phone, password, confirm].every((input) => input.classList.contains("success"))) {
          alert(`Registration Successful ✅ Welcome, Mr/Mrs. ${name.value}`);
          form.reset();
          resetStyles();
        }
      }

      const showError = (input, message) =>{
        input.classList.add("error");
        input.classList.remove("success");
        input.nextElementSibling.textContent = message;
      }

      const showSuccess = input => {
        input.classList.add("success"); //adding class from css
        input.classList.remove("error"); //removing class from css
        input.nextElementSibling.textContent = "";
      }

      const resetStyles = () =>{
        const inputs = document.querySelectorAll("input");
        inputs.forEach(function(input){
          input.classList.remove("success", "error");
        });
      }