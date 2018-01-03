package pl.cwiczenia;

public class CalculatorModel {
	private double calculationValue;
	
	private double calculate(String type, double firstNum, double secondNum) {
		switch(type) {
		case "+":return firstNum+secondNum;
		case "-":return firstNum-secondNum;
		case "*":return firstNum*secondNum;
		case "/":return firstNum/secondNum;
		case "pow":return Math.pow(firstNum, secondNum);
		case "sqrt":return Math.sqrt(firstNum);
		default:return 0;
		}
	}
	
	public void calculateValue(String type, double firstNum, double secondNum) {
		calculationValue = calculate(type, firstNum, secondNum);
	}
	
	
	
	public double getCalculationValue() {
		return calculationValue;
	}
}
