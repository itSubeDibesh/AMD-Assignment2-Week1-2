import java.util.Scanner;

public class InputOutput{
    protected float input;
    protected String condition;
    protected Scanner scanner;

    /**
     * @brief: Initializing Constructor and setting scanner.
     */
    InputOutput(){
        System.out.println("- InputOutput");
        this.scanner = new Scanner(System.in);
    }

    /**
     * @brief: Setting the condition.
     */
    protected void conditionMessage(){
        System.out.println("\nType the option you desire and hit enter.");
        System.out.print(" 1. Add \n 2. Subtract \n 3. Exit \nEnter your choice: ");
    }

    /**
     * @brief: Extracting and setting condition
     */
    public void setCondition(){
        this.conditionMessage();
        switch (this.scanner.next().toUpperCase()) {
                case "ADD":
                    this.condition = "ADD";
                    break;
                case "SUBTRACT":
                    this.condition = "SUBTRACT";
                    break;
                case "EXIT":
                    this.condition = "EXIT";
                    break;
                default:
                    this.condition = "INVALID";
                    break;
            }
    }

    /**
     * @brief: Getting condition
     */
    public String getCondition(){
        return this.condition;
    } 

    /**
     * @brief: Setting the input.
     */
    private void inputMessage(int index){
        System.out.println("Enter the number["+index+"]: ");
    }

    /**
     * @brief: Extracting and setting input
     */
    public boolean setInput(int index){
        try {
            this.inputMessage(index);
            this.input = this.scanner.nextFloat();
            return true;
        } catch (Exception e) {
            System.out.println("\nInvalid input, Please enter numeric value only.");
            return false;
        }
    }

    /**
     * @brief: Getting input
     */
    public float getInput(){
        return this.input;
    }
}