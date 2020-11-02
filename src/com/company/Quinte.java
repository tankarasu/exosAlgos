package com.company;

import java.math.BigInteger;

public class Quinte {
    public static void combinaison(int startingHorse, int playedHorse) {
        BigInteger chanceOrdrered = BigInteger.valueOf(fact(startingHorse));
        //Y = n ! / (p ! * (n –p)!)
        System.out.println("il y a une chance de gagner dans l'ordre sur " + chanceOrdrered);
    }

    public static int fact(int n) {
        if (n == 0) return (1);
        else return (n * fact(n - 1));
    }
}
