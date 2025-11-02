package util;


public class average {
		public static double calculateAverage(double[] grade) {
		if (grade == null || grade.length == 0) {
			throw new IllegalArgumentException("The array cant be null or empty"); //stops further running in the code and gives a message back
		}
		double sum = 0;
	    for (double num : grade) { // the loop is running for the amount of grades that are in the array
			sum += num;
		}
		return sum / grade.length;
	}

}
