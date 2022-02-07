package langJava.LeetCode;

public class SearchInsertionPosition {
    public static int searchInsert(int[] nums, int target) {
        int s = 0, e = nums.length - 1;

        while (s<=e) {
            int mid = (s + e)/2;
            if (nums[mid] == target) {
                return mid;
            } else if (target < nums[mid]) {
                e = mid - 1;
            } else {
                s = mid + 1;
            }
        }

        return s;
    }

    public static void main(String[] args) {
        int[] arr = {1,3,5,6};
        System.out.println(searchInsert(arr,-1));
    }
}
