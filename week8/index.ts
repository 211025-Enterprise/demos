let count: number = 5; // count should be of type number

function getNumber(): number {
  return 10;
}

function printNum(num: number): void | number {
  if (typeof num != "number") {
    return num;
  }
  console.log(num);
}

//printNum(count);

interface User {
  username: string;
  password: string;
}

interface Admin extends User {
  age: number;
}

interface Users {
  users: Admin[];
}

let user: Admin = {
  username: "snoopy",
  password: "doghouse",
  age: 18,
};

let appUsers: Users = {
  users: [
    { username: "Rick", password: "Morty", age: 80 },
    { username: "Rick", password: "Morty", age: 80 },
    { username: "Rick", password: "Morty", age: 80 },
  ],
};

interface Point {
  x: number;
  y: number;
  z: number;
}

interface OtherPoint {
  z: number;
}

function logPoint(p: Point) {
  console.log(p.x);
  console.log(p.y);
}

function logOtherPoint(p: OtherPoint | Point) {
  console.log(p.z);
}

const bees = { x: 12, y: 15, z: 10 };

const op: OtherPoint = { z: 25 };

logPoint(bees);
logOtherPoint(bees);

console.log(appUsers);

class UserAccount implements User {
  username: string;
  password: string;

  constructor(username: string, password: string) {
    this.username = username;
    this.password = password;
  }
}

let user2: User = new UserAccount("Bilbo", "th3shir3"); // {username: "Bilbo", password:"th3shir3"}
console.log(user2.username);

class Truck {
  constructor(
    private make: string,
    private model: string,
    private year: number
  ) {}

  getMake = () => {
    return this.make;
  };

  getModel = () => {
    return this.model;
  };

  getYear = () => {
    return this.year;
  };
}

let trucks: Truck[] = [
  new Truck("Ford", "F150", 2021),
  new Truck("Chevrolet", "Silverado", 2010),
  new Truck("Tesla", "Cyber-Truck", 2021),
];

trucks.forEach((truck) => {
  console.log(
    // this is string interpolation through the use of template literals (also available in JS)
    `Make: ${truck.getMake()}, Model: ${truck.getModel()}, Year: ${truck.getYear()}`
  );
});

type WindowState = "open" | "closed" | "minimized"; // these are uninions of values
type MicStatus = "muted" | "unmuted";
type PositiveOddValuesLessThanTen = 1 | 3 | 5 | 7 | 9;
type WorkDays = "Monday" | "Tuesday" | "Wednesday";

function daysWorking(): WorkDays {
  return "Wednesday";
}

let state: WindowState | MicStatus = "unmuted";

// class Something {
//   somesome: User | Admin;
// }

let objectArray: Array<Object | null>;

objectArray = trucks;
objectArray = [1, 88345, "hello", trucks[0], daysWorking()];

// objectArray[5] = null;

let [first, second, third, fourth, fifth, sixth] = objectArray;

objectArray.forEach((ele) => {
  console.log(typeof ele);
});

console.log(sixth);
