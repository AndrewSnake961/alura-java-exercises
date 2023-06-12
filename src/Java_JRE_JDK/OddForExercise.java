package Java_JRE_JDK;

public class OddForExercise {
    public static void main(String[] args) {
        int num = 1;
        for (int i = 0; i < 100; i++, num++) {
            if (num % 3 == 0) {
                System.out.println(num);
            }
        }

    }

}
