package com.itechsoftarehouse.androidhelper23.androidhelper23;

import java.util.ArrayList;

public class ArrayHelper {
    public ArrayList<Integer> index;
    public ArrayList<String> backValue;
    public ArrayList<String> frontValue;

    public ArrayHelper(){
       index = new ArrayList<Integer>();
       backValue = new ArrayList<String>();
       frontValue = new ArrayList<String>();

    }

    public void put(Integer position, String id, String val){
        index.add(position);
        backValue.add(position,id);
        frontValue.add(position,val);
    }

    public String getId(Integer position){
        return backValue.get(position);
    }

    public Integer getIntId(Integer position){
        return Integer.parseInt(backValue.get(position));
    }

    public String getValue(Integer position){
        return frontValue.get(position);
    }

    public void clear(){
        index.clear();
        backValue.clear();
        frontValue.clear();
    }

}
