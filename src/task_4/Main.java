package task_4;

public class Main {
    @Math(num1 = 100, num2 = 200)
    public void mathSum(int num1, int num2) {
        int sum = num1 + num2;
        System.out.println("Сумма: " + sum);
    }

    public static void main(String[] args) throws Exception {
        Main main = new Main();
        Class<?> clazz = main.getClass();
        Math annotation = clazz.getMethod("mathSum", int.class, int.class).getAnnotation(Math.class);

        int num1 = annotation.num1();
        int num2 = annotation.num2();

        main.mathSum(num1, num2);
    }
}

