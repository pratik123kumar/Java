import java.util.*;

public class Condition {
    public static void main(String[] args) {


        // Simple if - else condition in java
         

        System.out.println("hii ! today We are going to learn about conditions in java");

        System.out.println("Let's check who is adult or not ");

        Scanner checker = new Scanner(System.in);

        System.out.println("Enter you age ");

        int age = checker.nextInt();

        if (age >= 18) {
            System.out.println("Congradulations ! you are an adult");
        } else {
            System.out.println("Sorry ! you are not an adult");
        }

    

    }
}
