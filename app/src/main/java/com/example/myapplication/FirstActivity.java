package com.example.myapplication;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.res.AssetFileDescriptor;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

import java.text.SimpleDateFormat;
import java.util.Date;

public class FirstActivity extends AppCompatActivity implements View.OnClickListener{
    public int find_pos(int[] array,int value){
        for(int i=0;i<array.length;i++){
            if(array[i]==value){
                return i;
            }
        }
        return -1;
    }
    public void play_music(AssetFileDescriptor file, MediaPlayer mediaPlayer){
        try {
            mediaPlayer.setDataSource(file.getFileDescriptor(), file.getStartOffset(), file.getLength());
            mediaPlayer.prepare();
            mediaPlayer.start();
            file.close();
        }
        catch (Exception e){
            printT("play error");
        }
    }
    public Button[] get_Button_list(int[] button_num){
        Button[] buttonList = new Button[button_num.length];
        for (int i = 0; i<button_num.length;i++){
            buttonList[i] = findViewById(button_num[i]);
        }
        return buttonList;
    }
    public void printT(String str1){
        if(StaticStorage.getDebugMode()){
            Toast.makeText(FirstActivity.this,str1,Toast.LENGTH_SHORT).show();
        }
    }
    public void printB(String str1){
        Toast.makeText(FirstActivity.this,str1,Toast.LENGTH_SHORT).show();
    }
    public int random_choose(int[] list){
        return list[(int)(Math.random()*list.length)];
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu,menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        MediaPlayer mediaPlayer = new MediaPlayer();
        StaticStorage.player_list.add(mediaPlayer);
        AssetFileDescriptor file;
        if(StaticStorage.getXMode()){
            file = getResources().openRawResourceFd(StaticStorage.c_crazy);
        }
        else{
            file = getResources().openRawResourceFd(random_choose(StaticStorage.resource_list_c));
        }
        play_music(file,mediaPlayer);
        printT(item.getItemId()+"");
        StaticStorage.load_theme_map();
        Integer theme_value = StaticStorage.theme_map.get(item.getItemId());
        if(theme_value != null){
            setTheme(theme_value);
            printT("try to switch color to " + theme_value);
        }
        return true;
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        int[] theme_list = StaticStorage.theme_list;
        int theme=random_choose(theme_list);
        StaticStorage.setTheme(theme);
        StaticStorage.setDebugMode(false);
        StaticStorage.setXMode(false);
        setTheme(theme);
        super.onCreate(savedInstanceState);
        setContentView(Math.random()>0.5?R.layout.newlayoutx:R.layout.newlayout);
        Button[] btn_list = get_Button_list(StaticStorage.button_list);
        for (Button button : btn_list) {
            button.setOnClickListener(this);
        }
    }
    @Override
    public void onClick(View v) {
        int Id=v.getId();
        int[] button_list = StaticStorage.button_list;
        if(Id==button_list[0]){
                Date date=new Date();
                @SuppressLint("SimpleDateFormat") SimpleDateFormat dateFormat= new SimpleDateFormat("yyyy-MM-dd :hh:mm:ss");
                printB(dateFormat.format(date));
        }
        else if(Id==button_list[1]){
                finish();
        }
        else if(Id==button_list[button_list.length-2]){
            for (MediaPlayer player : StaticStorage.player_list){
                player.stop();
            }
            StaticStorage.player_list.clear();
            printT("clear complete");
        }
        else if(Id==button_list[button_list.length-1]){
            Intent intent=new Intent(FirstActivity.this, Second_list.class);
            startActivity(intent);
        }
        else{
            int pos=find_pos(button_list,Id);
            if(pos==-1){
                printT("index error occurred");
                pos=0;
            }
            MediaPlayer mediaPlayer = new MediaPlayer();
            StaticStorage.player_list.add(mediaPlayer);
            AssetFileDescriptor file;
            if(StaticStorage.getXMode()){
                file=getResources().openRawResourceFd(StaticStorage.b_crazy);
            }
            else{
                file = getResources().openRawResourceFd(random_choose(StaticStorage.resource_list_b));
            }
            play_music(file,mediaPlayer);
            printT(""+pos);
        }
    }
}