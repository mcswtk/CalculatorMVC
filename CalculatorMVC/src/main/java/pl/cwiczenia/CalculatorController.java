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
			try {
				firstNum = theView.getFirstNumber();
				secondNum = theView.getSecondNumber();
				
				theModel.add(firstNum, secondNum);
				
				theView.setCalcSolution(theModel.getCalculationValue());
			}
			catch(NumberFormatException ex) {
				theView.displayErrorMessage("Musisz wpisać liczby!");
			}
		}
		
	}
	
	
}
