import { useState } from "react";
import Todo from "./Todo";

export default function TodoList() {
  // list elements -> we need some sort of state variable to manage what is in our list
  // we need a way to display list items
  // we need the ability to add and remove todos

  let tempList = ["Make breakfast", "learn axios", "fix aws (optional)"];

  let [todoList, updateTodoList] = useState(tempList);

  function removeTodo(todo) {
    let tempList = todoList;
    // search the list to find the todo and remove it
    // then pass the updated list to updateTodoList
    let index = tempList.indexOf(todo);
    if (index != -1) {
      tempList.splice(index, 1);
      console.log(tempList);
      updateTodoList(tempList);
      console.log(todoList);
    }
  }

  return (
    <>
      <h3>Todos: </h3>
      <ol>
        {todoList.map((todo) => (
          <Todo todo={todo} remove={removeTodo} />
        ))}
      </ol>
    </>
  );
}
