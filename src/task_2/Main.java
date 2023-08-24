package task_2;

public class Main {
    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        double sum = calculator.add(10.0, 5.0);
        System.out.println("Сумма: " + sum);

        double difference = calculator.minus(10.0, 5.0);
        System.out.println("Разница: " + difference);

        double product = calculator.multiply(10.0, 5.0);
        System.out.println("Произведение: " + product);

        double quotient = calculator.divide(10.0, 5.0);
        System.out.println("Деление: " + quotient);
    }
}
