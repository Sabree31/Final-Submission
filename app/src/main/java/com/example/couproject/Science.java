package com.example.couproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Science extends AppCompatActivity {

    private ListView listView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_science);

        listView=findViewById(R.id.sListViewId);

        String[] itemNames=getResources().getStringArray(R.array.s_fac);

        ArrayAdapter adapter=new ArrayAdapter(this,R.layout.sample_view,R.id.textViewId,itemNames);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {


            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch(position){
                    case 0:
                        //Toast.makeText(getApplicationContext(), (String)parent.getItemAtPosition(position), Toast.LENGTH_LONG).show();
                        Intent i = new Intent(Science.this,Mathematics.class);
                        startActivity(i);
                        break;
                    case 1:
                        Intent i1 = new Intent(Science.this,Physics.class);
                        startActivity(i1);
                        break;
                    case 2:
                        Intent i2 = new Intent(Science.this,Chemistry.class);
                        startActivity(i2);
                        break;
                    case 3:
                        Intent i3 = new Intent(Science.this,Stat.class);
                        startActivity(i3);
                        break;
                    case 4:
                        Intent i4 = new Intent(Science.this,Pharmacy.class);
                        startActivity(i4);
                        break;
                }
            }
        });

        listView.setAdapter(adapter);
    }
}
