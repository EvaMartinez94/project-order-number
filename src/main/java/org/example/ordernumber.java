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
                int number = Integer.parseInt(input);
                if (number == 4) {
                    System.out.println("The number 4 is not allowed due to cultural reasons.");
                } else {
                    numbers.add(number);
                }
            } catch (NumberFormatException e) {
                break;
            }
        }
        if (numbers.isEmpty()) {
            System.out.println("No valid numbers were entered.");
            scanner.close();
            return;
        }
        System.out.print("Do you want to sort the numbers in ascending or descending order? (a/d): ");
        String sortOrder = scanner.nextLine().toLowerCase();
        
        if (sortOrder.equals("a")) {
            Collections.sort(numbers);
        } else if (sortOrder.equals("d")) {
            Collections.sort(numbers, Collections.reverseOrder());
        } else {
            System.out.println("Invalid sort order entered. Sorting in ascending order by default.");
            Collections.sort(numbers);
        }

        System.out.println("Sorted numbers: " + numbers);
        scanner.close();
    }
}
