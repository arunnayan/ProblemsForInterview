package LinkedList;
import java.util.*;
public class MergeSortedLinkedLists {

    private class Node {

      int data;
      Node next;
    }

    public Node head;
    private Node tail;
    private int size;

    public int getFirst() throws Exception {
      if (this.size == 0)
        throw new Exception("linked list is empty");

      return head.data;
    }

    public int getLast() throws Exception {
      if (this.size == 0)
        throw new Exception("linked list is empty");

      return tail.data;
    }

    public void addLast(int item) {
      // create a new node
      Node nn = new Node();

      nn.data = item;
      nn.next = null;

      // update summary
      if (size == 0) {
        this.head = nn;
        this.tail = nn;
        size++;
      } else

      {
        this.tail.next = nn;
        this.tail = nn;

        size++;
      }

    }

    public void addFirst(int item) {
      Node nn = new Node();
      nn.data = item;
      nn.next = null;

      if (size == 0) {
        this.head = nn;
        this.tail = nn;
        size++;
      } else {
        nn.next = this.head;
        this.head = nn;
        size++;
      }

    }

    public int removeFirst() throws Exception {
      Node fn = this.head;

      if (this.size == 0)
        throw new Exception("linked list is empty");

      if (this.size == 1) {
        this.head = null;
        this.tail = null;
        size = 0;
      } else {
        Node np1 = this.head.next;
        this.head = np1;
        size--;
      }

      return fn.data;
    }

    public void merge_sorted_list(MergeSortedLinkedLists other) throws Exception {

      MergeSortedLinkedLists ans = new MergeSortedLinkedLists();
      Node one = this.head;
      Node two = other.head;

      while(one!=null && two!=null){
        if(one.data<two.data){
          ans.addLast(one.data);
          one=one.next;
        }else{
          ans.addLast(two.data);
          two=two.next;
        }
      }
      while(one!=null){
          ans.addLast(one.data);
          one=one.next;
      }
      while(two!=null){
        ans.addLast(two.data);
        two=two.next;
      }
      ans.display();
    }

  public void merge_sorted_list_rec(MergeSortedLinkedLists other) throws Exception {
    this.head = merge_rec(this.head, other.head);
    this.display();

  }
  public Node merge_rec(Node a , Node b){
      if(a==null) return b;
      else if(b==null) return a;

      Node c=null;

      if(a.data<b.data){
        c=a;
        c.next = merge_rec(a.next,b);

      }else{
        c=b;
        c.next = merge_rec(a,b.next);
      }
      return c;

  }



    public void display() {

      Node temp = this.head;

      while (temp != null) {
        System.out.print(temp.data + " ");
        temp = temp.next;
      }

    }

    static Scanner scn = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
      // TODO Auto-generated method stub

      int t = scn.nextInt();

      while(t > 0){

        MergeSortedLinkedLists list1 = new MergeSortedLinkedLists();
        int n1 = scn.nextInt();

        for (int j = 0; j < n1; j++) {
          int item = scn.nextInt();
          list1.addLast(item);
        }

        MergeSortedLinkedLists list2 = new MergeSortedLinkedLists();
        int n2 = scn.nextInt();

        for (int j = 0; j < n2; j++) {
          int item = scn.nextInt();
          list2.addLast(item);
        }
        //list1.merge_sorted_list(list2);
        list1.merge_sorted_list_rec(list2);

        t--;
      }



    }
  }
