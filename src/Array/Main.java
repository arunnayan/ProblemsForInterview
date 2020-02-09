package Array;

public class Main {
  public static int trailingZeroes(int n) {
    int count =0;
    int pow=5;
    while ((n/pow)>0){
      count = count+ n/pow;
      pow = pow*5;
    }
    return count;
  }
  public static void main(String[] args) {
    System.out.println(trailingZeroes(1808548329));
  }
}
