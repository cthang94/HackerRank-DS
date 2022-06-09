package generics.driver;

import generics.myQueueGeneric;
import generics.myStackGeneric;

public class DriverForGenerics {
    public static void driveStackGeneric() {
        myStackGeneric<String> sg1 = new myStackGeneric<>();
        sg1.push("Max");
        sg1.push("Sam");
        sg1.push("Tom");
        sg1.print();
        sg1.pop();
        sg1.print();
    }
    public static void main(String[] args) {
        driveStackGeneric();
//        myQueueGeneric<String> queueGeneric1 = new myQueueGeneric<>();
//        myQueueGeneric<String> queueGeneric2 = new myQueueGeneric<>();
//        myQueueGeneric<Integer> queueGeneric3 = new myQueueGeneric<>();

//        queueGeneric1.enqueue("Sam");
//        queueGeneric1.enqueue("Max");
//        queueGeneric1.enqueue("Alex");
//
//        queueGeneric1.print();
//        queueGeneric1.dequeue();
//        queueGeneric1.print();
//        System.out.println(queueGeneric1.size());
//
//        queueGeneric2.dequeue();

//        queueGeneric3.enqueue(5);
//        queueGeneric3.enqueue(3);
//        System.out.println(queueGeneric3.dequeue().toString());
//        queueGeneric3.enqueue(7);
//        queueGeneric3.dequeue();
//        System.out.println(queueGeneric3.front().toString());
//        System.out.println(queueGeneric3.dequeue().toString());
////        System.out.println(queueGeneric3.dequeue());
//        queueGeneric3.isEmpty();
//        queueGeneric3.enqueue(9);
//        queueGeneric3.enqueue(7);
//        System.out.println(queueGeneric3.size());
//        queueGeneric3.enqueue(3);
//        queueGeneric3.enqueue(5);
//        queueGeneric3.print();
//        System.out.println(queueGeneric3.dequeue().toString());
//        queueGeneric3.print();

    }
}
