package pl.cwiczenia;

public class CalculatorModel {
	private double calculationValue;
	public void add(double firstNum, double secondNum) {
		calculationValue = firstNum + secondNum;
	}
	public double getCalculationValue() {
		return calculationValue;
	}
}
