package ExercíciosJava_1;

import java.util.Scanner;

public class Atividade_2 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        double preco;
        System.out.println("digite o preço");
        preco=scanner.nextDouble();
        if (preco<100&&preco>0){
            double result=(preco*0.90);
            System.out.printf("seu valor com desconto e igual a R$%.2f", result);
        }else if (preco>=100){
            System.out.printf(" seu valor sem o desconto e igual a R$%.2f", preco);
        }else {
            System.out.println("valor invalido");
        }scanner.close();
    }
}
