
public class HashTable<K,V> {
	private final int size=20;
	private Entry<K,V>[] table;
	
	public HashTable(){
		table= new Entry[size];
	}
	
	public void add(K key, V value){
		Entry<K,V> entry=new Entry<>(key,value);
		int position= hashPosition(key);
		table[position]=entry;
		
	}
	
	
	private int hashPosition(K key){
		System.out.println("El hash de la llave es: "+key.hashCode());
		System.out.println("La posición que le toca es: "+key.hashCode()%20);
		return key.hashCode()%size;
	}
	
	public void imprimeTabla(){
		for (int i = 0; i < table.length; i++) {
			if(table[i]!=null){
				System.out.println(i+".-"+"Key: "+table[i].getKey().toString()+" Value: "+table[i].getValue());
			}else{
				System.out.println(i+".-"+"Vacío");
			}
		}
	}
	
}
