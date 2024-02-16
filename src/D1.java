import java.util.List;

public class D1 {
    public double getAverage(List<Double> list) {
        double sum = 0;
        for (double currentValue : list) {
            sum += currentValue;
        }
        return sum / list.size();
    }
}