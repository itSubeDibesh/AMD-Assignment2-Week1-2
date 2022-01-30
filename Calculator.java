/**
 * @author: 
 *      Dibesh Raj Subedi - dsubedi@ismt.edu.np, dibeshrsubedi@gmail.com
 * 
 * @note: 
 *      There is a different approach to accomplish the task assigned but 
 *      the approach conducted here only reflects the situation required on 
 *      Assignment 2.
 * 
 * @compilation:
 *      To compile the project use the following command:
 *          javac Calculator.java InputOutput.java Result.java Addition.java Subtraction.java
 * 
 * @execution:
 *      To execute the project use the following command:
 *          java Calculator
 */

/**
 * @class: Calculator
 * @brief: This class is the main class and the entry point of the program.
 */
public class Calculator extends InputOutput{ 

    Addition add;
    Subtraction sub;
    private boolean isExit = false;
    private float input1 = 0;
    private float input2 = 0; 

    /**
     * @brief: Entry Point of the Application
     */
    public static void main(String[] args) {
        try {
            System.out.println("\nInitializing 'Calculator' elements....\n");
            Calculator calculator = new Calculator();
            calculator.initialize();
            calculator.run();
        } catch (Exception e) {
            System.out.println("\n\n- Error Calculator halted.");
        }
    }

    /**
     * @brief: Initializing the elements of the application
     */
    private void initialize(){
        this.add = new Addition();
        this.sub = new Subtraction();
        System.out.println("- Calculator");
        System.out.println("\n\t\tCalculator");
        System.out.println("\t@Author: Dibesh Raj Subedi");
    }
    
    /**
     * @brief: Running the application
     */
    private void run(){
        while(!this.isExit){
            System.out.println("\n\t\tMenu");
            this.setCondition();
            switch (this.getCondition()) {
                case "ADD":
                    System.out.println("\n- Addition");
                    if(this.inputValues()){
                        this.add.addition(this.input1, this.input2);
                    }
                    break;
                case "SUBTRACT":
                    System.out.println("\n- Subtraction");
                    if(this.inputValues()){
                        this.sub.subtraction(this.input1, this.input2);
                    } 
                    break;
                case "EXIT":
                    System.out.println("\n- Exiting gracefully");
                    this.isExit = true;
                    break;
                default:
                    System.out.println("\nInvalid option\nPlease try again using different option!");
                    break;
            }
        };
    }

    private boolean inputValues(){
        boolean isValid = false;
        for(int i = 1; i <= 2; i++){
            isValid = this.setInput(i);
            if(!isValid){
                break;
            }
            if(i == 1){
                this.input1 =  this.getInput();
            } else {
                this.input2 = this.getInput();
            }
        }
        return isValid;
    }
}