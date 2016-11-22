import java.util.*;

public class FracCalc {

    public static void main(String[] args) 
    {
        // Read the input from the user and call produceAnswer with an equation
    	Scanner userInput = new Scanner (System.in);
    	System.out.println("Enter a statement to calculate: ");
    	String statement = userInput.nextLine();
    	
    	
    	while (!statement.equals("quit")){
    		System.out.println(produceAnswer(statement));
    		System.out.println("Enter a statement to calculate: ");
        	statement = userInput.nextLine();        	
    	}

    }
    
    public static String produceAnswer(String input){ 
    	String firstOperand;
		String operator;
		String secondOperand;
    }
}
