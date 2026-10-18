import java.util.Arrays;

public class BinarySearch {
    public static int search(int[] values, int target) {
        int left = 0, right = values.length - 1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (values[mid] == target) return mid;
            if (values[mid] < target) left = mid + 1;
            else right = mid - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] values = {2, 5, 8, 12, 16, 23};
        System.out.println("Values: " + Arrays.toString(values));
        System.out.println("Index of 12: " + search(values, 12));
    }
}
