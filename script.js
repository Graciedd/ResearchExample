function showPage(id) {
    document.querySelectorAll('.page').forEach(p => p.classList.remove('active'));
    document.getElementById(id).classList.add('active');
}

/* LOGIN */
function login() {
    const user = document.getElementById("loginUser").value;
    const pass = document.getElementById("loginPass").value;

    if (user === "" || pass === "") {
        alert("Invalid username or password.");
        return;
    }

    showPage("homePage");
}

/* CREATE ACCOUNT → password page */
function goToPassword() {
    const u = document.getElementById("caUser").value;
    const f = document.getElementById("caFirst").value;
    const l = document.getElementById("caLast").value;
    const e = document.getElementById("caEmail").value;
    const d = document.getElementById("caDob").value;

    if (!u || !f || !l || !e || !d) {
        alert("Please fill all fields.");
        return;
    }

    showPage("passwordPage");
}

/* Create account */
function createAccount() {
    const p = document.getElementById("caPass").value;
    const r = document.getElementById("caPass2").value;

    if (!p || !r || p !== r) {
        alert("Passwords do not match.");
        return;
    }

    showPage("homePage");
}

