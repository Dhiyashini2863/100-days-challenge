// getting input from the user
const num = parseInt(prompt('Enter a non-negative integer: '));

// checking if number is negative
if (num < 0) 
{
    console.log('Please enter a positive integer');
}

// if number is 0
else if (num === 0)
{
    console.log(`The factorial of ${num} = 1.`);
}

// if number is positive
else
{
    let fact = 1;
    for (i = 1; i <= num; i++)
    {
        fact *= i;
    }
    console.log(`The factorial of ${num} = ${fact}.`);
}
