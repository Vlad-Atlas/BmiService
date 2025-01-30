public class BmiService {
    // Метод для расчета индекса массы тела
    public int calculate(double weight, double height) {
        // Формула расчета BMI: вес (в килограммах) / (рост (в метрах))^2
        double bmiIndex = weight / (height * height);
        return (int) bmiIndex; // Приведение к целому числу
    }
}