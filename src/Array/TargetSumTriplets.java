package Array;
import java.util.*;

//nSq
public class TargetSumTriplets {
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    int numOfInput= s.nextInt();
    int arr[] = new int[numOfInput];

    for(int i=0;i<arr.length;i++){
      arr[i] = s.nextInt();
    }
    Arrays.sort(arr);
    int target = s.nextInt();

    int right=numOfInput-1;
    for(int i =0;i<numOfInput;i++ ){
      int left =i+1;

      while(left<right){
        int cSum = arr[i]+arr[left]+arr[right];
        if(cSum == target){
          System.out.println(arr[i]+", "+ arr[left]+" and "+ arr[right]);
        }
        if(cSum>target){
          right--;
        }
        else{
          left++;
        }
      }
    }
  }
}