public class MyClass {
    public static void main(String args[]) {
      int[] a = { 1, 3, 5, 10 };
      int[] b = { 13, 20, 24, 30 };
      int n = 4;
      int target = 42;
      
      int i = 0, j = n-1;
      int x = 0, y=0;
      int ans = Integer.MIN_VALUE;
      
      while ( i < n && j >=0 ) {
          int sum = a[i] + b[j];
          
          if( sum <= target ){
              if( sum > ans ){
                  ans = sum;
                  x = a[i];
                  y = b[j];
              }
              i++;
          }
          else{
              j--;
          }
      }
      
      System.out.println(ans + " " + x + " " + y);
            
    }
}

Output : 40 x:10 y:30
