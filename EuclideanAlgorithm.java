import java.util.*;

public class Main {
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    public static int lcm(int a, int b) {
        return (a * b) / gcd(a, b);
    }
    public static int findLCM(int[] arr) {
        int length = arr.length;
        int result = arr[0];
        for (int i = 1; i < length; i++) {
            arr[i - 1] = lcm(result, arr[i]);
            result = arr[i];
        }
        Arrays.sort(arr);
        return arr[length - 1];
    }

    public static void main(String[] args) {
        int[] numbers = {7, 3, 2, 9, 12};
        System.out.println("LCM of array: " + findLCM(numbers));
    }
}
