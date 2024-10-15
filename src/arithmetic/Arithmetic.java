/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arithmetic;


import java.util.Scanner;
import static java.time.Clock.system;
import java.util.InputMismatchException;


/** This class calls the method to perform 
 * arithmetic operations based on user input
 * execute the code check the output
 * @author sivagamasrinivasan
 * 
 */
public class Arithmetic 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double n = 0, m = 0;
        boolean inputIsValid;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.print("Enter your 1st number: ");
            inputIsValid = true;
            try {
                n = scanner.nextDouble();
            } catch (InputMismatchException ex) {
                System.err.println("Unknown input.");
                inputIsValid = false;
                scanner.next();
            }
        } while (!inputIsValid);

        do {
            System.out.print("Enter your 2nd number: ");
            inputIsValid = true;
            try {
                m = scanner.nextDouble();
            } catch (InputMismatchException ex) {
                System.err.println("Unknown input.");
                inputIsValid = false;
                scanner.next();
            }
        } while (!inputIsValid);

        ArithmeticBase arithmetic = new ArithmeticBase(n, m);

        try {
            double result = arithmetic.calculate(scanner);
            System.out.println("Result: " + result);
        } catch (ArithmeticException | IllegalArgumentException ex) {
            System.err.println("Error: " + ex.getMessage());
        } finally {
            scanner.close();
        }
    }
}

