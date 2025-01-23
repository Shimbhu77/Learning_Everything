export function add(a:number,b:number):number{
    return a+b;
}

export function substract(a:number,b:number):number{
    return a-b;
}

export function multiply(a:number,b:number):number{
    return a*b;
}

export function divide(a:number,b:number):number{

    if(b==0){
      console.log("Cannot divide by zero");
      return 0;
    }
    else{
        return a/b;
    }
}