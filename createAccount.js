// Back button: return to login page
document.getElementById("loginButton").addEventListener("click", () => {
    window.location.href = "login.html";
});

// Next button: validate fields and go to set password page
document.getElementById("passwordCheck").addEventListener("click", () => {
    // Get input values
    const firstName = document.getElementById("firstNameField").value.trim();
    const lastName = document.getElementById("lastNameField").value.trim();
    const email = document.getElementById("emailField").value.trim();
    const birthdate = document.getElementById("birthdateField").value;
    const username = document.getElementById("usernameField").value.trim();

    // Basic validation
    if (!firstName || !lastName || !email || !birthdate || !username) {
        alert("Please fill out all fields");
        return;
    }

    // Save user info temporarily (optional)
    const newUser = { firstName, lastName, email, birthdate, username };
    localStorage.setItem("newUser", JSON.stringify(newUser));

    // Navigate to Set Password page
    window.location.href = "passwordCheck.html";
});

