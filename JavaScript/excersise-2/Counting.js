import { input } from "pynput";
const userInput = await input("what is the input String? ");
const userOuput = `${userInput} has ${userInput.length} character`;
console.log(userOuput);
