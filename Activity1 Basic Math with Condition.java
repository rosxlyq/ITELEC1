public class Activity1 Basic Math with Condition {
    public static void main(String[] args) {

        int a = 10;
        int b = 5;
        
        // choose operator what to use +,-,*,/,%
        char operator = '+'; 

    
        if (operator == '+') {
            System.out.println("Addition: " + (a + b));
        } else if (operator == '-') {
            System.out.println("Subtraction: " + (a - b));
        } else if (operator == '*') {
            System.out.println("Multiplication: " + (a * b));
        } else if (operator == '/') {
            if (b != 0) {
                System.out.println("Division: " + (a / b));
            } else {
                System.out.println("Cannot divide by zero!");
            }
        } else if (operator == '%') {
            System.out.println("Modulo: " + (a % b));
        } else {
            System.out.println("Invalid operation.");
        }
    }
}

/*
I made another example po, just incase 
public class Act1 {
    public static void main(String[] args) {

        int a = 35;
        int b = 5;

        // Addition
        if (true) { // i use true to show the result 
            System.out.println("Addition: " + (a + b));
        }

        // Subtraction
        if (true) {
            System.out.println("Subtraction: " + (a - b));
        }

        // Multiplication
        if (true) {
            System.out.println("Multiplication: " + (a * b));
        }

        // Division
        if (b != 0) { // check for division by zero
            System.out.println("Division: " + (a / b));
        } else {
            System.out.println("Cannot divide by zero!");
        }

        // Modulo
        if (true) {
            System.out.println("Modulo: " + (a % b));
        }
    }
}
*/
