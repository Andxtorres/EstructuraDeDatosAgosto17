
public class Node<T extends Comparable<T>> {
	
	private Node<T> next;
	private T element;
	public Node(){
	}	
	public Node(T element){
		this.element=element;
	}
	public Node<T> getNext() {
		return next;
	}
	public void setNext(Node<T> next) {
		this.next = next;
	}
	public T getElement() {
		return element;
	}
	public void setElement(T element) {
		this.element = element;
	}
	
	
}
