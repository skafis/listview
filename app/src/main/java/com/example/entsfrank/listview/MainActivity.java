package com.example.entsfrank.listview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[]  skills = {"HTML","CSS","android","python","Django","Java","JavaScript","UX/UI","C++","Application Security SPecialist"};
    }
}
