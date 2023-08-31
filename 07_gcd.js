let gcd;
// getting input from the user
const num1 = prompt('Enter a first positive integer: ');
const num2 = prompt('Enter a second positive integer: ');

// looping from 1 to number1 and number2
for (let i = 1; i <= num1 && i <= num2; i++) 
{

    // check if is factor of both integers
    if( num1 % i == 0 && num2 % i == 0) {
        gcd = i;
    }
}

// display the hcf
console.log(`GCD of ${num1} and ${num2} is ${gcd}.`);
