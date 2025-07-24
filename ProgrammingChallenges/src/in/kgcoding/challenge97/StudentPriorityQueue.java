//Result:
//        🔻 Negative (−) aaya to → o1 ko pehle rakhna hai
//        🔺 Positive (+) aaya to → o2 ko pehle rakhna hai
//        🟰 0 aaya to → dono barabar hain

package in.kgcoding.challenge97;

import java.util.Comparator;
import java.util.PriorityQueue;

public class StudentPriorityQueue {
    public static void main(String[] args) {
        PriorityQueue<Student> queue = new PriorityQueue<>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return o1.getGrade() - o2.getGrade();
            }
        });

        //PriorityQueue doesn’t keep items sorted like a list.
        //Java’s PriorityQueue uses a Min-Heap data structure (implemented as an array) to store elements.
        //Jab tum offer() karte ho, element heap ke rule ke hisaab se insert hota hai.
        //Heap ensure karta hai ki sabse chhoti value (lowest grade) root par ho.
        //Heap rearrange karta hai elements internally using heapify operations.

        //heapify se pehle, elements bas sequence mein jaate hain
        //Java automatically heapify karta hai har insert ke baad.
        //Heapify check karta hai: "Kya parent ka grade chhota hai?"
        //Agar nahi, to swap karta hai — taaki Min-Heap ban sake.


        // ✅ After Reheapify (Final Heap):
        //      Ram(A)
        //     /      \
        //Mohan(A)   Vyom(D)
        //  /    \
        //Shyam(C) Sanchit(B)

        queue.offer(new Student("Shyam", 'C'));
        queue.offer(new Student("Ram", 'A'));
        queue.offer(new Student("Vyom", 'D'));
        queue.offer(new Student("Mohan", 'A'));
        queue.offer(new Student("Sanchit", 'B'));

        System.out.println(queue);

        //poll() removes and returns the student with the lowest grade (highest priority) from the queue.
        //👉 Lower grade → higher priority → removed first.
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
        System.out.println(queue.poll());
    }
}
