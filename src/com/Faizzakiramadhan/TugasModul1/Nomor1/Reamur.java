package com.Faizzakiramadhan.TugasModul1.Nomor1;

public class Reamur {
    double toFahrenheit(){
        return (KonverterSuhu.SuhuAwal*2.25+32);
    }
    double toCelcius(){
        return (KonverterSuhu.SuhuAwal/0.8);
    }
    double toKelvin(){
        return (KonverterSuhu.SuhuAwal/0.8+237.15);
    }
}
