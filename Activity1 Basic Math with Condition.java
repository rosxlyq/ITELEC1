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

 
        
