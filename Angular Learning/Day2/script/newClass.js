"use strict";
class MscStudent {
    constructor(name, _roll, _fatherName, city) {
        this.name = name;
        this._roll = _roll;
        this._fatherName = _fatherName;
        this.city = city;
    }
    ;
    set roll(roll) {
        this._roll = roll;
    }
    get roll() {
        return this._roll;
    }
    set fatherName(fatherName) {
        this._fatherName = fatherName;
    }
    get fatherName() {
        return this._fatherName;
    }
}
let student = new MscStudent("Shimbhu", 77, "MRK", "Jaipur");
console.log(student.name);
console.log(student.roll);
console.log(student.fatherName);
console.log(student.city);
