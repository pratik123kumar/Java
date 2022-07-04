import java.util.*;

public class calculator {
    public static void main(String[] args) {

        System.out.println("Welcome to java calculator \n");

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your first number");

        int number1 = sc.nextInt();

        System.out.println("Enter your second number");

        int number2 = sc.nextInt();

        System.out.println("Now choose the operation you want to perform");

        System.out.println(" 1 : Addition");
        System.out.println(" 2 : Substraction");
        System.out.println(" 3 : Multiplication");
        System.out.println(" 4 : Divison");
        System.out.println(" 5 : Modulo");

        int operation = sc.nextInt();

        if(operation == 1){
            System.out.println(" Sum = " + number1 + number2);
        } else if (operation == 2) {

            System.out.println("Substraction = " + (number1 - number2) );
            
        } else if (operation == 3) {

            System.out.println("Multiplication = " + number1 * number2);
            
        } else if (operation == 4) {

            System.out.println("Division" + number1 / number2);
            
        } else if (operation == 5) {
            
            System.out.println("Modulo = " + number1 % number2);

        } else {

            System.out.println("invalid operation");
            
        }  
            
        




 


        
    }
}
