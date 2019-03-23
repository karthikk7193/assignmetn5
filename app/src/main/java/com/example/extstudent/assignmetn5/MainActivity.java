package com.example.extstudent.assignmetn5;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class MainActivity extends AppCompatActivity {
    private ListView mainListView = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.mainListView = (ListView) findViewById(R.id.listView);
        // TO-DO: Create a reference to the ListView widget.
        initListView();
    }

    private void initListView() {
        // TO-DO:
        // 1. Create an ArrayAdapter and add String data to it. Use .add
        // 2. Set the adaptor for the ListView
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, R.layout.list_layout_entry );
        adapter.add("Object 1");
        adapter.add("Object 2");

        String [] myObjects = {"1", "2"};
        adapter.addAll(myObjects);

        // TO-DO: Set the adaptor for the ListView
        this.mainListView.setAdapter(adapter);
    }
}