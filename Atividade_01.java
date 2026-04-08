package ExercíciosJava_1;

import java.util.Scanner;

public class Atividade_1 {
    public static void main(String[] args) {
        double payment;
        Scanner scan=new Scanner(System.in);
        System.out.println("Informe o salário do empregado:");
        payment=scan.nextDouble();
        if(payment>2000){
            System.out.println("Salário alto!");
        } else if(payment<=2000&&payment>=1){
            System.out.println("Salário baixo!");
        } else{
            System.out.println("Valor inválido informado!");
        }scan.close();

    }
}
