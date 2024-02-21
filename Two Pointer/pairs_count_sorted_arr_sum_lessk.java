// output : 6
public class MyClass {
    public static void main(String args[]) {
      int arr[] = {1, 2, 3, 4, 5, 6, 7, 8};
        int n = arr.length;
        int x = 7;
        
        int left = 0, right = n-1;
        int res = 0;
        
        while (left < right){
            if (arr[left]+arr[right] >=x ){
                right--;
            }
            else{
                res = res + (right-left);
                left++;
            }
        }
        System.out.println(res);
    }
}
