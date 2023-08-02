package com.example.myapplication;

import android.annotation.SuppressLint;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Switch;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import java.util.Arrays;
import java.util.List;

public class Second_list extends AppCompatActivity implements View.OnClickListener {
    public void printT(String str1) {
        if(StaticStorage.getDebugMode()){
            Toast.makeText(Second_list.this, str1, Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public void onClick(View v) {
        int Id = v.getId();
        if (Id == R.id.bt9) {
            finish();
        }
        if (Id == R.id.bt10) {
            StaticStorage.setXMode(false);
            StaticStorage.setDebugMode(false);
            @SuppressLint("UseSwitchCompatOrMaterialCode") Switch sw1 =findViewById(R.id.switch1);
            sw1.setOnClickListener(this);
            sw1.setChecked(StaticStorage.getXMode());
            @SuppressLint("UseSwitchCompatOrMaterialCode") Switch sw2 =findViewById(R.id.switch2);
            sw2.setOnClickListener(this);
            sw2.setChecked(StaticStorage.getDebugMode());
        }
        else if(Id==R.id.switch1){
            StaticStorage.setXMode(!StaticStorage.getXMode());
        }
        else if(Id==R.id.switch2){
            StaticStorage.setDebugMode(!StaticStorage.getDebugMode());
        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTheme(StaticStorage.getTheme());
        super.onCreate(savedInstanceState);
        setContentView(R.layout.second_list_layout);
        boolean X_mode= StaticStorage.getXMode();
        boolean debug_mode= StaticStorage.getDebugMode();

        Button bt9 = findViewById(R.id.bt9);
        bt9.setOnClickListener(this);

        Button bt10 = findViewById(R.id.bt10);
        bt10.setOnClickListener(this);

        @SuppressLint("UseSwitchCompatOrMaterialCode") Switch sw1 =findViewById(R.id.switch1);
        sw1.setOnClickListener(this);
        sw1.setChecked(X_mode);

        @SuppressLint("UseSwitchCompatOrMaterialCode") Switch sw2 =findViewById(R.id.switch2);
        sw2.setOnClickListener(this);
        sw2.setChecked(debug_mode);

        List<SwitchItem> item_list= Arrays.asList(
                new SwitchItem("function1", "nothing"),
                new SwitchItem("function1", "nothing"),
                new SwitchItem("function1", "nothing"),
                new SwitchItem("function1", "nothing"),
                new SwitchItem("function1", "nothing"),
                new SwitchItem("function1", "nothing"),
                new SwitchItem("function1", "nothing"),
                new SwitchItem("function1", "nothing"),
                new SwitchItem("function1", "nothing"),
                new SwitchItem("function1", "nothing"),
                new SwitchItem("function1", "nothing"),
                new SwitchItem("function1", "nothing"),
                new SwitchItem("function1", "nothing"),
                new SwitchItem("function1", "nothing"),
                new SwitchItem("function1", "nothing"),
                new SwitchItem("function2", "nothing"));
        SwitchItemAdapter adapter=new SwitchItemAdapter(Second_list.this,R.layout.switch_list_item,item_list);
        ListView listView=(ListView) findViewById(R.id.list_view);
        listView.setAdapter(adapter);
    }
}
