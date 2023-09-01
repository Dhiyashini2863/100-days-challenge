// getting  input from the user
const num = parseInt(prompt('Enter a number: '));

//creating a multiplication table
for(let i = 1; i <= 10; i++) {

    // multiply i with number
    const answer = i * num;

    // display the answer
    console.log(`${i} * ${num} = ${answer}`);
}
