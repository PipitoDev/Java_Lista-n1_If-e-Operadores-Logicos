package ExercíciosJava_1;

import java.util.Scanner;

public class Atividade_6 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int idade;
        System.out.println("Digite a sua idade");
        idade=scanner.nextInt();
        if(idade>=0&&idade<=12){
            System.out.println("Infantil");
        }else if(idade>=13&&idade<=17){
            System.out.println("Adolecente");
        }else if (idade>=18&&idade<=64){
            System.out.println("Adulto");
        }else if (idade>=65&&idade<=100){
            System.out.println("Idoso");
        }else if (idade>100){
            System.out.println("Virou pó.");
        } else {
            System.out.println("Não nasceu ainda.");
        }scanner.close();
    }
}
