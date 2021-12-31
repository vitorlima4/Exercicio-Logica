package exercicios;

import java.util.Scanner;

/*

    Faça um algoritmo para ler: a descrição do produto (nome), a quantidade adquirida
    e o preço unitário. Calcular e escrever o total (total = quantidade adquirida * preço unitário),
    o desconto e o total a pagar (total a pagar = total - desconto), sabendo-se que:

    - Se quantidade <= 5 o desconto será de 2%
    - Se quantidade > 5 e quantidade <=10 o desconto será de 3%
    - Se quantidade > 10 o desconto será de 5%

*/

public class questao015 {
    public static void main(String[] args) {
        
        String nome;
        int quantidade;
        double preco, total, totPagar, desconto;
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe o nome do produto: ");
        nome = entrada.next();
        
        System.out.println("Informe a quantidade: ");
        quantidade = entrada.nextInt();
        
        System.out.println("Informe o preço unitário: ");
        preco = entrada.nextDouble();
                        
        if(quantidade <= 5){
            desconto = 2;
        }else if(quantidade > 10){
            desconto = 5;
        }else{
            desconto = 3;
        }
        
        total = quantidade * preco;
        totPagar = total - (desconto/100);
                
        System.out.println("Nome do produto: " +nome+ 
                "\nTotal: R$" +total+ 
                "\nDesconto: " +desconto+ "%" +
                "\nTotal a pagar: R$" +totPagar);
    }
}
