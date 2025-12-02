document.getElementById("backToCA").addEventListener("click", () => {
    window.location.href = "createAccount.html";
});

document.getElementById("makeAccount").addEventListener("click", () => {
    let p = document.getElementById("passwordCAField").value;
    let r = document.getElementById("retypeField").value;

    if (!p || !r || p !== r) {
        console.log("Invalid password");
        return;
    }

    console.log("Account created!");
    window.location.href = "home.html";
});
