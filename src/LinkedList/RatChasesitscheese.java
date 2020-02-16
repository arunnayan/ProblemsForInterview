package LinkedList;

import java.util.*;

public class RatChasesitscheese {
  public  int[][] findSol(char[][] arr,int ans[][], int m, int n){
    if(m>=arr.length && n>=arr[0].length){
      return ans;
    }
    if(arr[m][n]=='O'){
      ans[m][n] = 1;
    }
    if((n+1 <arr.length) && (m <arr[0].length)){
      return findSol(arr, ans,m,n+1);
    }

    if((n <arr.length) && (m+1 <arr[0].length)){
      return findSol(arr, ans,m+1,n);
    }
    return ans;
  }

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int n = s.nextInt();
    int m = s.nextInt();

    char[][] maze = new char[n][m];

    for (int i = 0; i < n; i++) {

      String ans = s.next();
      for (int j = 0; j < m; j++) {
        maze[i][j] = ans.charAt(j);
      }

    }


    int ans[][]= new int[n][m];
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        ans[i][j] = 0;
      }
    }
    RatChasesitscheese rat = new RatChasesitscheese();
    int[][] sol = rat.findSol(maze, ans, 0, 0);
    for (int i = 0; i < sol.length; i++) {
      for (int j = 0; j < sol[i].length; j++) {
        System.out.println(sol[i][j]+" ");
      }
      System.out.println();
    }

  }
}
