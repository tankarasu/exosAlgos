package com.company;

public class compte_remunere {

    /**
     * la fonction calcule le résultat final d'un placement et l'affiche en console
     * @param capital - le capitale initial investi , un entier
     * @param annualRate - le taux de rémunération annuel, ex: 0.04 pour 4%
     * @param placedTimeYear - le temps de l'investissement en année
     */
    public static void remunerationCompte(int capital, float annualRate, int placedTimeYear) {

        float newCapital = (float) (capital * Math.pow((1 + annualRate), placedTimeYear));
        System.out.println(Math.ceil(newCapital *100)/100 +" euros.");

    }
}
