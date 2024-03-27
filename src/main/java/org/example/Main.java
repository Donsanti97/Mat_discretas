package org.example;

import java.util.Scanner;

import static org.example.Validations.isNumeric;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el número de elementos que serán analizados: ");
        isNumeric(sc);
        int numElements = sc.nextInt();
        String[] elements = new String[numElements];
        int numSubconjuntos = (int) Math.pow(2, numElements);
        System.out.println("A continuación ingrese los elementos que desee: ");
        for (int i = 1; i <= numElements; i++) {
            System.out.print("Elemento " + i + ": ");
            elements[i-1] = sc.next();
        }

        for (int i = 0; i < numSubconjuntos; i++) {
            System.out.print("{");
            boolean conjuntoVacio = true;
            for (int j = 0; j < numElements; j++) {
                if ((i & (1 << j)) > 0) {
                    System.out.print(elements[j] + " ");
                    conjuntoVacio = false;
                }
            }
            if (conjuntoVacio) {
                System.out.print("Ø");
            }
            System.out.println("}");
        }

        sc.close();






    }
}