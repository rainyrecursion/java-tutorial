public class FastExpo {

    public static long expo(long base, long power) {
        if (power == 0) {
            return 1;
        }
        if (power == 1) {
            return base;
        }
        long halfPower = power / 2;
        long x = expo(base, halfPower);
        if (power % 2 == 0) {
            return x * x;
        }
        return x * x * base;
    }

}