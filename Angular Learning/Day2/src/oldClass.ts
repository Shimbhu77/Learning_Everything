
class Student
{
    public name : string;
    private _roll : number;
    private _fatherNamer : string;
    private _city : string;

    constructor(name:string,roll:number,fatherName:string,city:string)
    {
        this.name = name;
        this._fatherNamer=fatherName;
        this._city=city;
        this._roll=roll;
    }

    set roll(roll:number)
    {
        this._roll=roll;
    }

    get roll()
    {
        return this._roll;
    }

    set city(city:string)
    {
        this._city=city;
    }

    get getCity()
    {
        return this._city;
    }

    set fatherName(fatherName:string)
    {
        this._fatherNamer=fatherName;
    }

    get fatherName()
    {
        return this._fatherNamer;
    }

}


let mscStudent = new Student("Payal",12,"Rajesh","Jaipur");

console.log(mscStudent.name);
console.log(mscStudent.getCity);