public class Main {
    public static void main(String[] args) {
        BmiService bmiService = new BmiService();

        // Примерные данные: вес 98 кг, рост 1.87 метра
        double weight = 60; // вес в килограммах
        double height = 1.75;// рост в метрах
        int bmiIndex = bmiService.calculate(weight, height);

        System.out.println("Индекс массы тела (BMI): " + bmiIndex);
    }
}