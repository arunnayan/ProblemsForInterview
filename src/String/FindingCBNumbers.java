package String;

import java.util.Scanner;

public class FindingCBNumbers {

  public static boolean isPrime(int num){
    if(num==0) return false;
    if(num==1) return false;
    if(num==2) return true;
    if((num&1)==0) return false; // even number

    for(int i=3;i*i<num;i=i+2){
      if(num%i==0) return false;
    }
    return true;
  }



  public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    int l = s.nextInt();
    int num = s.nextInt();
    int arr[] = new int[l];
    int x = 10*l-1;
    for(int i =0;i<l;i++){
      arr[i]=num/x;
      x=x%10;
    }
    int count=0;
    for(int i=0;i<arr.length;i++){
      for(int j=i;j<arr.length;j++){
        int decimal=1;
        int res = 0;
        for(int k =i;k<=j;k++){
          res+=arr[k]*decimal;
          decimal=decimal*10;
        }
        if(isPrime(res)){
          count++;
        }
      }
    }

    System.out.println(count);
  }
}