import 'package:flutter_bloc/flutter_bloc.dart';

class CounterCubit extends Cubit<int>{
   CounterCubit() :super(0);

   void Increment(){
     emit(state+1);
   }

   void Decrement(){
    if(state>0)
    {
       emit(state-1);
    }
    
   }
}
