// Define Actions
import 'package:flutter/material.dart';
import 'package:flutter_redux/flutter_redux.dart';
import 'package:redux/redux.dart';

enum CounterAction { increment, decrement }

// Define Reducer
int counterReducer(int state, action) {
  if (action == CounterAction.increment) {
    return state + 1;
  } else if (action == CounterAction.decrement) {
    return state - 1;
  }
  return state;
}

// Usage in UI
class CounterPage extends StatelessWidget {
  final Store<int> store = Store<int>(counterReducer, initialState: 0);

  @override
  Widget build(BuildContext context) {
    return StoreProvider<int>(
      store: store,
      child: Scaffold(
        appBar: AppBar(title: Text('Counter')),
        body: Center(
          child: Column(
            mainAxisAlignment: MainAxisAlignment.center,
            children: <Widget>[
              StoreConnector<int, int>(
                converter: (store) => store.state,
                builder: (context, count) {
                  return Text('$count');
                },
              ),
              SizedBox(height: 20),
              Row(
                mainAxisAlignment: MainAxisAlignment.spaceEvenly,
                children: <Widget>[
                  FloatingActionButton(
                    onPressed: () =>
                        store.dispatch(CounterAction.decrement),
                    child: Icon(Icons.remove),
                  ),
                  FloatingActionButton(
                    onPressed: () =>
                        store.dispatch(CounterAction.increment),
                    child: Icon(Icons.add),
                  ),
                ],
              ),
            ],
          ),
        ),
      ),
    );
  }
}
