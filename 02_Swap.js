//JavaScript program to swap two variables

//Getting input from the users
let num_1 = prompt('Enter first number: ');
let num_2 = prompt('Enter second number: ');

//create a temporary variable
let temp;

//swap variables
temp = num_1;
num_1 = num_2;
num_2 = temp;

console.log(`The value of num_1 after swapping: ${num_1}`);
console.log(`The value of num_2 after swapping: ${num_2}`);
