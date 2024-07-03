import { input } from "pynput";
const userName = await input("what is your name: ");
const useroutPut = `Hello ${userName}, nice to meet you!`;
console.log(useroutPut);
