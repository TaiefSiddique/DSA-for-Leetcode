
import java.util.ArrayList;
import java.util.List;

public class SlidingWindow {
    public static List<Integer> slidingWindow(int[] nums, int k) {
        List<Integer> result = new ArrayList<>();
        if (nums == null || nums.length == 0 || k <= 0 || k > nums.length)
            return result;

        int windowSum = 0;
        // Calculate sum of first window
        for (int i = 0; i < k; i++) {
            windowSum += nums[i];
        }
        result.add(windowSum);

        // Slide the window and calculate sum of remaining windows
        for (int i = k; i < nums.length; i++) {
            windowSum = windowSum - nums[i - k] + nums[i];
            result.add(windowSum);
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = { 1, 3, -1, -3, 5, 3, 6, 7 };
        int k = 3;
        List<Integer> result = slidingWindow(nums, k);
        System.out.println("Sliding window sums: " + result);
    }
}
