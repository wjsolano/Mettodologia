package ejem_Polimorfismo;

public class Vehiculo {
	
	protected String modelo;
	protected String matricula;
	protected String marca;
	
	public Vehiculo(String pMatricula, String pMarca, String pModelo) {
		matricula=pMatricula;
		marca=pMarca;
		modelo=pModelo;
	}
	
	public String getMatricula() {
		return matricula;
	}
	
	public String getMarca() {
		return marca;
	}
	
	public String getModelo() {
		return modelo;
	}
	
	public String mostrarDatos() {
		return "Matricula: "+matricula+"\nMarca: "+marca+"\nModelo: "+modelo; 
	}


}
