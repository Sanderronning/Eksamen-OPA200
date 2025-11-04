/**
 * @author Tonje Andreassen
 */

package util;


public class average {
		public double calculateAverage(double[] grade) {
			
		if (grade == null || grade.length == 0) {
			throw new IllegalArgumentException("The array cant be null or empty"); //stops further running in the code and gives a message back
		}
		double sum = 0;
	    for (double num : grade) { // the loop is running for the amount of grades that are in the array
			sum += num;
		}
	    
	    double averageGrade = sum / grade.length; //the total sum of grades are divided on the number or grades in the array
	    
		return averageGrade; // Returns the average grade to the controller
	}

}
