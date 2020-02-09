package Array;

import java.util.Scanner;

public class RotateImage {

  public static void main(String[] args) {


    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    int arr[][] = new int[n][n];

    for(int i=0;i<arr[0].length;i++) {
      for (int j = 0; j < arr.length; j++) {
        arr[i][j] = s.nextInt();
      }
    }
    //Take transpose

    for(int i=0;i<arr[0].length;i++){
      //j =i as each time one row and cols are alread taken
      //if i==1, so 1st row and col is swapped, j should start from 2 when i=2
      for(int j=i;j<arr.length;j++){
        int t = arr[i][j];
        arr[i][j] = arr[j][i];
        arr[j][i]=t;
      }
    }


    for(int i=0;i<n;i++){
      int low=0;
      int high=n-1;
      while (low<=high){
        int t = arr[low][i];
        arr[low][i] = arr[high][i];
        arr[high][i] =t;
        low++;
        high--;
      }
    }


    for (int i = 0; i < arr.length; i++) {
      for (int j = 0; j < arr[0].length; j++) {
        System.out.print(arr[i][j] + " ");
      }
      System.out.println();
    }

  }
}
