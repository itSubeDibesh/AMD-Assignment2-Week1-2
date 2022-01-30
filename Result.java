/**
 * @brief: This class is used for the Result.
 */
public class Result {
    Result(){
        System.out.println("- Result");
    }

    /**
     * @brief: This function is used to print result.
     */
    protected void showResult(float number1, String condition, float number2, float result){
        System.out.println("\t "+number1+" "+condition+" "+number2+" = "+result+"\n");
        System.out.println("Any other Calculation? Follow the Menu.");
    }
}