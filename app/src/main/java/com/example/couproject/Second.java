package com.example.couproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Second extends AppCompatActivity {

    private ListView listView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        listView=findViewById(R.id.ListViewId);

        String[] itemNames=getResources().getStringArray(R.array.item_names);

        ArrayAdapter adapter=new ArrayAdapter(this,R.layout.sample_view,R.id.textViewId,itemNames);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {


            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch(position){
                    case 0:
                        //Toast.makeText(getApplicationContext(), (String)parent.getItemAtPosition(position), Toast.LENGTH_LONG).show();
                        Intent i = new Intent(Second.this,Home.class);
                        startActivity(i);
                        break;
                    case 1:
                        Intent i1 = new Intent(Second.this,Faculty_and_Dept.class);
                        startActivity(i1);
                        break;
                    case 2:
                        Intent i2 = new Intent(Second.this,Admission.class);
                        startActivity(i2);
                        break;
                    case 3:
                        Intent i3 = new Intent(Second.this,notice_board.class);
                        startActivity(i3);
                        break;
                    case 4:
                        Intent i4 = new Intent(Second.this,Administration.class);
                        startActivity(i4);
                        break;
                    case 5:
                        Intent i5 = new Intent(Second.this,Facilities.class);
                        startActivity(i5);
                        break;
                    case 6:
                        Intent i6 = new Intent(Second.this,blogs_and_journals.class);
                        startActivity(i6);
                        break;
                    case 7:
                        Intent i7 = new Intent(Second.this,About_Us.class);
                        startActivity(i7);
                        break;



                }
            }
        });

        listView.setAdapter(adapter);
    }
}
