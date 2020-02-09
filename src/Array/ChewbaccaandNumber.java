package Array;

import java.util.Scanner;

public class ChewbaccaandNumber {
  public static void main(String args[]) {

    Scanner s = new Scanner(System.in);
    long num = s.nextLong();
    long mul=1;
    long ans=0;
    while (num%10!=0){
      long rem = num%10;
      if(rem>=5 & rem!=0){
        rem=9-rem;
      }
      ans = ans + rem*mul;
      mul*=10;
      num=num/10;
    }
    System.out.println(ans);
  }
}
