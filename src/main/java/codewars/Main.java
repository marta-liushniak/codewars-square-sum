package codewars;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println(squareSum(new int[]{1, 2, 2}));
    }

    public static int squareSum(int[] n) {
        return Arrays
                .stream(n)
                .map(num -> num * num)
                .sum();
    }
}
