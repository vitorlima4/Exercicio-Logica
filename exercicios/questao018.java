package exercicio;

import java.util.Scanner;

/*
    Escreva um algoritmo para ler 2 valores e se o segundo valor informado for ZERO, deve ser lido
    um novo valor, ou seja, para o segundo valor não pode ser aceito o valor zero e imprimir o resultado
    da divisão do primeiro valor lido pelo segundo valor lido. (utilizar a estrutura While).

    Acrescentar uma mensagem de 'VALOR INVÁLIDO' no exercício caso o segundo valor
    informado seja ZERO.
*/

public class questao018 {
    public static void main(String[] args) {
        
        double valor1, valor2, resultado;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Informe o primeiro valor: ");
        valor1 = entrada.nextDouble();
        
        System.out.println("Informe o segundo valor: ");
        valor2 = entrada.nextDouble();
         
        while(valor2 == 0){
            System.out.println("Valor Inválido!");
            System.out.println("Informe o segundo valor novamente: ");
            valor2 = entrada.nextDouble();           
        }
        
        resultado = valor1 / valor2;
        
        System.out.println("Resultado da divisão: " +resultado);
    }
}
