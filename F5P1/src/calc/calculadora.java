package calc;

public class calculadora {
 
	public static double soma(double a, double b){
		double value;
		value = a + b;
		return value;
	}
	
	public static double sub(double operand1, double operand2){

		double value;
		value = operand1 - operand2;
		return value;
	}

	public static double div(double operand1, double operand2){

		double value = operand1 / operand2;
		return value;
	}

	public static double mult(double operand1, double operand2){

		double value;
		value = operand1 * operand2;
		return value;
	}
}
