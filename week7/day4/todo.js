let todoList = document.getElementById("todoList");

function newTodo() {
  let todoText = document.getElementById("todo").value;

  let todoElement = document.createElement("li");

  let todoPara = document.createElement("span");
  todoPara.textContent = todoText;
  todoPara.setAttribute("id", "todoText");

  let deleteButton = document.createElement("button");
  deleteButton.textContent = "Remove";
  deleteButton.className = "red";
  //   deleteButton.setAttribute("onclick", "strikeThrough(this)");
  deleteButton.addEventListener("click", function () {
    strikeThrough(this);
  });

  todoElement.appendChild(deleteButton);
  todoElement.appendChild(todoPara);

  todoList.appendChild(todoElement);
}

function removeTodo(element) {
  // element -> delete button -> parent: li
  element.parentElement.remove();
}

function strikeThrough(element) {
  element.parentElement.children[1].style.textDecoration = "line-through";
  element.setAttribute("onclick", "removeTodo(this)");
}
