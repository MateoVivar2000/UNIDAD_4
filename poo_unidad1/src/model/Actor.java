package model;

public class Actor {
	
	//Atributos
	private String nombre;
	private int añoNacimiento;
	
	//Constructor
	public Actor (String nombre, int añoNacimiento) {
		this.nombre = nombre;
		this.añoNacimiento = añoNacimiento;
	}
	
	//Método
	public void mostrarInfo() {
		System.out.println("Actor: "+ nombre + " Nacido en " + añoNacimiento);
	}

}
