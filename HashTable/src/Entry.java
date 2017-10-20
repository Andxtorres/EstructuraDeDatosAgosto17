
public class Entry<K,V> {
	
	private K key;
	private V value;
	private Entry<K,V> siguiente;
	
	
	public Entry(K key, V value) {
		super();
		this.key = key;
		this.value = value;
	}
	public K getKey() {
		return key;
	}
	public void setKey(K key) {
		this.key = key;
	}
	public V getValue() {
		return value;
	}
	public void setValue(V value) {
		this.value = value;
	}
	public Entry<K, V> getSiguiente() {
		return siguiente;
	}
	public void setSiguiente(Entry<K, V> siguiente) {
		this.siguiente = siguiente;
	}
	
	

}
