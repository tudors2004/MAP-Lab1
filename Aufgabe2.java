import java.util.*;
public class Aufgabe2 {
    public static int findMax(int[] numbers){
        return Arrays.stream(numbers).max().getAsInt();
    }
    public static int findMin(int[] numbers){
        return Arrays.stream(numbers).min().getAsInt();
    }
    public static int findMaxSum(int[] numbers){
        return Arrays.stream(numbers).sum() - findMin(numbers);
    }
    public static int findMinSum(int[] numbers){
        return Arrays.stream(numbers).sum() - findMax(numbers);
    }
}
