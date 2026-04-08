package ExercíciosJava_1;

import java.util.Scanner;

public class Atividade_3 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        double degreesC;
        System.out.printf("Insira a temperatura:");
        degreesC=scan.nextDouble();
        if(degreesC>40){
            System.out.printf("Temperatura extremamente alta : %.1f°C", degreesC);
        } else if(degreesC<=40&&degreesC>=15){
            System.out.printf("Temperatura dentro dos limites normais : %.1f°C", degreesC);
        } else if(degreesC<15&&degreesC>=1){
            System.out.printf("Temperatura abaixo do normal : %.1f°C", degreesC);
        } else{
            System.out.printf("Temperatura extremamente baixa : %.1f°C", degreesC);
        } scan.close();
    }
}
