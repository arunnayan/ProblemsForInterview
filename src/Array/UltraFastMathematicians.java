package Array;

import java.util.Scanner;

public class UltraFastMathematicians {
  public static void main(String args[]) {

    Scanner s = new Scanner(System.in);
    int n_test_case = s.nextInt();
    int ans = 0;
    int decimal=1;
    while(n_test_case-->0){
      String num1 = s.next();
      String num2 = s.next();

      int i=0;
      StringBuffer sb=new StringBuffer();
      for(i =0;i<num1.length() && i<num2.length();i++){
        if(num1.charAt(i)!=num2.charAt(i)){
          sb.append("1");
        }else{
          sb.append("0");

        }
      }
      while (i<num1.length()){
        sb.append(num1.charAt(i));
      }
      while (i<num2.length()){
        sb.append(num2.charAt(i));
      }
      System.out.println(sb);
    }

  }
}