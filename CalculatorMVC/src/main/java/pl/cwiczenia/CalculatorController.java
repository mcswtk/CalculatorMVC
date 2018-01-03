package pl.cwiczenia;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorController {
	private CalculatorView theView;
	private CalculatorModel theModel;
	public CalculatorController(CalculatorView theView, CalculatorModel theModel) {
		this.theView = theView;
		this.theModel = theModel;
		
		this.theView.addCalculationListener(new CalculateListener());
	}
	
	class CalculateListener implements ActionListener{

		public void actionPerformed(ActionEvent e) {
			double firstNum, secondNum = 0;
			String calcType;
			try {
				calcType = theView.getCalcType();
				firstNum = theView.getFirstNumber();
				secondNum = theView.getSecondNumber();
				if(calcType=="/" && secondNum == 0) {
					theView.setSolutionClear();
					theView.displayErrorMessage("Nie dziel przez 0!");
					return;
				}
				if(calcType=="sqrt" && firstNum < 0) {
					theView.setSolutionClear();
					theView.displayErrorMessage("Liczba pod pierwiastkiem nie może być ujemna!");
					return;
				}
				
				theModel.calculateValue(calcType, firstNum, secondNum);
				theView.setCalcSolution(theModel.getCalculationValue());
			}
			catch(NumberFormatException ex) {
				theView.displayErrorMessage("Błąd!");
			}
		}
		
	}
	
}
