//getting input from the user
const num = parseInt(prompt('Enter a non-negative integer: '));
let sum = 0;
for (let i = 1; i <= num; i++) 
{
    sum += i;
}
//displaying the sum
console.log('The sum of natural numbers=', sum);
