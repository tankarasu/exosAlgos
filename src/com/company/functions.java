package com.company;

import java.util.Scanner;

public class functions {
    /**
     * la fonction qui lancera tout le processus, il initialisera finalPrice pour le reste du process
     */
    public static void sellProduct() {
        System.out.println("let's start");
        float finalPrice = twoReduction();
        System.out.println("It will cost " + finalPrice + " €");
        giveCashBack(finalPrice);
    }

    /**
     * ici on calcule le prix après lui avoir appliqué les remises dans un ordre précis.
     * Lorsque l'on tapera 50 en ligne de commande cela équivaudra à 50%
     * @return - la fonction içi nous retourne le prix après remise.
     */
    public static float twoReduction() {
        Scanner reduction = new Scanner(System.in);
        System.out.println("Veuillez entrez votre remise par ordre décroissant.");
        System.out.println("Votre première remise:");
        byte firstDiscount = reduction.nextByte();
        System.out.println("Votre deuxième remise:");
        byte secondDiscount = reduction.nextByte();
        if (firstDiscount < secondDiscount) {
            System.out.println("L'ordre des réductions n'est pas exacte.");
            twoReduction();
        }
        float intialPrice = 10;
        float firstReductionApplyed = intialPrice - (intialPrice * firstDiscount / 100);
        float resultingPrice;
        resultingPrice = firstReductionApplyed - (firstReductionApplyed * secondDiscount / 100);
        return resultingPrice;
    }

    /**
     * la fonction nous dispatch la monnaie en pièce et en billet.
     * @param finalPrice le prix qui servira à déduire du billet de 20€
     */
    public static void giveCashBack(float finalPrice) {
        Scanner giveMoney = new Scanner(System.in);
        System.out.println("Combien de billet de 20€ me donnez vous?");
        byte numberMoney = giveMoney.nextByte();
        if (numberMoney > 1) {
            System.out.println("C'est trop, je vais en prendre un seul.");
            numberMoney = 1;
        } else if (numberMoney <= 0) {
            System.out.println("y'a rien de gratuit dans la vie mon ami.\nBye");
            return;
        }

        String[][] cashList = {
                {"10", " bill oF 10 euros"},
                {"5", " bill oF 5 euros"},
                {"2", " coins of 2 euros"},
                {"1", " coins of 1 euros"},
                {"0.50", " coins of 50 cents"},
                {"0.20", " coins of 20 cents"},
                {"0.10", " coins of 10 cents"},
                {"0.05", " coins of 5 cents"},
                {"0.02", " coins of 2 cents"},
                {"0.01", " coins of 1 cent"}};

        float currentRest = (numberMoney * 20) - finalPrice;
        System.out.println("I give back " + currentRest + " €");
        //CurrentRest = 0 ?

        for (int i = 0; i < cashList.length; i++) {
            float eachBillAndCoin = Float.parseFloat(cashList[i][0]);
            String text = cashList[i][1];
            if (currentRest >= eachBillAndCoin) {
                byte numberOfBill = (byte) ((currentRest - (currentRest % eachBillAndCoin)) / eachBillAndCoin);
                System.out.println(numberOfBill + text);
                currentRest -= (numberOfBill * eachBillAndCoin);
                currentRest = (float) (Math.ceil(currentRest * 1000)) / 1000;
            }
        }
    }
}
