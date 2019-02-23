package FahrenheitGUI;


import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class FahrenheitGUI {


    private int WIDTH = 300;
    private int HEIGHT = 50;

    private JFrame frame;
    private JPanel panel;

    private JLabel inputLabel, outputLabel, resultLabel;
    private JTextField fahrenheit;

    //Set up this GUI, Construct it...

    public FahrenheitGUI() {

        //Setup Frame
        frame = new JFrame("Temperature Converter");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        //Setup Components

        inputLabel = new JLabel("Enter Fahrenheit: ");
        outputLabel = new JLabel("Celsius: ");
        resultLabel = new JLabel("_____");

        fahrenheit = new JTextField(5);
        fahrenheit.addActionListener(new TempLisener());

        panel = new JPanel();
        //wacky way to set up the dimension of the panel,  will the frame scale if the panel is larger??
        panel.setPreferredSize(new Dimension(WIDTH, HEIGHT));
        panel.setBackground(Color.yellow);

        //add components
        panel.add(inputLabel);
        panel.add(fahrenheit);
        panel.add(outputLabel);
        panel.add(resultLabel);

        //frame needs a contentPane, that is the panel we just made. It holds all our content.
        frame.getContentPane().add(panel);

    }


    //Set up TempLisener Class that can listen in on the action of the textfield and perform whatever actions
    private class TempLisener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent event) {

            int fahrenheitTemp;
            int celsiusTemp;

            String text = fahrenheit.getText();

            fahrenheitTemp = Integer.parseInt(text);
            celsiusTemp = (fahrenheitTemp - 32 ) * 5/9;

            resultLabel.setText(Integer.toString(celsiusTemp));

        }
    }

    public void display() {

        frame.pack();
        frame.setVisible(true);

    }
}
