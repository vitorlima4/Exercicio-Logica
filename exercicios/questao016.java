package exercicio;

import java.util.Scanner;

/*
    Escreva um algoritmo para ler as notas da 1a. e 2a. avaliações de um aluno, calcule e imprima a
    média (simples) desse aluno. Só devem ser aceitos valores válidos durante a leitura (0 a 10) para cada
    nota. 

    Acrescente uma mensagem 'NOVO CÁLCULO (S/N)?' ao final do exercício. Se for
    respondido 'S' deve retornar e executar um novo cálculo, caso contrário deverá encerrar o algoritmo.
*/
public class questao016 {
    public static void main(String[] args) {
        
        String letra;
        double nota1, nota2, media;
        
        Scanner entrada = new Scanner(System.in);
        
        do{
            do{
            System.out.println("Informe a primeira nota: ");
            nota1 = entrada.nextDouble();
            }while(!(nota1 >= 0 && nota1 <= 10));

            do{
            System.out.println("Informe a segunda nota: ");
            nota2 = entrada.nextDouble();
            }while(!(nota2 >= 0 && nota2 <= 10));

            media = (nota1 + nota2)/2;

            System.out.println("Média: " +media);
            
            System.out.println("Novo cálculo (s/n)?");
            letra = entrada.next();
            
        }while("s".equals(letra));
    }
}
