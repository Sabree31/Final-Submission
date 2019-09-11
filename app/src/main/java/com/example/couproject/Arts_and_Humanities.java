package com.example.couproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Arts_and_Humanities extends AppCompatActivity {

    private ListView listView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_arts_and__humanities);

        listView=findViewById(R.id.ahListViewId);

        String[] itemNames=getResources().getStringArray(R.array.ah_fac);

        ArrayAdapter adapter=new ArrayAdapter(this,R.layout.sample_view,R.id.textViewId,itemNames);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {


            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch(position){
                    case 0:
                        //Toast.makeText(getApplicationContext(), (String)parent.getItemAtPosition(position), Toast.LENGTH_LONG).show();
                        Intent i = new Intent(Arts_and_Humanities.this,Bangla.class);
                        startActivity(i);
                        break;
                    case 1:
                        Intent i1 = new Intent(Arts_and_Humanities.this,English.class);
                        startActivity(i1);
                        break;

                }
            }
        });

        listView.setAdapter(adapter);
    }
}
