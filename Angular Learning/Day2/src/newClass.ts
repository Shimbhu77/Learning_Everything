
class MscStudent
{
    
    constructor(public name:string, private _roll:number,private _fatherName:string, public city:string){};

    set roll(roll:number)
    {
        this._roll=roll;
    }

    get roll()
    {
        return this._roll;
    }

    set fatherName(fatherName:string)
    {
        this._fatherName=fatherName;
    }

    get fatherName()
    {
        return this._fatherName;
    }

}

let student = new MscStudent("Shimbhu",77,"MRK","Jaipur");

console.log(student.name);
console.log(student.roll);
console.log(student.fatherName);
console.log(student.city);