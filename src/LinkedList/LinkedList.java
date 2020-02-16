package LinkedList;

import java.util.Scanner;

public class LinkedList {

  private class Node{
    int data;
    Node next;

    public Node(int data, Node next) {
      this.data = data;
      this.next = next;
    }
  }
  private Node head;
  private Node tail;
  private int size;

  LinkedList(){
    this.head = null;
    this.tail = null;
    this.size = 0;
  }

  LinkedList(Node h, Node t, int s){
    this.head = h;
    this.tail = t;
    this.size = s;
  }

  //O(1)
  public int size(){
    return this.size;
  }

  //O(1)
  public boolean isEmpty(){
    return (this.size==0);
  }

  //O(1)
  public int getFirst()throws Exception{
    if(this.isEmpty()){
      throw new Exception("List is Empty");
    }
    return this.head.data;
  }

  //O(1)
  public int getLast()throws Exception{
    if(this.isEmpty()){
      throw new Exception("List is Empty");
    }
    return this.tail.data;
  }


  // O(N)
  public int getAt(int index) throws Exception {
    if(this.isEmpty()) throw new Exception("List is Empty");
    if(index>=this.size) throw new Exception("Index out of bound");

    Node c = this.head;
    for(int i=0;i<=index;i++){
      c=c.next;
    }
    return c.data;
  }

  // O(N)
  public Node getNodeIndex(int index) throws Exception{
    if(this.isEmpty()) throw new Exception("List is Empty");
    if(index<0 && index>=this.size) throw new Exception("Index out of bound");

    Node c = this.head;
    for(int i=0;i<index;i++){
      c=c.next;
    }
    return c;
  }

  public void addFirst(int data){ // head -> 5 -> 4 -> 3
    if(head==null){
      //this.head = null
      this.head = new Node(data, this.head);
    }
    if(this.size==0){
      this.head = new Node(data, this.head); // head -> 5
      this.tail = this.head;
    }else{
      this.head = new Node(data, this.head);// head -> (X) -> 5
    }
    this.size++;
  }

  // O(1)
  public void addLast(int data) {
    Node newNode = new Node(data, null);
    if(this.size==0){
      this.head = newNode;
      this.tail  = newNode;
    }else{
      this.tail.next = newNode;
      this.tail = this.tail.next; //this.tail = newNode;
    }

    this.size++;
  }

  public void addAt(int idx, int data) throws Exception {
    if(idx<0 && idx>=this.size) throw new Exception("Index out of bound");
    if(idx==0) {
      addFirst(data);
    }
    else if(idx == size) {
      addLast(data);
    }
    else {
      Node c = this.getNodeIndex(idx-1);


      Node n = new Node(data, c.next);
      c.next = n;
    }
  }
// O(1)
    public int removeFirst() throws Exception {
      if (this.isEmpty()) {
        throw new Exception("List is empty");
      }
      Node delete  = this.head;

      if(this.size==1){
        this.head =null;
        this.tail=null;

      }else{
        this.head = this.head.next;
      }
      this.size--;
      return delete.data;

  }

  // O(n)
  public int removeLast() throws Exception {
    if (this.isEmpty()) {
      throw new Exception("List is empty");
    }

    Node delete  = this.tail;

    if(this.size==1){
      this.head =null;
      this.tail=null;

    }else{
      this.tail = this.getNodeIndex(this.size() - 2);
      this.tail.next=null;
    }
    this.size--;
    return delete.data;

  }

  // O(n)
  public int removeAt(int idx) throws Exception {
    if (this.isEmpty()) {
      throw new Exception("List is empty");
    }
    if (idx<0 && idx>=size) {
      throw new Exception("Invalid arguments");
    }
    int result ;
    if(idx==0){
      result = this.removeFirst();
    }else if (idx==size){
      result = this.removeLast();
    }else{
      Node prev_2_delete = this.getNodeIndex(idx-1);
      Node node_2_delete = prev_2_delete.next;

      prev_2_delete.next = node_2_delete.next;
      result =node_2_delete.data;
    }
    this.size--;


    return result;
  }

  // O(n)
  public void display() {
    Node node = this.head;

    while (node != null) {
      System.out.print(node.data + " ");
      node = node.next;
    }

    //System.out.println("END");
  }


  //Initially n be the root node
  public Node reverseByNum(Node n, int k){

    Node currentNode = n;
    Node nextNode=null;
    Node prevNode=null;
    int count= 0;
    while (count<k && currentNode!=null){
      nextNode = currentNode.next;
      currentNode.next = prevNode;
      prevNode=currentNode;
      currentNode=nextNode;
      count++;
    }

    if(nextNode!=null){
      head.next = reverseByNum(nextNode, k);
    }
    return prevNode;
  }

  public void reverse(int k){
    reverseByNum(this.head, k);
  }




  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int N = scn.nextInt();
    int k = scn.nextInt();

    LinkedList list = new LinkedList();

    for (int i = 0; i < N; i++) {
      list.addLast(scn.nextInt());
    }

    list.reverse(k);
    list.display();
  }
}
