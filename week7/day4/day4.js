let body = document.getElementById("bodyText");

function addText() {
  var newElement = document.createElement("p");
  newElement.textContent = "This is a new element.";
  body.appendChild(newElement);
}

function removeText() {
  body.children[1].remove();
}
