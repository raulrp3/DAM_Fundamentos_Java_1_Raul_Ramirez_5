package com.company;

import java.util.Scanner;

public class Main {
    public static double validador(int opcion){
        double validado = 0;
        Scanner sc = new Scanner(System.in);
        switch (opcion){
            case  0:{
                while(!sc.hasNextInt()){
                    System.out.print("¡Por favor introduce un número entero! ");
                    sc.next();
                }
                validado = sc.nextDouble();
            }
            break;
            case 1:{
                while(!sc.hasNextDouble()){
                    System.out.print("¡Por favor introduce un número decimal! ");
                    sc.next();
                }
                validado = sc.nextDouble();
            }
            break;
        }
        return  validado;
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
        primerNumero = (int)validador(0);
        System.out.print("Introduce un segundo número: ");
        segundoNumero = (int)validador(0);
        sc.close();
        System.out.println(compararNumeros(primerNumero, segundoNumero));
    }
}
