package RecursionandBacktracking;

import java.util.Scanner;

public class MoveAllXatEnd {

  public StringBuilder print(StringBuilder str, StringBuilder ans){
    if(str.length()==0){
      return ans;
    }
    if(str.charAt(0)=='x'){
      print(new StringBuilder(str.substring(1)), ans);
      ans.append("x");
    }else{
      ans.append(str.substring(0,1));
      print(new StringBuilder(str.substring(1)), ans);
    }
    return ans;
  }

  public StringBuilder printUsing2Point(StringBuilder str, StringBuilder ans){
    int first = 0;
    int second = 0;
    for(int i=0;i< str.length();i++){
      if(str.charAt(i) == 'x'){
        second++;
      }
      else {
        ans.append(str.charAt(i));
      }
    }
    for(int i=0;i<second;i++){
      ans.append('x');
    }
    return ans;
  }


  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    StringBuilder str = new StringBuilder(s.next());
    StringBuilder ans = new StringBuilder();
    MoveAllXatEnd x = new MoveAllXatEnd();
    //System.out.println(x.print(str, ans));
    System.out.println(x.printUsing2Point(str, ans));
  }
}
