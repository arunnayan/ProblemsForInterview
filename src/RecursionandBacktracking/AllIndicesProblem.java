package RecursionandBacktracking;
import java.util.*;
public class AllIndicesProblem {
  public void findPos(int arr[], int index, int num){
    if(arr.length == index+1) return;
    if(arr[index] == num) System.out.print(index+" ");
    findPos(arr, index+1, num);
  }
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    int arrLen = s.nextInt();
    int arr[] = new int[arrLen];

    for(int i=0;i< arrLen;i++){
      arr[i] = s.nextInt();
    }

    int num = s.nextInt();
    AllIndicesProblem m = new AllIndicesProblem();
    m.findPos(arr, 0, num);
  }
}
