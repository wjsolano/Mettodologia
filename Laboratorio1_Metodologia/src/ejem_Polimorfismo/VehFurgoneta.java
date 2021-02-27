package ejem_Polimorfismo;

public class VehFurgoneta extends Vehiculo{
private int carga;
	
	public VehFurgoneta(int pCarga, String pMatricula, String pMarca, String pModelo) {
		super(pMatricula, pMarca, pModelo);
		carga=pCarga;
	}
	
	public int getCarga() {
		return carga;
	}
	
	public String mostrarDatos() {
		return "Matricula: "+matricula+"\nMarca: "+marca+"\nModelo: "+modelo
				+"\nCarga: "+carga;
	}

}
