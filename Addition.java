/**
 * @brief: This class is used for the Addition.
 */
public class Addition extends Result{
    /**
     * @brief: Constructor to initialize the Addition class.
     */
    Addition(){
        System.out.println("- Addition");
    }

    /**
     * @brief: This function is used to add two numbers.
     */
    public void addition(float number1, float number2){
        float result = number1 + number2;
        String condition = "+";
        this.showResult(number1, condition, number2, result);
    }
}