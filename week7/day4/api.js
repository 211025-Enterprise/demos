let url = "http://localhost:8081/api/users";

document.getElementById("getUsers").addEventListener("click", () => {
  fetchUsers();
});

let userList = document.getElementById("userList");

// Get users with the AJAX HMLHttpRequest or XHR
function getUsers() {
  let xhr = new XMLHttpRequest(); // we use this object to send requests and receive the response

  xhr.onreadystatechange = function () {
    if (this.readyState === XMLHttpRequest.DONE) {
      renderUsers(JSON.parse(xhr.responseText));
    }
  };

  xhr.open("GET", url);
  xhr.send();
}

async function fetchUsers() {
  let response = await fetch(url);

  response
    .json()
    .then((data) => {
      renderUsers(data);
    })
    .catch((exception) => {
      console.log(exception);
    });
}

async function addUser() {
  let username = document.getElementById("username").value;
  let password = document.getElementById("password").value;

  let user = { username: username, password: password };

  let response = await fetch(url, {
    method: "POST",
    headers: {
      "Content-Type": "application/json",
    },
    body: JSON.stringify(user),
  });

  response.json().then((data) => {
    console.log(data);
  });
}

function renderUsers(users) {
  while (userList.firstChild) userList.removeChild(firstChild);

  users.forEach((user) => {
    let element = document.createElement("p");
    element.textContent = user.username;
    userList.appendChild(element);
  });
}
