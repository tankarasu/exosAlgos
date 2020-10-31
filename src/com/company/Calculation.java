package com.company;

public class Calculation {


    public static float monthlyPaiementCalculation(int takenCapital, float annualRate, int numberOfMonth, int insurance) {

        float monthlyPaiement = (float) ((takenCapital * annualRate / 12) / (1 - (Math.pow(1 + annualRate / 12, (numberOfMonth * -1)))));
        monthlyPaiement += insurance;
        monthlyPaiement = (float) (Math.ceil(monthlyPaiement * 100)) / 100;

        return monthlyPaiement;
    }

}
