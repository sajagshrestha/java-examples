import javax.swing.*;
import java.awt.event.*;

public class Calculator implements ActionListener{
	JFrame f;
	JButton multiplyButton, divideButton;
	JLabel firstNumberLabel , secondNumberLabel , resultLabel;
	JTextField firstNumber, secondNumber;

	Calculator(){
		//initialize components
		f = new JFrame();
		firstNumberLabel = new JLabel("1st Number:");
		secondNumberLabel = new JLabel("2nd Number:");
		firstNumber = new JTextField();
		secondNumber = new JTextField();
		multiplyButton = new JButton("Multiply");
		divideButton = new JButton("Divide");
		resultLabel = new JLabel("");

		//styling
		firstNumberLabel.setBounds(0,0,200,50);
		firstNumber.setBounds(250,0,200,50);
		secondNumberLabel.setBounds(0,50,200,50);
		secondNumber.setBounds(250,50,200,50);
		multiplyButton.setBounds(0,100,200,50);
		divideButton.setBounds(250,100,200,50);
		resultLabel.setBounds(0,150,200,50);

		
		//add components to frame
		f.add(firstNumberLabel);
		f.add(secondNumberLabel);
		f.add(firstNumber);
		f.add(secondNumber);
		f.add(multiplyButton);
		f.add(divideButton);
		f.add(resultLabel);

		//style frame
		f.setSize(600,500);
        	f.setLayout(null);
        	f.setVisible(true);

		//add action listeners
		multiplyButton.addActionListener(this);
		divideButton.addActionListener(this);

	}
	public void actionPerformed(ActionEvent e){
		try{
			float x = Float.parseFloat(firstNumber.getText());
			float y = Float.parseFloat(secondNumber.getText());
			if(e.getSource() == multiplyButton){
				//if multiply button is clicked
				resultLabel.setText("The result is: " + (x*y));
			}
			else{
				//if division button is clicked
				resultLabel.setText("The result is: " + (x/y));
			}
		}
		catch(Exception err){
			resultLabel.setText("Invalid Input");
		}
	}
	
	public static void main(String[] args) {
        	new Calculator();
    	}
}
