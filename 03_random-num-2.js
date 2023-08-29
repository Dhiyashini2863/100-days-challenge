//getting input from the user
const low = parseInt(prompt("Enter a lowest number: "));
const high = parseInt(prompt("Enter a highest number: "));

// generating a random number
const r = Math.floor(Math.random() * (high - low + 1)) + low;

// display a random number
console.log(`Random number between ${low} and ${high} is ${r}`);
