package com.Faizzakiramadhan.TugasModul1.Nomor2;

public class PendaftaranMaba {
    String nama;
    private int tgl_lahir;
    private String bulan_lahir;
    private int thn_lahir;
    String sma;


    public PendaftaranMaba(String nama, String sma, int tgl_lahir, String bulan_lahir, int thn_lahir) {
        this.nama = nama;
        this.tgl_lahir = tgl_lahir;
        this.bulan_lahir = bulan_lahir;
        this.thn_lahir = thn_lahir;
        this.sma = sma;
    }

    public int gettgl_lahir() {
        return tgl_lahir;
    }

    public String getbulan_lhr() {
        return bulan_lahir;
    }

    public int getthn_lhr() {
        return thn_lahir;
    }

    public String getNama() {
        return nama;
    }

    public String getsma() {
        return sma;
    }
}
