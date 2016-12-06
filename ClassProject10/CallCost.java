import javax.swing.*;
import java.awt.*;


	new CallCost(); {}
	
	
	//CallCost calculates minutes into call time and displays result in a panel.
	public class CallCost extends JFrame
{
		private JPanel panel;
		private JLabel messageLabel;
		private JTextField textInput;
		private JButton calcButton;
		private ButtonGroup radioButtonGroup;
		private JRadioButton daytimeButton, eveningButton, offpeakButton;
		private final int WINDOW_WIDTH = 310;
		private final int WINDOW_HEIGHT = 100;
	
		
		//CONSTRUCTOR
		public CallCost() {
			
			//Set Title
			setTitle("Long Distance Calls");
			
			//Sets the size of the window to variables initialized earlier
			setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
			
			//Closes on exit
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			
			//Build the panel
			buildPanel();
			
			//Add the panel to the frame's content page
			add(panel);
			
			//Display the window
			setVisible(true);
		}
		
		//Method for adding a label, text field, 3 radio buttons, and a calculate button.
		private buildPanel() {
			
			//Create a Grid Layout manager with 3 rows and one column
			setLayout(new GridLayout(3,1));
			
			//Create Label and Text field
			messageLabel = new JLabel("Select a time, minutes, and click on calculate button");
			textInput = new JTextField(10);
			
			//Create radio buttons
			daytimeButton = new JRadioButton("daytime");
			eveningButton = new JRadioButton("evening");
			offpeakButton = new JRadioButton("off-peak");
			
			//Create calculate button
			JButton calcButton = new JButton("Calculate");
			
			//Group the radio buttons
			radioButtonGroup = new ButtonGroup();
			radioButtonGroup.add(daytimeButton);
			radioButtonGroup.add(eveningButton);
			radioButtonGroup.add(offpeakButton);
			
			//Add action listeners to the radio buttons.
			daytimeButton.addActionListener(new RadioButtonListener());
			eveningButton.addActionListener(new RadioButtonListener());
			offpeakButton.addActionListener(new RadioButtonListener());
			
			//Register an event listener with calculate button
			calcButton.addActionListener(new ButtonListener());
			
			//Create a panel and add the components to it
			panel = new JPanel();
			panel.add(messageLabel);
			panel.add(textInput);
			panel.add(daytimeButton);
			panel.add(eveningButton);
			panel.add(offpeakButton);
			panel.add(calcButton);
		}
		
		//Private inner class that handles the event when the user clicks a button
		
		private class ButtonListener implements ActionListener {
			public void actionPerformed(ActionEvent e) {
				if(e.getSource() == calcButton) {
					//Display the Calculation
					JOptionPane.showMessageDialog(null, input + " minutes, cost of call is $" + result);
				}
					
			}
		}
		
		private class RadioButtonListener implements ActionListener {
			public void actionPerformed(ActionEvent e) {
				String input;
				double result = 0.0;
				
				//Get minutes
				input = textInput.getText();
				
				//Determine which radio button was clicked
				if(e.getSource() == daytimeButton {
					result=Double.parseDouble(input) * 0.07;
				}
				else if (e.getSource() == eveningButton) {
					result = Double.parseDouble(input) * 0.02;
				} 
				else if (e.getSource() == offpeakButton) {
					result = Double.parseDouble(input) * 0.05;
				}
				
				return result;				
			}
		}
	}
