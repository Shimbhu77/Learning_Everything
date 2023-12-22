import 'package:flutter/material.dart';

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
      title: "Shimbhu's To do Application",
      theme: ThemeData(primaryColor: Colors.purple,useMaterial3: true),
      home: MyHomePage(),
     );
  }
}

class MyHomePage extends StatefulWidget
{
   @override
   State<MyHomePage> createState()
   {
      return _MyHomePageState();
   }
}

class _MyHomePageState extends State<MyHomePage>
{
  @override
  Widget build(BuildContext context)
  {
     return Scaffold(
      appBar: AppBar(
        title: Text("To do App"),
      ),
      body: ,
     );
  }
}