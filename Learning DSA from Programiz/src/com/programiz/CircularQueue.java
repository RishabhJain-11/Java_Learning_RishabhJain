package com.programiz;

 public class CircularQueue {
     public static void main(String[] args) {
         CircularQueue q = new CircularQueue();
         q.deQueue();

         q.enQueue(1);
         q.enQueue(2);
         q.enQueue(3);
         q.enQueue(4);
         q.enQueue(5);
         q.enQueue(6);
         q.display();

         int elem = q.deQueue();
         if(elem != -1){
             System.out.println("Deleted Element is = " + elem);
         }
         q.display();

         q.enQueue(7);
         q.display();
         q.enQueue(8);
     }
    int SIZE = 5;//SIZE OF CIRCULAR QUEUE
    int front,rear;
    int items[] = new int[SIZE];//creating A  Queue

    CircularQueue(){//initializing the front and the rear to -1
        front = -1;
        rear = -1;
    }

    public boolean isFull(){
        if(front == 0 && rear == SIZE - 1){
            return true;
        }
        if(front == rear + 1){
            return true;
        }
        return false;
    }
    //Check if the Queue is Empty

     boolean isEmpty(){
        if(front == -1)
            return true;
        else
            return false;
     }

     //Adding element
     void enQueue(int element){
        if(isFull()){
            System.out.println("Queue is full");
        }else {
            if (front == -1)
                front = 0;
            rear = (rear+1)%SIZE;
            items[rear] = element;
            System.out.println("Inserted " + element);
        }
     }

     //Removing an element
     public int deQueue(){
        int element;
        if(isEmpty()){
            System.out.println("Queue is Empty ");
            return (-1);
        }else{
            element = items[front];
            if(front == rear){
                front = -1;
                rear = -1;
            }//Q has only one element so we reset the Queue after deleting it.
            else{
                front = (front +1) % SIZE;
            }
            return (element);
        }
     }
     //Function to Display the Status of the Circular Queue
     void display(){
        int i ;
        if(isEmpty()){
            System.out.println("Enpty Queue");
        }

        else {
            System.out.println("Front -> " + front);
            System.out.println("Items -> ");
            for (i = front; i != rear; i = (i + 1) % SIZE) {
                System.out.println(items[i] + " ");
                System.out.println(items[i]);
                System.out.println("Rear -> " + rear);
            }
        }
     }

}
