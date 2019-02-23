package Random;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class PushCounter extends JApplet {

    private int APPLET_WIDTH = 300;
    private int APPLET_HEIGHT = 35;
    private int pushes;
    private JLabel label;
    private JButton push;

    
    //Set up GUI

    public void init() {

        pushes = 0;

        push = new JButton("Push Me");
        push.addActionListener(new ButtonListener());

        label = new JLabel ("Pushes: " + Integer.toString(pushes));

        Container cp = getContentPane();
        cp.setBackground(Color.pink);
        cp.setLayout(new FlowLayout());
        cp.add(push);
        cp.add(label);

        setSize(APPLET_WIDTH, APPLET_HEIGHT);


    }


    private class ButtonListener implements ActionListener {

        public void actionPerformed(ActionEvent event) {

            pushes++;
            label.setText("Pushes: " + Integer.toString(pushes));
            repaint();
        }


    }



}


