package com.kodetr.resepmakanan;

import android.text.Editable;

public class ResepMakanan {

    private int id;
    private String nama_makanan;
    private String gambar;
    private Editable harga;
    private Editable diskon;

    public int getId() {
        return id;
    }

    public Editable getHarga() {
        return harga;
    }

    public void setHarga(Editable harga) {
        this.harga = harga;
    }

    public Editable getDiskon() {
        return diskon;
    }

    public void setDiskon(Editable diskon) {
        this.diskon = diskon;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNama_makanan() {
        return nama_makanan;
    }

    public void setNama_makanan(String nama_makanan) {
        this.nama_makanan = nama_makanan;
    }

    public String getGambar() {
        return gambar;
    }

    public void setGambar(String gambar) {
        this.gambar = gambar;
    }

}
