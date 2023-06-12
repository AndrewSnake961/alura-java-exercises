package Java_JRE_JDK;

public class FactorialExercise {
    public static void main(String[] args) {
        int num = 1;
        int factorial = 1;
        for (int i = 1; i <= 10; i++, num++) {
            factorial *= num;
            System.out.println(String.format("El factorial de %d es: %d ", i, factorial));
        }
    }
}
