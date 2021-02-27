package ejem_Herencia;

public class Profesor extends Persona{
	 //Campos espec�ficos de la subclase.

    private String IdProfesor;

    //Constructor de la subclase: incluimos como par�metros al menos los del constructor de la superclase

    public Profesor (String nombre, String apellidos, int edad) {

        super(nombre, apellidos, edad);

        IdProfesor = "Unknown";   } //Cierre del constructor

    //M�todos espec�ficos de la subclase

    public void setIdProfesor (String IdProfesor) { this.IdProfesor = IdProfesor;   }

    public String getIdProfesor () { return IdProfesor;   }

    public void mostrarNombreApellidosYCarnet() {

        // nombre = "Paco"; Si trat�ramos de acceder directamente a un campo privado de la superclase, salta un error

        // S� podemos acceder a variables de instancia a trav�s de los m�todos de acceso p�blicos de la superclase

        System.out.println ("Profesor de nombre: " + getNombre() + " " +  getApellidos() +

         " con Id de profesor: " + getIdProfesor() ); }
}
