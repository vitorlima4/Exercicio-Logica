package exercicios;

import java.util.Scanner;

/*
    Fazer um programa para ler um número inteiro e 
    dizer se este número é par ou ímpar
*/
public class questao010 {
    public static void main(String[] args) {
        
        int numero;
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um número: ");
        numero = entrada.nextInt();
        
        if(numero % 2 == 0){
            System.out.println("Número par.");
        }else{
            System.out.println("Número ímpar.");
        }    
    }
}
