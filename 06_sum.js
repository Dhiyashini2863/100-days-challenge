let sum = 0;
let num = 0;

do {
    sum += num;
    num = parseInt(prompt('Enter a number: '));
} while(num >= 0)

console.log(`The sum is ${sum}.`);
