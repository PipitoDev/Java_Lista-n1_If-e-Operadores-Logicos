package ExercíciosJava_1;

import java.util.Scanner;

public class Atividade_14 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        double result;
        System.out.println("Insira a nota:");
        result=scan.nextDouble();
        if(result>=7){
            System.out.println("Aprovado!");
        } else {
            System.out.println("Reprovado!");
        }scan.close();
    }
}
