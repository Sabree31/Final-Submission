package com.example.couproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Business_Studies extends AppCompatActivity {

    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_business__studies);

        listView=findViewById(R.id.bsListViewId);

        String[] itemNames=getResources().getStringArray(R.array.bs_fac);

        ArrayAdapter adapter=new ArrayAdapter(this,R.layout.sample_view,R.id.textViewId,itemNames);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {


            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch(position){
                    case 0:
                        //Toast.makeText(getApplicationContext(), (String)parent.getItemAtPosition(position), Toast.LENGTH_LONG).show();
                        Intent i = new Intent(Business_Studies.this,Management.class);
                        startActivity(i);
                        break;
                    case 1:
                        Intent i1 = new Intent(Business_Studies.this,AIS.class);
                        startActivity(i1);
                        break;
                    case 2:
                        Intent i2 = new Intent(Business_Studies.this,Marketing.class);
                        startActivity(i2);
                        break;
                    case 3:
                        Intent i3 = new Intent(Business_Studies.this,Finance.class);
                        startActivity(i3);
                        break;

                }
            }
        });

        listView.setAdapter(adapter);
    }
}
