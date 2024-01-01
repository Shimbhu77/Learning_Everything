
class TodoEvent{}

class addTaskEvent extends TodoEvent{
  String id;
  String title;
  String desc;

  addTaskEvent(this.id,this.title,this.desc);
}

class removeTaskEvent extends TodoEvent{
   String id;

   removeTaskEvent(this.id);
}