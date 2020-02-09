package String;

import java.util.*;

public class CanYouReadThis {
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    String str = s.nextLine();
    for(int i=0;i<str.length();i++){
      if('A'<=str.charAt(i) && 'Z'>=str.charAt(i)){
        System.out.println();
        System.out.print(str.charAt(i));
      }else{
        System.out.print(str.charAt(i));
      }
    }
  }
}

//IAmACompetitiveProgrammer