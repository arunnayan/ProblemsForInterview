package LinkedList;

import java.util.Scanner;

public class InterSectionLinkedLists {

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

    public int getCommonindex(InterSectionLinkedLists other){
      //find the length of smallest
      Node h = this.head;
      Node other_head= other.head;

      int count=0;
      if(this.size>other.size){
        count = this.size-other.size;
        for (int i = 0; i < count; i++) {
          h = h.next;
        }
      }else{
        count =other.size- this.size;
        count = this.size-other.size;
        for (int i = 0; i < count; i++) {
          other_head = other_head.next;
        }
      }

      while (h!=null){
        count++;
        if(h.data==other_head.data){
          return h.data;
        }
        h=h.next;
        other_head=other_head.next;
      }
      return -1;
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



        InterSectionLinkedLists list1 = new InterSectionLinkedLists();
        int n1 = scn.nextInt();

        for (int j = 0; j < n1; j++) {
          int item = scn.nextInt();
          list1.addLast(item);
        }

        InterSectionLinkedLists list2 = new InterSectionLinkedLists();
        int n2 = scn.nextInt();

        for (int j = 0; j < n2; j++) {
          int item = scn.nextInt();
          list2.addLast(item);
        }
        //list1.merge_sorted_list(list2);
        //list1.merge_sorted_list_rec(list2);
        System.out.println(list1.getCommonindex(list2));




    }
  }
