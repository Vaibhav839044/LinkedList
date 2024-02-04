class program1{
    Node head;
    

    public void addFirst(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void addLast(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }

        Node currentNode = head;
        while(currentNode.next != null){
            currentNode = currentNode.next;
        }
        currentNode.next = newNode;
    }

    public void printList(){
        if(head == null){
            System.out.println("List is empty");
        }
        Node currentNode = head;
        while(currentNode != null){
            System.out.print(currentNode.data +"->");
            currentNode = currentNode.next;
        }
        System.out.println("NULL");
    }

    
   

    public static void main(String[] arg) throws NullPointerException{
        program1 list = new program1();
        list.addFirst("vaibhav");
        list.addFirst("shubham");
        list.addFirst("Rushikesh");
        list.addLast("ketan");
        list.printList();
        
    }


}
class Node{
        String data;
        Node next;

        Node(String data){
            this.data = data;
            this.next = null;
        }
    }