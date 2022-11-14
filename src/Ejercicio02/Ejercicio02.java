package Ejercicio02;

import java.util.Scanner;

public class Ejercicio02 {
    public static void main(String[] args) {
        /*
        Haz un programa que solicite un número de días y nos indique cúantas semanas contiene y cúantos dias sobran.
         */

        System.out.println("Ejercicio02: Contador de semanas y dias.\n");
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número de días: ");
        int semana = 7;
        int dias = sc.nextInt();
        int semanas = dias / semana;
        int diasResto = dias % semana;
        System.out.print("En " +dias+ " dias hay " +semanas+ " semanas y " +diasResto+ " dias.");
    }
}
