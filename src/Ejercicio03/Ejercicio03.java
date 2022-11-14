package Ejercicio03;

import java.util.Scanner;

public class Ejercicio03 {
    public static void main(String[] args) {
        /*
        Escribe un programa que solicite el peso (en Kilogramos) y la altura de una persona (en metros)
        y muestre por pantalla su índice de Masa Corporal (IMC), expresando con dos decimales.
         */
        System.out.println("Ejercicio03: Calculadora de IMC.\n");
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca su peso (en kg): ");
        double peso = sc.nextDouble();
        System.out.print("Introduzca su altura (en metros): ");
        double altura = sc.nextDouble();

        double imc = peso / Math.pow(altura, 2);
        System.out.printf("El IMC es: %.2f",imc);



    }
}
