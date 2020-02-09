package Array;
import java.util.*;

public class BrokenCalculator {
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    int num = s.nextInt();

    int ans = 1;
    for(int i=1; i<=num;i++){
      ans*=i;
    }
    System.out.println(ans);

  }
}