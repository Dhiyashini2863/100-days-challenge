function emptyArray(arr) 
{

    // substituting new array
    arr.splice(0, arr.length);
    
    return arr;
}

const array = [1, 2 ,3];
console.log(array);

// call the function
const result = emptyArray(array);
console.log(result);
