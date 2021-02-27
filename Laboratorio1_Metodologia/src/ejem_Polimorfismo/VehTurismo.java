package ejem_Polimorfismo;

public class VehTurismo extends Vehiculo{
	
    private int puertas;
	
	public VehTurismo(int pPuertas, String pMatricula, String pMarca, String pModelo) {
		super(pMatricula, pMarca, pModelo);
		puertas=pPuertas;
	}
	
	public int getPuertas() {
		return puertas;
	}
	
	public String mostrarDatos() {
		return "Matricula: "+matricula+"\nMarca: "+marca+"\nModelo: "+modelo+
				"\nNumero de Puertas: "+puertas;
	}

}
