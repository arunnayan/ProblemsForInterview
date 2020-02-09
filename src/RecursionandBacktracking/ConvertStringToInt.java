package RecursionandBacktracking;
import java.util.*;



public class ConvertStringToInt {

  public void convertToIn(String str, int number){

    if(str.length() == 0) {
      System.out.println(number);
      return;
    }
    char c = str.charAt(0);
    number = number + (c-48)*(int )Math.pow(10, str.length()-1);
    convertToIn(str.substring(1), number);
  }

  public static void main(String[] args) {


  Scanner s = new Scanner(System.in);
  String str = s.next();

  ConvertStringToInt m = new ConvertStringToInt();
  m.convertToIn(str, 0);
  }

}
