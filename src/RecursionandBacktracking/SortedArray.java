package RecursionandBacktracking;

import java.util.Scanner;

public class SortedArray {
  public boolean isSorted(int arr[], int startIndex){
    if(startIndex==arr.length-1) return true;
    if(arr[startIndex]>arr[startIndex+1]) return false;

    return (arr[startIndex]<arr[startIndex+1] && isSorted(arr,startIndex+1));
  }
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    int numOfInput = s.nextInt();

    int arr[] = new int[numOfInput];
    for(int i =0;i< numOfInput;i++){
      arr[i] = s.nextInt();
    }
    SortedArray m = new SortedArray();
    System.out.println(m.isSorted(arr,0));

  }
}
