import java.util.HashMap;
import java.util.Map;

public class maxSumOfGoodArr {
  public static long maxSumOfGoodSubarray(int[] A, int k) {
        Map<Integer, Integer> freq = new HashMap<>();
        long currentSum = 0;
        long maxSum = 0;

        int l = 0;

        for (int r = 0; r < A.length; r++) {
            int elem = A[r];
            freq.put(elem, freq.getOrDefault(elem, 0) + 1);
            currentSum += elem;

            while (freq.size() > k) {
                int leftElem = A[l];
                freq.put(leftElem, freq.get(leftElem) - 1);
                if (freq.get(leftElem) == 0) {
                    freq.remove(leftElem);
                }
                currentSum -= leftElem;
                l++;
            }

            maxSum = Math.max(maxSum, currentSum);
        }

        return maxSum;
    }
    public static void main(String[] args) {
      int[] arr={-1,-2,-3};
      int k=2;
      System.out.println(maxSumOfGoodSubarray(arr, k));
       
    }
}
