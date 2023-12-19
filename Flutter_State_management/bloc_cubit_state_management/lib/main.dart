import 'package:bloc_cubit_state_management/counter_cubit.dart';
import 'package:flutter/material.dart';
import 'package:flutter_bloc/flutter_bloc.dart';

void main()
{
  runApp(MyApp());
}

class MyApp extends StatelessWidget
{
  @override
  Widget build(BuildContext context)
  {
    return MaterialApp(
      title: "Shimbhu's Counter App",
      home: MyHomePage(),
    );
  }
}

class MyHomePage extends StatefulWidget
{
   @override
   State<MyHomePage> createState(){
    return _MyHomePageState();
   }
}

class _MyHomePageState extends State<MyHomePage>
{
  int stateValue = 0;
  @override
  Widget build(BuildContext context)
  {
    return BlocProvider(
      create: (context) => CounterCubit(),
      child: Scaffold(
        appBar: AppBar(
          title: Text("Shimbhu's App"),
        ),
        body: BlocBuilder<CounterCubit,int>(
          builder: (context,value) {
            return Center(
              child: Column(
                mainAxisAlignment: MainAxisAlignment.center,
              children: [
                Text("Number : $value ",style: TextStyle(fontSize: 30,color: Colors.purple),),
                SizedBox(height: 20,),
                FloatingActionButton(onPressed: (){
                  // stateValue = stateValue+1;
    
                  // setState(() {
                    
                  // });
                  context.read<CounterCubit>().Increment();


                },
                backgroundColor: Colors.purple.shade400,
                elevation: 100,
                splashColor: Colors.green,
                child: Icon(Icons.add),
                ),
                SizedBox(height: 20,),
                FloatingActionButton(onPressed: (){
    
                  // if(stateValue > 0)
                  // {
                  //   stateValue = stateValue-1;
                  //   setState(() {
                      
                  //   });
                  // }

                  context.read<CounterCubit>().Decrement();
                  
                },
                backgroundColor: Colors.purple.shade400,
                elevation: 100,
                splashColor: Colors.red,
                child: Icon(Icons.remove),
                )
              ],
            ));
          }
        ),
      ),
    );
  }
}