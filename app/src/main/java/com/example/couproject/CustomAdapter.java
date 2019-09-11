package com.example.couproject;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;

public class CustomAdapter extends BaseAdapter {

    Context context;
    int[] img;
    private LayoutInflater inflater;

    CustomAdapter(Context context,int[] img){

        this.context=context;
        this.img=img;

    }

    @Override
    public int getCount() {
        return img.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        if(view==null)
        {
            inflater= (LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
            view=inflater.inflate(R.layout.sample_gridview,viewGroup,false);
        }

        ImageView imageView=view.findViewById(R.id.imageViewGV);
        imageView.setImageResource(img[i]);

        return view;
    }
}
