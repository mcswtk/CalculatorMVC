package pl.cwiczenia;

import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.*;

public class CalculatorView extends JFrame{
	private String[] types = {"+", "-", "*", "/", "sqrt", "pow"};  
	private JTextField firstNum = new JTextField(10);
	private JTextField secondNum = new JTextField(10);
	private JButton calculateButton = new JButton("=");
	private JTextField calcSolution = new JTextField(10);
	private JComboBox calculationType = new JComboBox(types);
	private DecimalFormat df = new DecimalFormat();
	CalculatorView(){
		JPanel calcPanel = new JPanel();
		df.setMaximumFractionDigits(12);
		df.setMinimumFractionDigits(0);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(500,200);
		
		calcPanel.add(firstNum);
		firstNum.setText("0");
		calcPanel.add(calculationType);
		calcPanel.add(secondNum);
		secondNum.setText("0");
		calcPanel.add(calculateButton);
		calcPanel.add(calcSolution);
		
		
		getContentPane().add(calcPanel);
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
		calcSolution.setText((df.format(solution)));
	}
	public String getCalcType() {
		return (String)calculationType.getSelectedItem();
	}
	public void setSolutionClear() {
		calcSolution.setText("");
	}
	
	void addCalculationListener(ActionListener listenerForCalcButton) {
		calculateButton.addActionListener(listenerForCalcButton);
	}
	
	void displayErrorMessage(String errorMessage) {
		JOptionPane.showMessageDialog(this, errorMessage);
	}
}
