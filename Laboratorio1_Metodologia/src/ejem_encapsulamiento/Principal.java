package ejem_encapsulamiento;

public class Principal {

	public static void main(String[] args) {
        Persona persona1=new Persona();
		
		persona1.setEdad(19);
		System.out.println("Edad: "+persona1.getEdad());
		
		persona1.setNombre("Hector");
		System.out.println("Nombre: "+persona1.getNombre());


	}

}
