package com.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ordernumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();

        System.out.println("Welcome to the Number Sorter");
        System.out.println("Enter numbers one by one (enter a non-numeric value to finish):");

        while (true) {
            System.out.print("Enter a number: ");
            String input = scanner.nextLine();

            try {
                // Intentamos convertir la entrada a un número entero
                int number = Integer.parseInt(input);
                if (number == 4) {
                    // Si el número es 4, mostramos un mensaje y no lo añadimos a la lista
                    System.out.println("The number 4 is not allowed due to cultural reasons.");
                } else {
                    // Si el número es válido y no es 4, lo añadimos a la lista
                    numbers.add(number);
                }
            } catch (NumberFormatException e) {
                // Si se lanza una excepción NumberFormatException, rompemos el bucle
                // Esto ocurre cuando el usuario ingresa un valor no numérico
                break;
            }
        }

        if (numbers.isEmpty()) {
            // Si no se ingresaron números válidos, mostramos un mensaje y terminamos el programa
            System.out.println("No valid numbers were entered.");
            scanner.close();
            return;
        }

        // Preguntamos al usuario si desea ordenar en orden ascendente o descendente
        System.out.print("Do you want to sort the numbers in ascending or descending order? (a/d): ");
        String sortOrder = scanner.nextLine().toLowerCase();

        // Ordenamos la lista según la elección del usuario
        if (sortOrder.equals("a")) {
            Collections.sort(numbers);
        } else if (sortOrder.equals("d")) {
            Collections.sort(numbers, Collections.reverseOrder());
        } else {
            // Si la entrada no es válida, ordenamos en orden ascendente por defecto
            System.out.println("Invalid sort order entered. Sorting in ascending order by default.");
            Collections.sort(numbers);
        }

        // Mostramos los números ordenados
        System.out.println("Sorted numbers: " + numbers);
        scanner.close();
    }
}


