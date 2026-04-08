package ExercíciosJava_1;

import java.util.Scanner;

public class Atividade_11 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int num;
        System.out.println("Informe um número aleatório:");
        num=scan.nextInt();
        if(num%5==0){
            System.out.println("O número " +num+ " é divisível por 5.");
        } else {
            System.out.println("O número " +num+ " não é divisível por 5.");
        }scan.close();
    }
}
