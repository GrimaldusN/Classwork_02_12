import java.util.List;

// Нарушение CODE SMELLS:
//public class DAta {
//    public double calculateAverage(List<Double> numbers) {
//        double sum = 0;
//        for (double num : numbers) {
//            sum += num;
//        }
//
//        double average = sum / numbers.size();
//
//        double variance = 0;
//        for (double num : numbers) {
//            variance += Math.pow(num - average, 2);
//        }
//        double standardDeviation = Math.sqrt(variance / numbers.size());
//
//        return standardDeviation;
//    }
//}

public class DAta {
    public double calculateStandardDeviation(List<Double> numbers) {
        if (numbers == null || numbers.isEmpty()) {
            throw new IllegalArgumentException("Input list is null or empty");
        }

        double sum = calculateSum(numbers);
        double average = sum / numbers.size();
        double variance = calculateVariance(numbers, average);

        return Math.sqrt(variance / numbers.size());
    }

    private double calculateSum(List<Double> numbers) {
        double sum = 0;
        for (double num : numbers) {
            sum += num;
        }
        return sum;
    }

    private double calculateVariance(List<Double> numbers, double average) {
        double variance = 0;
        for (double num : numbers) {
            variance += Math.pow(num - average, 2);
        }
        return variance;
    }
}
