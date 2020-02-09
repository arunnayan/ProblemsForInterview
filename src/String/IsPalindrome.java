package String;
import java.util.*;
public class IsPalindrome {

    public boolean isPalindropm(int[] num, int start, int end){
     if (start>=end){
       return true;
     }
      if(num[start]==num[end]){
        return isPalindropm(num, start+1,end-1);
      }
      return false;
    }
    public static void main(String args[]) {
      IsPalindrome m = new IsPalindrome();
      Scanner s = new Scanner(System.in);
      int numOfIp= s.nextInt();
      int arr[] = new int[numOfIp];
      for(int i =0;i< numOfIp;i++){
        arr[i] = s.nextInt();
      }
      System.out.println(m.isPalindropm(arr, 0, numOfIp - 1));
    }
  }
