package data;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.support.annotation.Nullable;

import static data.PetContractClass.PetsEntry.COLUMN_PET_BREED;
import static data.PetContractClass.PetsEntry.COLUMN_PET_GENDER;
import static data.PetContractClass.PetsEntry.COLUMN_PET_NAME;
import static data.PetContractClass.PetsEntry.COLUMN_PET_WEIGHT;
import static data.PetContractClass.PetsEntry.TABLE_NAME;
import static data.PetContractClass.PetsEntry._ID;

public final class PetsDbHelper extends SQLiteOpenHelper {

    public static  final String DATABASE_NAME = "shelter.db";
    public static  final int DATABASE_VERSION = 1;

    public PetsDbHelper(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        String SQL_CREATE_PETS_TABLE = "CREATE TABLE "
                + TABLE_NAME + "("
                + _ID + " INTEGER PRIMARY KEY AUTOINCREMENT,"
                + COLUMN_PET_NAME + " TEXT NOT NULL,"
                + COLUMN_PET_BREED + " TEXT,"
                + COLUMN_PET_GENDER + " INTEGER NOT NULL,"
                + COLUMN_PET_WEIGHT + " INTEGER NOT NULL DEFAULT  0 " + ")";

        db.execSQL(SQL_CREATE_PETS_TABLE) ;
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
