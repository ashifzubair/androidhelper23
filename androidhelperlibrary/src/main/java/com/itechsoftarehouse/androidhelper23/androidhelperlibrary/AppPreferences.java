package com.itechsoftarehouse.androidhelper23.androidhelperlibrary;


import android.content.Context;
import android.content.SharedPreferences;

public class AppPreferences {
    Context context;
    SharedPreferences sp;

    public AppPreferences(Context c) {
        context = c;
    }

    public AppPreferences(String preferenceName, Context c) {
        context = c;
        sp = c.getSharedPreferences(preferenceName, Context.MODE_PRIVATE);
    }

    public AppPreferences(String preferenceName, int mode, Context c) {
        context = c;
        sp = c.getSharedPreferences(preferenceName, mode);
    }

    public void openPreferences(String prefernecesName, int mode) {
        sp = context.getSharedPreferences(prefernecesName, mode);
    }

    public void openPreferences(String prefernecesName) {
        openPreferences(prefernecesName, Context.MODE_PRIVATE);
    }

    public void put(String key,String value){
       sp.edit().putString(key,value).apply();
    }

    public void put(String key,int value){
        sp.edit().putInt(key,value).apply();
    }

    public void put(String key,float value){
        sp.edit().putFloat(key,value).apply();
    }

    public void put(String key,long value){
        sp.edit().putLong(key,value).apply();
    }

    public void put(String key,boolean value){
        sp.edit().putBoolean(key,value).apply();
    }

    public String getString(String key){
        return sp.getString(key,null);
    }

    public int getInt(String key){
        return sp.getInt(key,0);
    }

    public float getFloat(String key){
        return sp.getFloat(key,0);
    }

    public long getLong(String key){
        return sp.getLong(key,0);
    }

    public boolean getBoolean(String key){
        return sp.getBoolean(key,false);
    }

    public boolean check(String key){
        return sp.contains(key);
    }

    public void clear(){
        sp.edit().clear();
    }

    public void remove(String key){
        sp.edit().remove(key);
    }
}
