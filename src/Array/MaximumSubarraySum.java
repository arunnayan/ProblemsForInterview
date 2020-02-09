package Array;
import java.util.*;

public class MaximumSubarraySum {

  public int maxSumSubArray2(int arr[]){
    int cumSumArr[] = new int[arr.length];
    cumSumArr[0] = arr[0];

    for(int i = 1; i < cumSumArr.length;i++){
      cumSumArr[i] = arr[i] + cumSumArr[i-1];
    }
    int sum = 0;
    for(int i = 0;i<cumSumArr.length;i++){
      for(int j=i;j<cumSumArr.length;j++){
        int cSum = 0;
        if(i==0) {
          cSum = cumSumArr[j];
        }
        // i-j subarray summ
        else {
          cSum = cumSumArr[j]-cumSumArr[i-1];
        }
        if(cSum>sum){
          sum=cSum;
        }
      }
    }
    return sum;
  }

  public int maxSumSubArray(int arr[]){
    int cumSum[] = new int[arr.length];
    cumSum[0] = arr[0];

        /*for(int i = i; i < cumSum.length;i++){
            cumSum[i] = arr[i] + cumSum[i-1];
        }*/
    int sum = 0;
    for(int i=0; i<arr.length;i++){
      for(int j=i;j<arr.length;j++){
        int cSum = 0;
        for(int k=i;k<=j;k++){
          cSum+=arr[k];
        }
        if(cSum>sum){
          sum=cSum;
        }
      }
    }

    return sum;

  }
  public static void main(String args[]) {
    MaximumSubarraySum m = new MaximumSubarraySum();
    Scanner s = new Scanner(System.in);
    int numOfTestcase = s.nextInt();
    System.out.println();
    while(numOfTestcase-->0){
      int numOfInput = s.nextInt();
      int arr[] = new int[numOfInput];

      for(int i=0;i<numOfInput;i++){
        arr[i] = s.nextInt();

      }

      //System.out.println(m.maxSumSubArray(arr));
      System.out.println(m.maxSumSubArray2(arr));

    }


  }
}