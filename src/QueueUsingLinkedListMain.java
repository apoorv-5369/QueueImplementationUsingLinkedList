public class QueueUsingLinkedListMain {
    private Node front, rear;
    private int currentSize;
    // Class to define the linked list node.
    private class Node{
        int data;
        Node next;
    }
    // Zero argument constructor.
    public QueueUsingLinkedListMain(){
        front = null;
        rear = null;
        currentSize = 0;
    }
    public boolean isEmpty(){
        return (currentSize==0);
    }
    public int dequeue(){
        int data = front.data;
        front = front.next;
        if(isEmpty()){
            rear = null;
            System.out.println("Queue is Empty.");
        }
        currentSize--;
        System.out.println(data+" deleted from the Queue.");
        return data;
    }
    public void enqueue(int data){
        Node oldRear = rear;
        rear = new Node();
        rear.data=data;
        rear.next=null;
        if(isEmpty()){
            front = rear;
        }else{
            oldRear.next = rear;
        }
        currentSize++;
        System.out.println(data+" added to the Queue.");
    }
    public static void main(String[] args){
        QueueUsingLinkedListMain q = new QueueUsingLinkedListMain();
        q.enqueue(45);
        q.enqueue(15);
        q.enqueue(3);
        q.dequeue();
        q.dequeue();
        q.dequeue();
    }
}
