package com.itechsoftarehouse.androidhelper23.androidhelperlibrary;

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

}
