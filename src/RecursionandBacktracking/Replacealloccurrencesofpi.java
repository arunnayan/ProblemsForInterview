package RecursionandBacktracking;

import java.util.Scanner;

public class Replacealloccurrencesofpi {

  public String replace(String str){
    if(str.length()<=1){
      return str;
    }

    //if pi
    if(str.charAt(0) == 'p' && str.length()>=2 && str.charAt(1)=='i') {
      return "3.14"+replace(str.substring(2,str.length()));
    }
    //if not pi
    return str.charAt(0) +replace(str.substring(1,str.length()));
  }
  public static void main(String[] args) {
    Replacealloccurrencesofpi m =new Replacealloccurrencesofpi();
    Scanner s = new Scanner(System.in);
    int numOfTestCase = s.nextInt();
    System.out.println();
    while(numOfTestCase-->0){
      System.out.println(m.replace(s.next()));

    }
  }
}
