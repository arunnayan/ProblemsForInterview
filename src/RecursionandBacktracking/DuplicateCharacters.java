package RecursionandBacktracking;

import java.util.Scanner;
/*

In this question, the idea is to put a
recursive function on the Array and print * if we got any repetitive character.

Algorithm:

If length of the string is 1, return the string.
Self work is to check if the first two characters of the string are equal. If they are, insert a * between the two characters. Then, perform a recursive call for the rest of the string excluding the two characters.
Else perform the recursive call for the next character.
 */
public class DuplicateCharacters {

  public String duplicate_char(String str, int length){
    if(str.length()==length) return "";


    if ( length>1 && (str.charAt(length) == str.charAt(length-1))){
      System.out.print("*");
    }
    System.out.print(str.charAt(length));
    return duplicate_char(str, length+1);
  }

  public static void main(String[] args) {
    DuplicateCharacters m = new DuplicateCharacters();
    Scanner s = new Scanner(System.in);
    String str = s.next();

    System.out.println(m.duplicate_char(str, 0));
  }
  }
