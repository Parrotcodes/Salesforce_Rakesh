//JS starts from Here.........

console.log("Hello JS!");

// window.alert("Hi everyone");
// signle line comment

/*
multi
lline
comment
*/

const div = document.getElementById("mydiv");
const h1 = document.getElementById("myH1");
const p = document.getElementById("myP");

div.textContent="Hello div tag";
h1.textContent="Hello H1 tag";
p.textContent="Hello P tag";

// variables
let age = 20;
let year = 2025;
let gpa = 2.5;
let myName = "JavaScript";

console.log("Age: "+age);
console.log(`The current year is ${year}`);
console.log(`My GPA ${gpa} -> Typeof: `+typeof gpa);
console.log(`My Name is ${myName}`);


// Booleans
let online = true;
let isStd = false;

console.log(`Online : ${online} -> typeof: `+typeof online);

// Excercise 1
let uname = "Rakesh";
let myAge = 20;
let isStuendent = true;

document.getElementById("myName").textContent= `Name: ${uname}`;
document.getElementById("myAge").textContent= `Age: ${myAge}`;
document.getElementById("isStudent").textContent= `Enrolled: ${isStuendent}`;

// Arthematic operators
let count = 10;

count += 2;
count -= 2;
count *= 2;
count /= 2;
count %= 2;
count **= 2;

count++;
count--;
console.log(count);

// operator precedence

// userInput
// method 1: window prompt
// method 2: HTML input (professional way)

let username;

// method 1: window prompt
// username= window.prompt("What is Your Name?");
document.getElementById('iname').textContent = `Hello, ${username}`;
console.log(`UserName: ${username}`);

// method 2: HTML input (professional way)
document.getElementById("mySubmit").onclick = function(){
    username = document.getElementById("myInput").value; 
    document.getElementById('iname').textContent = `Hello, ${username}`;
    console.log(`UserName: ${username}`);
}

// TypeConversion - changing one dataType to another dataType
let uage = 20;
// let uage = window.prompt("Enter Your Age?"); // this will give string
uage = Number(uage);
uage +=1;
console.log(uage);

// Constatnt - const
const PI = 3.14;

console.log("PI value: "+PI);
// Excerice - 2 (Area of circle) using html input

// Counter Program - Excerise
const decreasebtn = document.getElementById("decrease");
const resetbtn = document.getElementById("reset");
const increasebtn = document.getElementById("increase");
const counterLable = document.getElementById("counterLable");

let counter = 0;

increasebtn.onclick = function(){
    counter++;
    counterLable.textContent = counter;
}

resetbtn.onclick = function(){
    counter = 0;
    counterLable.textContent = counter;
}

decreasebtn.onclick = function(){
    counter--;
    counterLable.textContent = counter;
}


// Math Object
let x = 10;
let y = -2.2;
let s = 45;
let z;

// z = Math.floor(y);
// z = Math.ceil(y);
// z = Math.random();
// z = Math.round(y);
// z = Math.trunc(y);
// z = Math.log(x);
// z = Math.PI;
// z = Math.E;
// z = Math.max(x,y);
// z = Math.min(x,y);
// z = Math.tan(s);
// z = Math.sign(y);
// z = Math.abs(y);
// z = Math.sign(s);
// z = Math.cos(s);
// z = Math.pow(x,2);
z = Math.sqrt(x);

console.log(z);


// Random()
let r;
let min =10;
let max = 50;
// r = Math.random();
// r = Math.floor(Math.random()*10)+1;
r = Math.floor(Math.random()*(max-min))+min; //range of random values

console.log(r);


// DICE Roll
const rollLable = document.getElementById("dicenum");
const rollBtn = document.getElementById("rollbtn");

rollBtn.onclick = function(){
    rollLable.textContent = Math.floor(Math.random() *6)+1;
}


// Statements
let userAge = 18; 
let isLicence = false;

if(userAge>=18){
    console.log("your are eligible to Drive!");
    if(isLicence){
        console.log("you can drive. Bcz,you have licence!");   
    }else{
        console.log("You can not drive, you don't have licence yet!");        
    }
}else{
    console.log("your are not eligible to vote!");
}


// Nested-else-if (Excercise) -- HTML input
let myText = document.getElementById("checkAge");
let checkSubmitbtn = document.getElementById("checkSubmit");
let resultInfo = document.getElementById("checkinfo");
let checkAge;

checkSubmitbtn.onclick = function(){
   checkAge = myText.value;
   checkAge = Number(checkAge);

    if (checkAge>=100) {
        console.log("Your too Old to enter into site!");     
        resultInfo.textContent = `Your too Old to enter into site!`;
    }else if (checkAge==0) {
        console.log("you just now born!");
        resultInfo.textContent = "you just now born!";
    }else if(checkAge<0){
        console.log("Negative numbers not allowed!");
        resultInfo.textContent = "Negative numbers not allowed!";
    }else if (checkAge<18) {
        console.log("your an just adult!");
        resultInfo.textContent = "your an just adult!";
    }else{
        console.log("Your eligible to enter into site!");
        resultInfo.textContent = "Your eligible to enter into site!";
    }
}


// checked (property) - true/false  (for radio/checkbox btns checking)
let subscribe = false;
if(subscribe.checked){
    console.log("your subscribed!");
}else{
    console.log("your not subscribed!");
}

// Ternary Operator
let res = subscribe?"yes":"No";
console.log(res);

let time = 12;
let greet = time>=12?"Good Afternoon":"Good Morning";
console.log(greet);


// Switch-case

// String Methods
let user = "Rakesh";
let num = "999-999-999"
// console.log(user.toUpperCase());
// console.log(user.length);
console.log(num.replaceAll("-","_"));

const fullName = "Chilukala Rakesh";
let firstName = fullName.slice(0,5);
console.log(firstName);

const myEmail = "chilukala.r@intime.tec.in";
console.log(myEmail.slice(myEmail.indexOf('@')));


// Method Chaining
// firstName = window.prompt("Enter your name: ");

firstName = firstName.trim().charAt(0,1).toUpperCase() + firstName.trim().slice(1).toLowerCase();
console.log(firstName);


// Logical Operators -- && , ! , ||

// Equlity operator , strict Equality operator
// =, ==, ===, !=, !==

let P = 3.14;

// P === '3.14'; -> checks the number and data Type

// While Loop & do-while Loop
let entername = "";
// while(entername === "" || entername === null){
//     // entername = window.prompt("Enter your name: ");
// }
console.log("Name: "+entername);


// Excercise

let isLoggedIn = false;
let newuser;
let pwd;

// do{
// if(!isLoggedIn){
//     newuser = window.prompt("Enter your Name: ");
//     pwd = window.prompt("Enter you password: ");

//     if (newuser === "" || pwd==="") {
//         console.log("Please provide all the details properly!");
//     }else if(newuser==="user" && pwd === "pwd"){
//         isLoggedIn = true;
//         console.log("your logged in Success!");
//     }else{
//         console.log("Something went wrong!");
        
//     }
// }
// }while(!isLoggedIn);


// For-Loop (break/continue)

// Number Guessing Game - Excersie


// Functions - write once re-use manyTimes

function msg(){
    console.log("Welcome to Functions!");
}
msg();

let nname;
function greeting(nname){
    console.log(`Hello, ${nname}`);
}

greeting("Rakesh"); //parameter follow arguments postions should must same

function add(x,y){
    return x+y;
}

let answer = add(10,20);
console.log(answer);


function isValidEmail(email){
    if(email.includes("@")){
        return true;
    }else{
        return false;
    }
    return
}

console.log(isValidEmail("stor@e.com"));



// Variable Scope - local/global


// Temperature converter -- Excercise


// Arrays in JS -- var hold one value but array many
let names = ["Rakesh","Hary","Amar",100,true];
names[2] ="New Amar";
names.push("Pushed");
// pop(),push("new item"),unshift("new shift item"),shift()
// length
// indexOf("Hary") - 1(true), index[0]
console.log(names);

for (let i = 0; i < names.length; i++) {
    console.log(names[i]);    // looping array elements 
}

//enhanced for-loop
console.log("---------Enhance ForLoop----");
for(let n of names){
    console.log(n);
}

//sort(), reverse()
console.log(names.sort());
console.log(names.sort().reverse());

// 2D-Arrays - Matrix of data in (rows,columns)
//.join() -- to add space or anything
// jagged Arrays also possible Eg: mart[][]=[[1,2],[3,4,5],[0]] diff size of arrays

let arr2D = [
                [1,2,3],
                [4,5,6],
                [7,8,9],
                ['*',0,'#']
            ];
for(let n of arr2D){
    const rows = n.join(' ');
    console.log(rows);
}


// Spread Operator - ... allows an iterable (unpack the elements of array)
let nums = [10,2,30,23,50];
// let maximum = Math.max(nums); //NaN
let maximum = Math.max(...nums);
// let minimum = Math.min(nums); //NaN
let minimum = Math.min(...nums);

console.log(maximum);
console.log(minimum);

// string into arrays
let newstring = "My Name is Rakesh";
// let nameArray= [...newstring];
let nameArray= [...newstring].join('-');
console.log(nameArray);

// copy of arrays 
let arr1 = [1,2,4];
let arr2 = [...arr1];
let newarr2 = [5,6,7]
let allNums = [...arr1,...newarr2,10,20];
console.log(arr2);
console.log(...arr2,...newarr2);
console.log(...allNums);

// REST Parameters - (...rest)
// spread(...) - expands an array into separate elements
// reset(...) - bundles separate elements into array (which accepts 'n' no.of arguments in a funciton)

function myFridge(...fruits){ //rest parameter
    // console.log(fruits); // ...fruits -- spread operators prints all fruits
    return fruits;
}
const fruits1="Apple";
const fruits2 ="Mango";

let fruisssss = myFridge(fruits1,fruits2);
console.log(fruisssss);


// sum of n numbers
function sum(...n){
    let res =0;
    for(let i of n){
        res += i;
    }
    return res;
}

const addAll = sum(1,2,3,4,5);
console.log("Sum:"+addAll);


// FullName -- using reset parameter
function myFullName(...strings){
    return strings.join(' ');
}
let FullNameIs = myFullName("Chilukala","Rakesh");
console.log(FullNameIs);



// DICE ROLLER - PROJECT (HTML,CSS,JS)


// Random Passowrd - Generator


// Callbacks -- a function  that is passed as an argument to another function
//              used to handle asyncronous func
//              1.Reading files
//              2.Network requests
//              3.Interacting with db
//  first reading completes then prints calling next

hi(Bye);
// Bye();
welcome();

function hi(callback){
    console.log("Hi");
    callback();
}

function welcome(){
    console.log("welcome");
}
function Bye(){
    console.log("Bye");
}


mySum(FinalResult,2,3);
mySum(FinalResultPageDOM,10,20);

function mySum(callback,x,y){
        let result = x+y;
        callback(result);
}

function FinalResult(result){
    console.log(result);
}

function FinalResultPageDOM(result){
    document.getElementById("myCallback").textContent = `The callback sum: ${result}`;
}


// forEach Method -- iterate the ele of array and applied a specified function(callback) to each element
let funNumbers = [10,20,30,40,50];

funNumbers.forEach(square);
funNumbers.forEach(double);
funNumbers.forEach(displayNumbers);

function displayNumbers(ele){
    console.log(ele);    
}

// own math methods
function double(element,index,array){
    array[index] = element *2;
}

function triple(element,index,array){
    array[index] = element *3;
}

function square(element,index,array){
    array[index] = Math.pow(element,2);
}

function cube(element,index,array){
    array[index] = Math.pow(element,3);
}


let users = ["rakesh","money","honey","john"];

users.forEach(ArrayUpperCase);
users.forEach(myUpperCaseArray);

//myOwn Array Uppercase method
function ArrayUpperCase(element,index,array){
        array[index]= element.toUpperCase();
}

function myUpperCaseArray(strings){
    console.log(strings);
}


// map() method






















