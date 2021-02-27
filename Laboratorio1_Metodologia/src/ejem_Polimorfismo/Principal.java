package ejem_Polimorfismo;

public class Principal {

	public static void main(String[] args) {
        Vehiculo vehiculo[]=new Vehiculo[4];
		
		vehiculo[0]=new Vehiculo("HC13", "Toyota", "C19");
		vehiculo[1]=new VehTurismo(6, "EM18", "Ferrari", "Z26");
		vehiculo[2]=new VehDeportivo(400, "IJ16", "Ford", "M25");
		vehiculo[3]=new VehFurgoneta(3000, "IM02", "Audi", "V21");
		
		for(Vehiculo carros:vehiculo) {
			System.out.println(carros.mostrarDatos());
			System.out.println("");
		}

	}

}
