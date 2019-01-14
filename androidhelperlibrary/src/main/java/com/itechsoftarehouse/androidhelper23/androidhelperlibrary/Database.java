package com.itechsoftarehouse.androidhelper23.androidhelperlibrary;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;


public class Database {
    private Context context;
    private SQLiteDatabase db;
    private Utility u;
    private String lastSql;
    private int lastRowCount = 0;

    public Database(Context c) {
        context = c;
        u = new Utility();
    }

    public SQLiteDatabase Database(String dbname, Context c) {
        context = c;
        u = new Utility();
        db = context.openOrCreateDatabase(dbname, context.MODE_PRIVATE, null);
        return db;
    }

    public SQLiteDatabase openDb(String dbname) {
        if (context != null) {
            db = context.openOrCreateDatabase(dbname, context.MODE_PRIVATE, null);
            return db;
        } else {
            return null;
        }
    }

    public SQLiteDatabase getDb() {
        return db;
    }

    public String getLastSql() {
        return lastSql;
    }

    public int getLastRowCount() {
        return lastRowCount;
    }

    public Cursor query(String sql) {
        lastSql = sql;
        if (u.isnotempty(sql)) {
            return db.rawQuery(sql, null);
        } else
            return null;
    }

    public void exec(String sql) {
        lastSql = sql;
        if (u.isnotempty(sql)) {
            db.execSQL(sql);
        }
    }

    public int selectCount(String tablename, String where) {
        Cursor res = query("select count(*) recfound from " + tablename + " " + where);
        res.moveToFirst();
        return res.getInt(0);
    }

    public int selectCount(String tablename) {
        return selectCount(tablename, "");
    }

    public int selectSum(String field, String tablename, String where) {
        Cursor res = query("select sum(" + field + ") total from " + tablename + " " + where);
        res.moveToFirst();
        return res.getInt(0);
    }

    public int selectSum(String field, String tablename) {
        return selectSum(field, tablename, "");
    }

    public int selectMax(String field, String tablename, String where) {
        Cursor res = query("select max(" + field + ") maxval from " + tablename + " " + where);
        res.moveToFirst();
        return res.getInt(0);
    }

    public int selectMax(String field, String tablename) {
        return selectMax(field, tablename, "");
    }

    public int selectMin(String field, String tablename, String where) {
        Cursor res = query("select min(" + field + ") minval from " + tablename + " " + where);
        res.moveToFirst();
        return res.getInt(0);
    }

    public int selectMin(String field, String tablename) {
        return selectMin(field, tablename, "");
    }

    public Cursor selectAll(String tablename) {
        return query("select * from " + tablename);
    }

    public Cursor selectData(String fields, String tablename, String where) {
        return query("select " + fields + " from " + tablename + " " + where);
    }

    public Cursor selectData(String fields, String tablename) {
        return selectData(fields, tablename, "");
    }

    public Cursor selectWhere(String fields, String tablename, String where) {
        return query("selct " + fields + " from " + tablename + " " + where);
    }

    public Cursor selectAllWhere(String tablename, String where) {
        return query("select * from " + tablename + " " + where);
    }

    public Cursor selectAllWhere(String tablename) {
        return selectAll(tablename);
    }

    public void insert(String tablename, String fields, String values) {
        exec("insert into " + tablename + "(" + fields + ") values (" + values + ")");
    }

    public void update(String tablename, String values, String where) {
        exec("update " + tablename + " set " + values + " " + where);
    }

    public void updateData(String tablename, String field, String value, String where) {
        exec("update " + tablename + " set " + field + " = " + value + " " + where);
    }

    public void delete(String tablename, String where) {
        exec("delete from " + tablename + " " + where);
    }
}
