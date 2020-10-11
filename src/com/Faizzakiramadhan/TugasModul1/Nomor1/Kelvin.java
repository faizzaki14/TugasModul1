package com.Faizzakiramadhan.TugasModul1.Nomor1;

public class Kelvin {
    double toCelcius(){
        return (KonverterSuhu.SuhuAwal-273.15);
    }
    double toReamur(){
        return ((KonverterSuhu.SuhuAwal-273.15)*0.8);
    }
    double toFahrenheit(){
        return (KonverterSuhu.SuhuAwal*1.8-459.67);
    }
}
