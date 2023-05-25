import java.util.Scanner;

public class Calculator {
    static Scanner scnr = new Scanner(System.in);

    public static void main(String[] args) {      // Initiation
        String mode, StandorScien, pick, choice;

        do {
            System.out.println("Enter the calculator mode: Standard/Scientific?");
            StandorScien = scnr.next();
            mode = StandorScien.toUpperCase();


            if (mode.equals("STANDARD")) {
                StandardMethod(mode);
            }


            if (mode.equals("SCIENTIFIC")) {
                ScientificMethod(mode);
            }

            System.out.println("Do you want to start over? (Y/N)");
            pick = scnr.next();
            choice = pick.toUpperCase();


        } while (choice.equals("Y"));

        System.out.println("Goodbye");
    }

    public static void StandardMethod(String Standard) { // Standard
        String sym;

        System.out.print("The calculator will operate in standard mode.\n" + "Enter '+' for addition, '-' for subtractions, '*' for multiplication, '/' for division\n");
        sym = scnr.next();

        while ((!sym.equals("+")) && (!sym.equals("-")) && (!sym.equals("*")) && (!sym.equals("/"))) {

            System.out.println("Invalid operator " + sym);
            System.out.print("Enter '+' for addition, '-' for subtractions, '*' for multiplication, '/' for division\n");
            sym = scnr.next();
        }


        if (sym.equals("+")) {
            Sum(sym);
        }
        if (sym.equals("-")) {
            Sub(sym);
        }
        if (sym.equals("*")) {
            Mul(sym);
        }
        if (sym.equals("/")) {
            Div(sym);
        }
    }

    public static void ScientificMethod(String Scientific) { // Scientific

        String sym;

        System.out.println("The calculator will operate in scientific mode.\n" + "Enter '+' for addition, '-' for subtractions, '*' for multiplication, '/' for division, 'sin' for sin x, 'cos' for cos x, 'tan' for tan x:");
        sym = scnr.next();

        while ((!sym.equals("+")) && (!sym.equals("-")) && (!sym.equals("cos")) && (!sym.equals("tan")) && (!sym.equals("sin")) && (!sym.equals("*")) && (!sym.equals("/"))) {

            System.out.println("Invalid operator " + sym);
            System.out.print("Enter '+' for addition, '-' for subtractions, '*' for multiplication, '/' for division, 'sin' for sin x, 'cos' for cos x, 'tan' for tan x:\n");
            sym = scnr.next();
        }

        if (sym.equals("+")) {
            Sum(sym);
        }
        if (sym.equals("-")) {
            Sub(sym);
        }
        if (sym.equals("*")) {
            Mul(sym);
        }
        if (sym.equals("/")) {
            Div(sym);
        }
        if (sym.equals("sin")) {
            Sin(sym);
        }
        if (sym.equals("cos")) {
            Cos(sym);
        }
        if (sym.equals("tan")) {
            Tan(sym);
        }

    }

    public static void Sum(String Sum) { // Addition
        int total, i;
        Double x;

        System.out.println("How many numbers do you want to add?");
        total = scnr.nextInt();
        System.out.println("Enter " + total + " numbers");

        x = scnr.nextDouble();
        for (i = 1; i < total; i++) {

            x = x + scnr.nextDouble();
        }
        System.out.println("Result: " + x);
    }

    public static void Sub(String Sub) { // Subtraction
        int total, i;
        Double x;

        System.out.println("How many numbers do you want to subtract?");
        total = scnr.nextInt();
        System.out.println("Enter " + total + " numbers");

        x = scnr.nextDouble();
        for (i = 1; i < total; i++) {
            x = (x - scnr.nextDouble());

        }

        System.out.println("Result: " + x);
    }

    public static void Mul(String Mul) { // Multiplication
        int total, i;
        Double x;

        System.out.println("How many numbers do you want to multiply?");
        total = scnr.nextInt();
        System.out.println("Enter " + total + " numbers");

        x = scnr.nextDouble();
        for (i = 1; i < total; i++) {
            x = x * scnr.nextDouble();

        }
        System.out.println("Result: " + x);
    }

    public static void Div(String Div) { // Division
        int total, i;
        Double x;

        System.out.println("How many numbers do you want to divide?");
        total = scnr.nextInt();
        System.out.println("Enter " + total + " numbers");

        x = scnr.nextDouble();
        for (i = 1; i < total; i++) {
            x = x / scnr.nextDouble();
        }
        System.out.println("Result: " + x);

    }

    public static void Sin(String Sin) { // Sin
        Double x;

        System.out.println("Enter a number in radians to find the sine");
        x = scnr.nextDouble();
        System.out.println("Result: " + Math.sin(x));
    }

    public static void Cos(String Cos) { // Cos
        Double x;

        System.out.println("Enter a number in radians to find the cosine");
        x = scnr.nextDouble();
        System.out.println("Result: " + Math.cos(x));
    }

    public static void Tan(String Tan) { // Tan
        Double x;

        System.out.println("Enter a number in radians to find the tangent");
        x = scnr.nextDouble();
        System.out.println("Result: " + Math.tan(x));
    }
}