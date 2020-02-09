package Array;
import java.util.*;
public class MatrixSearch {
  public int isPresent(int[][] mat,int r, int c, int num){
    int cR = 0;
    int cC = c;
    while(cR <=r && cC>=0){
      if (mat[cR][cC] == num)
        return 1;
      if (mat[cR][cC] > num){
        cC--;
      }else{
        cR++;
      }
    }
    return 0;
  }

  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    int numOfRow = s.nextInt();
    int numOfCol = s.nextInt();
    int[][] mat = new int[numOfRow][numOfCol];

    for(int i = 0;i< numOfRow;i++){
      for(int j=0;j<numOfCol;j++){
        mat[i][j] = s.nextInt();
      }
    }

    int numToFind  = s.nextInt();
    MatrixSearch m = new MatrixSearch();
    System.out.println(m.isPresent(mat, numOfRow - 1, numOfCol - 1, numToFind));
  }
}

