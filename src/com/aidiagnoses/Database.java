package com.aidiagnoses;

public class Database {

    private final String[] diagnose = {
            "Brucellosis", "Mastitis", "Septicemia Epizootia", "Pink Eye", "Helminthiasis", "Bovine Ephermeral Fever", "Scabies", "Laminitis", "Abses", "Bloat", "Endometritis", "Pneumonia", "Retensi Plasenta", "Hipocalsemia"
    };

    public String[] getDiagnose() {
        return diagnose;
    }

    private final int[][] databaseDisease = {
            {1,1,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
            {0,0,0,0,1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0},
            {0,1,1,0,0,0,1,1,1,0,0,0,0,0,0,0,0,0,0,0,0},
            {0,0,1,0,1,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0},
            {0,0,1,1,0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0},
            {0,1,1,0,1,0,1,1,0,0,0,1,1,0,0,0,0,0,0,0,0},
            {0,0,1,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0},
            {0,0,1,0,0,0,0,0,0,0,0,1,0,0,1,0,0,0,0,0,0},
            {0,0,0,0,0,0,1,0,0,0,0,0,0,0,0,1,0,0,0,0,0},
            {0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,1,1,0,0,0},
            {0,0,1,0,1,0,1,0,0,0,0,0,0,0,0,0,0,0,1,0,0},
            {0,0,1,0,1,0,1,0,0,0,0,0,0,0,0,0,1,0,0,1,0},
            {0,0,1,1,0,0,1,0,0,0,0,0,0,0,0,0,0,0,1,0,0},
            {0,0,1,0,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,1},
    };

    public int[][] getDatabaseDisease() {
        return databaseDisease;
    }
}
