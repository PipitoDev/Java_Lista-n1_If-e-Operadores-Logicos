package ExercíciosJava_1;

import java.util.Scanner;

public class Atividade_12 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int num1, num2, num3;
        System.out.println("Escreva três números separadamente");
        num1=scan.nextInt();
        num2=scan.nextInt();
        num3=scan.nextInt();
        if(num1>num2&&num1>num3){
            System.out.println(num1+ " é o maior número!");
        } else if(num2>num1&&num2>num3){
            System.out.println(num2+ " é o maior número!");
        } else if(num3>num1&&num3>num2){
            System.out.println(num3+ " é o maior número!");
        }
        if(num1<num2&&num1<num3){
            System.out.println(num1+ " é o menor número!");
        } else if(num2<num1&&num2<num3){
            System.out.println(num2+ " é o menor número!");
        } else if(num3<num1&&num3<num2){
            System.out.println(num3+ " é o menor número!");
        }
        if(num1==num2&&num1==num3&&num2==num3){
            System.out.println(num1+ ", " +num2+ " e " +num3+ " são iguais!");
        } else if(num1==num2){
            if(num1>num3){
                System.out.println(num1+ " e " +num2+ " são iguais e maiores!");
            } else {
                System.out.println(num1+ " e " +num2+ " são iguais e menores!");
            }
        } else if(num1==num3){
            if(num1>num2){
                System.out.println(num1+ " e " +num3+ " são iguais e maiores!");
            } else {
                System.out.println(num1+ " e " +num3+ " são iguais e menores!");
            }
        } else if(num2==num3){
            if(num2>num1){
                System.out.println(num2+ " e " +num3+ " são iguais e maiores!");
            } else {
                System.out.println(num2+ " e " +num3+ " são iguais e menores!");
            }
        }scan.close();
    }//Não sei como excluir a casa decimal se o valor for apenas 0, então deixei como tipo Int por deixar mais limpo/bonito.
}
