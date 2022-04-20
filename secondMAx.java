public class MyClass {
    public static void main(String args[]) {
      int max = 0;
      int sMax = 0;
      int[]arr = new int[]{1,3,52,1,0,-1,32,1,-4,-5,1,5,0,22};
      if(arr[0] > arr[1]){
          max = arr[0];
          sMax = arr[1];
      }
      else{
          max = arr[1];
          sMax = arr[0];
      }
      
      for(int i = 2; i < arr.length; i++){
          if(arr[i] > max){
              sMax = max;
              max = arr[i];
          }else if(arr[i] > sMax){
              sMax = arr[i];
          }
      }
      System.out.println(max + "  " + sMax);
    }
}