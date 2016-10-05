
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by Olivi on 20-09-2016.
 */


public class Chapter12 extends Loan {


    public static void main(String[] args) throws Exception {
        //numberFormatException("hej");     //Ex1
        //arrayIndexOutOfBoundsException(); //Ex2
        //inputMismatchException();         //Ex3
        //new Loan(2.5, 1, 1000);           //Ex4
        //Triangle ex5  = new Triangle (10, 5, 5); //Ex5

    }

    //Ex1
    public static void numberFormatException(String string) {
        try {
            int i = Integer.parseInt(java.lang.String.valueOf(string));
            System.out.println(i);
        }

        //if string is not a number
        catch (NumberFormatException nfe) {
            System.out.println("String is not a number");
        }
    }

    //Ex2
    public static void inputMismatchException() {
        Scanner input = new Scanner(System.in);
        boolean notANumber = true;

        do {
            try {
                System.out.println("Write a number:");
                int number = input.nextInt();
                System.out.println("Write a number:");
                int number2 = input.nextInt();

                int sum = number + number2;

                System.out.println("The sum is " + sum);

                notANumber = false;

            } catch (InputMismatchException ime) {
                System.out.println("The input must be a number");
                input.nextLine();
            }
        }
        while (notANumber);
    }

    //Ex3
    public static void arrayIndexOutOfBoundsException() {
        Scanner input = new Scanner(System.in);

        Random r = new Random();

        //An array of the size of 100
        int[] ar1 = new int[100];

        //Runs through the array length
        //Creates a random number and saves it at i
        for (int i = 0; i < ar1.length; i++) {
            ar1[i] = r.nextInt(10);

        }
        try {
            System.out.println("Type an index: ");
            int index = input.nextInt();
            index = ar1[index];
            System.out.println(index);
        } catch (ArrayIndexOutOfBoundsException aiofbe) {
            System.out.println("Out of bounds");
        } catch (InputMismatchException ime) {
            System.out.println("Input must be an integer");
        }
    }


    //Ex4 - Loan.class

    //Ex5 - Triangle.class

    //Ex6
    /*(NumberFormatException) Listing 6.8 implements the hex2Dec(String hexString) method, which converts a hex string into a decimal number.
    Implement the hex2Dec method to throw a NumberFormatException if the
    string is not a hex string.*/
}
