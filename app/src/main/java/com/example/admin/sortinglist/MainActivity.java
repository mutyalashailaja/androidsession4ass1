package com.example.admin.sortinglist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.Collections;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    ListView mListview;
    Button ascending;
    Button descending;
    ArrayList<String> mArrayList;
    ArrayAdapter<String> mArrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ascending = (Button) findViewById(R.id.button);
        descending = (Button) findViewById(R.id.button2);
        mListview = (ListView) findViewById(R.id.listView);
        mArrayList = new ArrayList<>();

        mArrayList.add("January");
        mArrayList.add("Febrauary");
        mArrayList.add("March");
        mArrayList.add("April");
        mArrayList.add("May");
        mArrayList.add("June");
        mArrayList.add("July");
        mArrayList.add("August");

        ascending.setOnClickListener(this);
        descending.setOnClickListener(this);


        mArrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, android.R.id.text1, mArrayList);
        mListview.setAdapter(mArrayAdapter);
    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.button){

         Collections.sort(mArrayList);
mArrayAdapter.notifyDataSetChanged();
    }
else
        {
            if(v.getId()==R.id.button2){
                Collections.reverse(mArrayList);
                mArrayAdapter.notifyDataSetChanged();
            }
        }
}

}




