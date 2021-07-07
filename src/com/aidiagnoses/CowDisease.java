package com.aidiagnoses;

public class CowDisease {

    // FOR TESTING
//    public static void main(String[] args) {
        int []tes = { 0,0,1,0,1,0,1,1,0,0,0,0,0,0,1,0,1,0,0,0,0 };
//        System.out.println(diagnoseDiseaseWithIndex(tes));
//        System.out.println(diagnoseDiseaseWithString(tes));
//    }

    public static String diagnoseDiseaseWithString(int[] gejala) {
        Calculation calc = new Calculation(gejala);
        return calc.rankWithString();
    }

    public static int diagnoseDiseaseWithIndex(int[] gejala) {
        Calculation calc = new Calculation(gejala);
        return calc.rankOnlyIndex();
    }
}
