package exercicios;

import java.util.Scanner;

/*
    Ler dois valores e imprimir uma das três mensagens a seguir:

    ‘Números iguais’, caso os números sejam iguais
    ‘Primeiro valor é o maior’, caso o primeiro seja maior que o segundo;
    ‘Segundo valor é o maior’, caso o segundo seja maior que o primeiro. 
*/
public class questao014 {
    public static void main(String[] args) {
        int valor1, valor2;
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o primeiro valor: ");
        valor1 = entrada.nextInt();
        System.out.println("Digite o segundo valor: ");
        valor2 = entrada.nextInt();
        
        if(valor1 > valor2){
            System.out.println("Primeiro valor é o maior: " +valor1);
        }else if(valor2 > valor1){
            System.out.println("Segundo valor é o maior: " +valor2);
        }else{
            System.out.println("Números iguais!");
        }
    }
}
