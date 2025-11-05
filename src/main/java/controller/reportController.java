/**
 * @author Tonje Andreassen
 */

package controller;

import java.io.IOException;
import java.nio.file.Path; 
import java.util.List;
import utils.Util;
import util.average;
import util.reportFileWriter;
import view.reportView;

public class reportController {
	private average util ;
	private reportView view;
	private reportFileWriter util;
	
	public reportController(average util, reportView view, reportFileWriter util) {
		this.util = util;
		this.view = view;
		this.util = util;
	}
	
	public String gradeList (double[]grade) { //Here is the list of grades from exam
    
	public double calculateAverageController(double[] grade) {
	double[] grades = calculateAverage(grade);
	return calculateAverageController(grade)
			
			{	
		
	
	
//gets the calculation from the util class average. Where the average calculation is done.The report controller gets the average grade.
    try {
    	reportFileWriter.FileWriter(Path.of("averageGradeReport.txt"), grade); // have to find out if it is grade or averageGrade that is going to be here
    } catch (IOException e) { // e is instance/variable of the IOException, that is a build in class in java
    	return "An error occured while saving the file: " + e.getMessage(); // e.getMessage() is a method build inside java
    }
    return "The average grade is: " + averageGrade; // returns the average grade in a message to the ui
    }
}
