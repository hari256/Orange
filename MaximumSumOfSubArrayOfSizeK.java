public class MaximumSumOfSubArrayOfSizeK {
    public static void main(String[] args) {
        int[] arr = {2, 1, 35, 51, 3, 2};
        int k = 3;

        //use sliding window
        int len = arr.length;
        int sum = 0;

        //first sum;
        for (int j = 0; j < k; j++) {
            sum += arr[j];
        }
        int maxSum = sum;
        //slide
        for (int i = k; i < len; i++) {
            sum = sum + arr[i] - arr[i - k];
            maxSum = Math.max(sum, maxSum);
        }
        System.out.println(maxSum);
    }
}
