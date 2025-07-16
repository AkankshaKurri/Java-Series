//Queue Interface
//1. It's a collection designed for holding elements prior to processing.
//2. Ordering: Typically, it orders elements in FIFO(First-In-First-Out) manner.
//3. End Points: Offers two ends - one for insertion(tail) and the other removal(head).

//1. add(E e): Inserts the specified element into the queue. Throws an exception if the element cannot be added.
//2. offer(E e): Inserts the specified element into the queue. Returns false if the element cannot be added.
//3. remove(): Retrieves and removes the head of  the queue. Throws an exception if the queue is empty.
//4. poll(): Retrieves and removes the head of the queue, or returns null if the queue is empty.
//5. element(): Retrieves, but does not remove, the head of the queue. Throws an exception if the queue is empty.
//6. peek(): Retrieves, but does not remove, the head of the queue, or returns null if the queue is empty.


package in.kgcoding.collections;

import java.util.LinkedList;
import java.util.Queue;

public class TestingQueue {
    public static void main(String[] args) {
         Queue<Integer> queue = new LinkedList<>();
         queue.add(1);  //add integer
         queue.offer(2);  //add integer

        printQueue(queue);

        System.out.println(queue.element());  //returns 1
        System.out.println(queue.peek());    //returns 1

        System.out.println(queue.remove());   //Remove "1" and returns 1
        System.out.println(queue.poll());     //Remove "2" and returns 2

        printQueue(queue);

        //System.out.println(queue.remove()); //returns exception
        System.out.print(queue.poll());  //returns null

    }

    public static void printQueue(Queue<Integer> queue) {
        System.out.print("Collections are:");
        for(Integer i : queue){
            System.out.printf("%d ",i);
        }
        System.out.println();
    }
}
