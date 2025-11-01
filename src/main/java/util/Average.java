package util;


public class Average {
		public static double calculateAverage(int[] numbers) {
		if (numbers == null || numbers.length == 0) {
			throw new IllegalArgumentException("Array must not be null or empty");
		}
		double sum = 0;
		for (int num : numbers) {
			sum += num;
		}
		return sum / numbers.length;
	}

}
