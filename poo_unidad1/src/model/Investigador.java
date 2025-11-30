package model;

public class Investigador {
	//ATRIBUTOS
	private String nombre;
	private String especialidad;
	
	//CONSTRUCTOR
	public Investigador (String nombre, String especialidad) {
		this.nombre = nombre;
		this.especialidad = especialidad;
	}
	
	//METODO
	public void mostrarInfo() {
		System.out.println("Investigador: " + nombre + " Especialidad: "+ especialidad);
	}

}
