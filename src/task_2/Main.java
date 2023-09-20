package task_2;

import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws Exception {
        Calculator calculator = new Calculator();

        double a = 10.0;
        double b = 5.0;

        Class<?> calculatorClass = calculator.getClass();

        Method addMethod = calculatorClass.getDeclaredMethod("add", double.class, double.class);
        addMethod.setAccessible(true);
        double sum = (double) addMethod.invoke(calculator, a, b);

        Method minusMethod = calculatorClass.getDeclaredMethod("minus", double.class, double.class);
        minusMethod.setAccessible(true);
        double difference = (double) minusMethod.invoke(calculator, a, b);

        Method multiplyMethod = calculatorClass.getDeclaredMethod("multiply", double.class, double.class);
        multiplyMethod.setAccessible(true);
        double product = (double) multiplyMethod.invoke(calculator, a, b);

        Method divideMethod = calculatorClass.getDeclaredMethod("divide", double.class, double.class);
        divideMethod.setAccessible(true);
        double quotient = (double) divideMethod.invoke(calculator, a, b);

        System.out.println("Сумма: " + sum);
        System.out.println("Разница: " + difference);
        System.out.println("Произведение: " + product);
        System.out.println("Деление: " + quotient);
    }
}

