
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
		Alumno a3= new Alumno();
		a3.setMatricula("A01211934");
		a3.setNombre("Alumno Colison");
		hashTable.add(a3,6.5);
		Alumno a4= new Alumno();
		a4.setMatricula("A01211954");
		a4.setNombre("Colision 2");
		hashTable.add(a4,8.0);
		hashTable.imprimeTabla();
		System.out.println("Si buscamos el elemento: a3 su value es: "+hashTable.find(a1));

		
		
	}
	

}
