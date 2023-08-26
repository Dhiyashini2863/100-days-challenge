// getting kilometer input from the user
const kilo_meter = prompt("Enter the kilometer value: ")

// conversion factor for kilo_meter to mile
const factor = 0.621371

// calculate miles
const miles = kilo_meter * factor

console.log(`${kilo_meter} kms = ${miles} miles.`);
