import 'package:flutter/material.dart';
import 'package:flutter/widgets.dart';
import 'package:flutter_bloc/flutter_bloc.dart';
import 'package:todo_app_with_bloc_state/blocs/bloc_events.dart';
import 'package:todo_app_with_bloc_state/blocs/todo_bloc.dart';
import 'package:todo_app_with_bloc_state/blocs/todo_model.dart';

class HomeScreen extends StatefulWidget
{
   @override
   State<HomeScreen> createState(){
     return _HomeScreenState();
   }
}

class _HomeScreenState extends State<HomeScreen>
{

  final idController = TextEditingController();
  final titleController = TextEditingController();
  final descriptionController = TextEditingController();

  @override
  Widget build(BuildContext context)
  {
    final bloc = BlocProvider.of<TodoBloc>(context);
      return Scaffold(
        appBar: AppBar(
          title: Text("Todo App"),
          backgroundColor: Theme.of(context).primaryColor,
        ),
        body: BlocBuilder<TodoBloc,List<Todo>>(
          builder: (context,todos) {
            return Container(
              // color: Colors.green.shade200,
              // height: 700,
              child: Column(
                children: [
                  Container(
                    // height: 300,
                    color: Colors.white,
                    child: Column(
                      mainAxisAlignment: MainAxisAlignment.center,
                      children: [
                        Padding(
                          padding: const EdgeInsets.all(10.0),
                          child: TextField(
                            controller: idController,
                            keyboardType: TextInputType.number,
                            style: TextStyle(fontSize: 18,fontStyle: FontStyle.italic,color: Colors.purple),
                            decoration: InputDecoration(
                              hintText: 'Enter Task Id',
                              hintStyle: TextStyle(color: Colors.brown),
                              border: OutlineInputBorder(borderRadius: BorderRadius.circular(20),borderSide: BorderSide(color: Colors.yellow)),
                            ),
                          ),
                        ),
                        Padding(
                          padding: const EdgeInsets.all(10.0),
                          child: TextField(
                            controller: titleController,
                            style: TextStyle(fontSize: 18,fontStyle: FontStyle.italic,color: Colors.purple),
                            decoration: InputDecoration(
                              hintText: 'Enter Task Title',
                              hintStyle: TextStyle(color: Colors.brown),
                              border: OutlineInputBorder(borderRadius: BorderRadius.circular(20),borderSide: BorderSide(color: Colors.yellow)),
                            ),
                          ),
                        ),
                        Padding(
                          padding: const EdgeInsets.all(10.0),
                          child: TextField(
                            controller: descriptionController,
                            style: TextStyle(fontSize: 18,fontStyle: FontStyle.italic,color: Colors.purple),
                            minLines: 2,
                            maxLines: null,
                            decoration: InputDecoration(
                              hintText: 'Enter Task Description',
                              hintStyle: TextStyle(color: Colors.brown),
                              border: OutlineInputBorder(borderRadius: BorderRadius.circular(20),borderSide: BorderSide(color: Colors.yellow)),
                            ),
                          ),
                        ),
                        Padding(
                          padding: const EdgeInsets.all(10.0),
                          child: Container(
                            height: 40,
                            width: 200,
                            // color: Colors.green,
                            child: ElevatedButton(onPressed: (){
                              bloc.add(addTaskEvent(idController.text.trim() ,titleController.text.trim(), descriptionController.text.trim()));
                            }, child: const Text("Add Task",style: TextStyle(fontSize: 18,fontStyle: FontStyle.italic,color: Colors.purple),)),
                          ),
                        )
                      ],
                    ),
                  ),
                  const SizedBox(height: 10,),
                  // BlocBuilder<TodoBloc,List<Todo>>(
                  //   builder: (context,todos) {
                  //     return 
                      Expanded(
                        child: Container(
                          // height: 200,
                          // color: Colors.blue,
                          child: ListView.builder(itemCount: todos.length,itemBuilder: (context,index)
                          { 
                             return Padding(
                               padding: const EdgeInsets.all(8.0),
                               child: Container(
                                 decoration: BoxDecoration(border: Border.all(color: Colors.purple,width: 2),borderRadius: BorderRadius.circular(10)),
                                 child: ListTile(
                                  title: Text("${todos[index].id}. ${todos[index].title}",style: const TextStyle(fontSize: 20,fontStyle: FontStyle.italic,color: Colors.purple)),
                                  subtitle: Text("${todos[index].description}",style: const TextStyle(fontSize: 14,fontStyle: FontStyle.italic,color: Colors.purple)),
                                  leading: Icon(Icons.task),
                                  tileColor: Colors.yellow.shade100,
                                  trailing: ElevatedButton(onPressed: () {
                                    bloc.add(removeTaskEvent(todos[index].id));
                                  },
                                  child: const Text("Remove",style: TextStyle(fontSize: 16,fontStyle: FontStyle.italic,color: Colors.red),),)
                                 ),
                               ),
                             );
                          }),
                          
                        ),
                      ),
                    // }
                  // )
                ],
              ),
            );
          }
        ),
      );
  }
}