document.getElementById("loginButton").addEventListener("click", () => {
    let user = document.getElementById("usernameField").value;
    let pass = document.getElementById("passwordField").value;

    if (!user || !pass) {
        console.log("Invalid username or password");
        return;
    }

    console.log("Valid username and password");
    window.location.href = "home.html";
});

document.getElementById("createAccountButton").addEventListener("click", () => {
    console.log("Going to Create Account screen");
    window.location.href = "createAccount.html";
});
