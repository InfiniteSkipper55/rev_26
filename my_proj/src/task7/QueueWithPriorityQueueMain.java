package task7;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueWithPriorityQueueMain {

	public static void main(String[] args) {
		Queue<Integer> ll = new LinkedList<>();
		for (int i = 0; i < 10; i++) {
			ll.add(i);
		}
		System.out.println("Elements of queue: " + ll);
		
		ll.remove();
		System.out.println("Elements of queue after removing first element: " + ll);
		
		int a = ll.peek();
		System.out.println("Head element of queue: " + a);
		System.out.println("Size of queue: " + ll.size());
		ll.add(99);
		System.out.println("Updated queue: " + ll);
		
		//Implementation of PriorityQueue
		Queue<Integer> pq = new PriorityQueue<Integer>();
		pq.add(4);
		pq.add(80);
		pq.add(5);
		
		Iterator<Integer> i = pq.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
		Queue<String> pq1 = new PriorityQueue<>();
		pq1.add("god");
		pq1.add("please");
		pq1.add("help");
		pq1.add("me");
		pq1.add("bro");
		pq1.add("hey");
		
		System.out.println(pq1);
		
		//Product Example of PriorityQueue
		Queue<QueueWithPriorityQueue> qpq = new PriorityQueue<>();
		qpq.add(new QueueWithPriorityQueue(1, "Izuku", 20));
		qpq.add(new QueueWithPriorityQueue(7, "Sasuke", 25));
		qpq.add(new QueueWithPriorityQueue(8, "Goku", 18));
		qpq.add(new QueueWithPriorityQueue(5, "Vegita", 21));
		
		printQueue(qpq);
		
		
	}
	
	public static void printQueue(Queue<QueueWithPriorityQueue> qpq) {
		Iterator<QueueWithPriorityQueue> iq = qpq.iterator();
		while(iq.hasNext()) {
			System.out.println(iq.next());
		}
	}

}
