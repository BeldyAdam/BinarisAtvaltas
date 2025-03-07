package hu.szamalk.modell;

import java.util.Random;
import java.util.Stack;

public class BinarisSzamAtvalas {
    public Stack<Integer> verem = new Stack<>();

    public BinarisSzamAtvalas() {
        veremFeltolt(8);
    }

    public void veremFeltolt(int hossz){
        Random rnd = new Random();
        String biSzam = "";
        for (int i = 0; i < hossz; i++) {
            biSzam += rnd.nextInt(0,2);
        }
        verem.add(Integer.parseInt(biSzam));
        System.out.println(verem.get(0));
    }

    public void binarisNoveles(int max){
        int decimalis = binarsDecimalba(verem.get(0));
        int alap = binarsDecimalba(verem.get(0));
        while (alap != max){
            alap++;
            decimalis++;
            System.out.println(decimalis);
            System.out.println(Integer.toBinaryString(decimalis));
        }
    }

    public void binarisCsokkent(int min){
        int decimalis = binarsDecimalba(verem.get(0));
        int alap = binarsDecimalba(verem.get(0));
        while (alap != min){
            alap--;
            decimalis--;
            System.out.println(decimalis);
            System.out.println(Integer.toBinaryString(decimalis));
        }
    }


    public int binarsDecimalba(int binaris) {
        int decimal = 0;
        int alap = 1;
        while (binaris > 0) {
            int utolso = binaris % 10;
            decimal += utolso * alap;
            alap = alap * 2;
            binaris = binaris / 10;
        }
        return decimal;
    }

    public Stack<Integer> getVerem() {
        return verem;
    }

}
