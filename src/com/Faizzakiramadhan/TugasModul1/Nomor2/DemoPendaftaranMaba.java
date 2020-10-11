package com.Faizzakiramadhan.TugasModul1.Nomor2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class DemoPendaftaranMaba {
    public static void main(String[] args) {
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReaderr = new BufferedReader(inputStreamReader);
        Scanner scan = new Scanner(System.in);
        String nama = "";
        String sma = "";
        String bulan_lahir = "";
        int tgl_lhr,thn_lhr;

        System.out.println("================================");
        System.out.println("Pendaftaran Mahasiswa Baru = ");
        System.out.println("================================");

        try {
            System.out.print("Masukan Nama\t: ");
            nama = bufferedReaderr.readLine();

        } catch (IOException log) {
            log.printStackTrace();
        }

        try {
            System.out.print("Masukan Asal Sekolah \t: ");
            sma =  bufferedReaderr.readLine();

        } catch (IOException log) {
            log.printStackTrace();
        }



        System.out.println("Masukan Tanggal Lahir (ex : 14 Desember 2000) : ");
        //input ttl
        System.out.print("Tanggal (dd)\t: ");
        tgl_lhr = scan.nextInt();
        System.out.print("Bulan (mm)\t\t: ");
        bulan_lahir = scan.next();
        System.out.print("Tahun (tttt)\t: ");
        thn_lhr = scan.nextInt();

        PendaftaranMaba registe = new PendaftaranMaba(nama, sma, tgl_lhr, bulan_lahir, thn_lhr);
        System.out.println();

        System.out.println("Data Yang Dimasukan = ");
        System.out.println("Nama\t\t\t: " + registe.getNama());
        System.out.println("Asal Sekolah\t: " + registe.getsma());
        System.out.println("Tanggal Lahir\t: " + registe.gettgl_lahir() + "/" + registe.getbulan_lhr() + "/" + registe.getthn_lhr());
        //regist.getTnggl();

        System.out.println();
        System.out.println("Selamat, Pendaftaran Berhasil dilakukan ! :) ");
        System.out.println("================================");
    }
}
