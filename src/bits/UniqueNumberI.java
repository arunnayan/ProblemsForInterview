package bits;

import java.util.Scanner;

public class UniqueNumberI {

  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();

    int ans=s.nextInt();
    for(int i =0;i<n-1;i++){
      ans = ans^s.nextInt();
    }
    System.out.println(ans);
  }
}

/*
Sample Input
7
1 1 2 2 3 3 4
Sample Output
4
*/