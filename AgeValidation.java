package jattask7;

	import java.util.Scanner;

	// Custom exception class
	class InvalidAgeException extends Exception {
	    // Constructor that accepts a message
	    public InvalidAgeException(String message) {
	        super(message);
	    }
	}

	public class AgeValidation {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Prompt user to enter age
	        System.out.print("Enter your age: ");
	        int age = scanner.nextInt();

	        try {
	            // Throw InvalidAgeException if age is less than 18
	            if (age < 18) {
	                throw new InvalidAgeException("Age must be 18 or older.");
	            }

	            // If no exception is thrown, print a success message
	            System.out.println("Age is valid: " + age);

	        } catch (InvalidAgeException e) {
	            // Catch the InvalidAgeException and display an error message
	            System.out.println("Error: " + e.getMessage());
	        }

	        // Close the scanner
	        scanner.close();
	    }
	}



