package exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

/* 
    Calcular a área do círculo
    Fórmula:  area = pi . raio^2
    Considerando para este problema que pi = 3.14159   
*/

public class questao003 {
    public static void main(String[] args) {
           
        double area, raio, pi = 3.14159;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite o valor do raio: ");
        raio = entrada.nextDouble();
              
        area = pi * Math.pow(raio, 2);
        
        DecimalFormat df = new DecimalFormat("0.0000");
        System.out.println("A área do círculo é: " +df.format(area));
             
    }
}
