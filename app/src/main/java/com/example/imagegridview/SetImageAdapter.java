package com.example.imagegridview;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridLayout;
import android.widget.GridView;
import android.widget.ImageView;


public class SetImageAdapter extends BaseAdapter{

    public Integer[] thumbImages= {
            R.drawable.india,
            R.drawable.china,
            R.drawable.america,
            R.drawable.australia,
            R.drawable.new_zealand,
            R.drawable.portugle,

    };

    private Context Cont;

    public SetImageAdapter(Context c){
        Cont=c;
    }

    @Override
    public int getCount() {
        return thumbImages.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imgview = new ImageView(Cont);
        imgview.setLayoutParams(new GridView.LayoutParams(370,250));
        imgview.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imgview.setPadding(10,10,10,10);
        imgview.setImageResource(thumbImages[position]);

        return imgview;

    }
}