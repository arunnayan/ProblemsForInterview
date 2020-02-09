package RecursionandBacktracking;

import java.util.Scanner;

public class Subsequences {

  public int getSubSeq(String str, String ans){
    if(str.length()==0){
      System.out.print(ans+" ");
      return 1;
    }
    //abc ->
    // {a,""}bc...


     int b = getSubSeq(str.substring(1), ans); //not including a in answer
    //getSubSeq(bc, "");

    int a = getSubSeq(str.substring(1),ans+ str.charAt(0));
    //getSubSeq(bc, a+"");
    return a +b;
  }
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    Subsequences m =new Subsequences();

    int ans = (m.getSubSeq(s.next(), ""));
    System.out.println();
    System.out.println(ans);
  }

}
