
import 'package:flutter_bloc/flutter_bloc.dart';
import 'package:todo_app_with_bloc_state/blocs/bloc_events.dart';
import 'package:todo_app_with_bloc_state/blocs/todo_model.dart';




class TodoBloc extends Bloc<TodoEvent,List<Todo>>
{
   TodoBloc() : super([])
   {
     on<addTaskEvent>((event, emit) {
        
     },);

     on<removeTaskEvent>((event, emit) {
       
     },);
   }
}