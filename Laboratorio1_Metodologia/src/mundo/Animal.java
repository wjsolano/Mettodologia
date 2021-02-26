package mundo;

public abstract class Animal {
	// Variable que contendra el nombre del animal
		private String name;
	 
		// setter para definir el nombre del animal
		public void setName(String name) {
			this.name=name;
		}
	 
		// getter para obtener el nombre del animal
		public String getName() {
			return this.name;
		}
	 
		// Definiemos una clase abstracta
		// Creas un patron de diseño que tienes que seguir obligatoriamente
		// en tu jerarquia de herencia
		public abstract String tipoAnimal();
}
