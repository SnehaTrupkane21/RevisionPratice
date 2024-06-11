package DateTime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateF {
	
	
	    public static void main(String[] args) {
	        // Input date string in "dd-mm-yyyy" format
	        String inputDateString = "13-05-2024";

	        // Define the formatter for "dd-MM-yyyy" format
	        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

	        // Parse the input date string to a LocalDate object
	        LocalDate date = LocalDate.parse(inputDateString, formatter);

	        // Print the parsed date
	        System.out.println("Parsed Date: " + date);

	        // You can now use this LocalDate object for your automation tasks
	        // For example, setting date fields in web forms or comparing dates
	        
	        // If needed, you can format the date back to a string in a different format
	        DateTimeFormatter outputFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
	        String formattedDateString = date.format(outputFormatter);
	        System.out.println("Formatted Date: " + formattedDateString);
	    }
	}

