import logo from "./logo.svg";
import "./App.css";
import { Routes, Route } from "react-router-dom";
import TodoList from "./components/todo/TodoList";
import { Pokemon } from "./components/pokemon/Pokemon";
import "bootstrap/dist/css/bootstrap.min.css";

function App() {
  return (
    <>
      <Routes>
        <Route path="/test" element={<Test />} />
        <Route path="/todo" element={<TodoList />} />
        <Route path="/pokemon" element={<Pokemon />} />
      </Routes>
    </>
  );
}

function Test() {
  return <h1>Test works</h1>;
}

export default App;
