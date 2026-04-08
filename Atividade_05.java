package ExercíciosJava_1;

import java.util.Scanner;

public class Atividade_5 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int age;
        System.out.println("Verificador de idade para votar.\n" +
                "Insira a idade da pessoa:");
        age=scan.nextInt();
        if(age>=16&&age<=100){
            System.out.println("Idade suficiente para votar.");
        } else{
            System.out.println("Idade insuficiente ou inválida para votar.");
        }scan.close();
    }
}
