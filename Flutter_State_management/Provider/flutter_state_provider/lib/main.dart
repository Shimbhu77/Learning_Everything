import 'package:flutter/material.dart';
import 'package:flutter_state_provider/provider_first_list.dart';
import 'package:flutter_state_provider/provider_list.dart';
import 'package:provider/provider.dart';

void main()
{
  runApp(MyApp());
}

class MyApp extends StatelessWidget
{

  @override
  Widget build(BuildContext context)
  {
      return MultiProvider(
        providers: [
          ChangeNotifierProvider(create: (context){
            return ProviderList();
          })
        ],
        child: MaterialApp(
          title: "Shimbhu's App",
          home: ProviderFirstList(),
        ),
      );
  }
}