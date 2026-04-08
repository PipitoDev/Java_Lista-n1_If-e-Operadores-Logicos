package ExercíciosJava_1;

import java.util.Scanner;

public class Atividade_10 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int num1, num2;
        System.out.println("Informe dois números separadamente:");
        num1=scan.nextInt();
        num2=scan.nextInt();
        if(num1==num2){
            System.out.println(num1+ " e " +num2+ " são iguais!");
        } else {
            System.out.println(num1+ " e " +num2+ " não são iguais!");
        }scan.close();
    }
}
