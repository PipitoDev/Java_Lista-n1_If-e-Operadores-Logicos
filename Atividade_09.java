package ExercíciosJava_1;

import java.util.Scanner;

public class Atividade_9 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        double degreesC;
        System.out.println("Informe a temperatura:");
        degreesC=scan.nextDouble();
        if(degreesC>=0&&degreesC<15){
            System.out.printf("A temperatura de %.1f℃ é fria!", degreesC);
        } else if(degreesC>=15&&degreesC<=25){
            System.out.printf("A temperatura de %.1f℃ é agradável!", degreesC);
        } else if(degreesC>25&&degreesC<=40){
            System.out.printf("A temperatura de %.1f℃ é quente!", degreesC);
        } else if(degreesC>40){
            System.out.printf("A temperatura de %.1f℃ é ALTÍSSIMA!!!", degreesC);
        } else {
            System.out.printf("A temperatua de %.1f℃ é muito fria!", degreesC);
        } scan.close();
    }
}
