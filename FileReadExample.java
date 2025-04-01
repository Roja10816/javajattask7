package jattask7;

	import java.io.File;
	import java.io.FileNotFoundException;
	import java.util.Scanner;

	public class FileReadExample {
	    public static void main(String[] args) {
	        // Specify the path to the file
	        String fileName = "example.txt";

	        try {
	            // Attempt to open the file
	            File file = new File(fileName);
	            Scanner fileScanner = new Scanner(file);

	            // Reading and printing the content of the file
	            System.out.println("Contents of the file:");
	            while (fileScanner.hasNextLine()) {
	                System.out.println(fileScanner.nextLine());
	            }

	            // Closing the scanner
	            fileScanner.close();
	        } catch (FileNotFoundException e) {
	            // Handle the case when the file does not exist
	            System.out.println("Error: The file " + fileName + " was not found.");
	        }
	    }
	}



