package com.example.myapplication;

import android.telecom.Call;
import android.widget.Switch;

public class SwitchItem{
    private final String name;
    private final String detail;
    public SwitchItem(String name,String detail){
        this.detail=detail;
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public String getDetail(){
        return detail;
    }
}
