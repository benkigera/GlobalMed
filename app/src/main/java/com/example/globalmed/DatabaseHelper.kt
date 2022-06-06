package com.example.globalmed

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class DatabaseHelper(
    context: Context?,
) : SQLiteOpenHelper(context, DATABASE_NAME, null, DATABASE_VERSION) {

    //called when the database is created for the first time.
    override fun onCreate(db: SQLiteDatabase?) {
        db?.execSQL(GlobalMedDBContract.EmployeeEntry.SQL_CREATE_ENTRIES)
    }

    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {
        db?.execSQL(GlobalMedDBContract.EmployeeEntry.SQL_DROP_TABLE)
        onCreate(db)
    }

    companion object {
        const val DATABASE_NAME = "globalmed.db"
        const val DATABASE_VERSION = 1
    }
}