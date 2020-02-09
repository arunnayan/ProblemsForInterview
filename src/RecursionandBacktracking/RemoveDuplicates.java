package RecursionandBacktracking;

import java.util.Scanner;

public class RemoveDuplicates {

  public String remove_duplicate(String str, int index){
    if(str.length()==index) return "";
    if(index == 0 && str.length()>0){
      System.out.print(str.charAt(0));
      return remove_duplicate(str, index+1);
    }
    if(index >= 1 && str.charAt(index) == str.charAt(index-1)){
      return remove_duplicate(str, index+1);
    }else{
      System.out.print(str.charAt(index));
      return remove_duplicate(str, index+1);

    }

  }
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    String str = s.next();
    RemoveDuplicates m = new RemoveDuplicates();
    m.remove_duplicate(str,0);
  }
}
