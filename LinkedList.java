
public class LinkedList 
{

  Node head;

  void insertAtHead(int val) 
  {
    Node newNode = new Node(val);
    if (head == null) 
    {
      head = newNode;
      return;
    }

    newNode.next = head;
    head = newNode;
  }

  void insertAtTail(int val) 
  {
    Node newNode = new Node(val);
    if (head == null) 
    {
      head = newNode;
      return;
    }

    Node temp = head;
    while (temp.next != null) 
    {
      temp = temp.next;
    }
    temp.next = newNode;
  }

  void display() 
  {
    Node temp = head;
    while (temp != null) 
    {
      System.out.print(temp.data + " -> ");
      temp = temp.next;
    }
    System.out.println();
  }

  boolean search(int key) 
  {
    Node temp = head;
    while (temp != null) 
    {
      if (temp.data == key) 
      {
        return true;
      }
      temp = temp.next;
    }
    return false;
  }

  public static void main(String[] args) 
  {
    LinkedList linkedList = new LinkedList();
    linkedList.insertAtTail(1);
    linkedList.insertAtTail(2);
    linkedList.insertAtTail(3);
    linkedList.display();
    linkedList.insertAtHead(4);
    linkedList.display();

    boolean isFound = linkedList.search(5);
    if (isFound) 
    {
      System.out.println("exist in linked list");
    } else 
    {
      System.out.println("Not exist in the linked list");
    }
  }
}

class Node 
{
  int data;
  Node next;

  Node(int val) 
  {
    this.data = val;
    this.next = null;
  }
}
