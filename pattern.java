public class MyClass {
    public static void main(String args[]) {
      int n = 4;
      int s = 2 * n - 1;
      for(int i = 0; i < s / 2 + 1; i++){
          int m = n;
              for(int j = 0; j < i; j++){
                  System.out.print(m + " ");
                  m--;
              }
              for(int j = 0; j < s - (2 * i); j++){
                  System.out.print((n - i) + " ");
              }
              m = n - i + 1;
              for(int j = 0; j < i; j++){
                  System.out.print(m + " ");
                  m++;
              }
          System.out.println();
      }
      
      for(int i = s /2 - 1; i >= 0; i--){
          int m = n;
              for(int j = 0; j < i; j++){
                  System.out.print(m + " ");
                  m--;
              }
              for(int j = 0; j < s - (2 * i); j++){
                  System.out.print((n - i) + " ");
              }
              m = n - i + 1;
              for(int j = 0; j < i; j++){
                  System.out.print(m + " ");
                  m++;
              }
          System.out.println();
      }
    }
}