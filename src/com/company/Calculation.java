package com.company;

public class Calculation {

    /**
     * La fonction calcule la mensualité d'un cresdit immobilier incluant les intéret et l'assurance
     * @param takenCapital - correspond au capital emprunté au départ
     * @param annualRate - taux d'intéret annuel 0.04 pour 4%
     * @param numberOfMonth - ici le nombre de mois, c'est le nombre de période plus génériquement, par ex: nombre de trimest * nombre d'année
     * @param insurance - taux fixe du prix de l'assurance par période en entier ex : 50
     * @return - la valeur de retour est la mensualité, ou la valeur du remboursement périodique, tout inclus
     */
    public static float monthlyPaiementCalculation(int takenCapital, float annualRate, int numberOfMonth, int insurance) {

        float monthlyPaiement = (float) ((takenCapital * annualRate / 12) / (1 - (Math.pow(1 + annualRate / 12, (numberOfMonth * -1)))));
        monthlyPaiement += insurance;
        monthlyPaiement = (float) (Math.ceil(monthlyPaiement * 100)) / 100;

        return monthlyPaiement;
    }

}
