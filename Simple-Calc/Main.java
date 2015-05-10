package pm.maven.calc;

import javax.swing.JOptionPane;

public class CalcII {

	public static void main(String[] args){
	
	double number1, number2;	
	String operation;
		
	String firstInput ="";
	String secondInput ="";
	
	firstInput = JOptionPane.showInputDialog("Enter First Number: ");
	secondInput = JOptionPane.showInputDialog("Enter Second Number: ");
	operation = JOptionPane.showInputDialog("Enter the Operator ( +, -, *, or /)");
	
	
	
	number1 = Double.parseDouble(firstInput);
	number2 = Double.parseDouble(secondInput);
	
	switch (operation){
	case "+":
		JOptionPane.showMessageDialog(null, "Your answer is: " +(number1 + number2));
		break;
	case"-":
		JOptionPane.showMessageDialog(null, "Your answer is: " +(number1 - number2));
		break;
	case"*":
		JOptionPane.showMessageDialog(null, "Your answer is: " +(number1 * number2));
		break;
	case"/":
		JOptionPane.showMessageDialog(null, "Your answer is: " +(number1 / number2));
		break;
	default:
		JOptionPane.showMessageDialog(null, "Please enter a valid operation ( +, -, *, or /)");
	}
	
	
	
	}
}
