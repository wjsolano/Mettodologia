package ejem_Polimorfismo;

public class VehDeportivo extends Vehiculo{
	
    private int cilindro;
	
	public VehDeportivo(int pCilindro, String pMatricula, String pMarca, String pModelo) {
		super(pMatricula, pMarca, pModelo);
		cilindro=pCilindro;
	}
	
	public int getClindro() {
		return cilindro;
	}
	
	public String mostrarDatos() {
		return "Matricula: "+matricula+"\nMarca: "+marca+"\nModelo: "+modelo+
				"\nCilindrada: "+cilindro;
	}

}
