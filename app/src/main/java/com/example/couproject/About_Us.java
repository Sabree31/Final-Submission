package com.example.couproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class About_Us extends AppCompatActivity {

    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about__us);

        listView=findViewById(R.id.auListViewId);

        String[] itemNames=getResources().getStringArray(R.array.about);

        ArrayAdapter adapter=new ArrayAdapter(this,R.layout.sample_view,R.id.textViewId,itemNames);

        listView.setAdapter(adapter);
    }
}
