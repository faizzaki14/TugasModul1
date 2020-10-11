package com.Faizzakiramadhan.TugasModul1.Nomor1;

public class Celcius {

    double toFahrenheit(){
        return (KonverterSuhu.SuhuAwal*1.8+32);
    }
    double toReamur(){
        return (KonverterSuhu.SuhuAwal*0.8);
    }
    double toKelvin(){
        return (KonverterSuhu.SuhuAwal+273.15);
    }
}
