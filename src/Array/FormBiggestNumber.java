package Array;



import java.util.Scanner;

public class FormBiggestNumber {

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int tc = scn.nextInt();
    while (tc > 0) {
      int n = scn.nextInt();
      int[] arr = new int[n];
      for (int i = 0; i < arr.length; i++) {
        arr[i] = scn.nextInt();
      }
      sort(arr);
      display(arr);

    }
  }

  private static void display(int[] arr) {
    for (int val : arr) {
      System.out.print(val + "");
    }

    System.out.println();
  }

  private static void sort(int[] arr) {

    for(int i=0;i< arr.length-1;i++){
      //Each time sortest will go last
      for(int j=0;j< arr.length-1-i;j++){
          if(compare(arr[j],arr[j+1])>0){
            int temp = arr[j];
            arr[j] =arr[j+1];
            arr[j+1] = temp;
          }
      }
    }
  }


  public static int compare(int n1, int n2) {
    String s1 = n1+""+n2;
    String s2 = n2+""+n1;
    int val1 = Integer.valueOf(s1);
    int val2 = Integer.valueOf(s2);

    if(val1>val2) return -1;
    else return 1;
  }
}
