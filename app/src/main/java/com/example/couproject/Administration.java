package com.example.couproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Administration extends AppCompatActivity {

    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_administration);

        listView=findViewById(R.id.adminsListViewId);

        String[] itemNames=getResources().getStringArray(R.array.Administration);

        ArrayAdapter adapter=new ArrayAdapter(this,R.layout.sample_view,R.id.textViewId,itemNames);

        listView.setAdapter(adapter);
    }
}
