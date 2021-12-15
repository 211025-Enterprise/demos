import { useState } from "react";
import Todo from "./Todo";
import {
  InputGroup,
  FormControl,
  Button,
  Form,
  FormGroup,
} from "react-bootstrap";

export default function TodoList() {
  // list elements -> we need some sort of state variable to manage what is in our list
  // we need a way to display list items
  // we need the ability to add and remove todos

  let tempList = ["Make breakfast", "learn axios", "fix aws (optional)"];

  let [todoList, updateTodoList] = useState(tempList);
  let [todo, updateTodo] = useState("");

  function removeTodo(todo) {
    let tempList = [...todoList];
    // search the list to find the todo and remove it
    // then pass the updated list to updateTodoList
    let index = tempList.indexOf(todo);
    if (index != -1) {
      tempList.splice(index, 1);
      updateTodoList(tempList);
    }
  }

  function handleChange(e) {
    updateTodo(e.target.value);
  }

  function addTodo(e) {
    e.preventDefault();
    updateTodoList([todo, ...todoList]);
    updateTodo("");
  }

  return (
    <>
      <h3>Todos: </h3>
      <form onSubmit={addTodo}>
        <input type="text" value={todo} onChange={handleChange} />
        <input type="submit" value="Add" />
      </form>
      <ol>
        {todoList.map((todo) => (
          <Todo todo={todo} remove={removeTodo} key={todo} />
        ))}
      </ol>
    </>
  );
}
