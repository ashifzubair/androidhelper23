package com.itechsoftarehouse.androidhelper23.androidhelperlibrary;

import android.support.annotation.Nullable;

public class Utility {


    public boolean isempty(String str) {
        // '  ashif Zubair ' ==> 'ashif Zubair'
        if (trim(str).length() == 0)
            return true;
        else
            return false;
    }

    public boolean isempty(Integer i) {
        String val = Integer.toString(i);
        return isempty(val);
    }

    public boolean isempty(float i) {
        String val = Float.toString(i);
        return isempty(val);
    }

    public boolean isempty(Double i) {
        String val = Double.toString(i);
        return isempty(val);
    }

    public boolean isnull(@Nullable String s){
        if (s == null)
            return true;
        else
            return false;
    }

    public boolean isnotnull(@Nullable String s){
        return !isnull(s);
    }

    public boolean isnull(@Nullable Integer i){
        if (i == null)
            return true;
        else
            return false;
    }

    public boolean isnotnull(@Nullable Integer i){
        return !isnull(i);
    }

    public boolean isnotempty(String str) {
        return !isempty(str);
    }

    public boolean isnotempty(Integer i) {
        String val = Integer.toString(i);
        return isnotempty(val);
    }

    public boolean isnotempty(float i) {
        String val = Float.toString(i);
        return isnotempty(val);
    }

    public boolean isnotempty(Double i) {
        String val = Double.toString(i);
        return isnotempty(val);
    }

    public boolean iszero(Integer i) {
        if (i == 0)
            return true;
        else
            return false;
    }

    public boolean iszero(float i) {
        if (i == 0)
            return true;
        else
            return false;
    }

    public boolean iszero(Double i) {
        if (i == 0)
            return true;
        else
            return false;
    }

    public boolean isequal(String str1, String str2){
        if(str1.equals(str2))
            return true;
        else
            return false;
    }

    public String trim(String str) {
        return str.trim();
    }

    public String lower(String str) {
        return str.toLowerCase();
    }

    public String upper(String str) {
        return str.toUpperCase();
    }

    public String nvl(String val1,String val2){
        return isnotnull(val1)&&isnotempty(val1)?val1:val2;
    }

    public int nvl(int val1,int val2){
        return isnotempty(val1)?val1:val2;
    }

    public float nvl(float val1,float val2){
        return isnotempty(val1)?val1:val2;
    }

    public double nvl(double val1,double val2){
        return isnotempty(val1)?val1:val2;
    }

}
