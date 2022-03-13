public class BinarySearch_704 {
    public static void main(String[] args) {
//        int[] arr = {-1, 0, 3, 5, 9, 12};
        int[] arr = {25};
        int val = search(arr, -25);
        System.out.println(val);
    }

    public static int search(int[] nums, int target) {
        int low = 0;
        int high = nums.length - 1;
        while (high >= low) {
            int mid = (high + low) / 2;
            if (nums[mid] == target)
                return mid;
            else if (nums[mid] > target)
                high = mid - 1;
            else
                low = mid + 1;
        }
        return -1;
    }
}
