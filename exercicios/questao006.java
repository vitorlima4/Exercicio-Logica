import java.text.DecimalFormat;
import java.util.Scanner;

/*
    Leia 3 valores, no caso, variáveis A, B e C, que são as três notas de um aluno.
    A seguir, calcule a média do aluno, sabendo que a nota A tem peso 2, a nota B tem peso 3 
    e a nota C tem peso 5. Considere que cada nota pode ir de 0 até 10.0, sempre com uma casa decimal.
*/

public class questao006 {
    public static void main(String[] args) {
        double a, b, c, media, pesoA = 2, pesoB = 3, pesoC = 5;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Informe a primeira nota: ");
        a = entrada.nextDouble();
        System.out.println("Informe a segunda nota: ");
        b = entrada.nextDouble();
        System.out.println("Informe a terceira nota: ");
        c = entrada.nextDouble();
        
        media = ((a* pesoA) + (b * pesoB) + (c * pesoC)) / (pesoA + pesoB + pesoC);
        
        DecimalFormat df = new DecimalFormat("0.0");
        System.out.println("MEDIA = " +df.format(media));
    }
}