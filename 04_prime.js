// getting input from the user
const num = parseInt(prompt("Enter a non-negative number: "));
let isPrime = true;

// check if number is equal to 1
if (num === 1) 
{
    console.log("1 is neither prime nor composite");
}

// check if number is greater than 1
else if (num > 1) 
{

    // looping through 2 to num-1
    for (let i = 2; i < num; i++) 
    {
        if (num % i == 0) 
        {
            isPrime = false;
            break;
        }
    }

    if (isPrime) 
    {
        console.log(`${num} is a prime number`);
    } else 
    {
        console.log(`${num} is a not prime number`);
    }
}

// check if number is less than 1
else 
{
    console.log("The number is not a prime number.");
}
