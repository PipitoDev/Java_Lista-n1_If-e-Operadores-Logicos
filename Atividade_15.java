package ExercíciosJava_1;

import java.util.Scanner;

public class Atividade_15 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int side1, side2, side3;
        System.out.println("Informe três valores separadamente:");
        side1=scan.nextInt();
        side2=scan.nextInt();
        side3=scan.nextInt();
        if(side1+side2>side3&&side1+side3>side2&&side2+side3>side1){
            System.out.println("É possível formar um triângulo com esses valores!");
        } else {
            System.out.println("Não é possível formar um triângulo com esses valores!");
        }scan.close();
    }
}
