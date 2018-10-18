package com.company;

import java.util.Scanner;

public class Main {
    public static int validarNumero(Scanner sc) {
        int numeroValidado;
        while (!sc.hasNextInt()) {
            System.out.print("¡Introduce un valor numérico entero! ");
            sc.next();
        }
        numeroValidado = sc.nextInt();
        return numeroValidado;
    }

    public static String compararNumeros(int primerNumero, int segundoNumero) {
        String cadenaResultado;
        if (primerNumero == segundoNumero) {
            cadenaResultado = "Los dos números SÍ son iguales.";
        } else {
            cadenaResultado = "Los dos números NO son iguales.";
        }
        return cadenaResultado;
    }

    public static void main(String[] args) {
        int primerNumero, segundoNumero;
        Scanner sc = new Scanner(System.in);
        System.out.println("Vamos a comparar dos números y comprobar si son iguales o no.");
        System.out.print("Introduce un primer número: ");
        primerNumero = validarNumero(sc);
        System.out.print("Introduce un segundo número: ");
        segundoNumero = validarNumero(sc);
        sc.close();
        System.out.println(compararNumeros(primerNumero, segundoNumero));
    }
}
