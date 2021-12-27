package exercicios;

import java.util.Scanner;

/*
    Ler as notas da 1a. e 2a. avaliações de um aluno. Calcular a média aritmética
    simples e escrever uma mensagem que diga se o aluno foi ou não aprovado 
    (considerar que nota igual ou maior que 6 o
    aluno é aprovado). Escrever também a média calculada.
*/

public class questao012 {
    public static void main(String[] args) {
        double nota1, nota2, media;
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe a primeira nota: ");
        nota1 = entrada.nextDouble();
        System.out.println("Informe a segunda nota: ");
        nota2 = entrada.nextDouble();
        
        media = (nota1 + nota2)/2;
        
        if(media >= 6){
            System.out.println("Média: " +media+ "\nSituação: aprovado");
        }else{
            System.out.println("Média: " +media+ "\nSituação: reprovado");
        }
    }
}
