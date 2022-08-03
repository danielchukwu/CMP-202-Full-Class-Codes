package week1;

public class Main {

    // a method - this method swaps two numbers
    static void swapTwoNumbers(int num1, int num2){
        System.out.println("Before");                            //print: Before
        System.out.println("num1= "+ num1 + ", num2= " + num2);  //print: num1= 5, num2= 10

        // swap numbers
        int hold_num1 = num1;   // hold_num1 = 5
        num1 = num2;            // num1 = 10
        num2 = hold_num1;       // num2 = 5

        System.out.println("After");                             // print: After
        System.out.println("num1= "+ num1 + " num2= " + num2);   // print: num1= 10, num2= 5
    }

    // main method - required to run our program
    public static void main(String [] args){
        // call method
        swapTwoNumbers(5, 10);
    }

}
