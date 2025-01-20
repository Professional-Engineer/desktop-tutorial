import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int nums[] = new int[4];
        Scanner se = new Scanner(System.in);
        System.out.println("Enter the array: ");
        for (int i = 0; i < nums.length; i++) {
            nums[i] = se.nextInt();
        }
        System.out.println("Enter the Target Element: ");
        int target = se.nextInt();
        int newarr[] = Arrays.copyOf(nums, nums.length + 1);
        newarr[nums.length] = target;
        Arrays.sort(newarr);

        for (int n : newarr) {
            if (newarr[n] == target) {
                System.out.println("Target found at position: " + n);
                break;
            }


        }
    }
}
