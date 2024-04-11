package hotel.example.hotel.data;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class HotelDBhelper extends SQLiteOpenHelper {
    private static final String Database_name = "Hotel";
    private static final int Database_version = 1;
    public HotelDBhelper(@Nullable Context context) {
        super(context, Database_name, null, Database_version);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        sqLiteDatabase.execSQL("CREATE TABLE" + HuespedContrat.HuespedEntry.TABLE_NAME "(" +
                HuespedContrat.HuespedEntry._ID + "Integer primary key autoincrement, " +
                );

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
