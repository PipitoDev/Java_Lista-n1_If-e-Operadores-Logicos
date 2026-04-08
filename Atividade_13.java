package ExercíciosJava_1;

import java.util.Scanner;

public class Atividade_13 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int year;
        System.out.println("Verificador de ano bissexto. \n" +
                "Informe o ano que deseja verificar:");
        year=scan.nextInt();
        if(year%4==0&&year%100!=0||year%400==0){
            System.out.println("O ano de " +year+ " é bissexto!");
        } else {
            System.out.println("O ano de " +year+ " não é bissexto!");
        }scan.close();
    }
}
