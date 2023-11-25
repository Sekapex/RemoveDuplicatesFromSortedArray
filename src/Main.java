import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3};

        int k = removeDuplicates(nums);
        int[] expectedNums = new int[k];

        System.arraycopy(nums, 0, expectedNums, 0, k);
        System.out.println(Arrays.toString(expectedNums));
    }
    private static int removeDuplicates(int[] nums) {
        int k = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i-1]) {
                nums[k] = nums[i];
                k++;
            }
        }

        System.out.println(Arrays.toString(nums));
        return k;
    }
    private static int removeDuplicatesButAppearsTwice(int[] nums) {
        int k=2;
        for (int i = 2; i < nums.length; i++) {
            if (nums[i] != nums[k-2]) {
                nums[k] = nums[i];
                k++;
            }
        }

        System.out.println(Arrays.toString(nums));
        return k;
    }
}