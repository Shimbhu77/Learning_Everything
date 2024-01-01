"use strict";
class Student {
    constructor(name, roll, fatherName, city) {
        this.name = name;
        this._fatherNamer = fatherName;
        this._city = city;
        this._roll = roll;
    }
    set roll(roll) {
        this._roll = roll;
    }
    get roll() {
        return this._roll;
    }
    set city(city) {
        this._city = city;
    }
    get getCity() {
        return this._city;
    }
    set fatherName(fatherName) {
        this._fatherNamer = fatherName;
    }
    get fatherName() {
        return this._fatherNamer;
    }
}
let mscStudent = new Student("Payal", 12, "Rajesh", "Jaipur");
console.log(mscStudent.name);
console.log(mscStudent.getCity);
