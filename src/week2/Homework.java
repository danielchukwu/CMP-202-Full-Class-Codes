package week2;

import java.util.Scanner;

public class Homework {
    // Homework - write program that takes input from a user and checks if input is "trap" or "circle"
    //            to calculate for area of trapezium or circumference of circle

    static void pickTrapOrCircle() {

        Scanner input = new Scanner(System.in);

        // Pick a Calculator Option
        System.out.println("A PROGRAM THAT CALCULATES FOR THE AREA OF A TRAPEZIUM OR THE CIRCUMFERENCE OF A CIRCLE!");
        System.out.println("");

        System.out.print("Enter trap or circle to start calculator: ");
        String pick = input.next();           // .next - receives only strings

        System.out.println("pick: " + pick);
        if (pick.equals("trap")){             // if pick == trap we calculate area of trapezium
            System.out.print("Enter a: ");
            int a = input.nextInt();          // .nextInt - receives only integers
            System.out.print("Enter b: ");
            int b = input.nextInt();          // .nextInt - receives only integers
            System.out.print("Enter h: ");
            int c = input.nextInt();          // .nextInt - receives only integers

            findAreaOfTrapezuim(a, b, c);     // call method
        }

        if (pick.equals("circle")){           // if pick == circle we calculate circumference of circle
            System.out.print("Enter r: ");
            int r = input.nextInt();          // .next - receives only strings

            findCircumferenceOfCircle(r);     // call method
        }
    }

    static void findAreaOfTrapezuim(int a, int b, int h){

        // calculate area of trapezium
        float ab_result = a + b;               // ab_result = a + b
        float ab_divided = ab_result / 2;      // ab_divided = (a + b) / 2
        float area_of_trap = ab_divided * h;   // area_of_trap = (a + b / 2) * 2

        System.out.println("Area of trapezuim = " + area_of_trap);    // print
    }

    static void findCircumferenceOfCircle(int r){

        // calculate circumference of circle
        float pie = 3.14159f;                            // pie = 3.14159f
        float circumferce_of_circle = 2 * pie * r;       // circumferce_of_circle = 2 * (3.14159f) * r

        System.out.println("Circumference Of Circle = " + circumferce_of_circle);  // print
    }

    // main method - required to run our program
    public static void main(String [] args){
        // call method
        pickTrapOrCircle();
    }

}
