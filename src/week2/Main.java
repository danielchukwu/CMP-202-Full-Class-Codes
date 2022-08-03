package week2;

// import scanner
import java.util.Scanner;

public class Main {
    // Today's - class is on collecting input from users using Scanner
    //          in order to take input from user we must import the scanner class above and create a scanner object(in line 12)

    // method
    static void addMoreDrinks(){
        Scanner input = new Scanner(System.in); // create scanner

        // collect input from user
        int price = input.nextInt();  // .nextInt - receives only integers
        int quantity = input.nextInt(); // .nextInt - receives only integers
        String typeOfDrink = input.next(); // .next - receives only strings

        System.out.println("We received "+ quantity + " " + typeOfDrink + " at " + price + "naira for each");  // print
    }

    // main method - required to run our program
    public static void main (String [] args){
        // call method
        addMoreDrinks();
    }
}
