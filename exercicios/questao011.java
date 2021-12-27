package exercicios;

import java.util.Scanner;


/*
  As maçãs custam R$ 1,30 cada se forem compradas menos de uma dúzia, e R$ 1,00 se forem
  compradas pelo menos 12. Escreva um programa que leia o número de maçãs compradas, calcule e
  escreva o custo total da compra. 
  
 */

public class questao011 {
    public static void main(String[] args) {
        int maca;
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe o número de maças compradas: ");
        maca = entrada.nextInt();
        
        if(maca < 12){
            System.out.println("Valor: R$" +maca * 1.30);
        }else{
            System.out.println("Valor: R$" +maca * 1.00);
        }
    }
}
