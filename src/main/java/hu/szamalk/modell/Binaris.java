package hu.szamalk.modell;
import java.sql.SQLOutput;
import java.util.Random;
import java.util.Stack;

public class Binaris {
        Stack<Integer> verem = new Stack<>();
        Random rnd = new Random();

        public Binaris(int hossz) {
            feltolt(hossz);
        }

        public void feltolt(int hossz) {
            if(verem.isEmpty()){
                for (int i = 0; i < hossz; i++) {
                    verem.push(rnd.nextInt(0,2));
                }
            }
        }

        public void kiir(){
            System.out.println("Verem tartalma: " + verem);
        }

        public void noveles(){
            int hossz = verem.size()-1;
            int i = 0;
            while(verem.get(hossz-i).equals(1)){
                verem.set(hossz-i, 0);
                i++;
            }
            verem.set(hossz-i, 1);
        }

        public void noveles2() {
            int hossz = verem.size();
            if(verem.peek().equals(0)){
                verem.pop();
                verem.push(1);
            }
            else{
                while(verem.peek() == 1){
                    verem.pop();
                }
                verem.pop();
                verem.push(1);
                while(verem.size() != hossz){
                    verem.push(0);
                }
            }
        }
    }
