document.getElementById("nextPass").addEventListener("click", () => {
    const u = document.getElementById("usernameCAField").value;
    const f = document.getElementById("firstNameField").value;
    const l = document.getElementById("lastNameField").value;
    const e = document.getElementById("emailField").value;
    const dob = document.getElementById("dobField").value;

    if (!u || !f || !l || !e || !dob) {
        console.log("Invalid input");
        return;
    }

    console.log("Fields validated");
    window.location.href = "passwordCheck.html";
});
