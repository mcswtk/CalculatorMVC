package pl.cwiczenia;

import java.awt.event.ActionListener;

import javax.swing.*;

public class CalculatorView extends JFrame{
	private JTextField firstNum = new JTextField(10);
	private JLabel calculationLabel = new JLabel("+");
	private JTextField secondNum = new JTextField(10);
	private JButton calculateButton = new JButton("=");
	private JTextField calcSolution = new JTextField(10);
	
	CalculatorView(){
		JPanel calcPanel = new JPanel();
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(600,200);
		
		calcPanel.add(firstNum);
		calcPanel.add(calculationLabel);
		calcPanel.add(secondNum);
		calcPanel.add(calculateButton);
		calcPanel.add(calcSolution);
		
		this.add(calcPanel);
	}
	
	public double getFirstNumber() {
		return Double.parseDouble(firstNum.getText());
	}
	public double getSecondNumber() {
		return Double.parseDouble(secondNum.getText());
	}
	public double getCalcSolution() {
		return Double.parseDouble(calcSolution.getText());
	}
	public void setCalcSolution(double solution) {
		calcSolution.setText(Double.toString(solution));
	}
	
	void addCalculationListener(ActionListener listenerForCalcButton) {
		calculateButton.addActionListener(listenerForCalcButton);
	}
	
	void displayErrorMessage(String errorMessage) {
		JOptionPane.showMessageDialog(this, errorMessage);
	}
}
