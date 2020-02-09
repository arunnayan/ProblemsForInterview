package RecursionandBacktracking;
import java.util.*;
public class TowerofHanoi {

  //Move n-1 from A to B
  //move nth c
  //Move n-1 to A

  public void move(int num, char src, char dst, char helper){
    if (num==0) return;
    move(num-1, src, helper,dst);
    //Last big ring after movin n-1 from a to b, A to C
    System.out.println("Moving ring " + num +" from "+src +" to "+dst);
    move(num-1, helper,dst, src);
  }

  public static void main(String args[]) {
    TowerofHanoi m = new TowerofHanoi();
    Scanner s = new Scanner(System.in);
    int num  = s.nextInt();
    m.move(num, 'A','C','B');

  }
}

