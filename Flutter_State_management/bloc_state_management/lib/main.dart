import 'package:bloc_state_management/counter_bloc.dart';
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
     return MultiBlocProvider(
       providers: [
        BlocProvider(create: (_)=> CounterBloc()),
       ],
       child: MaterialApp(
        title: "Shimbhu's Counter App",
        home: MyHomePage(),
       ),
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
   @override
   Widget build(BuildContext context)
   {

     final counterBloc = BlocProvider.of<CounterBloc>(context);

     return Scaffold(
      appBar: AppBar(
        title: Text("Shimbhu's App"),
      ),
      body: Center(
        child: Column(
          mainAxisAlignment: MainAxisAlignment.center,
          children: [
          BlocBuilder<CounterBloc,int>(
            builder: (context,value) {
              return Text("Number : $value",style: TextStyle(fontSize: 30,color: Colors.purple),);
            }
          ),
          SizedBox(height: 10,),
          FloatingActionButton(onPressed: (){
             counterBloc.add(CounterIncremented());
          },
          backgroundColor: Colors.purple,
          child: Icon(Icons.add),
          ),
          SizedBox(height: 10,),
          FloatingActionButton(onPressed: (){
             counterBloc.add(CounterDecremented());
          },
          backgroundColor: Colors.purple,
          child: Icon(Icons.remove),
          )
        ]),
      ),
     );
   }
}