package Array;

import java.util.*;
public class Subarray {


  public void printSubARRAY(int []arr){
    for(int i = 0; i <arr.length;i++){
      //{1,2,3,4,5}
      for(int j=i;j<arr.length;j++){
        for(int k =i; k<=j; k++){
          System.out.print(arr[k]+", ");
        }
        System.out.println();
      }

    }

  }

  //n*n*n
  public int subbarrayWithMaxsum(int []arr){
    int sum = 0;
    for(int i = 0; i <arr.length;i++){
      //{1,2,3,4,5}
      for(int j=i;j<arr.length;j++){
        int currentSum = 0;
        for(int k =i; k<=j; k++){
          currentSum = currentSum + arr[k];
        }
        if(currentSum > sum) {
          sum = currentSum;
        }

      }

    }
    return sum;
  }


  public int subbarrayWithMaxsum3(int []arr){
    int sum = 0;
    int cumSumArr[] = new int[arr.length];
    cumSumArr[0] = arr[0];

    for(int i =1;i<cumSumArr.length;i++){
      cumSumArr[i] = arr[i] + cumSumArr[i-1];
    }

    for(int i =0;i<cumSumArr.length;i++){
      for(int j=i;j<cumSumArr.length;j++){
        int s =0;
        if(i==0){
          s = cumSumArr[j];
        }
        else{
          s = cumSumArr[j]-cumSumArr[i-1];
        }

        if(s>sum) sum=s;
      }
    }
    return sum;
  }


  public int kandaneMaxSumSubarray(int []arr){

    int cs = 0;
    int maxSum = 0;

    for(int i =0;i< arr.length;i++){
      cs+=arr[i];
      if (cs< 0){
        cs=0;
      }

      maxSum = Math.max(cs,maxSum);
    }
    return maxSum;
  }



  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int length = scn.nextInt();
    int arr[] = new int[length];

    for(int i =0; i< arr.length;i++){
      arr[i] = scn.nextInt();
    }
    Subarray sb = new Subarray();
    //sb.printSubARRAY(arr);

    //System.out.println(sb.subbarrayWithMaxsum(arr));
    System.out.println(sb.subbarrayWithMaxsum3(arr)); //1p
    //System.out.println(sb.kandaneMaxSumSubarray(arr));
  }
}
//9
//-4 1 3 -2 6 2 -8 -9 4