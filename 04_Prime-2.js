// getting input from the user
const low = parseInt(prompt('Enter lower number: '));
const high = parseInt(prompt('Enter higher number: '));

console.log(`The prime numbers between ${low} and ${high} are:`);

// looping from lowerNumber to higherNumber
for (let i = low; i <= high; i++) 
{
    let flag = 0;

    // looping through 2 to user input number
    for (let j = 2; j < i; j++) 
    {
        if (i % j == 0) {
            flag = 1;
            break;
        }
    }

    // if number greater than 1 and not divisible by other numbers
    if (i > 1 && flag == 0) 
    {
        console.log(i);
    }
}
