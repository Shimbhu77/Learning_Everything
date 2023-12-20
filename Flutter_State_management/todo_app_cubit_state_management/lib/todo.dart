class Todo
{
  String name;
  String description;
  DateTime ? createdAt;
  DateTime ? modifiedAt;

  Todo(
    {
      required this.name, required this.description,this.createdAt,this.modifiedAt
    }
  );

}