package sorting;

import java.util.Scanner;

public class BubbleSort {
  public static void main(String args[]) {
      Scanner s = new Scanner(System.in);
      int l = s.nextInt();
      int arr[] = new int[l];
      for(int i=0;i<l;i++){
        arr[i] = s.nextInt();
    }

    for(int i=0;i<arr.length-1;i++){
      for(int j=0;j<arr.length-1-i;j++){
        if(arr[j]>arr[j+1]){
          int t=arr[j];
          arr[j] = arr[j+1];
          arr[j+1]=t;
        }
      }
    }

    for(int i=0;i<arr.length;i++){
      System.out.println(arr[i]);
    }

  }
}