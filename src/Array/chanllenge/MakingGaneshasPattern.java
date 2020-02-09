package Array.chanllenge;

import java.util.Scanner;

public class MakingGaneshasPattern {
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    int num =s.nextInt();
    //first row
    //firs *
    System.out.print("*");
    //space
    //*__**** => **** = (num+1)/2 + 1 => num - (num+3)/2 = (num-3)/2
    for(int i=0;i<(num-3)/2;i++){
      System.out.print(" ");
    }
    //Last ****
    for(int i=0;i<(num+1)/2;i++){
      System.out.print("*");
    }

    System.out.println();
    for(int i =0;i<(num-1)/2;i++){
      System.out.print("*");
      for(int j=0;j<(num-3)/2;j++){
        System.out.print(" ");
      }
      System.out.print("*");
      System.out.println();
    }

    for(int i =1;i<=num;i++) {
      System.out.print("*");
    }
    System.out.println();

     for(int i =0;i<(num-1)/2;i++){

      for(int j=0;j<(num-1)/2;j++){
         System.out.print(" ");
       }
       System.out.print("*");
       for(int k=0;k<(num-3)/2;k++){
         System.out.print(" ");
       }
       System.out.print("*");
       System.out.println();
     }


    //Last row 4 ****
    for(int i=0;i<(num+1)/2;i++){
      System.out.print("*");
    }
    //space
    //*__**** => **** = (num+1)/2 + 1 => num - (num+3)/2 = (num-3)/2
    for(int i=0;i<(num-3)/2;i++){
      System.out.print(" ");
    }
    //Last *
      System.out.print("*");



  }
}