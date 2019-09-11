package com.example.couproject;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.GridView;

public class imageICT extends AppCompatActivity {

    int[] img={R.drawable.ictday,R.drawable.tofael,R.drawable.tour2018_8,
            R.drawable.ictday4,R.drawable.tour2018_2,R.drawable.tour2018_3,
            R.drawable.tour2018_5,R.drawable.tour2018_9,R.drawable.vollyball_1,
            R.drawable.vollyball_2,R.drawable.vollyball_3};

    private GridView gridView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_ict);

        gridView=findViewById(R.id.GVICT);

        CustomAdapter adapter=new CustomAdapter(this,img);
        gridView.setAdapter(adapter);


    }
}
