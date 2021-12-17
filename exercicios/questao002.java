package exercicios;

import java.util.Scanner;

/*
    Leia 2 valores inteiros e armazene-os nas variáveis A e B. 
    Efetue a soma de A e B atribuindo o seu resultado na variável X
*/

public class questao002 {

    public static void main(String[] args) {
        
        int a, b, x;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite o valor de A: ");
        a = entrada.nextInt();
        System.out.println("Digite o valor de B: ");
        b = entrada.nextInt();
        
        x = a + b;
        
        System.out.println("O Resultado é: " +x);
              
    }   
}
