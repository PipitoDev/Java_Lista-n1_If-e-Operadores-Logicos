package ExercíciosJava_1;

import java.util.Scanner;

public class Atividade_7 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        double num1, num2, num3;
        System.out.println("Digite três números separadamente:");
        num1=scan.nextDouble();
        num2=scan.nextDouble();
        num3=scan.nextDouble();
        if(num1>num2&&num1>num3){
            System.out.println(num1+ " é o maior número!");
        } else if (num2>num1&&num2>num3) {
            System.out.println(num2+ " é o maior número!");
        } else if (num3>num1&&num3>num2){
            System.out.println(num3+ " é o maior número!");
        } else if (num1==num2&&num1==num3&&num2==num1&&num2==num3){
            System.out.println("Todos os números são iguais!");
        } else {
            System.out.println("Dois números são iguais e são os maiores!");
        }
    }
}
