
import 'package:flutter_bloc/flutter_bloc.dart';
import 'package:todo_app_with_bloc_state/blocs/bloc_events.dart';
import 'package:todo_app_with_bloc_state/blocs/todo_model.dart';

class TodoBloc extends Bloc<TodoEvent,List<Todo>>
{
   TodoBloc() : super([])
   {
     on<addTaskEvent>((event, emit) {
      List<Todo> list = List.from(state);
      list.add(Todo(event.id, event.title, event.desc,DateTime.now()));
      emit(list);
     },);

     on<removeTaskEvent>((event, emit) {
      List<Todo> list = List.from(state);
      list.removeWhere((todo) => todo.id==event.id);
      emit(list);
     },);
   }
  
  @override
  Stream<List<Todo>> mapEventToState(TodoEvent event) async*
  {
     if(event is addTaskEvent)
     {
      List<Todo> list = List.from(state);
      list.add(Todo(event.id, event.title, event.desc,DateTime.now()));
      yield list;

     }
     else if(event is removeTaskEvent)
     {
        List<Todo> list = List.from(state);
        list.removeWhere((todo) => todo.id==event.id);
        yield list;
     } 
  }
}