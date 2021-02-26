package ejem_Abstraccion;

public class Perro   extends Animal{
	public Perro(String name) {
		super.setName(name);
	}
 
	// Estamos obligados a crear este metodo, ya que heredamos de Animal
	// que es una clase abstracta, por lo que hay que definir todos los
	// metodos abstractos que tenga
	public String tipoAnimal() {
		return "El animal es un perro. Se llama " + super.getName();
	}
}
