package Array;
import java.util.*;
public class PrimeVisits {

  public boolean isPrime(int num){
    if(num<=0) return false;
    if(num==1) return false;
    if(num==2) return true;
    //for even check
    if((num&1)==0){
      return false;
    }

    boolean isPrime= true;
    for(int i=3;i*i<=num;i=i+2){
      if(num%i==0){
        return false;

      }
    }
    return isPrime;
  }
  public int PRIME_VISITS(int start, int end){
    int primes[] = new int[end+1];
    primes[0] = 0;
    primes[1] = 0;
        /*
        for(int i=2; i<1000000;i+=2 ){
            primes[i] = 0;
        }*/

     //All odds
    for(int i=3; i <=end;i=i+2){
      if ((i&1) ==0 || i<start){
        primes[i]=0;
      }else {
        primes[i]=1;
      }
    }
    if(start<=2){
      primes[2] = 1;
    }
      //All the multiples of 3
      for(int i =3;i<=end;i=i+2){
        int j=2;
        while (i*j<=end){
          primes[i*j] = 0;
          j++;
      }
    }
    int sum=0;
    for(int i=0;i<=end;i++){
      if(primes[i]==1){
        sum++;
      }
    }
    return sum;
  }
  public static void main(String args[]) {
    PrimeVisits m = new PrimeVisits();
    Scanner s =new Scanner(System.in);
    int numOfTests = s.nextInt();
    while(numOfTests-->0){
      int start = s.nextInt();
      int end = s.nextInt();
      System.out.println(m.PRIME_VISITS(start,end));
    }
  }
}