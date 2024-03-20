
public class JavaBasics {

    public static void main(String[] args) {
        // Variables declaration and initialization
        int a = 5;
        int b = 3;
        
        // Float and double variables
        float c = 3.5f;
        double d = 7.8;
        
        // Char variable
        char ch = 'A';
        
        // Arithmetic operations
        int sum = a + b;
        int difference = a - b;
        int product = a * b;
        int quotient = a / b;
        
        float divisionResult = (float) a / b; // Casting to float
        
        // Output results
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);
        System.out.println("Division Result: " + divisionResult);
        
        // Output float and double variables
        System.out.println("Float Variable c: " + c);
        System.out.println("Double Variable d: " + d);
        
        // Output char variable
        System.out.println("Char Variable ch: " + ch);
        
        // Conditional statements
        if (a > b) {
            System.out.println("a is greater than b");
        } else if (a < b) {
            System.out.println("b is greater than a");
        } else {
            System.out.println("a and b are equal");
        }
        
        // Increment and Decrement operators
        int i = 5;
        System.out.println("Initial value of i: " + i);
        i++; // Increment operator
        System.out.println("After incrementing i: " + i);
        i--; // Decrement operator
        System.out.println("After decrementing i: " + i);
        
        // Loops
        // While loop
        int j = 0;
        while (j < 5) {
            System.out.println("Inside while loop, j = " + j);
            j++;
        }
        
        // For loop
        for (int k = 0; k < 5; k++) {
            System.out.println("Inside for loop, k = " + k);
        }
    }
}
