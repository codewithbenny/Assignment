package Questions;

import node.Node;

public class StackUsingLinkedList {
    private Node top;
    private int size;

    public StackUsingLinkedList() {
        this.top = null;
         size = 0;
    }

    public void push(int element){
        Node node =new Node(element);
        if(top==null){
            top=node;

        }else{
            node.setNext(top);
            top=node;
        }
        System.out.println("Added Successfully");
        size++;
    }
    public int pop() {
        int response = 0;

            // Single node
            response = top.getData();
            // size--;
            top = top.getNext();



        return response;
    }
    public static void main(String[] args) {
      StackUsingLinkedList stackUsingLinkedList=new StackUsingLinkedList();
      stackUsingLinkedList.push(10);
        stackUsingLinkedList.push(20);
        stackUsingLinkedList.push(30);
        System.out.println(stackUsingLinkedList.pop());
        System.out.println(stackUsingLinkedList.pop());
    }
}
