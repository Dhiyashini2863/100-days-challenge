// getting input from the user
const num = prompt("Enter a number: ");

// if the number is even
if(num % 2 == 0) {
    console.log("The number is even");
}

// if the number is odd
else if(num % 2 == 1) {
    console.log("The number is odd");
}

//if input is not a number
else{
    console.log("Please enter a valid number")
}
