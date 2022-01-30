/**
 * @brief: This class is used for the Subtraction.
 */
public class Subtraction extends Result{
    Subtraction(){
        System.out.println("- Subtraction");
    }

    /**
     * @brief: This function is used to subtract two numbers.
     */
    public void subtraction(float number1, float number2){
        float result = number1 - number2;
        String condition = "-";
        this.showResult(number1, condition, number2, result);
    }
}