package com.example.couproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Social_Science extends AppCompatActivity {

    private ListView listView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_social__science);

        listView=findViewById(R.id.ssListViewId);

        String[] itemNames=getResources().getStringArray(R.array.ss_fac);

        ArrayAdapter adapter=new ArrayAdapter(this,R.layout.sample_view,R.id.textViewId,itemNames);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {


            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch(position){
                    case 0:
                        //Toast.makeText(getApplicationContext(), (String)parent.getItemAtPosition(position), Toast.LENGTH_LONG).show();
                        Intent i = new Intent(Social_Science.this,Archeology.class);
                        startActivity(i);
                        break;
                    case 1:
                        Intent i1 = new Intent(Social_Science.this,Economics.class);
                        startActivity(i1);
                        break;
                    case 2:
                        Intent i2 = new Intent(Social_Science.this,PA.class);
                        startActivity(i2);
                        break;
                    case 3:
                        Intent i3 = new Intent(Social_Science.this,Anthropology.class);
                        startActivity(i3);
                        break;
                    case 4:
                        Intent i4 = new Intent(Social_Science.this,journalism.class);
                        startActivity(i4);
                        break;
                }
            }
        });

        listView.setAdapter(adapter);
    }
}
