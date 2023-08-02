package com.example.myapplication;

import android.media.MediaPlayer;

import java.util.ArrayList;
import java.util.HashMap;

public class StaticStorage {
    private static boolean single_mode;
    private static boolean debug_mode;
    private static int theme;
    public static int b_crazy = R.raw.audio53;
    public static int c_crazy = R.raw.a99;
    public static boolean getXMode(){
        return single_mode;
    }
    public static void setXMode(boolean X){
        single_mode=X;
    }
    public static boolean getDebugMode(){
        return debug_mode;
    }
    public static void setDebugMode(boolean de){
        debug_mode=de;
    }
    public static int getTheme(){return theme;}
    public static void setTheme(int theme1){theme=theme1;}
    public static ArrayList<MediaPlayer> player_list = new ArrayList<>();
    public static HashMap<Integer,Integer> theme_map= new HashMap<>();
    public static void load_theme_map(){
        theme_map.put(R.id.item1, R.style.Red);
        theme_map.put(R.id.item2, R.style.Pink);
        theme_map.put(R.id.item3, R.style.Yellow);
        theme_map.put(R.id.item4, R.style.Green);
        theme_map.put(R.id.item5, R.style.Blue);
        theme_map.put(R.id.item6, R.style.Blue);
        theme_map.put(R.id.item7, R.style.Purple);
        theme_map.put(R.id.item8, R.style.Purple);


    }
    public static int[] theme_list=new int[]{
            R.style.Theme_MyApplication,
            R.style.Blue,
            R.style.Purple,
            R.style.Red,
            R.style.Pink,
            R.style.Yellow,
            R.style.Green
    };
    public static int[] resource_list_c = new int[]{
            R.raw.a1,
            R.raw.a10,
            R.raw.a11,
            R.raw.a12,
            R.raw.a13,
            R.raw.a14,
            R.raw.a15,
            R.raw.a16,
            R.raw.a17,
            R.raw.a18,
            R.raw.a19,
            R.raw.a2,
            R.raw.a20,
            R.raw.a21,
            R.raw.a22,
            R.raw.a23,
            R.raw.a24,
            R.raw.a25,
            R.raw.a26,
            R.raw.a27,
            R.raw.a28,
            R.raw.a3,
            R.raw.a4,
            R.raw.a5,
            R.raw.a6,
            R.raw.a7,
            R.raw.a8,
            R.raw.a9,
            R.raw.s1,
            R.raw.s10,
            R.raw.s11,
            R.raw.s12,
            R.raw.s13,
            R.raw.s14,
            R.raw.s15,
            R.raw.s16,
            R.raw.s17,
            R.raw.s18,
            R.raw.s19,
            R.raw.s2,
            R.raw.s20,
            R.raw.s21,
            R.raw.s22,
            R.raw.s23,
            R.raw.s24,
            R.raw.s25,
            R.raw.s26,
            R.raw.s27,
            R.raw.s28,
            R.raw.s29,
            R.raw.s3,
            R.raw.s30,
            R.raw.s31,
            R.raw.s32,
            R.raw.s33,
            R.raw.s34,
            R.raw.s35,
            R.raw.s36,
            R.raw.s37,
            R.raw.s38,
            R.raw.s39,
            R.raw.s4,
            R.raw.s40,
            R.raw.s41,
            R.raw.s42,
            R.raw.s43,
            R.raw.s44,
            R.raw.s5,
            R.raw.s6,
            R.raw.s7,
            R.raw.s8,
            R.raw.s9
    },
        resource_list_b = new int[]{
                R.raw.audio110,
                R.raw.audio111,
                R.raw.audio112,
                R.raw.audio113,
                R.raw.audio114,
                R.raw.audio115,
                R.raw.audio12,
                R.raw.audio13,
                R.raw.audio14,
                R.raw.audio15,
                R.raw.audio16,
                R.raw.audio17,
                R.raw.audio18,
                R.raw.audio19,
                R.raw.audio2,
                R.raw.audio20,
                R.raw.audio21,
                R.raw.audio22,
                R.raw.audio23,
                R.raw.audio24,
                R.raw.audio25,
                R.raw.audio26,
                R.raw.audio27,
                R.raw.audio28,
                R.raw.audio29,
                R.raw.audio3,
                R.raw.audio30,
                R.raw.audio31,
                R.raw.audio32,
                R.raw.audio33,
                R.raw.audio34,
                R.raw.audio35,
                R.raw.audio36,
                R.raw.audio37,
                R.raw.audio38,
                R.raw.audio39,
                R.raw.audio4,
                R.raw.audio40,
                R.raw.audio41,
                R.raw.audio42,
                R.raw.audio43,
                R.raw.audio44,
                R.raw.audio45,
                R.raw.audio46,
                R.raw.audio47,
                R.raw.audio48,
                R.raw.audio49,
                R.raw.audio5,
                R.raw.audio50,
                R.raw.audio51,
                R.raw.audio52,
                R.raw.audio53,
                R.raw.audio54,
                R.raw.audio55,
                R.raw.audio56,
                R.raw.audio57,
                R.raw.audio58,
                R.raw.audio59,
                R.raw.audio6,
                R.raw.audio60,
                R.raw.audio61,
                R.raw.audio62,
                R.raw.audio63,
                R.raw.audio64,
                R.raw.audio65,
                R.raw.audio66,
                R.raw.audio67,
                R.raw.audio68,
                R.raw.audio69,
                R.raw.audio7,
                R.raw.audio70,
                R.raw.audio71,
                R.raw.audio72,
                R.raw.audio73,
                R.raw.audio74,
                R.raw.audio75,
                R.raw.audio76,
                R.raw.audio77,
                R.raw.audio78,
                R.raw.audio79,
                R.raw.audio8,
                R.raw.audio80,
                R.raw.audio81,
                R.raw.audio82,
                R.raw.audio83,
                R.raw.audio84,
                R.raw.audio85,
                R.raw.audio86,
                R.raw.audio87,
                R.raw.audio88,
                R.raw.audio89,
                R.raw.audio9,
                R.raw.audio90,
                R.raw.audio91,
                R.raw.audio92,
                R.raw.audio93,
                R.raw.audio94,
                R.raw.audio95,
                R.raw.audio96,
                R.raw.audio97,
                R.raw.audio98,
                R.raw.audio99,
    },
        button_list=new int[]{
                R.id.bt1,
                R.id.bt2,
                R.id.bt3,
                R.id.bt4,
                R.id.bt5,
                R.id.bt6,
                R.id.bt7,
                R.id.bt8
    };
}