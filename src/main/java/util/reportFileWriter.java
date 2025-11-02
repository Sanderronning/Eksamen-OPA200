package util;

import java.io.FileWriter;
import java.io.IOException;

public class reportFileWriter {
	
	double averageGrade = 4.2; // Example average grade
	public void writeAveragetoFile(double averageGrade) { // Method to write average grade to file	
		try {
			FileWriter writer = new FileWriter("averageGradeReport.txt"); // Creates a file in the folder where the application is running
			writer.write("The average grade is: " + averageGrade); // Write average grade
			writer.close(); // Close the writer
			System.out.println("Comfirmation. The average grade is successfully wrote to the file."); // Success message
			System.out.println("File location: " + System.getProperty("user.dir") + "/averageGradeReport.txt"); // Print file location
		} catch (IOException e) {
			System.out.println("An error occurred while writing to the file."); // Handle exception
			e.printStackTrace();
		}
	}
	
}
