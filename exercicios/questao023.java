package exercicio;

import java.util.Scanner;

/*
    Ler um valor N e imprimir todos os valores inteiros entre 1 e N. Considere
    que o N será sempre maior que ZERO.
*/
public class questao023 {
    public static void main(String[] args) {
        int valorN;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Informe um valor inteiro: ");
        valorN = entrada.nextInt();
        
        while(valorN <= 0){
            System.out.println("O valor precisa ser maior que 0: ");
            valorN = entrada.nextInt();
        }
        
        for(int i = 1; i <= valorN; i++){
            System.out.println(i);
        }
    }
}
