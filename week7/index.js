// var varObject = "String"; // function scoped variable declaration
// let letObject = "String"; // block scoped
// const constObject = "String"; // const variable block scope

// console.log(typeof letObject);
// letObject = 5;
// console.log(constObject);

// Primitive Types
// string
// number
// BigInt
// boolean
// NaN
// null
// undefined
// Symbol

// Reference Type
// object -> function, class, contructors, arrays, objects

// Truthy vs Falsy -> simply denotes what a particular value will return if evaluated with a conditional
// 8 Falsy Values in JavaScript
//      false
//      0 = +0
//      -0
//      0n -> BigInt value of 0
//      "" or '' or `` -> empty strings
//      null -> the absence of a value
//      undefined -> is a value that hasn't been defined
//      NaN -> Not a number

// Hoisting is a concept in JS that allows to use a function before its declared. The interpreter will hoist a declaration up in the execution order

someFun();

var x;

console.log(isTruthyOrFalsey(x)); //

function someFun() {
  console.log("Hello world");
}

x = 5;

// let zeroPlus = +0n;
// let zeroNegative = -0n;
// console.log(zeroPlus);
// console.log(zeroNegative);

// let object = {};

// console.log(isTruthyOrFalsey(object));

function isTruthyOrFalsey(value) {
  return value ? "truthy" : "falsy";
}

// let person = {
//   name: "Gerald",
//   age: 32,
//   eyes: 2.7,
//   wearsGlasses: true,
//   car: {
//     make: "Honda",
//     model: "Accord",
//     year: 1983,
//   },
//   fun: function () {
//     console.log("Oh hi there.");
//   },
//   funfun: function () {
//     return function () {
//       console.log("Why can I do this");
//     };
//   },
//   funInTheFun: function (anotherFun) {
//     if (typeof anotherFun != "function") {
//       return;
//     }
//     anotherFun();
//   },
// };

// let fruit = ["orange", "apple", "strawberry"];

// // Destructuring
// // Object

// let { year, make, model } = person.car;

// console.log(make);
// console.log(model);
// console.log(year);

// // Array

// let [, , anyWord] = fruit;
// console.log(anyWord);

// let apple = fruit.find((x) => x == "apple");
// console.log(apple);
// apple = fruit.findIndex((x) => x == "apple");

// console.log("apple"[4]);

// // console.log(first);
// // console.log(second);
// // console.log(anyWord);
// console.log(apple);

// fruit[3] = "banana";
// fruit.push("tomato");
// let fruitFruit = fruit.slice();
//let fruit2 = [...fruit];
// fruitFruit.unshift(fruit);
// fruit.shift();
// console.log(fruit.length);
// fruit.push(undefined);
// fruit.length = 1;
// console.log(fruit.length);
// fruit.length = 5;
// console.log(fruit);

// console.log(person.name); //Gerald
// console.log(person.car.make); //Honda
// console.log(person.wearsGlasses); //True
// person.wearsGlasses = 5; // no type safety allows us
// console.log(person.wearsGlasses); //5
// let funRef = person.fun;
// funRef(); // Oh hi there
// person.funInTheFun(person.funfun()); // why can i do this
// person.funInTheFun(5);
// function someFun() {}
// let arrowFun = () => { // this is an arrow function
//   x = 5;
//   return false;
// };
// (function () { // this is an immediately invoked function
//   let x = 5;
//   console.log("This is immediately invoked.");
// })();
// console.log(arrowFun()); //false
