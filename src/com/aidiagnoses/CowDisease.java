package com.aidiagnoses;

public class CowDisease {

    public static String diagnoseDiseaseWithString(int[] gejala) {
        Calculation calc = new Calculation(gejala);
        return calc.rankWithString();
    }

    public static int diagnoseDiseaseWithIndex(int[] gejala) {
        Calculation calc = new Calculation(gejala);
        return calc.rankOnlyIndex();
    }
}
