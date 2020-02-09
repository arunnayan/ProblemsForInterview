package String;

import java.util.Scanner;

public class MaxFrequencyCharacter {

  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    String str = s.nextLine();



    char ch[] = new char[26];

    for (int i = 0; i < str.length(); i++) {
        ch[str.charAt(i)-'a']++;
    }

    int max=0;
    int c='a';
    for (int i = 0; i <26; i++) {
      if(max<=ch[i]){
        max= ch[i];
        c = (char)(c+i);
      }
    }
    System.out.println((char)c);


  }

  /*public static void main(String args[]) {
    Scanner s = new Scanner(System.in);
    String str = s.nextLine();


    char[] ch= str.toCharArray();
    int num[] = new int[150];
    for(char c:ch){
      int n = c;
      if(num[n]!=0){
        num[n] = num[n]+1;
      }
      else{
        num[n] = 1;
      }
    }

    int max =0;
    for(int i=0;i<150;i++){
      if(num[i]>num[max]){
        max =i;
      }
    }

    System.out.println((char)max);
  }*/
}

