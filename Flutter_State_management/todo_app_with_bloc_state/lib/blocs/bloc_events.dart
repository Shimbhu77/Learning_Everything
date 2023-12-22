
class TodoEvent{}

class addTaskEvent extends TodoEvent{
  int id;
  String title;
  String desc;

  addTaskEvent(this.id,this.title,this.desc);
}

class removeTaskEvent extends TodoEvent{
   int id;

   removeTaskEvent(this.id);
}