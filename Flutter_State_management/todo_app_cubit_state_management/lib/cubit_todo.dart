
import 'package:flutter/material.dart';
import 'package:flutter_bloc/flutter_bloc.dart';
import 'package:todo_app_cubit_state_management/todo.dart';

class TodoCubit extends Cubit<List<Todo>>
{
  TodoCubit():super([]);
  
  void addTodo(String title,String desc)
  {
    final todo = Todo(name: title, description: desc,createdAt: DateTime.now(),modifiedAt: DateTime.now());

    emit([...state,todo]);
  }

}