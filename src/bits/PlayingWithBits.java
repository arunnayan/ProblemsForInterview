package bits;

import java.util.Scanner;

public class PlayingWithBits {

  public static void main(String[] args) {

    Scanner s = new Scanner(System.in);
    int t = s.nextInt();
    while (t-- > 0) {
      int count = 0;
      int f = s.nextInt();
      int sec = s.nextInt();
      for (int i = f; i <= sec; i++) {
        int num=i;
        while (num > 0) {
          if ((num & 1) == 1) {
            count++;

          }
          num = num >> 1;
        }
      }
      System.out.println(count);

    }

  }
}

