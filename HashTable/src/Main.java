
public class Main {
	
	public static void main(String args[]){

		/*
		Alumno a1= new Alumno();
		a1.setMatricula("A01211914");
		a1.setNombre("Andrés Torres");
		Alumno a2= new Alumno();
		a2.setMatricula("A01211914");
		a2.setNombre("Andres Torres");
		Alumno a3= new Alumno();
		a3.setMatricula("A013299292");
		a3.setNombre("Juan Pérez");		
		System.out.println("HashCode de a1: "+a1.hashCode());
		System.out.println("HashCode de a2: "+a2.hashCode());
		System.out.println("HashCode de a2: "+a3.hashCode());
		System.out.println("Los objetos son iguales? "+a1.equals(a2));
		*/
		Alumno a1= new Alumno();
		a1.setMatricula("A01211914");
		a1.setNombre("Andrés Torres");
		HashTable<Alumno,Double> hashTable= new HashTable<>();
		hashTable.add(a1, 9.9);
		hashTable.imprimeTabla();
		Alumno a2= new Alumno();
		a2.setMatricula("A01211936");
		a2.setNombre("Pedro Lopez");
		hashTable.add(a2, 7.5);
		hashTable.imprimeTabla();
		
		
	}
	

}
