package Array;

import java.util.Scanner;

public class SpiralPrintAnticlockwise {
  public static void main(String args[]) {

    Scanner s = new Scanner(System.in);
    int nR=s.nextInt();
    int nC =s.nextInt();
    int[][] matrix = new int[nR][nC];

    for(int i=0;i<nR;i++){
      for(int j=0;j<nC;j++){
        matrix[i][j] = s.nextInt();
      }
    }

    int sR =0;
    int sC=0;
    int eR=nR-1;
    int eC = nC-1;


    while(sR<=eR && sC<=eC){

      //Down row wise
      for(int i=sR;i<=eR;i++){
        System.out.print(matrix[i][sC]+" ,");
      }
      //sR++;
      sC++;
      //last col wise
      for(int i=sC;i<=eC;i++){
        System.out.print(matrix[eR][i]+" ,");
      }
      //eC--;
      eR--;

      //up row wise
      for(int i=eR;i>=sR;i--){
        System.out.print(matrix[i][eC]+" ,");
      }
      eC--;
      //eC--;
      //last colum wise
      for(int i=eC;i>=sC;i--){
        System.out.print(matrix[sR][i]+" ,");
      }
      //sC++;
      sR++;

    }
    System.out.println("END");
  }
}


