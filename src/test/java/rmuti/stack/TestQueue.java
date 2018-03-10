package rmuti.stack;

import rmuti.stack.ArrayListQueue;

public class TestQueue {
	
	public static void main(String[] args) {
		ArrayListQueue queue = new ArrayListQueue();
		queue.enqueue("macos");
		queue.enqueue("linux");
		queue.enqueue("windows");
		System.out.println(queue);
		System.out.println(queue.peek());
		String data = (String)queue.dequeue();
		System.out.println(queue);
		
	}
}
