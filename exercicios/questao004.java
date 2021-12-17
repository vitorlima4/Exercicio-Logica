package exercicios;

import java.util.Scanner;

/*  
    Leia dois valores inteiros. A seguir, calcule o produto 
    entre estes dois valores e atribua esta operação à variável PROD. 
    A seguir mostre a variável PROD.
*/

public class questao004 {
    public static void main(String[] args) {
        
        int valor1, valor2, PROD;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Informe o primeiro valor: ");
        valor1 = entrada.nextInt();
        System.out.println("Informe o segundo valor: ");
        valor2 = entrada.nextInt();
        
        PROD = valor1 * valor2;
        
        System.out.println("PROD = " +PROD);
    }
}
