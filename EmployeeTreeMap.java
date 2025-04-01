package jattask7;


	import java.util.Map;
	import java.util.TreeMap;

	public class EmployeeTreeMap {
	    public static void main(String[] args) {
	        // Creating a TreeMap to store employee IDs and names
	        Map<Integer, String> employeeMap = new TreeMap<>();

	        // Adding employee IDs and names to the TreeMap
	        employeeMap.put(101, "John Doe");
	        employeeMap.put(102, "Alice Smith");
	        employeeMap.put(103, "Bob Johnson");
	        employeeMap.put(104, "Charlie Brown");
	        employeeMap.put(105, "David Williams");

	        // Printing all employee names in alphabetical order
	        System.out.println("Employee names in alphabetical order:");
	        employeeMap.values().stream()
	                .sorted() // Sorts the employee names in natural order (alphabetical)
	                .forEach(System.out::println);
	    }
	}


