package Activities;
import java.util.*;

public class Activity2 {
    public static void main(String[] args) {
        int[] Arr = {10, 10, 10, 14, 1, 10};
        System.out.println("Original Array: " + Arrays.toString(Arr));
        int Num = 10;
        int Sum = 30;
        System.out.println("Result: " + result(Arr, Num, Sum));
    }

    public static boolean result(int[] numbers, int Num, int Sum) {
        int temp_sum = 0;
        for (int number : numbers) {
            if (number == Num) {
                temp_sum += Num;
            }
            if (temp_sum > Sum) {
                break;
            }
        }
        return temp_sum == Sum;
    }
}
