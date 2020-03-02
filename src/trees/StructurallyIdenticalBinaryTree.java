package trees;

import java.util.Scanner;

public class StructurallyIdenticalBinaryTree {

  static Scanner scn = new Scanner(System.in);

  public static void main(String[] args) {
    StructurallyIdenticalBinaryTree m = new StructurallyIdenticalBinaryTree();
    BinaryTree bt1 = m.new BinaryTree();
    BinaryTree bt2 = m.new BinaryTree();
    System.out.println(bt1.structurallyIdentical(bt2));
  }

  private class BinaryTree {
    private class Node {
      int data;
      Node left;
      Node right;
    }

    private Node root;
    private int size;

    public BinaryTree() {
      this.root = this.takeInput(null, false);
    }

    public Node takeInput(Node parent, boolean ilc) {

      int cdata = scn.nextInt();
      Node child = new Node();
      child.data = cdata;
      this.size++;

      // left
      boolean hlc = scn.nextBoolean();

      if (hlc) {
        child.left = this.takeInput(child, true);
      }

      // right
      boolean hrc = scn.nextBoolean();

      if (hrc) {
        child.right = this.takeInput(child, false);
      }

      // return
      return child;
    }

    public boolean structurallyIdentical(BinaryTree other) {
      return this.structurallyIdentical(this.root, other.root);
    }
    public int size(){
      return size;
    }
    private boolean structurallyIdentical(Node tnode, Node onode) {
      if(tnode==null && onode==null ) return true;
      if(tnode==null && onode!=null) return false;
      if(tnode!=null && onode==null) return false;
      boolean result = structurallyIdentical(tnode.left,onode.left);
      if(result==false) return false;
      result = structurallyIdentical(tnode.right,onode.right);
      if(result==false) return false;
      return result;
    }

  }
}
/*

10 true 20 true 40 false false true 50 false false true 30 true 60 false false true 73 false false
10 true 20 true 40 false false true 50 false false true 30 true 60 false false true 73 false false

 */