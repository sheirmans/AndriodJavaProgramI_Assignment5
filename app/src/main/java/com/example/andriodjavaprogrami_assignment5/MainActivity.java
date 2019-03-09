package com.example.andriodjavaprogrami_assignment5;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView listView = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        this.listView = (ListView)findViewById(R.id.listView);

        initListView();
    }

     private void initListView() {
        // TO-DO:
        // 1. Create an ArrayAdapter and add String data to it. Use .add
        // 2. Set the adaptor for the ListView
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, R.layout.list_layout_entry);
        adapter.add("First Custom Item");
        adapter.add("Second Custom Item");
        adapter.add("Third Custom Item");
        adapter.add("Fourth Custom Item");

        //alternate approach
        //String [] myObjects = {"1","2", "3","4"};
        //adapter.addAll(myObjects);

        // TO-DO: Set the adaptor for the ListView
        this.listView.setAdapter(adapter);
    }
}
