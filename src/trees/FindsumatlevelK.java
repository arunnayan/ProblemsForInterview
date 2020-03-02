package trees;

import java.util.Scanner;

public class FindsumatlevelK {
  static Scanner scn = new Scanner(System.in);
  class Node{
    int data;
    Node left;
    Node right;
  }

  private Node root;
  private int size;

  public Node create_tree(Node n, int ith_level){

      //for parent node / root node for first time
      int item = scn.nextInt();
      Node node = new Node();
      node.data = item;
      this.root = node;

      //for 2 child node if exist

      int noc = scn.nextInt();
    for (int i = 0; i < noc; i++) {
      Node child = create_tree(node, i); //i=0 left child and i=1 right chold
      if(i==0) node.left=child;
      if(i==1) node.right=child;
    }
    return node;
  }
  public void display() {
    System.out.println("--------------------------");
    display(this.root);
    System.out.println("--------------------------");
  }

  private void display(Node node) {
    String str = node.data + " -> ";
    if(node.left!=null) str += node.left.data + ", ";
    if(node.right!=null) str += node.right.data + ", ";

    str += ".";
    System.out.println(str);
    if(node.left!=null) display(node.left );
    if(node.right!=null) display(node.left );
  }

  public int sum_at_kth_level(Node root, int kth){
   /*     1   kth = 1
        /  \
      2     3  kth = 2
    */

    if(root==null) return 0;
    if(kth<=1){
      return root.data;
    }
    int left_sum = sum_at_kth_level(root.left, kth-1);
    int right_sum = sum_at_kth_level(root.left, kth-1);

    return left_sum+right_sum;
  }


  public static void main(String[] args) {

    FindsumatlevelK f = new FindsumatlevelK();
    f.root = f.create_tree(null, -1);
    f.display();
    scn.nextLine();
    int kth_level = scn.nextInt();

    System.out.println(f.sum_at_kth_level(f.root, kth_level));
  }
}
