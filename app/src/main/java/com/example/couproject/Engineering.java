package com.example.couproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class Engineering extends AppCompatActivity {

    private ListView listView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_engineering);

        listView=findViewById(R.id.engListViewId);

        String[] itemNames=getResources().getStringArray(R.array.eng_fac);

        ArrayAdapter adapter=new ArrayAdapter(this,R.layout.sample_view,R.id.textViewId,itemNames);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {


            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch(position){
                    case 0:
                        Toast.makeText(getApplicationContext(), (String)parent.getItemAtPosition(position), Toast.LENGTH_LONG).show();
                        Intent i00 = new Intent(Engineering.this,ICT.class);
                        startActivity(i00);
                        break;
                    case 1:
                        Intent i01 = new Intent(Engineering.this,CSE.class);
                        startActivity(i01);
                        break;

                }
            }
        });

        listView.setAdapter(adapter);

    }
}
