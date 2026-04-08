package ExercíciosJava_1;

import java.util.Scanner;

public class Atividade_4 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int idade;
        System.out.println("digite a sua idade");
        idade=scanner.nextInt();
        if(idade>=18&&idade<=120){
            System.out.println("maior de idade");
        }else if(idade>=0&&idade<18){
            System.out.println("menor de idade");
        }else{
            System.out.println("nao nasce ou ja morreu kakakkaaka");
        }scanner.close();
    }
}