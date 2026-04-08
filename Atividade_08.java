package ExercíciosJava_1;

import java.util.Scanner;

public class Atividade_8 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int num;
        System.out.println("Insira um número aleatório:");
        num=scan.nextInt();
        if (num>0){
            System.out.println(num+ " é um número positivo!");
        } else if (num<0){
            System.out.println(num+ " é um número negativo!");
        } else {
            System.out.println(num+ " é zero!");
        }scan.close();
    }
}
