package com.nochitsoft.nochesky.catalog;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by nochita on 2016-04-08.
 */
public class DatabaseHelper extends SQLiteOpenHelper {
    // If you change the database schema, you must increment the database version.
    public static final int DATABASE_VERSION = 1;
    public static final String DATABASE_NAME = "Catalog.db";

    private static final String TEXT_TYPE = " TEXT";
    private static final String COMMA_SEP = ",";
    private static final String SQL_CREATE_ENTRIES =
            "CREATE TABLE " + CatalogContract.Catalog.TABLE_NAME + " (" +
                    CatalogContract.Catalog._ID + " INTEGER PRIMARY KEY," +
                    CatalogContract.Catalog.COLUMN_NAME_ID + TEXT_TYPE + COMMA_SEP +
                    CatalogContract.Catalog.COLUMN_NAME_COMMON_NAME + TEXT_TYPE + COMMA_SEP +
                    CatalogContract.Catalog.COLUMN_NAME_CONSTELLATION + TEXT_TYPE + COMMA_SEP +
                    CatalogContract.Catalog.COLUMN_NAME_TYPE + TEXT_TYPE + COMMA_SEP +
                    CatalogContract.Catalog.COLUMN_NAME_MAGNITUDE + TEXT_TYPE + COMMA_SEP +
            " )";


    public DatabaseHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(SQL_CREATE_ENTRIES);
    }
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // This database is only a cache for online data, so its upgrade policy is
        // to simply to discard the data and start over
//        db.execSQL(SQL_DELETE_ENTRIES);
//        onCreate(db);
    }
    public void onDowngrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        onUpgrade(db, oldVersion, newVersion);
    }
}
