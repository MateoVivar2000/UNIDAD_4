package tikTok;

public class Influencer {
	//ATRIBUTOS
	private String nombre;
	private String canal;

//CONSTRUCTOR
public Influencer (String nombre, String canal){
	this.nombre =nombre;
	this.canal= canal;
}

//METODO
public void mostrarInfo() {
	System.out.println ("Influencer: "+ nombre + " Canal: " + canal);
}

	

}
