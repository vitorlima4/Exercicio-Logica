package exercicios;

import java.text.DecimalFormat;
import java.util.Scanner;

/*
    Escreva um programa que leia o número de um funcionário, seu número de horas trabalhadas,
    o valor que recebe por hora e calcula o salário desse funcionário. A seguir,
    mostre o número e o salário do funcionário, com duas casas decimais.
*/

public class questao008 {
    public static void main(String[] args) {
        int numero, horas;
        double valorh, salario;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Informe seu número: ");
        numero = entrada.nextInt();
        System.out.println("Informe a quantidade de horas trabalhada: ");
        horas = entrada.nextInt();
        System.out.println("Informe o valor que recebe por hora: ");
        valorh = entrada.nextDouble();
        
        salario = horas * valorh;
        
        System.out.println("Número = " +numero);
        DecimalFormat df = new DecimalFormat("0.00");
        System.out.println("Salário = R$ " +df.format(salario));
    }
}
