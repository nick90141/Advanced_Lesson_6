package task_2;
    /**
    * @author  Mykyta
    * @version last
    * on 24.08.2023
    */
public class Calculator {
    /**
     * @param a Первое число.
     * @param b Второе число.
     * @return Результат суммы.
     */
    @Values(a = 0, b = 0)
    public double add(double a, double b) {
        return a + b;
    }
    /**
     * @param a Первое число.
     * @param b Второе число.
     * @return Результат разницы.
     */
    @Values(a = 0, b = 0)
    public double minus(double a, double b) {
        return a - b;
    }
    /**
     * @param a Первое число.
     * @param b Второе число.
     * @return Результат умножения.
     */
    @Values(a = 0, b = 0)
    public double multiply(double a, double b) {
        return a * b;
    }
    /**

     * @param a Первое число.
     * @param b Второе число.
     * @return Результат деления.
     * @throws IllegalArgumentException Если второе число равняется нулю.
     */
    @Values(a = 0, b = 0)
    public double divide(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("На ноль делить нельзя!");
        }
        return a / b;
    }
}

