package jattask7;

	public class IndexOutOfBoundsExample {
	    public static void main(String[] args) {
	        // Demonstrating ArrayIndexOutOfBoundsException
	        try {
	            int[] numbers = {1, 2, 3};
	            System.out.println("Accessing index 5 of the array: " + numbers[5]);
	        } catch (ArrayIndexOutOfBoundsException e) {
	            System.out.println("Error: Array index is out of bounds.");
	        }

	        // Demonstrating StringIndexOutOfBoundsException
	        try {
	            String text = "Hello";
	            System.out.println("Accessing character at index 10 of the string: " + text.charAt(10));
	        } catch (StringIndexOutOfBoundsException e) {
	            System.out.println("Error: String index is out of bounds.");
	        }
	    }
	}



