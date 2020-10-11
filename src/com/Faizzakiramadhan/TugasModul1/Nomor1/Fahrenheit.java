package com.Faizzakiramadhan.TugasModul1.Nomor1;

public class Fahrenheit {
    double toCelcius(){
        return ((KonverterSuhu.SuhuAwal-32)/1.8);
    }
    double toReamur(){
        return ((KonverterSuhu.SuhuAwal-32)/2.25);
    }
    double toKelvin(){
        return ((KonverterSuhu.SuhuAwal+459.67)/1.8);
    }
}
