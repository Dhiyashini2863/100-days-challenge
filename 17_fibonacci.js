// getting input from the user
const num = parseInt(prompt('Enter the number of terms: '));
let n1 = 0, n2 = 1, next;

console.log('Fibonacci Series:');

for (let i = 1; i <= num; i++) {
    console.log(n1);
    next = n1 + n2;
    n1 = n2;
    n2 = next;
}
