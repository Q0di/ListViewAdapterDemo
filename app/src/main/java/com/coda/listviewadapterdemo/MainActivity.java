package com.coda.listviewadapterdemo;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;


public class MainActivity extends ActionBarActivity {

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = (ListView) findViewById(R.id.listView);
        String[] values = getResources().getStringArray(R.array.list_adapter_array);

        //define a new adapter
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1, android.R.id.text1, values);

        //assign adapter to list view
        listView.setAdapter(adapter);

        //listView Item CLick Listener
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //list view clicked item index
                int itemPosition = position;

                //list view click item value
                String itemValue = (String) listView.getItemAtPosition(position);

                Toast.makeText(getApplicationContext(),"Position: " + itemPosition+"ListItem"+itemValue, Toast.LENGTH_LONG).show();


            }
        });

    }


}
