import logo from "./logo.svg";
import "./App.css";
import "bootstrap/dist/css/bootstrap.min.css";
import React, { useState } from "react";
import Button from "react-bootstrap/Button";

import days from "./resource.js";

// <HelloWorld name="Dario" />  -> HelloWorld({name: "Dario"});

function App() {
  return <DaysOfTheWeek days={days} />;
}

function DaysOfTheWeek({ days }) {
  let [currentDay, updateCurrentDay] = useState("Monday");

  // useState is one of three hooks
  // let [state variable, callback function to update the state]
  //          = useState(default state value)
  // useState is a function the returns an array of two arguments
  // stateVariable and the updateFunction

  return (
    <>
      <h3>Current Day: {currentDay}</h3>
      <ul>
        {days.map((day) => (
          <Day key={day} day={day} update={updateCurrentDay} />
        ))}
      </ul>
    </>
  );
}

function Day({ day, update }) {
  return (
    <>
      <li>
        {day}{" "}
        <Button
          onClick={() => {
            update(day);
          }}
        >
          today
        </Button>
      </li>
    </>
  );
}

class ClassComponent extends React.Component {
  render() {
    return <HelloWorld name="Dario" classes="test" />;
  }
}

function logHello() {
  console.log("Hello");
}

function HelloWorld(props) {
  return (
    <>
      <h1 className={props.classes}>Hello {props.name} from React!</h1>
      <Button variant="primary" onClick={logHello}>
        Click Me
      </Button>
      <ConditionalRendering showHidden={true} />
    </>
  );
}

function Nested() {
  return <h1>Revisit component nesting</h1>;
}

function ConditionalRendering(props) {
  // if statement conditional rendering
  // if (props.showHidden) {
  //   return <h1>Yahaha! You found me!</h1>;
  // } else return <></>;

  // ternary conditional rendering
  // return props.showHidden ? <h1>Yahaha, you found me!</h1> : <></>;

  // guard operator conditional rendering
  return (props.showHidden && <h1>Yahaha, you found me!</h1>) || <h1>Hello</h1>;
}

let ArrowComponent = () => {
  return <h1>Whew...</h1>;
};

export default App;
