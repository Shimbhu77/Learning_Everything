import 'package:flutter/material.dart';
import 'package:flutter_bloc/flutter_bloc.dart';
import 'package:todo_app_with_bloc_state/blocs/todo_bloc.dart';
import 'package:todo_app_with_bloc_state/widgets/home_screen.dart';

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
      providers: [BlocProvider(create: (_)=>TodoBloc())],
       child: MaterialApp(
        title: "Shimbhu's To do Application",
        theme: ThemeData(primaryColor: Colors.grey,useMaterial3: true),
        home: HomeScreen(),
       ),
     );
  }
}

// class MyHomePage extends StatefulWidget
// {
//    @override
//    State<MyHomePage> createState()
//    {
//       return _MyHomePageState();
//    }
// }

// class _MyHomePageState extends State<MyHomePage>
// {
//   @override
//   Widget build(BuildContext context)
//   {
//      return Scaffold(
//       appBar: AppBar(
//         title: Text("To do App"),
//       ),
//       body: ,
//      );
//   }
// }