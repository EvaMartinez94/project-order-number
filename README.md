# Number Sorter 🎰

Number Sorter is a simple Java application that allows users to enter a list of numbers and then sort them in either ascending or descending order. 
The application also excludes the number 4 due to cultural reasons.

## Features

- Accepts a list of numbers from the user.
- Allows sorting in ascending or descending order.
- Excludes the number 4 from the list.

## Usage

1. When you run the application, it will prompt you to enter numbers one by one.
2. To finish entering numbers, type a non-numeric value.
3. After entering the numbers, you will be prompted to choose the sort order:
    - Enter `a` for ascending order.
    - Enter `d` for descending order.
4. The sorted list of numbers will be displayed.

### Example
`Welcome to the Number Sorter
Enter numbers one by one (enter a non-numeric value to finish):
Enter a number: 5
Enter a number: 3
Enter a number: 4
The number 4 is not allowed due to cultural reasons.
Enter a number: 2
Enter a number: a
Do you want to sort the numbers in ascending or descending order? (a/d): a
Sorted numbers: [2, 3, 5]´

## Notes

- The number 4 is not allowed and will be excluded from the list.
- If no valid numbers are entered, the application will display a message and terminate.
- If an invalid sort order is entered, the application will default to sorting in ascending order.
