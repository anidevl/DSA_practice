public class LL{
 /*Major Operations in LinkedList are
  
  1.add-addFirst,addSecond
  2.delete-deleteFirst,deleteSecond
  3.traverse
  4.size

  */
  Node head;
  private int size;
  LL(){
    size = 0;
  }

  // Creating our Node class
  public class Node{
    String data; // data in that node
    Node next; // the next node it is pointing too we are using Node variable here to store data of next Node

    Node(String data){
        this.data = data; //here "this.data" is our data in node and "data" is our String data that we will passs using constructor
        this.next = null; //by default we will have null node for next node and change it as per our need
    }

  }
  //addFirst
  public void addFirst(String data){
    Node newNode = new Node(data);
    newNode.next = head;
    head= newNode;
    size++;
  }
  //addLast
  public void addLast(String data){
    Node newNode = new Node(data);
    size++;
    if(head==null){
      head=newNode;
      return;
    }
    Node currNode = head;
    while(currNode.next!=null){
      currNode = currNode.next;
    }
    currNode.next = newNode;

  }
  //deleteFirst
  public void deleteFirst(){
    if(head==null){
      System.out.println("LinkedList is Empty ");
      return;
    }
    head = head.next;
    size--;
  }
  // deleteLast
  public void deleteLast(){
    if(head==null){
      System.out.println("LinkedList is Empty");
      return;
    }
    if(head.next==null){
      head=null;
      size--;
      return;
    }
    Node secondLast = head;
    Node lastNode = head.next;

    while(lastNode.next==null){
      lastNode = lastNode.next;
      secondLast = secondLast.next;
    }
    secondLast.next = null;
    size--;
    
  }
  // traverese
  public void traverese(){
    
    if(head==null){
      System.out.println("null");
      return;
    }
    Node currNode = head;
    while(currNode!=null){
      System.out.print(currNode.data + "->");
      currNode = currNode.next;
    }
    System.out.println("null");
    
  }
  // size
  public void size(){
    System.out.println(size);
  }
  //reverse
  public void reverseIterative(){
    // if list is empty or only one element is present then we will deal it with using below case
    if(head==null || head.next==null){
      return;
    }
    // if list is not empty
      Node prevNode = null;
      Node currNode = head;
      Node nextNode = head.next;
      while(currNode!=null){
         nextNode = currNode.next;
         currNode.next = prevNode;
         prevNode = currNode;
         currNode = nextNode;
      }
      //making my original LinkedList 's last element as head after reversing the whole Linked list 
      head = prevNode;  
        

    }
    public Node reverseRecursive(Node head){
      if(head==null || head.next==null){
        return head;
      }
      
      Node newHead = reverseRecursive(head.next);
      Node front = head.next;
      front.next = head;
      head.next = null;
      return newHead;

      
    }
    
  
  public static void main(String[] args) {
    LL list = new LL();
    list.addFirst("1");
    list.addLast("3");
    list.addLast("4");
    list.addLast("5");
    
    // list.traverese();
    // list.size();
    // list.deleteFirst();
    // list.traverese();
    // list.size();
    // list.deleteLast();
    list.traverese();
    list.size();
    list.head=list.reverseRecursive(list.head);
    list.traverese();
    list.size();

  }
  
    
}
