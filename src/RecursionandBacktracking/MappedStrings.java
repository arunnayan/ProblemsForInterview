package RecursionandBacktracking;

import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Scanner;

public class MappedStrings {

  private void print(String num,String ans, HashMap<Integer, String> map) {
    if(num.length()==0){
      System.out.println(ans);
      return;
    }
    //123 -> {1,""}23
    int n1 = Integer.parseInt(num.substring(0,1));//1
    String rem = num.substring(1);//23
    print(rem, ans+map.get(n1),map);

    if(num.length()>=2){
      int n2 = Integer.parseInt(num.substring(0,2));
      if(n2<=26){
        String rem2 = num.substring(2);//23
        print(rem2, ans+map.get(n2),map);
      }

    }

  }


  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    HashMap<Integer,String> map = new HashMap();
    int i = 1;
    for (char ch = 'A'; ch <= 'Z'; ++ch)
      map.put(i++, String.valueOf(ch));
    MappedStrings m= new MappedStrings();
    m.print(""+n,"", map);

  }




}
