
import 'package:flutter/material.dart';

class ProviderList extends ChangeNotifier
{
   List<int> list = [1,2,3,4];

   void add()
   {
     int last = list.last;

     list.add(last+1);

     notifyListeners();
   }
}