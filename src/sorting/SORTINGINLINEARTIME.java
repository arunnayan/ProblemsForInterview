package sorting;

import java.util.Scanner;

public class SORTINGINLINEARTIME {
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    int l = s.nextInt();
    int arr[] = new int[l];
    for(int i=0;i<l;i++){
      arr[i] = s.nextInt();
    }

    int start = 0;
    int end = l-1;
    int mid = (start+end)/2;

    while (mid<=end){
      if(arr[mid]==1){
        mid++;
      }else if(arr[mid]==0){
        int t = arr[start];
        arr[start] = arr[mid];
        arr[mid]=t;
        start++;
        mid++;
      }else{
        int t = arr[end];
        arr[end] = arr[mid];
        arr[mid]=t;
        end--;

      }

    }

    for(int i=0;i<arr.length;i++){
      System.out.println(arr[i]);
    }
  }
}
