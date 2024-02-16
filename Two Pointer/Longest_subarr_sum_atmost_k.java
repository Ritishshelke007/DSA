// output : 2

public class MyClass {
    public static void main(String args[]) {
      int[] a = { 1, 2, 3, 4, 5 };
        int n = a.length;
        int k = 5;
        
        int left = 0, right = 0; 
        long sum = a[0];
        int maxLen = 0;
        while (right < n) {
           
            while (left <= right && sum > k) {
                sum -= a[left];
                left++;
            }

           if (sum <= k) {
                maxLen = Math.max(maxLen, right - left + 1);
            }
            right++;
            if (right < n) sum += a[right];
        }
        System.out.println(maxLen);
    }
}
