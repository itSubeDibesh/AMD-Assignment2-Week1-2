# **Calculator**

**Note:** Make sure you have [java](https://www.oracle.com/java/technologies/downloads/#java8) installed on your machine.

## **Table of Contents**

- [**Calculator**](#calculator)
  - [**Table of Contents**](#table-of-contents)
  - [**Description**](#description)
  - [**Installation**](#installation)
  - [**Compilation**](#compilation)
  - [**Execution**](#execution)
  - [**Operation**](#operation)

## **Description**

Create a simple calculator simulator program that only does addition and subtraction.

You need to create three classes named Calculator, Addition & Subtraction

1. The Calculator class will have the main method of Java from where the whole flow of program will be initiated.
1. First, the Calculator class should take input from the user for operation.

   - If the user inputs “Add” then perform Addition
   - If the user inputs “Subtract” then perform Subtraction
   - If the user inputs other than these, you need to display a warning message and ask for input again.

     For e.g., You can display text like “What would you like to perform?” and the user provide inputs.

1. After that, the program has to ask the user to input two different numbers.
1. Once the numbers are inputted from the user, it should perform Addition and Subtraction based on the previous choice of the user.
1. The Addition class must have a method to do the sum whereas the Subtraction class must have a method to do the subtract.
1. The Calculator class needs to call those methods and retrieve the result from them and finally display them.

**_Note:_** You will need to compile all the three classes and finally run only the Calculator class since it contains the main method.

## **Installation**

Clone the repository and follow the [compilation](#compilation) and [execution](#execution) steps.

## **Compilation**

To compile the project, you need to run the following command in the terminal:

```bash
    javac Calculator.java InputOutput.java Result.java Addition.java Subtraction.java
```

## **Execution**

To run the project, you need to run the following command in the terminal:

```bash
    java Calculator
```

## **Operation**

After you run the [execution](#execution) step you will be prompted as following:

```bash
    Initializing 'Calculator' elements....

- InputOutput
- Result
- Addition
- Result
- Subtraction
- Calculator

                Calculator
        @Author: Dibesh Raj Subedi

                Menu

Type the option you desire and hit enter.
 1. Add
 2. Subtract
 3. Exit
Enter your choice:
```

Now enter `add` or `subtract` accordingly if you want to exit, enter `exit`. When you enter `CTRL+C` the terminal exits forcefully. When add or subtract is entered you will be prompted to enter numbers to perform the operations.

When program exits, you will be observing the following output:

```bash
Initializing 'Calculator' elements....

- InputOutput
- Result
- Addition
- Result
- Subtraction
- Calculator

                Calculator
        @Author: Dibesh Raj Subedi

                Menu

Type the option you desire and hit enter.
 1. Add
 2. Subtract
 3. Exit
Enter your choice: exit

- Exiting gracefully

```
