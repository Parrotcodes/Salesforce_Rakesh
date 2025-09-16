 const form = document.getElementById("registrationForm");

      form.addEventListener("submit", function (event) {
        event.preventDefault(); // stop form submit preventing default behaviour
        validateForm();
      });

      function validateForm() {
        let valid = true;
        const name = document.getElementById("name");

        // Name
        if (name.value.trim() === "") {
          showError(name, "Name is required"); //(input,msg)
          valid = false;
        } else {
          showSuccess(name);
        }

        // Email
        const email = document.getElementById("email");
        const emailPattern = /@/;
        if (!email.value.match(emailPattern)) {
          showError(email, "Enter a valid email");
          valid = false;
        } else {
          showSuccess(email);
        }

        // Phone 
        const phone = document.getElementById("phone");
        const phonePattern = /^[0-9]{10}$/;
        if (!phone.value.match(phonePattern)) {
          showError(phone, "Enter a valid 10-digit phone number");
          valid = false;
        } else {
          showSuccess(phone);
        }

        // Password 
        const password = document.getElementById("password");
        if (password.value.length < 6) {
          showError(password, "Password must be at least 6 characters");
          valid = false;
        } else {
          showSuccess(password);
        }

        // Confirm
        const confirm = document.getElementById("confirm");
        if (confirm.value !== password.value || confirm.value === "") {
          showError(confirm, "Passwords do not match");
          valid = false;
        } else {
          showSuccess(confirm);
        }

        if (valid) {
          window.alert("Registration Successful");
          form.reset();
          resetStyles();
        }
      }

      function showError(input, message) {
        input.classList.add("error");
        input.classList.remove("success");
        input.nextElementSibling.textContent = message;
      }

      function showSuccess(input) {
        input.classList.add("success"); //adding class from css
        input.classList.remove("error"); //removing class from css
        input.nextElementSibling.textContent = "";
      }

      function resetStyles() {
        const inputs = document.querySelectorAll("input");
        inputs.forEach(function(input){
          input.classList.remove("success", "error");
        });
 }