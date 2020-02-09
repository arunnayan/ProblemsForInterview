package String;
import java.util.*;
public class UpperLower {

  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    char c = s.next().charAt(0);
    //System.out.print(c);
    if(c>='A' && c<='Z'){
      System.out.print("UPPERCASE");
    }
    else if(c>='a' && c<='z'){
      System.out.print("lowercase");
    }else{
      System.out.print("Invalid");
    }

  }
}