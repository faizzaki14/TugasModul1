package com.Faizzakiramadhan.TugasModul1.Nomor1;

import java.util.Scanner;

public class KonverterSuhu {

    static double SuhuAwal;
    static char Awal;

    public static void main(String[] args) {
        double Celcius, Fahrenheit, Kelvin, Reamur;

        Celcius celcius       = new Celcius();
        Fahrenheit fahrenheit = new Fahrenheit();
        Kelvin kelvin         = new Kelvin();
        Reamur reamur         = new Reamur();

        boolean valid = false;
        Scanner input = new Scanner(System.in);

        while (valid != true){
            System.out.println("========Program Konversi Suhu========");
            System.out.println("Alert!!!! : Masukkan Suhu dengan Cara Inputkan Angka + suhu, contoh 10 C atau 50 F,dll");
            System.out.println(" Masukkan Nilai Suhu Awal : ");
            SuhuAwal = input.nextDouble();
            Awal = input.next().charAt(0);

            switch (Awal){

                case 'C' :
                    Reamur     = celcius.toReamur();
                    Fahrenheit = celcius.toFahrenheit();
                    Kelvin     = celcius.toKelvin();

                    System.out.println("Suhu Awal = "+ SuhuAwal + " Celcius\nHasil : ");
                    System.out.println(SuhuAwal +" Celcius -> Fahrenheit = "+ Fahrenheit + " Fahrenheit");
                    System.out.println(SuhuAwal +" Celcius -> Kelvin = "+ Kelvin + " Kelvin");
                    System.out.println(SuhuAwal +" Celcius -> Reamur = "+ Reamur + " Reamur");
                    valid=true;
                    break;
                case 'F' :
                    Celcius     = fahrenheit.toCelcius();
                    Kelvin      = fahrenheit.toKelvin();
                    Reamur      = fahrenheit.toReamur();

                    System.out.println("Suhu Awal = "+ SuhuAwal + " Fahrenheit\nHasil : ");
                    System.out.println(SuhuAwal +" Fahrenheit -> Celcius = "+ Celcius + " Celcius");
                    System.out.println(SuhuAwal +" Fahrenheit -> Kelvin = "+ Kelvin + " Kelvin");
                    System.out.println(SuhuAwal +" Fahrenheit -> Reamur = "+ Reamur + " Reamur");
                    valid=true;
                    break;
                case 'K' :
                    Reamur     = kelvin.toReamur();
                    Fahrenheit = kelvin.toFahrenheit();
                    Celcius    = kelvin.toCelcius();

                    System.out.println("Suhu Awal = "+ SuhuAwal + " Kelvin\nHasil : ");
                    System.out.println(SuhuAwal +" Kelvin -> Celcius = "+ Celcius + " Celcius");
                    System.out.println(SuhuAwal +" Kelvin -> Fahrenheit = "+ Fahrenheit + " Fahrenheit");
                    System.out.println(SuhuAwal +" Kelvin -> Reamur = "+ Reamur + " Reamur");
                    valid=true;
                    break;
                case 'R' :
                    Celcius    = reamur.toCelcius();
                    Fahrenheit = reamur.toFahrenheit();
                    Kelvin     = reamur.toKelvin();

                    System.out.println("Suhu Awal = "+ SuhuAwal + " Reamur\nHasil : ");
                    System.out.println(SuhuAwal +" Reamur -> Celcius = "+ Celcius + " Celcius");
                    System.out.println(SuhuAwal +" Reamur -> Fahrenheit = "+ Fahrenheit + " Fahrenheit");
                    System.out.println(SuhuAwal +" Reamur -> Kelvin = "+ Kelvin + " Kelvin");
                    valid=true;
                    break;

                default:
                    System.out.println("Inputan Salah, Silahkan Ulangi dan Masukkan dengan benar");

            }

        }
    }
}
