package com.example.entsfrank.listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[]  skills = {"HTML","CSS","android","python","Django","Java","JavaScript","UX/UI","C++","Application Security SPecialist"};

        ListAdapter theAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, skills );

        ListView theListView = (ListView) findViewById(R.id.listview);
//        tells list view what to do

        theListView.setAdapter(theAdapter);

//        theListView.setOnItemClickListener(new AdapterView.OnItemClickListener(){
//            @Override
//            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                AdapterView adapterView = null;
//                String skillspicked= "you selected " + String.valueOf(adapterView.getItemAtPosition(position));
//                Toast.makeText(MainActivity. this , skillspicked, Toast.LENGTH_SHORT).show();
//            }
//        });
        }
    }

