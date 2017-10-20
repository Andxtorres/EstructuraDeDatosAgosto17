
public class HashTable<K,V> {
	private final int size=20;
	private Entry<K,V>[] table;
	
	public HashTable(){
		table= new Entry[size];
	}
	
	public void add(K key, V value){
		Entry<K,V> entry=new Entry<>(key,value);
		int position= hashPosition(key);
		if(table[position]!=null){
			Entry<K,V> temp= table[position];
			while(temp.getSiguiente()!=null){
				temp=temp.getSiguiente();
			}
			temp.setSiguiente(entry);
		}else{
			table[position]=entry;

		}
		
	}
	
	public V find(K key){
		int pos= hashPosition(key);
		if(table[pos]!=null){
			Entry<K,V> temp= table[pos];
			while(temp!=null){
				if(temp.getKey().equals(key)){
					
					return temp.getValue();
				}else{
					temp=temp.getSiguiente();
				}
			}
			return null;
		}else{
			return null;
		}
	}
	
	
	private int hashPosition(K key){
		System.out.println("El hash de la llave es: "+key.hashCode());
		System.out.println("La posición que le toca es: "+key.hashCode()%20);
		return key.hashCode()%size;
	}
	
	public void imprimeTabla(){
		for (int i = 0; i < table.length; i++) {
			if(table[i]!=null){
				Entry<K,V> temp= table[i];

				while(temp!=null){
					System.out.print(i+".-"+"Key: "+temp.getKey().toString()+" Value: "+temp.getValue()+"");
					temp=temp.getSiguiente();
				}
				System.out.println("");
			}else{
				System.out.println(i+".-"+"Vacío");
			}
		}
	}
	
}
