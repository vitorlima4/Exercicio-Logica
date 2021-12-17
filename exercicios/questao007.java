package exercicios;

import java.util.Scanner;

/*
    Leia quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto
    de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).
*/

public class questao007 {
    public static void main(String[] args) {
        int a, b, c, d, diferenca;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Informe o primeiro valor: ");
        a = entrada.nextInt();
        System.out.println("Informe o segundo valor: ");
        b = entrada.nextInt();
        System.out.println("Informe o terceiro valor: ");
        c = entrada.nextInt();
        System.out.println("Informe o quarto valor: ");
        d = entrada.nextInt();
        
        diferenca = (a * b - c * d);
        
        System.out.println("DIFERENÇA = " +diferenca);
         
        
    }
}
