package trees;
import java.util.*;

public class BuildBST {

  class Node {

    int data;
    Node left;
    Node right;

    public Node(int data) {
      this.data = data;
      this.left = null;
      this.right = null;
    }
  }

  private Node root;
  private int size;

  public void consturct(int []arr){
    this.root = buildBST(arr, 0, arr.length-1);
  }

  public Node buildBST(int[] sort_arr, int start, int end) {
    if(start>end) return null;
    int mid = (start+end)/2;
    Node new_node = new Node(sort_arr[mid]);
    new_node.left = buildBST(sort_arr, start, mid-1);
    new_node.right = buildBST(sort_arr, mid+1, end);
    return new_node;
  }

  public void print_pre_order(Node r) {
    //Middle - Left - Right
    if(r==null) return;

    System.out.print(r.data + " ");

    print_pre_order(r.left);
    print_pre_order(r.right);
  }

  public static void main(String[] args) {
    BuildBST bst = new BuildBST();
    Scanner s = new Scanner(System.in);
    int numOfTestCases = s.nextInt();
    while (numOfTestCases-- > 0) {
      int len = s.nextInt();

      int sorted_arr[] = new int[len];
      for (int i = 0; i < len; i++) {
        sorted_arr[i] = s.nextInt();
      }

      bst.consturct(sorted_arr);
      bst.print_pre_order(bst.root);

    }
  }
}