package String;

import java.util.Scanner;

//Sample Input
//    acb
//    Sample Output
//    a2c-1b
public class DifferenceinAsciiCodes {
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    String str = s.nextLine();
    String ans="";
    for(int i=0;i<str.length()-1;i++){
      char chOne = str.charAt(i);
      char chTwo = str.charAt(i+1);
      ans+=(char)chOne+""+(chTwo-chOne);
    }
    ans+=(char)str.charAt(str.length()-1);
    System.out.println(ans);
  }
}
