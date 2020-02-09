package Array;

import java.util.Scanner;


/*
4 4
11 12 13 14
21 22 23 24
31 32 33 34
41 42 43 44
 */

public class WavePrintColumnWise {


  public void printWave2(int m[][], int r, int c){
    int y = 0;
    boolean x = true;
    while(y<c){

      if(y%2==0)
      {
        for(int i =0; i<r;i++)
          System.out.print(m[i][y]+", ");
      }
      else{
        for(int i =r-1; i>=0;i--)
          System.out.print(m[i][y]+", ");
      }

      y++;
    }
    System.out.println("END");
  }


  public void printWave(int m[][], int r, int c){
    int y = 0;
    boolean x = true;
    while(y<c){

      if(x)
      {
        for(int i =0; i<r;i++)
          System.out.print(m[i][y]+", ");
      }
      else{
        for(int i =r-1; i>=0;i--)
          System.out.print(m[i][y]+", ");
      }
      x =!x;
      y++;
    }
    System.out.println("END");
  }
  public static void main(String[] args) {

    Scanner scn = new Scanner(System.in);
    int r = scn.nextInt();
    int c = scn.nextInt();
    int[][] m = new int[r][c];
    for(int i =0; i<r;i++)
    {
      for(int j =0; j<c;j++){
        m[i][j] = scn.nextInt();;
      }
    }
    WavePrintColumnWise w = new WavePrintColumnWise();
    //w.printWave(m, r, c);
    //11, 21, 31, 41, 42, 32, 22, 12, 13, 23, 33, 43, 44, 34, 24, 14, END
    //11, 21, 31, 41, 42, 32, 22, 12, 13, 23, 33, 43, 44, 34, 24, 14, END
    w.printWave2(m,r,c);
  }
}


