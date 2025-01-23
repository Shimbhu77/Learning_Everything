"use strict";
Object.defineProperty(exports, "__esModule", { value: true });
exports.divide = exports.multiply = exports.substract = exports.add = void 0;
function add(a, b) {
    return a + b;
}
exports.add = add;
function substract(a, b) {
    return a - b;
}
exports.substract = substract;
function multiply(a, b) {
    return a * b;
}
exports.multiply = multiply;
function divide(a, b) {
    if (b == 0) {
        console.log("Cannot divide by zero");
        return 0;
    }
    else {
        return a / b;
    }
}
exports.divide = divide;
