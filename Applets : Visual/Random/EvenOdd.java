package Random;
import javax.swing.*;

public class EvenOdd {

      public static void main(String args[]) {


          String numStr;
          String result;

          int num;
          int again;



              do {

                  numStr = JOptionPane.showInputDialog("Enter an Integer");
                  num = Integer.parseInt(numStr);

                  //cleannnnnnn
                  result = " That number is " + ((num % 2 == 0) ? "even" : "odd");

                  JOptionPane.showMessageDialog(null, result);

                  again = JOptionPane.showConfirmDialog(null, "Do Another?");

                  //pre installed constants are the ALL_CAPS_ONES it seems
              } while (again == JOptionPane.YES_OPTION);

          }
      

}





