package Java_JRE_JDK;

public class ReverseInteger {
    public int reverse(int x) {
        boolean isNegative = false;
        if (x < 0) {
            isNegative = true;
            x = Math.abs(x);
        }

        int result = 0;
        while (x != 0) {
            int digit = x % 10;
            result = result * 10 + digit;
            x /= 10;
        }

        if (isNegative) {
            result *= -1;
        }

        if (result < Integer.MIN_VALUE || result > Integer.MAX_VALUE) {
            return 0;
        }

        return result;
    }

}
