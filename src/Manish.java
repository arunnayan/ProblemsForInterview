/*class test{
  void meth(int i, int j){
    i*=2;
    j/=2;
  }
}
public class Manish {

  public static void main(String[] args) {
    test t = new test();
    int a=20;
    int b=40;
    System.out.println(a);
    System.out.println(b);
    t.meth(a,b);
    System.out.println(a);
    System.out.println(b);
  }
}
*/

/*
public class Manish {

  public static void main(String[] args) {
    int i=0;
    i = i++;
    i= i++;
    System.out.println(i);
  }
}*/
/*
import java.util.Arrays;

class Manish{

  public static void main(String[] args) {
    int arr1[] = {1,2,3,4,5};
    int arr2[] = {1,2,3,4,5};
    System.out.println(arr1.equals(arr2));
    System.out.println(Arrays.equals(arr1,arr2));
  }
}
*/

import java.util.Arrays;
import java.util.Scanner;
/*
class Manish{

  public static void main(String[] args) {
    int a = 0;
    Manish m = new Manish();
    for (int i = 0; i < 2; i++) {
      for (int j = 0; j <4 ; j++) {
a =i;
      }
      System.out.println(j);
    }
  }
}
*/
/*
class Manish{

  public static void main(String[] args) {
    System.out.println(-10%-3); // -1
  }}


 */
/*
class Manish{

  public static void main(String[] args) {
    double d = -10.0/-0;
    System.out.println(d); // -Infinity

  }}

  */

//class Manish{
//
//  public static void main(String[] args) {
//   String str1= "XYZ";
//
//   String str2= "INDIA";
//    String str3= str1+str2;
//   String str4= "XYZINDIA";
//
//    System.out.println(str3==str4);//false
//  }}

//
//class Manish{
//
//  public static void main(String[] args) {
//    m1(null);
//  }
//
//  static void m1(Object i1) {
//    System.out.println("Object i1");
//  }
//  static void m1(String i1) {
//    System.out.println("String i1");
//  }
//}


/*
class Manish {

  public static void main(String[] args) {
    Hai h = new hello();
    h.sum(10, 20);
  }

}
class Hai{
  public void sum(int x, int y){
    System.out.println("Sum in Hai");
  }
}
class Hello extends Hai{
  public int sum(int x, int y){
    System.out.println("Sum in Hello");
    return 10;
  }
}

*/
/*
class Outer {
  interface memi{
    public void foo();
  }
  static class Inner implements  memi{
    public void foo(){
      System.out.println("In outr"); //In outr
    }
  }

  public static void main(String[] args) {
    Outer.Inner i = new Outer.Inner();
    i.foo();
  }

}

*/

//class  Manish{
//
//  public static void main(String[] args) {
//    String csv = "Sue,5,true,3 ";
//    Scanner s = new Scanner(csv);
//    s.useDelimiter(",");
//    int age = s.nextInt();
//    System.out.println(age);// Runtime
//  }
//}
/*
class A {

  void myMethod() {
    System.out.println("A");
  }
}

class B extends A {

  void myMethod(int a) {
    System.out.println("B");
  }
}
class C extends A {

  void myMethod() {
    System.out.println("C");
  }
}
class  Manish{

  public static void main(String[] args) {
    A b = new B();
    C c = new C();
    b.myMethod();
    c.myMethod();
  }
}
A
C

*/