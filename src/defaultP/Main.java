package defaultP;

public class Main {

	public static void main(String[] args) {
		
		//object 
		Calculator calculator = new Calculator();

        //test addition
        int resultAddition = calculator.add(5, 10);
        System.out.println("Addition Result: " + resultAddition);

        // test subtraction
        int resultSubtraction = calculator.subtract(10, 5);
        System.out.println("Subtraction Result: " + resultSubtraction);

        // Test multiplication
        int resultMultiplication = calculator.multiply(5, 10);
        System.out.println("Multiplication Result: " + resultMultiplication);

        // Test division
        int resultDivision = calculator.division(10, 2);
        System.out.println("Division Result: " + resultDivision);

        // Test division by zero
       /* int resultDivisionByZero = calculator.division(10, 0); 
        System.out.println("Division by Zero Result: " + resultDivisionByZero);*/

        // Perform squaring
        int resultSquare = calculator.square(5);
        System.out.println("Square Result: " + resultSquare);
	}

}
