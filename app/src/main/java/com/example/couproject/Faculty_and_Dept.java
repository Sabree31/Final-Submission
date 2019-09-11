package com.example.couproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Faculty_and_Dept extends AppCompatActivity {

    private ListView listView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_faculty_and__dept);

        listView=findViewById(R.id.fdListViewId);

        String[] itemNames=getResources().getStringArray(R.array.fac_dept);

        ArrayAdapter adapter=new ArrayAdapter(this,R.layout.sample_view,R.id.textViewId,itemNames);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {


            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch(position){
                    case 0:
                        //Toast.makeText(getApplicationContext(), (String)parent.getItemAtPosition(position), Toast.LENGTH_LONG).show();
                        Intent i = new Intent(Faculty_and_Dept.this,Engineering.class);
                        startActivity(i);
                        break;
                    case 1:
                        Intent i1 = new Intent(Faculty_and_Dept.this,Arts_and_Humanities.class);
                        startActivity(i1);
                        break;
                    case 2:
                        Intent i2 = new Intent(Faculty_and_Dept.this,Business_Studies.class);
                        startActivity(i2);
                        break;
                    case 3:
                        Intent i3 = new Intent(Faculty_and_Dept.this,Social_Science.class);
                        startActivity(i3);
                        break;
                    case 4:
                        Intent i4 = new Intent(Faculty_and_Dept.this,Science.class);
                        startActivity(i4);
                        break;
                    case 5:
                        Intent i5 = new Intent(Faculty_and_Dept.this,Law.class);
                        startActivity(i5);
                        break;

                }
            }
        });

        listView.setAdapter(adapter);

    }
}
