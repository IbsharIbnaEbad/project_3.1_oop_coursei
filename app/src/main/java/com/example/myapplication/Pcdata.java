/*
package com.example.myapplication;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

@Database(entities = usersinfo.class, exportSchema = false, version = 1)
public abstract class Pcdata extends RoomDatabase {

    private static final String Databasename = "usersdb";
    private static Pcdata instance;

    public static synchronized Pcdata getDB(Context context) {
        if (instance == null) {
            instance = Room.databaseBuilder(context, Pcdata.class, Databasename)
                    .fallbackToDestructiveMigration()
                    .allowMainThreadQueries()
                    .build();
        }
        return instance;
    }

    public abstract userinfoDao userinfoDao();

}

    */
/*public class Pcdata extends SQLiteOpenHelper {
    private static final String Databasename = "contacts";
    private static final int Database_ver = 1;
    private static final String Table_contracts = "contacts";
    private static final String Key_id = "id";
    private static final String Key_name = "name";
    private static final String Key_phone = "phoneno";

    public Pcdata(Context context) {
        super(context, Databasename, null, Database_ver);

        //database e collume e kiccu change korle version er change oibo ar nay otoona
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("CREATE TABLE" + Table_contracts +
                "(" + Key_id + " Integer PRIMARY KEY AUTOINCREMENT," + Key_name + "TEXT," + Key_phone+"TEXT"+")");
        ;
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
            db.execSQL("DROP TABLE IF EXISTS "+Table_contracts);
            onCreate(db);


    }

    public  void  addContact (String name ,String phoneno){
SQLiteDatabase db = this.getWritableDatabase();
        ContentValues values
db.insert(Table_contracts,null,)
    }*/
