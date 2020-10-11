package com.Faizzakiramadhan.TugasModul1.Nomor3;

import java.util.Scanner;

public class DataKaryawan {
    private static void karyawan1() {
        System.out.println("Nama \t: Faiz zaki Ramadhan");
        System.out.println("ID \t\t: 19104075");
        System.out.println("Jabatan\t: CEO Perusahaan");
    }

    private static void karyawan2() {
        System.out.println("Nama \t: Anggeral masih wiradika");
        System.out.println("ID \t\t: 19104073");
        System.out.println("Jabatan\t: Manager");
    }

    private static int JumlahKaryawan() {

        return 2;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("====================================");
        System.out.println(" Program Pendataan Data Karyawan");
        System.out.println("====================================");

        System.out.println("Jumlah Karyawan\t: " + JumlahKaryawan());
        System.out.print("Pilih Karyawan\t: ");
        int choice = scan.nextInt();

        switch (choice) {
            case 1:
                karyawan1();

                break;

            case 2:
                karyawan2();

                break;
            default:
        }
    }
}
