// getting input from the user
const num1 = parseFloat(prompt("Enter first number: "));
const num2 = parseFloat(prompt("Enter second number: "));
const num3 = parseFloat(prompt("Enter third number: "));
let large;

// check the condition
if(num1 >= num2 && num1 >= num3) {
    large = num1;
}
else if (num2 >= num1 && num2 >= num3) {
    large = num2;
}
else {
    large = num3;
}

// display the result
console.log("The largest number is " + large);
