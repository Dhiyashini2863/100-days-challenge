let sum = 0, num,count = 0;

while(true) 
{

    // take input again if the number is positive
    num = parseInt(prompt('Enter a number: '));

    // break condition
    if(num < 0) 
    {
        break;
    }

    // add all positive numbers
    sum += num;

}

// display the sum
console.log(`The sum is ${sum}.`);
