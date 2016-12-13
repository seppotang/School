import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class IceCreamOrder extends JFrame {
    
    //Initialize Panels
    private JPanel panel1;
    private JPanel panel2;
    private JPanel panel3;
    
    //Initialize label
    private JLabel messageLabel;
    
    //Initialize Function buttons
    private JButton calcButton;
    private JButton saveButton;
    private JButton restoreButton;
    
    //Initialize radio buttons
    
    private JCheckBox nutsButton;
    private JCheckBox cherriesButton;
    
    //Initialize radio buttons and group
    private ButtonGroup radioButtonGroup;
    private JRadioButton vanillaButton, chocButton, strawButton;
    
    //Variables for window dimensions
    private final int WINDOW_WIDTH = 500;
    private final int WINDOW_HEIGHT = 150;
    
    //Cost total
    private double result=0.0;
    private double tax = .06;
    
    //Initialize strings
    private String flavorName = null;
    private String nutsStatus = null;
    private String cherryStatus = null;
    
    
    //Main method;;
    public static void main(String[] args) {
        new IceCreamOrder();
    }
    
    public IceCreamOrder() {
        //Set Title
        setTitle("Michael Graves - Ice Cream Order");
        
        //Sets the size of the window to variables initialized earlier
        setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        
        //Closes on exit
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //Build the panel
        buildPanel();

        //Add the panel to the frame's content page
        add(panel1);
        add(panel2);
        add(panel3);

        //Display the window
        setVisible(true);
    }
    
    //Method for adding a label, 3 radio buttons, and a calculate button.
    private void buildPanel() {
			
        //Create a Grid Layout manager with 3 rows and one column
        setLayout(new GridLayout(0,1));

        //Create Label and Text field
        messageLabel = new JLabel("Icecream Flavor");

        //Create radio buttons
        vanillaButton = new JRadioButton("Vanilla");
        chocButton = new JRadioButton("Chocolate");
        strawButton = new JRadioButton("Strawberry");
        
        //Create checkbox buttons
        nutsButton = new JCheckBox("Nuts");
        cherriesButton = new JCheckBox("Cherries");
        
        //Create function buttons
        calcButton = new JButton("Calculate");
        saveButton = new JButton("Save");
        restoreButton = new JButton("Restore");

        //Group the radio buttons
        radioButtonGroup = new ButtonGroup();
        radioButtonGroup.add(vanillaButton);
        radioButtonGroup.add(chocButton);
        radioButtonGroup.add(strawButton);

        //Add action listeners to the radio buttons.
        vanillaButton.addActionListener(new ButtonListener());
        chocButton.addActionListener(new ButtonListener());
        strawButton.addActionListener(new ButtonListener());

        //Register an event listener with calculate button
        calcButton.addActionListener(new ButtonListener());
        saveButton.addActionListener(new ButtonListener());
        restoreButton.addActionListener(new ButtonListener());

        //Create a panel1 and add the components to it
        panel1 = new JPanel();
        panel1.add(messageLabel);
        panel1.add(vanillaButton);
        panel1.add(chocButton);
        panel1.add(strawButton);
        
        //Create panel 2 and add components
        panel2 = new JPanel();
        panel2.add(nutsButton);
        panel2.add(cherriesButton);
        
        //Create panel 3 and add components
        panel3 = new JPanel();
        panel3.add(saveButton);
        panel3.add(restoreButton);
        panel3.add(calcButton);
        
        add(panel1,BorderLayout.WEST);
        add(panel3,BorderLayout.EAST);
    }
    
     private class ButtonListener implements ActionListener {
                public void actionPerformed(ActionEvent e) {
                
                //Determine which radio button was clicked
                if(e.getSource() == vanillaButton) {
                    flavorName = "Vanilla";
                    result= 2.25;
                }
                else if (e.getSource() == chocButton) {
                    flavorName = "Chocolate";
                    result = 2.25;
                }
                else if(e.getSource() == saveButton) {
                    try{
                        nutsCheck();
                        File file = new File("C:\\Users\\Seppotang\\Desktop\\icecream.txt");
                        PrintWriter writer = new PrintWriter(file, "UTF-8");
                        writer.println(flavorName);
                        writer.println(nutsStatus);
                        writer.println(cherryStatus);
                        writer.close();
                        } catch (IOException f) {
                            f.printStackTrace();
                        }
                    } 
                    
                else if (e.getSource() == strawButton) {
                    flavorName = "Strawberry";
                    result = 2.25;
                } 

                else if(e.getSource() == calcButton) {
                    //Display the Calculation
                    double addition = 0.0;
                    
                    if(nutsButton.isSelected() && 
                        !(cherriesButton.isSelected())) {
                        nutsStatus = "With_Nuts";
                        cherryStatus = "Without_Cherries";
                        addition = 0.50;
                    } else if(cherriesButton.isSelected() && 
                            nutsButton.isSelected()) {
                        nutsStatus = "With_Nuts";
                        cherryStatus = "With_Cherries";
                        addition = 1.00;
                    } else if(cherriesButton.isSelected()&& 
                            !(nutsButton.isSelected())) {
                        nutsStatus = "Without_Nuts";
                        cherryStatus = "With_Cherries";
                        addition = 0.50;
                    } else if(!(nutsButton.isSelected()&&
                            cherriesButton.isSelected())) {
                        nutsStatus = "Without_Nuts";
                        cherryStatus = "Without_Cherries";
                        addition = 0.00;
                    }
                    
                    JOptionPane.showMessageDialog(null, String.format("YOUR ORDER"
                    + "\nCost: "  + "%.2f"
                    + "\nTax: "   + "%.2f"
                    + "\nTotal: " + "%.2f", 
                    (result + addition), 
                    (result + addition)*tax,
                    (result+ addition)+tax*(result+addition)));
                }
                
                
        }
        
        public void saveFunction() throws IOException {
           try{
            File file = new File("icecream.txt");
            PrintWriter writer = new PrintWriter(file, "UTF-8");
            writer.println(flavorName);
            writer.println(nutsStatus);
            writer.println(cherryStatus);
            writer.close();
            } catch (IOException e) {
            }
        }
        
        public void nutsCheck() {
            if(nutsButton.isSelected() && 
                        !(cherriesButton.isSelected())) {
                        nutsStatus = "With_Nuts";
                        cherryStatus = "Without_Cherries";
                    } else if(cherriesButton.isSelected() && 
                            nutsButton.isSelected()) {
                        nutsStatus = "With_Nuts";
                        cherryStatus = "With_Cherries";
                    } else if(cherriesButton.isSelected()&& 
                            !(nutsButton.isSelected())) {
                        nutsStatus = "Without_Nuts";
                        cherryStatus = "With_Cherries";
                    } else if(!(nutsButton.isSelected()&&
                            cherriesButton.isSelected())) {
                        nutsStatus = "Without_Nuts";
                        cherryStatus = "Without_Cherries";
                    }
        }
        
        public void restoreFunction() {
            
        }
        
    }
     
     
}
