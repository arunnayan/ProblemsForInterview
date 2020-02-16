package RecursionandBacktracking;
import java.util.*;
public class MergerSort {


  //divide the array and then merge based on sorting
  public static int[] mergeSort(int arr[], int start, int end){
    if(start==end){
      return new int[arr[start]];
    }

    //this will split the array
    int mid = (start+end)/2;

    int[] left = mergeSort(arr, start,mid);
    int[] right = mergeSort(arr, mid+1, end);

    //merging the array
    return merge(arr,left,right);

  }

  //based on sorting
  public static int[] merge(int[] arr, int left[], int right[]){
    int mid = (left.length+right.length)/2;
    int s = 0;
    int s_2 = mid+1;

    int temp[] = new int[100];
    int temp_start = 0;


    while (s<left.length && s_2<right.length){
      if(arr[s]< arr[s_2]){
        temp[temp_start] = arr[s];
        temp_start++;
        s++;
      }else {
        temp[s_2] = arr[s];
        temp_start++;
        s_2++;
      }

      //copy remaining
      for (int i = s; i <left.length; i++) {
        temp[temp_start] = arr[i];
        i++;
        temp_start++;
      }

      //copy remaining
      for (int i = s_2; i < right.length; i++) {
        temp[s_2] = arr[i];
        temp_start++;
        i++;
      }
      for (int i = 0; i < temp_start; i++) {
        arr[i] =temp[i];
      }
    }
      return temp;
  }





  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    int size = s.nextInt();
    int arr[] = new int[size];
    for(int i=0;i<size;i++){
      arr[i] = s.nextInt();
    }

    for(int i=0;i<size;i++){
      System.out.print(arr[i]+",");
    }
    System.out.println();
    //MergerSort m = new MergerSort();
    mergeSort(arr,0, arr.length-1);
    for(int i=0;i<size;i++){
      System.out.print(arr[i]+",");
    }

  }

}
