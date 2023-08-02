package com.example.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class SwitchItemAdapter extends ArrayAdapter<SwitchItem> {
    private int resourceId;
    public SwitchItemAdapter(Context context, int textviewResId, List<SwitchItem> objects){
        super(context,textviewResId,objects);
        resourceId=textviewResId;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        SwitchItem switchitem=getItem(position);
        View view= LayoutInflater.from(getContext()).inflate(resourceId,parent,false);
        TextView name=(TextView) view.findViewById(R.id.textView2);
        TextView detail=(TextView) view.findViewById(R.id.textView3);
        name.setText(switchitem.getName());
        detail.setText(switchitem.getDetail());
        return view;
    }
}
