package com.example.maintenance;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import androidx.annotation.Nullable;

public class DatabaseManager extends SQLiteOpenHelper {

    private static final String DATABASE_NAME = "employes.db";
    private static final int DATABASE_VERSION = 1;

    public DatabaseManager(Context activity) {
        super(activity, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String requete = "CREATE TABLE Employe ("
                + "empnum INTEGER PRIMARY KEY AUTOINCREMENT,"
                + "empnom TEXT NOT NULL, "
                + "empage INTEGER NOT NULL, "
                + "empfonction TEXT, "
                + "empgrade TEXT);";
        db.execSQL(requete);
        Log.i("DATABASE", "onCreate invoked");
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldV, int newV) {

    }

    public void insertData(String nom, int age, String fonction, String grade) {

        String insert = "INSERT INTO Employe (empnom, empage, empfonction, empgrade)"
                + "VALUES ('" + nom + "', " + age + ", '" + fonction + "', '" + grade +"')";
        this.getWritableDatabase().execSQL(insert);
    }

    public Cursor selectData() {
        SQLiteDatabase db = this.getWritableDatabase();
        String select = "SELECT * FROM Employe";
        Cursor cursor = null;
        if(db != null) {
            cursor = db.rawQuery(select, null);
        }
        return cursor;
    }
}
