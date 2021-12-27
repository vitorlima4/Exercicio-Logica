package exercicios;

import java.util.Scanner;

/*
    Fazer um programa para ler um número inteiro, 
    e depois dizer se este número é negativo ou não.
*/

public class questao009 {
    public static void main(String[] args) {
        
        int numero;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite um número: ");
        numero = entrada.nextInt();
        
        if(numero >= 0){
            System.out.println("Não é negativo.");
        }else{
            System.out.println("Negativo.");
        }
    }
}
