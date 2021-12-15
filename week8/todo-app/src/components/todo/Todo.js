import { CloseButton } from "react-bootstrap";

function Todo({ todo, remove }) {
  return (
    <>
      <li>
        {todo} <CloseButton onClick={() => remove(todo)} />
      </li>
    </>
  );
}

export default Todo;
