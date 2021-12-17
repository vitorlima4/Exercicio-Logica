package exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

/*
    Leia 2 valores de ponto flutuante de dupla precisão A e B, 
    que correspondem a 2 notas de um aluno. A seguir, calcule a média do aluno, 
    sabendo que a nota A tem peso 3.5 e a nota B tem peso 7.5 (A soma dos pesos portanto é 11). 
    Assuma que cada nota pode ir de 0 até 10.0, sempre com uma casa decimal.
*/

public class questao005 {
    public static void main(String[] args) {
        double a, b, media, pesoA = 3.5, pesoB = 7.5;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Informe a primeira nota: ");
        a = entrada.nextDouble();
        System.out.println("Informe a segunda nota: ");
        b = entrada.nextDouble();
        
        media = ((a* pesoA) + (b * pesoB)) / (pesoA + pesoB);
        
        DecimalFormat df = new DecimalFormat("0.00000");
        System.out.println("MEDIA = " +df.format(media));
    }
}
