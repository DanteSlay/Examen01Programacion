package Ejercicio01;

import java.util.Scanner;

public class Ejercicio01 {
    public static void main(String[] args) {
        /*
        Haz un ejercicio que solicite dos numeros y diga si el primero es multiplo del segundo.
        Si lo es imprimira true, y si no imprimira false
         */
        System.out.println("Ejercicio01: Detector de multiplos\n");
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el primer número: ");
        int num1 = sc.nextInt();
        System.out.print("Inmtroduce el segundo número: ");
        int num2 = sc.nextInt();

        int resto = num1 % num2;
        boolean multiplo = resto == 0;
        System.out.println(num1+ " es múltiplo de " +num2+ ": " +multiplo);
    }
}
