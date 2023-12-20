import 'package:flutter/material.dart';
import 'package:flutter_bloc/flutter_bloc.dart';
import 'package:todo_app_cubit_state_management/cubit_todo.dart';
import 'package:todo_app_cubit_state_management/todo.dart';

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
        BlocProvider(create: (_)=> TodoCubit()),
      ],
      child: MaterialApp(
        title: "Shimbhu's Todo App",
        theme: ThemeData(primaryColor: Colors.purple,
        // primarySwatch: Colors.blue,
        useMaterial3: true,
        ),
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

  final titleController = TextEditingController();
  final descController = TextEditingController();
  @override
  Widget build(BuildContext context)
  {
     return Scaffold(
      appBar: AppBar(
        title: Text("Shimbhu's App"),
        backgroundColor: Theme.of(context).primaryColor,
        foregroundColor: Colors.white,
      ),
      body: BlocBuilder<TodoCubit,List<Todo>>(
        builder: (context,todos) {
          return Center(
            child: Container(
              color: Colors.purple.shade100,
              height: 700,
              width: 900,
              child: Column(
                mainAxisAlignment: MainAxisAlignment.center,
                children: [ 
                 Text("To Do App",style: TextStyle(fontSize: 40,fontStyle: FontStyle.italic,color: Colors.purple),),
                 SizedBox(height: 10,),
                 Container(
                  height: 200,
                  width: 600,
                  // color: Colors.green.shade200,
                   child: Column(
                        mainAxisAlignment: MainAxisAlignment.center,
                        children: [
                          TextField(
                             controller: titleController,
                             decoration: InputDecoration(
                              hintText: "Title",
                             ),
                          ),
                          TextField(
                             controller: descController,
                             decoration: InputDecoration(
                              hintText: "Description",
                             ),
                          ),
                          SizedBox(height: 20,),
                          ElevatedButton(
                            style: ButtonStyle(
                              fixedSize: MaterialStateProperty.all(Size(200, 40)),
                              backgroundColor:MaterialStateProperty.all<Color>(Colors.purple)
                            ),
                            onPressed: (){

                              context.read<TodoCubit>().addTodo(titleController.text.toString(), descController.text.toString());

                          }, child: Text("Add Task",style: TextStyle(fontSize: 18,color: Colors.white),))
                        ],
                    ),
                 ),
                 SizedBox(height: 10,),
                  Container(
                    width: 600,
                    height: 400,
                    // color: Colors.yellow.shade200,
                    child: ListView.builder(
                      scrollDirection: Axis.vertical,
                      itemCount: todos.length,itemBuilder: (context,index){
                              
                    return Padding(
                      padding: const EdgeInsets.all(8.0),
                      child: Container(
                        decoration: BoxDecoration(
                          border: Border.all(color: Colors.grey),
                          borderRadius: BorderRadius.circular(10)
                    
                        ),
                        child: ListTile(
                          title: Text(" ${index+1}.  ${todos[index].name}"),
                          subtitle: Text("${todos[index].description}"),
                          tileColor: Colors.blue,
                          focusColor: Colors.green,
                          hoverColor: Colors.brown,
                          leading: Icon(Icons.task),
                          trailing: Icon(Icons.check),
                        ),
                      ),
                    );
                              
                                }),
                  ),
              ]
              ),
            ),
          );
        }
      ),
     );
  }
}


