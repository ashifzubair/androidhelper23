package com.itechsoftarehouse.androidhelper23.androidhelperlibrary;

import android.content.Context;
import android.content.Intent;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.widget.Toast;

public class UserInterface {
    Context context;

    public UserInterface(Context con) {
        this.context = con;
    }

    private static final double ver = 1.0;

    public Utility u = new Utility();

    public void toast(String msg) {
        String str;
        //Toast toast = new Toast(context);
        if (u.isnotempty(msg)) {
            str = msg;
        } else {
            str = "No message sent.";
        }
        Toast.makeText(context, str, Toast.LENGTH_LONG).show();
    }

    public void info(String info) {
        this.toast(info);
    }

    public void snack(String msg, View view) {
        String str;
        //Toast toast = new Toast(context);
        if (u.isnotempty(msg)) {
            str = msg;
        } else {
            str = "No message sent.";
        }
        Snackbar.make(view, str, Snackbar.LENGTH_LONG).show();
        //Toast.makeText(context, str, Toast.LENGTH_LONG).show();

    }

    public void callActivity(Class<?> toClass) {
        Intent i = new Intent(context, toClass);
        context.startActivity(i);
    }


}

