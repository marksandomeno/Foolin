package Random;
import java.util.Scanner;

//reverses order of arrray
public class reverseArray {

    //10 element array
    public static double[] array = new double[10];


    public static void main(String args[]) {
        //all main code runs in here

        Scanner sc = new Scanner(System.in);
        System.out.println("Size of array: " + array.length);

        for(int i = 0; i < array.length; i++) {

            //Asks for each number than appends to array
            System.out.print("Enter number " + (i + 1) +  " : ");
            array[i] = sc.nextDouble();
        }

        System.out.println("Numbers in reverse order...");

        for(int index = array.length - 1; index >= 0; index--) {

            System.out.println(array[index]);

        }


    }



}
