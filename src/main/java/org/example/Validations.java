package org.example;

import java.util.Scanner;

public class Validations {

    public static boolean isNumeric(Scanner scanner){
        try {
            while (!scanner.hasNextInt()) {
                System.out.println("No ha ingresado un número entero. Por favor, inténtelo de nuevo:");
                scanner.next();
            }
            return true;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
