
import 'package:flutter/material.dart';
import 'package:flutter_state_provider/provider_list.dart';
import 'package:flutter_state_provider/provider_second_list.dart';
import 'package:provider/provider.dart';


class ProviderFirstList extends StatefulWidget
{
  @override
  State<ProviderFirstList> createState(){
    return ProviderFirstListState();
  }
}

class ProviderFirstListState extends State<ProviderFirstList>
{

  @override
  Widget build(BuildContext context)
  {
    // List<int> list = [1,2,3,4];

    return Consumer<ProviderList>(

      builder:(context, value, child) {
        return Scaffold(
        floatingActionButton: FloatingActionButton(onPressed: () {
           value.add();
        },
        child: Icon(Icons.add),
        ),
        appBar: AppBar(
          title: Text("Shimbhu"),
        ),
        body: Column(
          children: [
            Center(
              child: Container(
                // width: double.infinity,
                height: 600,
                child: ListView.builder(itemCount: value.list.length,itemBuilder: (context,index){
                  return Padding(
                    padding: const EdgeInsets.all(8.0),
                    child: Container(
                      height:200,
                      color: Colors.purple.shade300,
                      child: Center(child: Text("Number : ${value.list[index]}",style: const TextStyle(fontSize: 40,fontStyle: FontStyle.italic,color: Colors.white),)),
                    ),
                  );
                }),
              ),     
            ),
            SizedBox(height: 10,),
            ElevatedButton(onPressed: (){
                 Navigator.push(context, MaterialPageRoute(builder: (context){
                  return ProviderSecondList();
                 }));
            }, child: Icon(Icons.arrow_forward))
          ],

        ),
      );
      },
    );  
  }
}
//