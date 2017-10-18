
public class Main {
	
	public static void main(String args[]){
		Queue<Integer> q= new Queue<>();
		q.enqueue(3);
		q.enqueue(4);
		q.enqueue(6);
		q.enqueue(8);
		q.enqueue(10);
		q.print();
		System.out.println("Peek a la cola: "+q.peek());
		q.print();
		System.out.println("Dequeue: "+q.dequeue());
		q.print();
		System.out.println("Peek a la cola: "+q.peek());

	}

}
