const str1 = prompt("Enter a string:")
const str2 = prompt("Enter another string:")

// compare both strings
const final = str1.toUpperCase() === str2.toUpperCase();

if(final) {
    console.log('The strings are same');
} else {
    console.log('The strings are not same');
}
