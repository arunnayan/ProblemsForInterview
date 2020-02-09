package Array;

import java.util.Scanner;

public class RainWaterHarvesting {

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int numOfInput = sc.nextInt();
    int[] arr = new int[numOfInput];
    for (int i = 0; i < numOfInput; i++) {
      arr[i] = sc.nextInt();
    }

    //to calculate water at any point
    //max(ht of left, ht of right) - that point
    int[] left = new int[numOfInput];
    int[] right = new int[numOfInput];
    left[0] = arr[0];
    right[numOfInput - 1] = arr[numOfInput - 1];
    int leftMax = arr[0];
    int rightMax = arr[numOfInput - 1];

    for (int i = 1; i < numOfInput; i++) {
      if (arr[i] > left[i - 1]) {
        leftMax = arr[i];
      }
      left[i] = leftMax;
    }

    for (int i = 0; i < numOfInput; i++) {
      System.out.print(left[i]);
      System.out.print(" ");
    }

    System.out.print("\n");

    for (int i = numOfInput - 1; i >= 0; i--) {
      if (arr[i] > rightMax) {
        rightMax = arr[i];
      }
      right[i] = rightMax;
    }

    for (int i = 0; i < numOfInput; i++) {
      System.out.print(right[i]);
      System.out.print(" ");
    }
    System.out.print("\n");
    int sum = 0;
    for (int i = 1; i < numOfInput; i++) {
      sum += Math.min(left[i], right[i]) - arr[i];
    }

    System.out.println(sum);

  }
}
