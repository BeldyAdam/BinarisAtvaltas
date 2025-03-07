package hu.szamalk;

import hu.szamalk.modell.BinarisSzamAtvalas;

public class Main {
    public static void main(String[] args) {
        program();
    }

    public static void program(){
        BinarisSzamAtvalas binaris = new BinarisSzamAtvalas();
        System.out.println(binaris.binarsDecimalba(binaris.verem.get(0)));
        binaris.binarisCsokkent(0);
        binaris.binarisNoveles(255);
    }
}