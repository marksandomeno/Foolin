package FahrenheitGUI;

//Program only stops running when it is closed. It is not a run and done.

public class Fahrenheit {

    public static void main(String args[]) {
     //Creates new instance of a Fahrenheit converter.
    FahrenheitGUI converter = new FahrenheitGUI();

    //displays the frame and all the components inside. Since a new instance of FahrenheitGUI is created before the call to display.
    converter.display();


 }


}



