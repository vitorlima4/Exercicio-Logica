package exercicios;

import java.util.Scanner;


/*
    Ler o ano atual e o ano de nascimento de uma pessoa. Escrever uma mensagem 
    que diga se ela poderá ou não votar este ano 
    (não é necessário considerar o mês em que a pessoa nasceu)
*/

public class questao013 {
    public static void main(String[] args) {
        int anoAtual, anoNasc, resultado;
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe o seu ano de nascimento: ");
        anoNasc = entrada.nextInt();
        System.out.println("Informe o ano atual: ");
        anoAtual = entrada.nextInt();
        
        resultado = anoAtual - anoNasc;
        
        if(resultado >= 18){
            System.out.println("Você poderá votar esse ano!");
        }else{
            System.out.println("Você não poderá votar esse ano!");
        }
    }
}
