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
// it will change the original array
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


// map() method -- return a new array
const newnumbers = [1,2,3,4,5];

const sq = newnumbers.map(mysquare);

console.log(newnumbers);
console.log(sq);

function mysquare(ele){
   return Math.pow(ele,2);
}

const nnames = ["rakesh","somesh","hari"];

const upper =nnames.map(myUpper);
console.log(nnames);

console.log(upper);

function myUpper(ele){
    return ele.toUpperCase();
}

const dates = ["2024-03-12","2024-01-10"];

const myd = dates.map(myDatesFormat);
console.log(dates);
console.log(myd);


function myDatesFormat(ele){
    const part = ele.split("-");
    return `${part[1]}/${part[2]}/${part[0]}`;
}

// .filter() -- creates a new array by filtering out elements
const farr = [0,2,3,4,5,6,7,8,2,18,20,16,22];

const flarr = farr.filter(isAdult);
console.log(flarr);

function isEven(ele){
        return ele % 2 === 0;
}

function isAdult(ele){
    return ele>=18;
}

function getShortWords(ele){
    return ele.length <=5;
}

// reduce() -- reduce the element of an array to a single value 
const rates = [10,20,30,40,50];

const total = rates.reduce(sum);
const myMax = rates.reduce(getMax);
const myMin = rates.reduce(getMin);

console.log(total.toFixed(2));
console.log(myMax);
console.log(myMin);


function sum(prev,next){
    return prev+next;
}

function getMax(start,next){
    return Math.max(start,next);
}

function getMin(start,next){
    return Math.min(start,next);
}

// function declaration
function heelo(){
   console.log("heelooooo");
}
heelo();

// function expression - a way to define function as values or variables
const Greeting = function(){
    console.log("Good morning!");
}
Greeting();


setTimeout(function(){
    console.log("timer function called");   
},3000);

//map with fun expr
const newRates = rates.map(function(ele){
    return Math.pow(ele,2);
});
console.log(newRates);

//filter with fun expre
const newPrices = newRates.filter(function(ele){
    return ele<=500;
});

console.log(newPrices);

//reduce with fun expr
const newTotal = newRates.reduce(function(s,n){
    return s+n;
});
console.log(newTotal);

// **Arrow Functions -- ()=>{}
const sayHello = ()=> console.log("Hello saying..");

sayHello();

// const sayHelloName = (name)=>console.log(`Hello, ${name}`);
const sayHelloName = (name)=>{
    console.log(`Hello, ${name}`);
    console.log("welcome to my world ");
}
sayHelloName("Rakesh");


// OOPS in JS
// Object -- set of properites and methods 
// Object representation - {
                            // key:value,
                            // function()
                            //      } 

const Person = {
    fnmae:"New",
    lname : "User",
    age:24,
    isEmployee: true,
    say: function() {console.log(`I am an employe. My name is ${this.fnmae}`)},
    // say: ()=> console.log(`I am an employe. My name is ${this.fnmae}`), // this - keyword is doesn't work with arrow functions

    
};

const PersonInfo = ()=>{
    console.log(Person.fnmae);
    console.log(Person.lname);
    console.log(Person.age);
    console.log(Person.isEmployee);    
    Person.say();
}
PersonInfo();

// Constructor-- speacial method for definig the prop and methods of objects
function Car(name,brand,color,price){
    this.name = name,
    this.brand = brand,
    this.color = color,
    this.price = price,
    this.drive = function(){console.log("your driving car");
    }
}

const car1 = new Car("Q7","Audi","White",9999);
console.log(car1);
console.log(car1.brand);
car1.drive();

// fetch()
fetch("https://jsonplaceholder.typicode.com/todos/1")
    .then(response =>{
        if(!response.ok){
            throw new Error("could not fetch data");
        }
        return  response.json();
    })
    .then(data => console.log(data))
    .catch(error=>console.log(error));


// async/await

fetchData();

async function fetchData() {
    try {
        const response = await fetch("https://jsonplaceholder.typicode.com/todos/31");
        if(!response.ok){
            throw new Error("could not fetching data");
        }
        const data = await response.json(); //return promise
        console.log(data);
        
    } catch (error) {
        console.log(error);
    }
}




// object
const domObject = document.getElementById("object");
const Products ={
    pname:"Shoe",
    pbrand:"Puma",
    pprice:450,
    pAddCart: "product added to cart!",
    pBuy:()=>{console.log(`buying product ${Products.pname} done!`)},
    pBill:function(){console.log(`Total product Price: $${this.pprice}!`)}
}
domObject.innerHTML=`
<h1>OOPS in JS</h1> 
Product Name: ${Products.pname} <br/>
Product Brand: ${Products.pbrand} <br/>
Product Price: ${Products.pprice} <br/>
Product Cart: ${Products.pAddCart} <br/>
Product Buy: ${Products.pBuy()} <br/>
Product Bill: ${Products.pBill()}`;
// domObject.textContent=Products.pbrand;


// Constructor -- code reusability
function NewCar(brand,color,price){
    this.brand = brand,
    this.color = color,
    this.price = price,
    this.drive = ()=>{console.log("i am driving my NewCar...");
    }
}

const ncar1 = new NewCar("Audi","white",7878);
const ncar2 = new NewCar("Q6","red",8888);
console.log(ncar1);
console.log(ncar1.brand);
console.log(ncar2);
ncar2.drive();

// Class in JS
class NewProduct {
    static model = "Electric"; //static
    
    constructor(name,price,brand,color){
        this.name = name,
        this.price = price,
        this.brand = brand,
        this.color = color
    }

    static getInfo(){
       return "this is newCar Class static method";
    }

    displayInfo(){
        console.log(`NewProduct Name: ${this.name}`);
        console.log(`NewProduct Brand: ${this.brand}`);        
    }
}

const nproduct1 = new NewProduct("Nano electric",9999,"TATA","black");
console.log(nproduct1);
nproduct1.displayInfo();

// static -- we can access direct by using className
console.log(`Staic var: ${NewProduct.model}`);
console.log(`Staic Method: ${NewProduct.getInfo()}`);


class myUser{
    static name = "static user";
    static userCount = 0;

    constructor(name,age,isStuendent){
        this.name = name,
        this.age = age,
        this.isStuendent = isStuendent,
        myUser.userCount++;
    }

    
    static usayHello(){
        console.log("Hello, "+myUser.name);
    }

    static totalUsers(){
        console.log("Total users staic method: "+myUser.userCount);
    }
    sayHello(){
        console.log("Hello, "+this.name);
    }
}

console.log(myUser.name);
const muser = new myUser("Jhon",45,false)
const muser2 = new myUser("",45,true)
console.log(muser);
console.log(muser2);
muser.sayHello();
myUser.usayHello();
myUser.totalUsers();

// super() -- refers to parent
class Animal{
    constructor(name,age){
        this.name = name,
        this.age = age
    }

    move(){
        console.log(`${this.name} is movingg....`);
        
    }
}

class Tiger extends Animal{
    constructor(name,age,runSpeed){
        super(name,age);
        this.runSpeed = runSpeed;
        super.move(this.name);
    }
}

class Deer extends Animal{
    constructor(name,age,walkSpeed){
        super(name,age);
        this.walkSpeed = walkSpeed;
        super.move(this.name);
    }
}
const tiger = new Tiger("Tiger 1",77,500);
const deer = new Deer("Deer 1",47,100);
console.log(tiger);
tiger.move();
console.log(deer);
deer.move();


// Getters & Setters
class Rectangle{
    constructor(width,height){
        this.width = width;
        this.height = height;
    }

    set width(newWidth){
        if(newWidth > 0)
            this._width =  newWidth;
        else
            console.log("Width Number must be postive > 0");
    }

    set height(newHeight){
            if(newHeight > 0)
            this._height =  newHeight;
        else
            console.log("Height Number must be postive > 0");
    }

    get width(){
        return this._width.toFixed(1);
    }

    get height(){
        return this._height.toFixed(1);
    }

    get area(){
        return (this._width * this._height).toFixed(1);
    }
}

const rect = new Rectangle(4,4);
// console.log(rect);
console.log(rect.width);
console.log(rect.height);
console.log(rect.area);


class UserData{
    constructor(fname,age){
        this.fname = fname;
        this.age = age;
    }

    set fname(firstName){
        if(typeof firstName === "string" && firstName.length >0)
            this._fname = firstName;
        else
            console.log("Name must be non empty string type");
    }

    set age(myAge){
        if(typeof myAge === "number" && myAge >= 0)
            this._age = myAge;
        else
            console.log("Age must be non non-neagative Number type");
    }

    get fname(){
        return this._fname;
    }

    get age(){
        return this._age;
    }
}

const ecpUser = new UserData("df",10);
console.log(ecpUser);
console.log(ecpUser.name);
console.log(ecpUser.age);



// destructuring -- extracting values form array and objects,
                    // then assigning them in a convient way
                    // [] - to perform array destructuring
                    // {} - to perform object destructuring

// Swap 
let a = 1;
let b = 2;
[a,b] = [b,a];
console.log("a: "+a);
console.log("b: "+b);

// arrayElements Swapping
const colors =["red","green","grey","blue","white"];
[colors[0],colors[4]] = [colors[4], colors[0]];
console.log(colors);

const [fcolor,scolor,...extraColor] = colors;

console.log(fcolor);
console.log(scolor);
console.log(...extraColor);



// Objects desctruct
const dummyInfo = {
    dfirstName:"dummy",
    dage:34,
    djob:"Employee",
    dgender:"male"
}

const dummyInfo2 ={
    //  dfirstName:"dummy 2",
    dage:34,
    // dgender:"female"
}


const {dfirstName="demo",dage=18,djob="Unemployee",dgender="other"} = dummyInfo2;
console.log(dfirstName);
console.log(dage);
console.log(dgender);
console.log(djob);


// Destruct in func parameters object
function displayDummy({dfirstName="Function Name",dage=0,djob="unemployee"}){
    console.log("function name:"+dfirstName);
    console.log("function Job:"+djob);
    console.log("function age:"+dage);
    }

displayDummy(dummyInfo2);


// Nested-objects -- object iside of another object
const NestedObject_Person = {
    firstName:"Rakesh",
    lastName:"Chilukala",
    age:22,
    isEmployee:true,
    hobbies:["playing chess","karate","kabbadi"],
    address:{
        street:"local",
        mandal:"mandal",
        district:"banglore",
        pincode:500068,
        country:"India"
    }
}

console.log(NestedObject_Person);
console.log(NestedObject_Person.hobbies[1]);
console.log(NestedObject_Person.address.pincode);
for(const property in NestedObject_Person.address){ //loop through address object
    console.log(NestedObject_Person.address[property]);    
}

// Address Class
class NestedObjectPersonAddr{ //parent class
    constructor(name,age,...address){
        this.name = name,
        this.age = age,
        this.address = new Address(...address); // child object
    }
}

class Address{ //child object enclose with parenet
    constructor(street,mandal,district,country){
            this.street = street,
            this.mandal = mandal,
            this.district = district,
            this.country = country
    }
}

const nestedPersonaddre = new NestedObjectPersonAddr("Rakesh",22,"local street","main maindal","old district","india");
console.log(nestedPersonaddre);
console.log(nestedPersonaddre.address);


// Array of Objects
const myFruits=[
    {
        name:"apple",
        color:"red",
        isFruit:true,
        price:45
    }
    , {
        name:"Mango",
        color:"yellow",
        isFruit:true,
        price:35
    }, {
        name:"Grapes",
        color:"green",
        isFruit:true,
        price:65,
    }
]
// push(), pop(), splice(1,2) removes specific objects
myFruits.push({name:"Banana",color:"yellow",isFruit:false,price:30});

console.log(myFruits);
console.log(myFruits[1].color);
console.log(myFruits[3]);

//array of Objects -- forEach("looping array of object"),map("mapping each array object properties"),filter("this return new arrray"), reduce() methods possible
myFruits.forEach((fruit)=>{
    console.log(fruit);
})

//map()
const fruitColors = myFruits.map(fruit => fruit.color);
console.log(fruitColors);

const fruitNames = myFruits.map(fruit => fruit.name);
console.log(fruitNames);

// filter()
const YellowFruits = myFruits.filter(fruit=>fruit.color === "yellow");
console.log(YellowFruits);

const LowPrice = myFruits.filter(fruit=>fruit.price <=30);
console.log(LowPrice);

// reduce()
const MaxFruitPrice = myFruits.reduce((first,next) => first.price > next.price?first:next);
console.log(MaxFruitPrice);


// SORTING
const sortNames = ["zebra","apple","monkey","cat","zoo"];
sortNames.sort();
console.log(sortNames);

const sortNumbers = [1,10,5,2,6,8,4,9,0,3,7];
sortNumbers.sort();//lexographic order
console.log(sortNumbers);

//  not lexographic order = (alphabet + number + symbol)
sortNumbers.sort((a,b)=>b-a); //DESC
console.log(sortNumbers);

sortNumbers.sort((a,b)=>a-b); //ASC
console.log(sortNumbers);

// sort objects
myFruits.sort((a,b)=>a.price - b.price);
console.log(myFruits);

myFruits.sort((a,b)=>b.isFruit - a.isFruit);
console.log(myFruits);

myFruits.sort((a,b)=>a.name.localeCompare(b.name));//sort objects by property.name -- localeCompare() method
console.log(myFruits);


// SHUFFLE GAME -- using Fisher-Yates algorithm (best for large data to shuffle)
const cards = ['A',2,3,4,5,6,7,8,9,10,'K','Q','J'];
// cards.sort();
shuffle(cards);
console.log(cards);

function shuffle(array){
    for (let i = array.length-1;i > 0; i--) {
        const random = Math.floor(Math.random() * (i+1));
        [array[i],array[random]] = [array[random],array[i]]; //destruct        
    }
}



// DATE Object
const date = new Date();
console.log(date);

console.log(date.getFullYear());
console.log(date.getMonth());
console.log(date.getDate());
console.log(date.getTime());
console.log(date.getDay());

console.log(date.setFullYear(2024));

// closure - a function def inside another function
function outer(){
    let Newmsg = "Hello closure funtion";

    function inner(){
        let Innergreet = "Good nyt";
        console.log("Inner Function Call (outer var): "+Newmsg);        
        console.log("Inner Function var: "+Innergreet);        
    }

    inner();
    // console.log(Innergreet);
    console.log("outer Func var: "+Newmsg);
}

Newmsg = "welcome"; //won't chage privacy
console.log(Newmsg);

outer();


//Score counter -- closure
function Score(){
    // createCounter score
    let score = 0;

    //we can modify score inside function only
    // score = 100;
    function incr(){
        score++;
        console.log(score);
    }

    function getScore(){
        return score;
    }

    return {incr,getScore}
}

// incr();
// incr();
// incr();
// getScore();
const scoreMaster = Score();
scoreMaster.incr();
scoreMaster.incr();
scoreMaster.incr();
scoreMaster.incr();
scoreMaster.incr();
scoreMaster.getScore();

// Counter/Score Increment
function counterGame(){
    let myCount =0;

    function Increment(points){
        myCount += points;
        console.log(`+${myCount} points`);    
    }

    function Decrement(points){
        myCount -= points;
        console.log(`-${myCount} points`);    
    }

    function getCount(){
        console.log(`The total count:  ${myCount}`);
    }

    return {Increment,Decrement,getCount}
}

// myCount = 100; // we can change the value (no security outside fun)
// Increment(5);
// Increment(10);
// Decrement(5);
// getCount();
// myCount =100; // can not modify value
// console.log(myCount);

const myCounter = counterGame();
myCounter.Increment(10);
myCounter.Decrement(1);
myCounter.getCount();


// setTimeout()
setTimeout(()=>console.log("Timer calling meee..."),3000);

let timerId;
function startTimer(){
    timerId = setTimeout(()=>{console.log("Timer started....");
        console.log("butoon started");
        
    },3000)
}

function clearTimer(){
    clearTimeout(timerId);
    console.log("clear....timer");
    console.log("butoon stopped");
}


// console.time()
console.warn("warining.... error check")
console.error("checking errror...")
console.table(myFruits);
let i = 10;
let j = 20;
let k =i +j;
console.assert(0,k,"Sum is wrong!");
console.count("Ram","msg");
console.count("Ram");
console.count("Ram","msg");
console.count("msg","Ram");
console.count("fruits",myFruits.length);
console.count("fruits",myFruits.length);
console.debug(i+j);
console.trace(myFruits);
// confirm("are you sure?");
console.timeStamp("today");

// function onTap() {
//   console.log("Test.");
//   console.trace("Test");
//   throw new Error("Test");
// }
// onTap();


console.time("testt");
for (let K = 0; K < 100; K++) {
 //code    
}
console.timeEnd("testt");


// Currency Converter
// .toLocalString()

let dummyNumber = 123456789.99;

// dummyNumber = dummyNumber.toLocaleString("hi-In"); //default format
console.log(dummyNumber);

// dummyNumber = dummyNumber.toLocaleString("en-US");
dummyNumber = dummyNumber.toLocaleString("de-DE");
console.log(dummyNumber);

let prizeMoney = 454645900.99;
// prizeMoney = prizeMoney.toLocaleString("en-US",{style:"currency",currency:"USD"})
prizeMoney = prizeMoney.toLocaleString("hi-IN",{style:"currency",currency:"INR"});
// prizeMoney = prizeMoney.toLocaleString("de-DE",{style:"currency",currency:"EUR"});
console.log(prizeMoney);


// Compound Intrest Calculator - HTML,CSS,JS

function CompundCalculate(){
    const principalAmountInput = document.getElementById("pamount");
    const irateInput = document.getElementById("irate");
    const yearInput = document.getElementById("years");
    const totalAmount = document.getElementById("total-amount");

    let principal = Number(principalAmountInput.value);
    let irate = Number(irateInput.value);
    let year = Number(yearInput.value);


    if(principal < 0 || isNaN(principal)){
        principal =0;
        principalAmountInput.value =0;
    }

    if(irate<0 || isNaN(irate)){
        irate = 0;
        irateInput.value = 0;
    }

    if(year<0 || isNaN(year)){
        year =0;
        yearInput.value =0;
    }
    const result = principal * Math.pow((1+irate/1),1*year);

    totalAmount.textContent = result.toLocaleString(undefined,{style:"currency",currency:"USD"});
}


// Syncronous asyncornous
// syncronous -- Excecutive line by line consecutively in a sequential manner that wait for operation to complete
// asyncronous -- Allows mutilple operations concurrently without waiting doesn't block the execution flow 

// syncronous
console.log("Task1");
console.log("Task2");
console.log("Task3");
console.log("Task4");

// asyncronous - setTimeout() is async func
// we can handle with: callbacks, promise, async/await

setTimeout(()=> console.log("New Task 1"),1000);
console.log("New Task 2");
console.log("New Task 3");
console.log("New Task 4");

// Eg:
function fun1(callback){
    setTimeout(()=> {console.log("New Task 1"),callback()},2000);
}

function fun2(){
    console.log("New Task 2");
    console.log("New Task 3");
    console.log("New Task 4");
}

fun1(fun2);


// Error Handling - n/w errors, promise rejections, security errors
// try{}, catch(){},finally{}
console.log("-----My error handler----");
// console.lag("error 1") //TypeError
// console.log(m);
try {
    console.log(m);
} catch (error) {
    console.error(error);   
} finally{
    console.log("finally connection closed..");
}

// Eg: number/0 - infinity

try {
    const m = 5;
    const n = 0;
    if(n===0)
        throw new Error("we can't divide by zero");
    
    if(isNaN(m) || isNaN(n))
        throw new Error("values must be number");
        
    const o = m/n;

    console.log(o);
} catch (error) {
    console.error(error);    
}
console.log("Next line is runningg.. till end");


// Calculator -- Excersie
const calcdisplay = document.getElementById("display");

function appendToDisplay(input){
    calcdisplay.value += input;
}

function clearDisplay(){
    calcdisplay.value = "";
}

function MathCalculate(){
    try {
        calcdisplay.value = eval(calcdisplay.value);       
    } catch (error) {
        calcdisplay.value = "Error";
    }
}




// DOM -Document Object Model
//  Elemment selector
// getElementById()
// getElementByClassName()
// getElementByTagName()
// querySelector()
// querySelectorAll()

// console.log(document);
// console.dir(document);

const welcomeuser="salesforce tutorial - 2025 Batch";
// const welcomeuser="";
const myWelcomeMsg = document.getElementById("welcome-msg");
 myWelcomeMsg.innerHTML = welcomeuser === ""?"<h1>Welcome Tutorial</h1>":`<h1>${welcomeuser}</h1>`;

myWelcomeMsg.style.backgroundColor ="orange";
myWelcomeMsg.style.padding ="10px";
myWelcomeMsg.style.textAlign ="center";
myWelcomeMsg.style.boxShadow ="5px 5px 10px gold";


// Callback Hell (Nesting callbacks) -- we can avoid by using Promise, async/await
function taks1(callback){
    setTimeout(
        ()=>{console.log("callbackHell - Task1 complete ");
            callback();
    },5000)
        
}

function taks2(callback){
    setTimeout(
        ()=>{console.log("callbackHell - Task2 complete ");
            callback();
    },1000)   
}

function taks3(callback){
    setTimeout(
        ()=>{console.log("callbackHell - Task3 complete ");
            callback();
    },1000)   
}

function taks4(callback){
    setTimeout(
        ()=>{console.log("callbackHell - Task4 complete ");
       callback();
    },1000)  
}

taks1(()=>{
    taks2(()=>{
        taks3(()=>{
            taks4(()=>console.log("All tasks are done from Hell")
            )
        })
    })
});



// Promise -- (resolve,rejected)=>{}
// function clean1(callback){
//     setTimeout(()=>{console.log("clean 1");
//         callback();
//     },6000);
// }

// function clean2(callback){
//     setTimeout(()=>{console.log("clean 2");
//         callback();
//     },500);
// }

// function clean3(callback){
//     setTimeout(()=>{console.log("clean 3");
//         callback();
//     },500);
// }

//callback Hell -> Prompise
// clean1(()=>{
//     clean2(()=>{
//         clean3(()=>console.log("All cleaning sections completed")
//         )
//     })
// })


//Promise -- Method chaning
// function Pclean1(){
//     return new Promise((resolve,reject)=>{ //resolve what if reject
//         setTimeout(()=>{
//             resolve("Pclean 1");
//         },6000);
//     })
// }

// function Pclean2(){
//    return new Promise((resolve,reject)=>{
//         setTimeout(()=>{
//             resolve("Pclean 2");
//             },500);
//     })
// }

// function Pclean3(){
//     return new Promise((resolve,reject)=>{
//         setTimeout(()=>{
//             resolve("Pclean 3");
//     },500);
//     })
// }

function Pclean1(){
    return new Promise((resolve,reject)=>{ //resolve what if reject
      
            setTimeout(()=>{
                  const c1 = true;
                 if(c1){
                        resolve("Pclean 1");
                }else{
                    reject("Pcleaning1 not done!")   
                }
                },6000);
            
    })
}

function Pclean2(){
   return new Promise((resolve,reject)=>{
        setTimeout(()=>{
            const c2 = true;
            if(c2){
                resolve("Pclean 2");
            }else{
                reject("Pcleaning2 not done!")
            }
            },500);
    })
}

function Pclean3(){
    return new Promise((resolve,reject)=>{
        setTimeout(()=>{
            const c3 = false;
            if(c3){
                resolve("Pclean 3");
            }else{
                reject("Pcleaning3 not done")
            }            
    },500);
    })
}

Pclean1().then((value)=>{console.log(value); return Pclean2();})
        .then((value)=>{console.log(value); return Pclean3();})
        .then((value)=>{console.log(value); console.log("all tasks Pcleaning done!");})
        .catch((error)=>console.error(error));


// Async / await
// async - makes a function return a promise
// await - makes a async function wait for a promise

async function AsyncCleaning() {
    try{
        const aclean1 = await Pclean1();
        console.log("Asyc:"+aclean1);
    }catch(error){
        console.log("Async Error 1 => "+error);        
    }
   
    try{    
        const aclean2 = await Pclean2();
        console.log("Asyc:"+aclean2);
    }catch(error){
        console.error("Async Error 2 => "+error);
    }

    try{
        const aclean3 = await Pclean3();
        console.log("Asyc:"+aclean3);
    }catch(error){
        console.error("Async Error 3 => "+error);
    }
    
    console.log("All async cleanings are done!");   
}

AsyncCleaning();


// JSON 
// JSON.Stringify() - convert JS Object ot json string
// JSON.Parse() -- convert Json string to JS Object
const jsonnames = ["Rakesh","Hary","Jhon","Json"]; //similary for json
// const jsonnames = {
//     "name":"C Rakesh",
//     "age":22,
//     "isStudent":false,
//     "hobbies":["plalying chess","watching movies","reading news"],
//     "address":{
//         "street":"1001,new street",
//         "vil":"Madiwala",
//         "mand":"central silk board",
//         "dis":"CSR Layout,Banglore",
//         "state":"karnataka",
//         "pincode":500068
//     }
// };
// console.log(jsonnames); //array of objects
// const jsNames = JSON.stringify(jsonnames);
const jsNames = JSON.stringify(jsonnames);
const jsNamesobj = JSON.parse(jsNames);
console.log(jsNamesobj); //array to strings


// fetch("")
console.log("-------Person Json---------");
fetch("person.json")
    .then(res=>res.json())
    .then(val=>console.log(val))

console.log("-------People Json---------");
fetch("people.json")
    .then(res=>res.json())
    // .then(val=>console.log(val))
    .then(val2=>val2.forEach(v =>console.log(v.name)))
    .catch(error=>console.error(error))


// console.log("====CAT FACTS====");    
// // CAT Facts APIs
fetch("https://jsonplaceholder.typicode.com/todos/44") //BLOCKED BY CORS
    .then(res=>res.json())
    .then(val=>console.log(val.title))
    .catch(error=>console.error("API ERROR:"+error))


// Excersie
async function myAPIFetchData(apiId) {
    try {
        const myAPI =  await fetch(`https://jsonplaceholder.typicode.com/todos/${apiId}`)
        const data = await myAPI.json();
        console.log("API_ID_Title: ID "+data.id+" Tilte:"+data.title);
        
    } catch (error) {
        console.error(error);        
    }
}

myAPIFetchData(100);

// COOKIE
console.log("-------MyCookies---------");
document.cookie = "username=firstCookie";
document.cookie = "lastName=lastCookie";
// console.log(document.cookie);
const mycookies = decodeURIComponent(document.cookie);
console.log(mycookies.split("; ")); //stored in array - cookies



// Weather FetchData - Excersice
