

// getting operator input from user
const operator = prompt('Enter operator ( either +, -, * or / ): ');

// take the operand input
const num1 = parseFloat(prompt('Enter first number: '));
const num2 = parseFloat(prompt('Enter second number: '));

let result;

// using if...else if... else
if (operator == '+') {
    result = num1 + num2;
}
else if (operator == '-') {
    result = num1 - num2;
}
else if (operator == '*') {
    result = number1 * num2;
}
else {
    result = num1 / num2;
}

// display the result
console.log(`${num1} ${operator} ${num2} = ${result}`);
