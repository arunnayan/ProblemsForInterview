package RecursionandBacktracking;
import java.util.*;
public class LastIndex {

  public int getLastIndex(int arr[], int idx, int num){
    if(idx == arr.length) return -1;
    int rr = getLastIndex(arr,idx+1, num);

    if((arr[idx] == num) && rr == -1){
      return idx;
    }else{
      return rr;
    }
    //return -1;
  }
  public static void main(String[] args) {
      Scanner s = new Scanner(System.in);
      int arrLength = s.nextInt();
      int arr[] = new int[arrLength];
      for(int i=0;i<arrLength;i++){
        arr[i] = s.nextInt();
      }
      int num = s.nextInt();
      LastIndex l = new LastIndex();
      System.out.println(l.getLastIndex(arr, 0, num));
  }
}
