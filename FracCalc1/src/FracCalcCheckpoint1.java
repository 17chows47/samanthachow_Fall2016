import java.util.Scanner;

public class FracCalcCheckpoint1 {

	public static void main(String[] args){
		System.out.println("Enter statement: ");
		Scanner userInput = new Scanner(System.in);
		String statement = userInput.nextLine();
		
		System.out.println(produceAnswer(statement));
	}

	public static String produceAnswer(String statement){
		String [] statmentParts = statement.split(" ");
		String firstOperand = statementParts[0];
		String operator = statementParts[1];
		String secondOperand = statementParts[2];
		return secondOperand;
	}
}
