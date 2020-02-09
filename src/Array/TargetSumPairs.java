package Array;
import java.util.*;
public class TargetSumPairs {

  public void printTargetSum(int[] arr, int sum){
    int s = 0;
    int end = arr.length-1;
    Arrays.sort(arr);

    while(s<end){
      int cSum = arr[s] + arr[end];
      if(cSum == sum){
        System.out.println(arr[s]+" and "+ arr[end]);
        s++;
        end--;
      }
      else if (cSum > sum ){
        end--;
      }else{
        s++;
      }
    }
  }

  public static void main(String args[]) {

    Scanner s = new Scanner(System.in);
    int arrLength = s.nextInt();
    int arr [] = new int[arrLength];

    for(int i =0; i<arrLength;i++){
      arr[i] =  s.nextInt();
    }
    int sumToBefound = s.nextInt();

    TargetSumPairs m = new TargetSumPairs();
    m.printTargetSum(arr, sumToBefound);
  }
  /*
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    int arrLength = s.nextInt();
    int arr [] = new int[arrLength];

    for(int i =0; i<arrLength;i++){
      arr[i] =  s.nextInt();
    }
    int sumToBefound = s.nextInt();

    for(int i=0; i < arrLength;i++){
      for(int j=i+1; j< arr.length;j++){
        if (arr[i]+arr[j]==sumToBefound){
          if(arr[i]>arr[j]){
            System.out.println(arr[j]+" and "+ arr[i]);
          }else{
            System.out.println(arr[i]+" and "+ arr[j]);
          }

        }
      }
    }

  }

   */
}