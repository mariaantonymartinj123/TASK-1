
# Project Title

Title: Java Console calculator

Author: Maria Antony Martin J

Description:
         
- It is a simple, user friendly calculator program built using basic Java concepts.

- It allows users to perform arithmetic operations such as addition, subtraction, multiplication, division, modulus, and power.

- The program repeatedly performs the selected operation, and displays the result — until the user chooses to exit.


## Features

-Supports multiple arithmetic operations:

- Addition

- Subtraction

- Multiplication

- Division

- Modulus (remainder)

- Power (exponentiation)

-Easy user interaction

-Continuous loop until the user chooses Exit

-Handles division by zero

-Can be extended easily with new functions

## Working Flow

- The program starts by displaying available operations.

- The user selects an operation by entering a number between 1 and 7.

- If the user chooses Exit (7), the program terminates.

- For other options, the program asks for two inputs as type int.

- A switch statement tells which operation to perform.

- Then result is displayed and the process repeats until the user exits
## Sample Output
```text

------Java Console Calculator------
1.Add
2.Subtract
3.Multiply
4.Division
5.Modulus
6.Power
7.Exit
Choose an operation: 1
Enter the first number: 12
Enter the second number: 8
Result: 20

1.Add
2.Subtract
3.Multiply
4.Division
5.Modulus
6.Power
7.Exit
Choose an operation: 4
Enter the first number: 10
Enter the second number: 0
Result: Error! Can't divide by zero.

1.Add
2.Subtract
3.Multiply
4.Division
5.Modulus
6.Power
7.Exit
Choose an operation: 7
Exiting the calculator! Thank you!

```

## Error Handling

In this program, two types of error are handled

1. Invalid Input Handling [using try–catch]

- When the user enters something like a letter or symbol, it throws an InputMismatchException.

2. Division Error Handling [using if condition]

- For division, instead of using try–catch, a simple if-else condition is used to avoid dividing by zero
