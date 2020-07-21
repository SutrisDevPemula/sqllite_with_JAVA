package com.kodetr.resepmakanan;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class MakananImp extends SQLiteOpenHelper implements MakananInterface {

    private String NAMA_TABLE = "tbl_makanan";

    public MakananImp(Context context) {
        super(context, "db_maknan", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase sql) {
        sql.execSQL("CREATE TABLE '" + NAMA_TABLE + "'(id INTEGER, nama TEXT, gambar TEXT, harga INTEGER, diskon INTEGER )");

    }

    @Override
    public void onUpgrade(SQLiteDatabase sql, int i, int i1) {
        sql.execSQL("DROP TABLE '" + NAMA_TABLE + "'");
    }

    @Override
    public Cursor read() {
        SQLiteDatabase sql = getReadableDatabase();
        return sql.rawQuery("SELECT * FROM '" + NAMA_TABLE + "'", null);
    }

    @Override
    public void create(ResepMakanan makanan) {
        SQLiteDatabase sql = getWritableDatabase();
        sql.execSQL("INSERT INTO '" + NAMA_TABLE + "' VALUES ('" + makanan.getId() + "' '" + makanan.getNama_makanan() + "', '" + makanan.getGambar() + "', '"+makanan.getHarga()+"','"+makanan.getDiskon()+"') ");
    }

    @Override
    public void update(ResepMakanan makanan) {
        SQLiteDatabase sql = getWritableDatabase();
        sql.execSQL("UPDATE '"+ NAMA_TABLE +"' SET nama='" + makanan.getNama_makanan() + "',gambar='"+makanan.getGambar()+"',harga='"+makanan.getHarga()+"',diskon='"+makanan.getDiskon()+"' WHERE id='"+makanan.getId()+"' ");
    }

    @Override
    public void delete(int id) {
        SQLiteDatabase sql = getWritableDatabase();
        sql.execSQL("DELETE FROM '" + NAMA_TABLE + "' WHERE id='" + id + "'");
    }
}
