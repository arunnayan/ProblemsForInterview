package LinkedList;

import java.util.Scanner;

public class VerifyCircularLinkedLists {

    public class Node {

      int data;
      Node next;
    }

    public Node head;
    public Node tail;
    public int size;

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

  private boolean isCicularRemoveLoop() {
      Node slow = this.head;
      Node fast = this.head;
      while (fast!=null && fast.next!=null){
        if(slow==fast){
          break;
        }
        else {
          slow = slow.next;
          fast=fast.next.next;
        }
      }
      if(slow==fast)//loop found
      {
        Node s =this.head;
        Node sl =slow;
        while (s.next!=sl.next){
          //s and sl pointing the same node
          s=s.next;
          sl=sl.next;
        }
        sl.next=null;
        return true;

      }


      return false;
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



        VerifyCircularLinkedLists list1 = new VerifyCircularLinkedLists();
      int numOfData = scn.nextInt();
      for (int i = 0; i < numOfData; i++) {

          int item = scn.nextInt();
          list1.addLast(item);

      }

        //list1.merge_sorted_list(list2);
        //list1.merge_sorted_list_rec(list2);
        System.out.println(list1.isCicularRemoveLoop());
        System.out.println(list1.isCicularRemoveLoop());




    }


}
