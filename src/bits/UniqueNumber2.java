package bits;

import java.util.Scanner;

public class UniqueNumber2 {
  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    int l = s.nextInt();
    int[] arr = new int[l];

    for(int i =0;i< arr.length;i++){
      arr[i] = s.nextInt();
    }

    int result = arr[0]; // arr[i]^0 = arr[i]

    for(int i =1;i< arr.length;i++){
      result = result^arr[i];
    }

    //find 1 from the rigth
    int pos = 0;
    int temp = result;
    while(temp>0){
      if((temp&1)!=1){
        pos++;

      }
      temp=temp>>1;
    }
    //create mask
    int mask = 1<<pos;
    int fNum = 0;
    for(int i =0;i< arr.length;i++){
      if((arr[i] ^mask)> 0){
        fNum = mask^arr[i];
      }

    }
    int secondNum = result^fNum;
    System.out.print(fNum +" "+ secondNum);

  }
}


/*
Sample Input
7
1 1 2 2 3 3 4
Sample Output
4
*/