package Ejercicio04;

import java.util.Scanner;

public class Ejercicio04 {
    public static void main(String[] args) {
        /*
        Haz un programa que lea el nombre de un producto y su precio y calcule su precio teniendo en cuenta
        estos datos variación mensual y la anual.
         */
        System.out.println("Ejercicio04: Variación Mensual y Anual de un producto.\n");
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca el nombre del producto: ");
        String nombreProducto = sc.nextLine();
        System.out.print("Introduzca el precio del producto: ");
        double precioProducto = sc.nextDouble();
        double varMensual = -0.6, varAnual = 9;
        double resultadoMensual = (precioProducto * varMensual/100) + precioProducto;
        double resultadoAnual = (precioProducto * varAnual/100) + precioProducto;
        System.out.printf("El precio segun la variación mensual es: %.2f €\n" +
                "El precio segun la variación anual es: %.2f €", resultadoMensual, resultadoAnual );



    }
}


