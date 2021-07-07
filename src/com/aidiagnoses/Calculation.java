package com.aidiagnoses;

import java.text.DecimalFormat;

public class Calculation {
    private final static int size = 14;
    private static int []data;
    private static int[][]diseases;
    private static String[]diagnoses;

    public Calculation(int[] data){
        Database db = new Database();
        Calculation.data = data;
        diagnoses = db.getDiagnose();
        diseases = db.getDatabaseDisease();
    }

    public String rankWithString(){
        double absoluteA;
        double [] absoluteB;
        int [] multiply;
        double[] result;
        int rank;
        absoluteA = absoluteA();
        absoluteB = absoluteB();
        multiply = multiply();
        result = resultCalculation(absoluteA, absoluteB, multiply);
        rank = defineRank(result);
        return diagnoses[rank];
    }

    public int rankOnlyIndex(){
        double absoluteA;
        double [] absoluteB;
        int [] multiply;
        double[] result;
        int rank;
        absoluteA = absoluteA();
        absoluteB = absoluteB();
        multiply = multiply();
        result = resultCalculation(absoluteA, absoluteB, multiply);
        rank = defineRank(result);
        return rank;
    }

    public static double absoluteA(){
        double result;
        double temp=0;
        for (int data: data) {
            temp += data*data;
        }
        result = Math.sqrt(temp);
        return withTwoDecimalPlaces(result);
    }

    public static double[] absoluteB(){
        double []result = new double[size];
        int idx = 0;
        double temp;
        for (int []listDisease: diseases) {
            temp=0;
            for (int disease: listDisease) {
                temp += disease*disease;
            }
            result[idx] = withTwoDecimalPlaces(Math.sqrt(temp));
            idx++;
        }
        return result;
    }

    public static int[] multiply(){
        int []result = new int[size];
        int idx = 0;
        int idxData;
        int temp;
        for (int []listDisease: diseases) {
            temp=0;
            idxData = 0;
            for (int disease: listDisease) {
                temp += disease*data[idxData++];
            }
            result[idx] = temp;
            idx++;
        }
        return result;
    }

    public static double[] resultCalculation(double absoluteA, double[] absoluteB, int[] multiply){
        double [] result = new double[size];
        for(int i=0; i<size; i++){
            result[i] = withTwoDecimalPlaces(multiply[i]/(absoluteA*absoluteB[i]));
        }
        return result;
    }

    public static int defineRank(double[] results){
        int idxGreater = 0;
        for(int i = 1; i<size; i++){
            if(results[i]>results[idxGreater]){
                idxGreater = i;
            }
        }
        return idxGreater;
    }

    public static double withTwoDecimalPlaces(double value) {
        DecimalFormat df = new DecimalFormat("#.000");
        return new Double(df.format(value));
    }
}
