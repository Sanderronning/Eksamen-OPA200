package util;

import java.io.FileWriter;
import java.io.IOException;

public class reportFileWriter {
	
	double averageGrade = 4.2; // Example average grade
	public void writeAveragetoFile(double averageGrade) { // This is the method that is writing the average grade to the file, the average grade is calculated in the util class average	
		try {
			FileWriter writer = new FileWriter("averageGradeReport.txt"); // Creates a file in the folder where the application is running
			writer.write("The average grade is: " + averageGrade); // Writes the average grade that is stored in the average grade variable
			writer.close(); // The writer is closed
			System.out.println("Comfirmation. The average grade is successfully wrote to the file."); // Success message
			System.out.println("File location: " + System.getProperty("user.dir") + "/averageGradeReport.txt"); // Print file location
		} catch (IOException e) {
			System.out.println("An error occurred while writing to the file."); // The build in function that is handeling the exceptions, it is imported as IOException
			e.printStackTrace();
		}
	}
	
}
