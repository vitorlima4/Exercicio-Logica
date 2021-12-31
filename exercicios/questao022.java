package exercicio;

import java.util.Scanner;

/*
    Ler um valor inteiro (aceitar somente valores entre 1 e 10) e 
    escrever a tabuada de 1 a 10 do valor lido. 
*/
public class questao022 {
    public static void main(String[] args) {
        int valor;
        
        Scanner entrada = new Scanner(System.in);
        
        do{
            System.out.println("Informe um valor inteiro de 1 a 10: ");
            valor = entrada.nextInt();
        }while(!(valor >= 1 && valor <= 10));
        
        System.out.println("Multiplicação");
        for(int i = 1; i <= 10; i++){
            System.out.println(valor+ " x " +i+ " = " +valor * i);
        }
    }
}
